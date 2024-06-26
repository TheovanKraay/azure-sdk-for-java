// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.models.AccessMode;
import com.azure.resourcemanager.appcontainers.models.NfsAzureFileProperties;
import org.junit.jupiter.api.Assertions;

public final class NfsAzureFilePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        NfsAzureFileProperties model
            = BinaryData.fromString("{\"server\":\"qplpvmjc\",\"accessMode\":\"ReadWrite\",\"shareName\":\"bidyv\"}")
                .toObject(NfsAzureFileProperties.class);
        Assertions.assertEquals("qplpvmjc", model.server());
        Assertions.assertEquals(AccessMode.READ_WRITE, model.accessMode());
        Assertions.assertEquals("bidyv", model.shareName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        NfsAzureFileProperties model = new NfsAzureFileProperties().withServer("qplpvmjc")
            .withAccessMode(AccessMode.READ_WRITE).withShareName("bidyv");
        model = BinaryData.fromObject(model).toObject(NfsAzureFileProperties.class);
        Assertions.assertEquals("qplpvmjc", model.server());
        Assertions.assertEquals(AccessMode.READ_WRITE, model.accessMode());
        Assertions.assertEquals("bidyv", model.shareName());
    }
}
