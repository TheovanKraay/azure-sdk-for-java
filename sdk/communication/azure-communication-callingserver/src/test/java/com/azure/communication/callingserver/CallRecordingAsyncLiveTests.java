// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.communication.callingserver;

import com.azure.communication.callingserver.models.CallingServerErrorException;
import com.azure.communication.callingserver.models.RecordingState;
import com.azure.communication.callingserver.models.RecordingStateResult;
import com.azure.communication.callingserver.models.ServerCallLocator;
import com.azure.communication.callingserver.models.StartRecordingOptions;
import com.azure.core.http.HttpClient;
import com.azure.core.test.annotation.LiveOnly;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

// Package marked to be deprecated
@LiveOnly()
public class CallRecordingAsyncLiveTests extends CallAutomationLiveTestBase {

    @ParameterizedTest
    @MethodSource("com.azure.core.test.TestBase#getHttpClients")
    @DisabledIfEnvironmentVariable(
        named = "SKIP_LIVE_TEST",
        matches = "(?i)(true)",
        disabledReason = "Requires human intervention")
    @Disabled("Disabling test as calling sever is in the process of decommissioning")
    public void recordingOperations(HttpClient httpClient) {
        CallAutomationAsyncClient client = getCallingServerClientUsingConnectionString(httpClient)
            .addPolicy((context, next) -> logHeaders("recordingOperationsAsync", next))
            .buildAsyncClient();

        try {
            String ngrok = "https://localhost";
            String serverCallId = "serverCallId";
            CallRecordingAsync callRecording = client.getCallRecordingAsync();
            RecordingStateResult recordingResponse = callRecording
                .startRecording(
                    new StartRecordingOptions(new ServerCallLocator(serverCallId)).setRecordingStateCallbackUrl(ngrok))
                .block();
            assertNotNull(recordingResponse);
            String recordingId = recordingResponse.getRecordingId();
            assertNotNull(recordingId);

            recordingResponse = callRecording.getRecordingState(recordingId).block();
            assertNotNull(recordingResponse);
            assertEquals(RecordingState.ACTIVE, recordingResponse.getRecordingState());

            callRecording.pauseRecording(recordingId);
            recordingResponse = callRecording.getRecordingState(recordingId).block();
            assertNotNull(recordingResponse);
            assertEquals(RecordingState.INACTIVE, recordingResponse.getRecordingState());

            callRecording.resumeRecording(recordingId);
            recordingResponse = callRecording.getRecordingState(recordingId).block();
            assertNotNull(recordingResponse);
            assertEquals(RecordingState.ACTIVE, recordingResponse.getRecordingState());

            callRecording.stopRecording(recordingId).block();
            assertThrows(CallingServerErrorException.class, () -> callRecording.getRecordingState(recordingId).block());
        } catch (Exception ex) {
            fail("Unexpected exception received", ex);
        }
    }
}
