// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.CreateDataFlowDebugSessionResponseInner;
import org.junit.jupiter.api.Assertions;

public final class CreateDataFlowDebugSessionResponseInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CreateDataFlowDebugSessionResponseInner model
            = BinaryData.fromString("{\"status\":\"ruunzzjgehkf\",\"sessionId\":\"m\"}")
                .toObject(CreateDataFlowDebugSessionResponseInner.class);
        Assertions.assertEquals("ruunzzjgehkf", model.status());
        Assertions.assertEquals("m", model.sessionId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CreateDataFlowDebugSessionResponseInner model
            = new CreateDataFlowDebugSessionResponseInner().withStatus("ruunzzjgehkf").withSessionId("m");
        model = BinaryData.fromObject(model).toObject(CreateDataFlowDebugSessionResponseInner.class);
        Assertions.assertEquals("ruunzzjgehkf", model.status());
        Assertions.assertEquals("m", model.sessionId());
    }
}
