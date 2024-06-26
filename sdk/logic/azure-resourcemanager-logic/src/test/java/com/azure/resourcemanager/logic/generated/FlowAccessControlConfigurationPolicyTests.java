// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.logic.models.FlowAccessControlConfigurationPolicy;
import com.azure.resourcemanager.logic.models.IpAddressRange;
import com.azure.resourcemanager.logic.models.OpenAuthenticationAccessPolicies;
import com.azure.resourcemanager.logic.models.OpenAuthenticationAccessPolicy;
import com.azure.resourcemanager.logic.models.OpenAuthenticationProviderType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class FlowAccessControlConfigurationPolicyTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        FlowAccessControlConfigurationPolicy model =
            BinaryData
                .fromString(
                    "{\"allowedCallerIpAddresses\":[{\"addressRange\":\"xqabnmocpcysh\"},{\"addressRange\":\"zafb\"}],\"openAuthenticationPolicies\":{\"policies\":{\"oq\":{\"type\":\"AAD\",\"claims\":[]},\"ljavbqid\":{\"type\":\"AAD\",\"claims\":[]},\"zyulp\":{\"type\":\"AAD\",\"claims\":[]}}}}")
                .toObject(FlowAccessControlConfigurationPolicy.class);
        Assertions.assertEquals("xqabnmocpcysh", model.allowedCallerIpAddresses().get(0).addressRange());
        Assertions
            .assertEquals(
                OpenAuthenticationProviderType.AAD, model.openAuthenticationPolicies().policies().get("oq").type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        FlowAccessControlConfigurationPolicy model =
            new FlowAccessControlConfigurationPolicy()
                .withAllowedCallerIpAddresses(
                    Arrays
                        .asList(
                            new IpAddressRange().withAddressRange("xqabnmocpcysh"),
                            new IpAddressRange().withAddressRange("zafb")))
                .withOpenAuthenticationPolicies(
                    new OpenAuthenticationAccessPolicies()
                        .withPolicies(
                            mapOf(
                                "oq",
                                new OpenAuthenticationAccessPolicy()
                                    .withType(OpenAuthenticationProviderType.AAD)
                                    .withClaims(Arrays.asList()),
                                "ljavbqid",
                                new OpenAuthenticationAccessPolicy()
                                    .withType(OpenAuthenticationProviderType.AAD)
                                    .withClaims(Arrays.asList()),
                                "zyulp",
                                new OpenAuthenticationAccessPolicy()
                                    .withType(OpenAuthenticationProviderType.AAD)
                                    .withClaims(Arrays.asList()))));
        model = BinaryData.fromObject(model).toObject(FlowAccessControlConfigurationPolicy.class);
        Assertions.assertEquals("xqabnmocpcysh", model.allowedCallerIpAddresses().get(0).addressRange());
        Assertions
            .assertEquals(
                OpenAuthenticationProviderType.AAD, model.openAuthenticationPolicies().policies().get("oq").type());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
