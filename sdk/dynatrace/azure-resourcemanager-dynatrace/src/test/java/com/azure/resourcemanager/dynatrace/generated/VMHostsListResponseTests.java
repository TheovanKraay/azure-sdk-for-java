// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dynatrace.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dynatrace.fluent.models.VMInfoInner;
import com.azure.resourcemanager.dynatrace.models.AutoUpdateSetting;
import com.azure.resourcemanager.dynatrace.models.AvailabilityState;
import com.azure.resourcemanager.dynatrace.models.LogModule;
import com.azure.resourcemanager.dynatrace.models.MonitoringType;
import com.azure.resourcemanager.dynatrace.models.UpdateStatus;
import com.azure.resourcemanager.dynatrace.models.VMHostsListResponse;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class VMHostsListResponseTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        VMHostsListResponse model = BinaryData.fromString(
            "{\"value\":[{\"resourceId\":\"a\",\"version\":\"uhrzayvvt\",\"monitoringType\":\"CLOUD_INFRASTRUCTURE\",\"autoUpdateSetting\":\"ENABLED\",\"updateStatus\":\"INCOMPATIBLE\",\"availabilityState\":\"UNEXPECTED_SHUTDOWN\",\"logModule\":\"DISABLED\",\"hostGroup\":\"utqxlngx\",\"hostName\":\"fgugnxkrxdqmid\"}],\"nextLink\":\"hzrvqd\"}")
            .toObject(VMHostsListResponse.class);
        Assertions.assertEquals("a", model.value().get(0).resourceId());
        Assertions.assertEquals("uhrzayvvt", model.value().get(0).version());
        Assertions.assertEquals(MonitoringType.CLOUD_INFRASTRUCTURE, model.value().get(0).monitoringType());
        Assertions.assertEquals(AutoUpdateSetting.ENABLED, model.value().get(0).autoUpdateSetting());
        Assertions.assertEquals(UpdateStatus.INCOMPATIBLE, model.value().get(0).updateStatus());
        Assertions.assertEquals(AvailabilityState.UNEXPECTED_SHUTDOWN, model.value().get(0).availabilityState());
        Assertions.assertEquals(LogModule.DISABLED, model.value().get(0).logModule());
        Assertions.assertEquals("utqxlngx", model.value().get(0).hostGroup());
        Assertions.assertEquals("fgugnxkrxdqmid", model.value().get(0).hostname());
        Assertions.assertEquals("hzrvqd", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        VMHostsListResponse model
            = new VMHostsListResponse().withValue(Arrays.asList(new VMInfoInner().withResourceId("a")
                .withVersion("uhrzayvvt")
                .withMonitoringType(MonitoringType.CLOUD_INFRASTRUCTURE)
                .withAutoUpdateSetting(AutoUpdateSetting.ENABLED)
                .withUpdateStatus(UpdateStatus.INCOMPATIBLE)
                .withAvailabilityState(AvailabilityState.UNEXPECTED_SHUTDOWN)
                .withLogModule(LogModule.DISABLED)
                .withHostGroup("utqxlngx")
                .withHostname("fgugnxkrxdqmid"))).withNextLink("hzrvqd");
        model = BinaryData.fromObject(model).toObject(VMHostsListResponse.class);
        Assertions.assertEquals("a", model.value().get(0).resourceId());
        Assertions.assertEquals("uhrzayvvt", model.value().get(0).version());
        Assertions.assertEquals(MonitoringType.CLOUD_INFRASTRUCTURE, model.value().get(0).monitoringType());
        Assertions.assertEquals(AutoUpdateSetting.ENABLED, model.value().get(0).autoUpdateSetting());
        Assertions.assertEquals(UpdateStatus.INCOMPATIBLE, model.value().get(0).updateStatus());
        Assertions.assertEquals(AvailabilityState.UNEXPECTED_SHUTDOWN, model.value().get(0).availabilityState());
        Assertions.assertEquals(LogModule.DISABLED, model.value().get(0).logModule());
        Assertions.assertEquals("utqxlngx", model.value().get(0).hostGroup());
        Assertions.assertEquals("fgugnxkrxdqmid", model.value().get(0).hostname());
        Assertions.assertEquals("hzrvqd", model.nextLink());
    }
}
