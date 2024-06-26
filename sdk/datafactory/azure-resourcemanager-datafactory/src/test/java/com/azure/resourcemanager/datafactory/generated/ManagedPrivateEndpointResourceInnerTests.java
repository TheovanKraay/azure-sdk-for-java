// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.ManagedPrivateEndpointResourceInner;
import com.azure.resourcemanager.datafactory.models.ConnectionStateProperties;
import com.azure.resourcemanager.datafactory.models.ManagedPrivateEndpoint;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ManagedPrivateEndpointResourceInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ManagedPrivateEndpointResourceInner model = BinaryData.fromString(
            "{\"properties\":{\"connectionState\":{\"actionsRequired\":\"vpedwqslsrh\",\"description\":\"qvwwsko\",\"status\":\"cbrwi\"},\"fqdns\":[\"qejo\",\"ovyrrleaesinu\",\"tljqobbpih\"],\"groupId\":\"cecybmrqbrjbbmpx\",\"isReserved\":true,\"privateLinkResourceId\":\"kfrexcrseqwjks\",\"provisioningState\":\"udgzhxogjgg\",\"\":{\"kxibdafh\":\"datau\",\"y\":\"datakmdyomkxfbvfbh\",\"gddeimaw\":\"datarhpw\"}},\"name\":\"vgkk\",\"type\":\"ui\",\"etag\":\"cjc\",\"id\":\"tbw\"}")
            .toObject(ManagedPrivateEndpointResourceInner.class);
        Assertions.assertEquals("tbw", model.id());
        Assertions.assertEquals("qejo", model.properties().fqdns().get(0));
        Assertions.assertEquals("cecybmrqbrjbbmpx", model.properties().groupId());
        Assertions.assertEquals("kfrexcrseqwjks", model.properties().privateLinkResourceId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ManagedPrivateEndpointResourceInner model = new ManagedPrivateEndpointResourceInner().withId("tbw")
            .withProperties(new ManagedPrivateEndpoint().withConnectionState(new ConnectionStateProperties())
                .withFqdns(Arrays.asList("qejo", "ovyrrleaesinu", "tljqobbpih"))
                .withGroupId("cecybmrqbrjbbmpx")
                .withPrivateLinkResourceId("kfrexcrseqwjks")
                .withAdditionalProperties(mapOf("isReserved", true, "provisioningState", "udgzhxogjgg")));
        model = BinaryData.fromObject(model).toObject(ManagedPrivateEndpointResourceInner.class);
        Assertions.assertEquals("tbw", model.id());
        Assertions.assertEquals("qejo", model.properties().fqdns().get(0));
        Assertions.assertEquals("cecybmrqbrjbbmpx", model.properties().groupId());
        Assertions.assertEquals("kfrexcrseqwjks", model.properties().privateLinkResourceId());
    }

    // Use "Map.of" if available
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
