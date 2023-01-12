// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.postgresqlflexibleserver.fluent.models.NameAvailabilityInner;
import com.azure.resourcemanager.postgresqlflexibleserver.models.CheckNameAvailabilityReason;
import org.junit.jupiter.api.Assertions;

public final class NameAvailabilityInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        NameAvailabilityInner model =
            BinaryData
                .fromString(
                    "{\"name\":\"bhj\",\"type\":\"igeho\",\"nameAvailable\":false,\"reason\":\"Invalid\",\"message\":\"kanyktzlcuiywg\"}")
                .toObject(NameAvailabilityInner.class);
        Assertions.assertEquals(false, model.nameAvailable());
        Assertions.assertEquals(CheckNameAvailabilityReason.INVALID, model.reason());
        Assertions.assertEquals("kanyktzlcuiywg", model.message());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        NameAvailabilityInner model =
            new NameAvailabilityInner()
                .withNameAvailable(false)
                .withReason(CheckNameAvailabilityReason.INVALID)
                .withMessage("kanyktzlcuiywg");
        model = BinaryData.fromObject(model).toObject(NameAvailabilityInner.class);
        Assertions.assertEquals(false, model.nameAvailable());
        Assertions.assertEquals(CheckNameAvailabilityReason.INVALID, model.reason());
        Assertions.assertEquals("kanyktzlcuiywg", model.message());
    }
}