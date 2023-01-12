// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billingbenefits.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.billingbenefits.models.InstanceFlexibility;
import com.azure.resourcemanager.billingbenefits.models.ReservationOrderAliasResponsePropertiesReservedResourceProperties;
import org.junit.jupiter.api.Assertions;

public final class ReservationOrderAliasResponsePropertiesReservedResourcePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ReservationOrderAliasResponsePropertiesReservedResourceProperties model =
            BinaryData
                .fromString("{\"instanceFlexibility\":\"Off\"}")
                .toObject(ReservationOrderAliasResponsePropertiesReservedResourceProperties.class);
        Assertions.assertEquals(InstanceFlexibility.OFF, model.instanceFlexibility());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ReservationOrderAliasResponsePropertiesReservedResourceProperties model =
            new ReservationOrderAliasResponsePropertiesReservedResourceProperties()
                .withInstanceFlexibility(InstanceFlexibility.OFF);
        model =
            BinaryData
                .fromObject(model)
                .toObject(ReservationOrderAliasResponsePropertiesReservedResourceProperties.class);
        Assertions.assertEquals(InstanceFlexibility.OFF, model.instanceFlexibility());
    }
}