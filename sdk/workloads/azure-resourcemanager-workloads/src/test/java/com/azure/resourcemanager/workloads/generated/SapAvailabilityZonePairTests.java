// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.workloads.models.SapAvailabilityZonePair;
import org.junit.jupiter.api.Assertions;

public final class SapAvailabilityZonePairTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SapAvailabilityZonePair model =
            BinaryData
                .fromString("{\"zoneA\":5112949672295507633,\"zoneB\":2906295825403594883}")
                .toObject(SapAvailabilityZonePair.class);
        Assertions.assertEquals(5112949672295507633L, model.zoneA());
        Assertions.assertEquals(2906295825403594883L, model.zoneB());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SapAvailabilityZonePair model =
            new SapAvailabilityZonePair().withZoneA(5112949672295507633L).withZoneB(2906295825403594883L);
        model = BinaryData.fromObject(model).toObject(SapAvailabilityZonePair.class);
        Assertions.assertEquals(5112949672295507633L, model.zoneA());
        Assertions.assertEquals(2906295825403594883L, model.zoneB());
    }
}