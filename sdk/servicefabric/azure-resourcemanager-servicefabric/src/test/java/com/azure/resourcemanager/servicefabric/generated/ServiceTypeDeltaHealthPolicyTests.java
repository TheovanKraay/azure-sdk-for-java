// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.servicefabric.models.ServiceTypeDeltaHealthPolicy;
import org.junit.jupiter.api.Assertions;

public final class ServiceTypeDeltaHealthPolicyTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ServiceTypeDeltaHealthPolicy model =
            BinaryData
                .fromString("{\"maxPercentDeltaUnhealthyServices\":1154149650}")
                .toObject(ServiceTypeDeltaHealthPolicy.class);
        Assertions.assertEquals(1154149650, model.maxPercentDeltaUnhealthyServices());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ServiceTypeDeltaHealthPolicy model =
            new ServiceTypeDeltaHealthPolicy().withMaxPercentDeltaUnhealthyServices(1154149650);
        model = BinaryData.fromObject(model).toObject(ServiceTypeDeltaHealthPolicy.class);
        Assertions.assertEquals(1154149650, model.maxPercentDeltaUnhealthyServices());
    }
}