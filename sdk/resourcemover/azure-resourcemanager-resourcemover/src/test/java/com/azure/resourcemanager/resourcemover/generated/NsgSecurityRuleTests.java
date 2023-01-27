// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcemover.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.resourcemover.models.NsgSecurityRule;
import org.junit.jupiter.api.Assertions;

public final class NsgSecurityRuleTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        NsgSecurityRule model =
            BinaryData
                .fromString(
                    "{\"name\":\"ghxpkdw\",\"access\":\"aiuebbaumnyqu\",\"description\":\"deoj\",\"destinationAddressPrefix\":\"bckhsmtxpsi\",\"destinationPortRange\":\"tfhvpesapskrdqmh\",\"direction\":\"dhtldwkyz\",\"priority\":1335454628,\"protocol\":\"kn\",\"sourceAddressPrefix\":\"scwsv\",\"sourcePortRange\":\"otogtwrupqs\"}")
                .toObject(NsgSecurityRule.class);
        Assertions.assertEquals("ghxpkdw", model.name());
        Assertions.assertEquals("aiuebbaumnyqu", model.access());
        Assertions.assertEquals("deoj", model.description());
        Assertions.assertEquals("bckhsmtxpsi", model.destinationAddressPrefix());
        Assertions.assertEquals("tfhvpesapskrdqmh", model.destinationPortRange());
        Assertions.assertEquals("dhtldwkyz", model.direction());
        Assertions.assertEquals(1335454628, model.priority());
        Assertions.assertEquals("kn", model.protocol());
        Assertions.assertEquals("scwsv", model.sourceAddressPrefix());
        Assertions.assertEquals("otogtwrupqs", model.sourcePortRange());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        NsgSecurityRule model =
            new NsgSecurityRule()
                .withName("ghxpkdw")
                .withAccess("aiuebbaumnyqu")
                .withDescription("deoj")
                .withDestinationAddressPrefix("bckhsmtxpsi")
                .withDestinationPortRange("tfhvpesapskrdqmh")
                .withDirection("dhtldwkyz")
                .withPriority(1335454628)
                .withProtocol("kn")
                .withSourceAddressPrefix("scwsv")
                .withSourcePortRange("otogtwrupqs");
        model = BinaryData.fromObject(model).toObject(NsgSecurityRule.class);
        Assertions.assertEquals("ghxpkdw", model.name());
        Assertions.assertEquals("aiuebbaumnyqu", model.access());
        Assertions.assertEquals("deoj", model.description());
        Assertions.assertEquals("bckhsmtxpsi", model.destinationAddressPrefix());
        Assertions.assertEquals("tfhvpesapskrdqmh", model.destinationPortRange());
        Assertions.assertEquals("dhtldwkyz", model.direction());
        Assertions.assertEquals(1335454628, model.priority());
        Assertions.assertEquals("kn", model.protocol());
        Assertions.assertEquals("scwsv", model.sourceAddressPrefix());
        Assertions.assertEquals("otogtwrupqs", model.sourcePortRange());
    }
}