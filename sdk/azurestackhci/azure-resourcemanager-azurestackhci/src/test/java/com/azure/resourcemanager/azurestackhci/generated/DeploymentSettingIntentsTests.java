// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.azurestackhci.models.DeploymentSettingAdapterPropertyOverrides;
import com.azure.resourcemanager.azurestackhci.models.DeploymentSettingIntents;
import com.azure.resourcemanager.azurestackhci.models.DeploymentSettingVirtualSwitchConfigurationOverrides;
import com.azure.resourcemanager.azurestackhci.models.QosPolicyOverrides;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class DeploymentSettingIntentsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DeploymentSettingIntents model = BinaryData.fromString(
            "{\"name\":\"m\",\"trafficType\":[\"kvmkqzeqq\",\"dltfz\",\"mhhv\"],\"adapter\":[\"r\"],\"overrideVirtualSwitchConfiguration\":true,\"virtualSwitchConfigurationOverrides\":{\"enableIov\":\"obdagxtibqdxb\",\"loadBalancingAlgorithm\":\"akbogqxndlkzgxh\"},\"overrideQosPolicy\":true,\"qosPolicyOverrides\":{\"priorityValue8021Action_Cluster\":\"bpodxunkbebxm\",\"priorityValue8021Action_SMB\":\"yyntwl\",\"bandwidthPercentage_SMB\":\"qtkoievs\"},\"overrideAdapterProperty\":false,\"adapterPropertyOverrides\":{\"jumboPacket\":\"rlltmuwlauwzizx\",\"networkDirect\":\"pgcjefuzmuvp\",\"networkDirectTechnology\":\"tdum\"}}")
            .toObject(DeploymentSettingIntents.class);
        Assertions.assertEquals("m", model.name());
        Assertions.assertEquals("kvmkqzeqq", model.trafficType().get(0));
        Assertions.assertEquals("r", model.adapter().get(0));
        Assertions.assertEquals(true, model.overrideVirtualSwitchConfiguration());
        Assertions.assertEquals("obdagxtibqdxb", model.virtualSwitchConfigurationOverrides().enableIov());
        Assertions.assertEquals("akbogqxndlkzgxh",
            model.virtualSwitchConfigurationOverrides().loadBalancingAlgorithm());
        Assertions.assertEquals(true, model.overrideQosPolicy());
        Assertions.assertEquals("bpodxunkbebxm", model.qosPolicyOverrides().priorityValue8021ActionCluster());
        Assertions.assertEquals("yyntwl", model.qosPolicyOverrides().priorityValue8021ActionSmb());
        Assertions.assertEquals("qtkoievs", model.qosPolicyOverrides().bandwidthPercentageSmb());
        Assertions.assertEquals(false, model.overrideAdapterProperty());
        Assertions.assertEquals("rlltmuwlauwzizx", model.adapterPropertyOverrides().jumboPacket());
        Assertions.assertEquals("pgcjefuzmuvp", model.adapterPropertyOverrides().networkDirect());
        Assertions.assertEquals("tdum", model.adapterPropertyOverrides().networkDirectTechnology());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DeploymentSettingIntents model = new DeploymentSettingIntents().withName("m")
            .withTrafficType(Arrays.asList("kvmkqzeqq", "dltfz", "mhhv"))
            .withAdapter(Arrays.asList("r"))
            .withOverrideVirtualSwitchConfiguration(true)
            .withVirtualSwitchConfigurationOverrides(
                new DeploymentSettingVirtualSwitchConfigurationOverrides().withEnableIov("obdagxtibqdxb")
                    .withLoadBalancingAlgorithm("akbogqxndlkzgxh"))
            .withOverrideQosPolicy(true)
            .withQosPolicyOverrides(new QosPolicyOverrides().withPriorityValue8021ActionCluster("bpodxunkbebxm")
                .withPriorityValue8021ActionSmb("yyntwl")
                .withBandwidthPercentageSmb("qtkoievs"))
            .withOverrideAdapterProperty(false)
            .withAdapterPropertyOverrides(
                new DeploymentSettingAdapterPropertyOverrides().withJumboPacket("rlltmuwlauwzizx")
                    .withNetworkDirect("pgcjefuzmuvp")
                    .withNetworkDirectTechnology("tdum"));
        model = BinaryData.fromObject(model).toObject(DeploymentSettingIntents.class);
        Assertions.assertEquals("m", model.name());
        Assertions.assertEquals("kvmkqzeqq", model.trafficType().get(0));
        Assertions.assertEquals("r", model.adapter().get(0));
        Assertions.assertEquals(true, model.overrideVirtualSwitchConfiguration());
        Assertions.assertEquals("obdagxtibqdxb", model.virtualSwitchConfigurationOverrides().enableIov());
        Assertions.assertEquals("akbogqxndlkzgxh",
            model.virtualSwitchConfigurationOverrides().loadBalancingAlgorithm());
        Assertions.assertEquals(true, model.overrideQosPolicy());
        Assertions.assertEquals("bpodxunkbebxm", model.qosPolicyOverrides().priorityValue8021ActionCluster());
        Assertions.assertEquals("yyntwl", model.qosPolicyOverrides().priorityValue8021ActionSmb());
        Assertions.assertEquals("qtkoievs", model.qosPolicyOverrides().bandwidthPercentageSmb());
        Assertions.assertEquals(false, model.overrideAdapterProperty());
        Assertions.assertEquals("rlltmuwlauwzizx", model.adapterPropertyOverrides().jumboPacket());
        Assertions.assertEquals("pgcjefuzmuvp", model.adapterPropertyOverrides().networkDirect());
        Assertions.assertEquals("tdum", model.adapterPropertyOverrides().networkDirectTechnology());
    }
}
