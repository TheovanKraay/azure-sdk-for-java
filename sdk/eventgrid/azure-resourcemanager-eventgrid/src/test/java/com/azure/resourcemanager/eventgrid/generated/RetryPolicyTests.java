// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.eventgrid.models.RetryPolicy;
import org.junit.jupiter.api.Assertions;

public final class RetryPolicyTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RetryPolicy model
            = BinaryData.fromString("{\"maxDeliveryAttempts\":514038226,\"eventTimeToLiveInMinutes\":664044730}")
                .toObject(RetryPolicy.class);
        Assertions.assertEquals(514038226, model.maxDeliveryAttempts());
        Assertions.assertEquals(664044730, model.eventTimeToLiveInMinutes());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RetryPolicy model
            = new RetryPolicy().withMaxDeliveryAttempts(514038226).withEventTimeToLiveInMinutes(664044730);
        model = BinaryData.fromObject(model).toObject(RetryPolicy.class);
        Assertions.assertEquals(514038226, model.maxDeliveryAttempts());
        Assertions.assertEquals(664044730, model.eventTimeToLiveInMinutes());
    }
}
