// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridcompute.models.ServiceStatus;
import org.junit.jupiter.api.Assertions;

public final class ServiceStatusTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ServiceStatus model = BinaryData.fromString("{\"status\":\"ufizuckyf\",\"startupType\":\"rfidfvzwdz\"}")
            .toObject(ServiceStatus.class);
        Assertions.assertEquals("ufizuckyf", model.status());
        Assertions.assertEquals("rfidfvzwdz", model.startupType());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ServiceStatus model = new ServiceStatus().withStatus("ufizuckyf").withStartupType("rfidfvzwdz");
        model = BinaryData.fromObject(model).toObject(ServiceStatus.class);
        Assertions.assertEquals("ufizuckyf", model.status());
        Assertions.assertEquals("rfidfvzwdz", model.startupType());
    }
}
