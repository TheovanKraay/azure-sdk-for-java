// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.azurestackhci.models.StorageProfileUpdateDataDisksItem;
import org.junit.jupiter.api.Assertions;

public final class StorageProfileUpdateDataDisksItemTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        StorageProfileUpdateDataDisksItem model =
            BinaryData.fromString("{\"id\":\"aboekqv\"}").toObject(StorageProfileUpdateDataDisksItem.class);
        Assertions.assertEquals("aboekqv", model.id());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        StorageProfileUpdateDataDisksItem model = new StorageProfileUpdateDataDisksItem().withId("aboekqv");
        model = BinaryData.fromObject(model).toObject(StorageProfileUpdateDataDisksItem.class);
        Assertions.assertEquals("aboekqv", model.id());
    }
}
