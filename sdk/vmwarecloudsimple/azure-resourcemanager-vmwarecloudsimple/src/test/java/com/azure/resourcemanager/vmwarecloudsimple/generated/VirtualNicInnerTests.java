// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.vmwarecloudsimple.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.vmwarecloudsimple.fluent.models.VirtualNetworkInner;
import com.azure.resourcemanager.vmwarecloudsimple.fluent.models.VirtualNicInner;
import com.azure.resourcemanager.vmwarecloudsimple.models.GuestOsnicCustomization;
import com.azure.resourcemanager.vmwarecloudsimple.models.GuestOsnicCustomizationAllocation;
import com.azure.resourcemanager.vmwarecloudsimple.models.NicType;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class VirtualNicInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        VirtualNicInner model =
            BinaryData
                .fromString(
                    "{\"customization\":{\"allocation\":\"dynamic\",\"dnsServers\":[\"wdreqnovvqfovl\",\"xywsuws\",\"rsndsytgadgvra\"],\"gateway\":[\"neqn\"],\"ipAddress\":\"rrwlquuijfqkace\",\"mask\":\"ipfpubji\",\"primaryWinsServer\":\"wifto\",\"secondaryWinsServer\":\"kvpuvksgplsaknyn\"},\"ipAddresses\":[\"n\"],\"macAddress\":\"ph\",\"network\":{\"assignable\":true,\"id\":\"xodlqiyntorzih\",\"location\":\"osjswsr\",\"name\":\"lyzrpzbchckqqzqi\",\"properties\":{\"privateCloudId\":\"ysuiizynkedya\"},\"type\":\"wyhqmibzyhwits\"},\"nicType\":\"PCNET32\",\"powerOnBoot\":true,\"virtualNicId\":\"npcdpumnzgm\",\"virtualNicName\":\"nmabik\"}")
                .toObject(VirtualNicInner.class);
        Assertions.assertEquals(GuestOsnicCustomizationAllocation.DYNAMIC, model.customization().allocation());
        Assertions.assertEquals("wdreqnovvqfovl", model.customization().dnsServers().get(0));
        Assertions.assertEquals("neqn", model.customization().gateway().get(0));
        Assertions.assertEquals("rrwlquuijfqkace", model.customization().ipAddress());
        Assertions.assertEquals("ipfpubji", model.customization().mask());
        Assertions.assertEquals("wifto", model.customization().primaryWinsServer());
        Assertions.assertEquals("kvpuvksgplsaknyn", model.customization().secondaryWinsServer());
        Assertions.assertEquals("n", model.ipAddresses().get(0));
        Assertions.assertEquals("ph", model.macAddress());
        Assertions.assertEquals("xodlqiyntorzih", model.network().id());
        Assertions.assertEquals(NicType.PCNET32, model.nicType());
        Assertions.assertEquals(true, model.powerOnBoot());
        Assertions.assertEquals("npcdpumnzgm", model.virtualNicId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        VirtualNicInner model =
            new VirtualNicInner()
                .withCustomization(
                    new GuestOsnicCustomization()
                        .withAllocation(GuestOsnicCustomizationAllocation.DYNAMIC)
                        .withDnsServers(Arrays.asList("wdreqnovvqfovl", "xywsuws", "rsndsytgadgvra"))
                        .withGateway(Arrays.asList("neqn"))
                        .withIpAddress("rrwlquuijfqkace")
                        .withMask("ipfpubji")
                        .withPrimaryWinsServer("wifto")
                        .withSecondaryWinsServer("kvpuvksgplsaknyn"))
                .withIpAddresses(Arrays.asList("n"))
                .withMacAddress("ph")
                .withNetwork(new VirtualNetworkInner().withId("xodlqiyntorzih"))
                .withNicType(NicType.PCNET32)
                .withPowerOnBoot(true)
                .withVirtualNicId("npcdpumnzgm");
        model = BinaryData.fromObject(model).toObject(VirtualNicInner.class);
        Assertions.assertEquals(GuestOsnicCustomizationAllocation.DYNAMIC, model.customization().allocation());
        Assertions.assertEquals("wdreqnovvqfovl", model.customization().dnsServers().get(0));
        Assertions.assertEquals("neqn", model.customization().gateway().get(0));
        Assertions.assertEquals("rrwlquuijfqkace", model.customization().ipAddress());
        Assertions.assertEquals("ipfpubji", model.customization().mask());
        Assertions.assertEquals("wifto", model.customization().primaryWinsServer());
        Assertions.assertEquals("kvpuvksgplsaknyn", model.customization().secondaryWinsServer());
        Assertions.assertEquals("n", model.ipAddresses().get(0));
        Assertions.assertEquals("ph", model.macAddress());
        Assertions.assertEquals("xodlqiyntorzih", model.network().id());
        Assertions.assertEquals(NicType.PCNET32, model.nicType());
        Assertions.assertEquals(true, model.powerOnBoot());
        Assertions.assertEquals("npcdpumnzgm", model.virtualNicId());
    }
}