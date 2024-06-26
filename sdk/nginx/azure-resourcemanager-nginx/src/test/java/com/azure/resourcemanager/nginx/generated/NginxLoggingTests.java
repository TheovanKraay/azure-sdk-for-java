// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.nginx.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.nginx.models.NginxLogging;
import com.azure.resourcemanager.nginx.models.NginxStorageAccount;
import org.junit.jupiter.api.Assertions;

public final class NginxLoggingTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        NginxLogging model = BinaryData
            .fromString("{\"storageAccount\":{\"accountName\":\"scjeypv\",\"containerName\":\"zrkgqhcjrefovg\"}}")
            .toObject(NginxLogging.class);
        Assertions.assertEquals("scjeypv", model.storageAccount().accountName());
        Assertions.assertEquals("zrkgqhcjrefovg", model.storageAccount().containerName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        NginxLogging model = new NginxLogging().withStorageAccount(
            new NginxStorageAccount().withAccountName("scjeypv").withContainerName("zrkgqhcjrefovg"));
        model = BinaryData.fromObject(model).toObject(NginxLogging.class);
        Assertions.assertEquals("scjeypv", model.storageAccount().accountName());
        Assertions.assertEquals("zrkgqhcjrefovg", model.storageAccount().containerName());
    }
}
