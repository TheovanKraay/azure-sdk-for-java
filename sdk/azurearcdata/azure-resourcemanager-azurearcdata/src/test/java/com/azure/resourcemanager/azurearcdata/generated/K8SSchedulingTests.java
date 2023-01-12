// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurearcdata.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.azurearcdata.models.K8SResourceRequirements;
import com.azure.resourcemanager.azurearcdata.models.K8SScheduling;
import com.azure.resourcemanager.azurearcdata.models.K8SSchedulingOptions;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class K8SSchedulingTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        K8SScheduling model =
            BinaryData
                .fromString(
                    "{\"default\":{\"resources\":{\"requests\":{\"qjqabcypmivkwl\":\"zevgb\",\"wnfnbacf\":\"uvcc\",\"bqqwxrj\":\"onlebxetqgtzxdpn\"},\"limits\":{\"njampm\":\"llnwsubi\"},\"\":{\"chcbonqvpkvlrxnj\":\"datazscxaqwo\",\"pheoflokeyy\":\"dataase\"}},\"\":{\"asxazjpqyegualhb\":\"datajbdlwtgrhpdjpju\"}},\"\":{\"jzzvdud\":\"datae\",\"pwlbjnpg\":\"datawdslfhotwmcy\"}}")
                .toObject(K8SScheduling.class);
        Assertions.assertEquals("zevgb", model.defaultProperty().resources().requests().get("qjqabcypmivkwl"));
        Assertions.assertEquals("llnwsubi", model.defaultProperty().resources().limits().get("njampm"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        K8SScheduling model =
            new K8SScheduling()
                .withDefaultProperty(
                    new K8SSchedulingOptions()
                        .withResources(
                            new K8SResourceRequirements()
                                .withRequests(
                                    mapOf("qjqabcypmivkwl", "zevgb", "wnfnbacf", "uvcc", "bqqwxrj", "onlebxetqgtzxdpn"))
                                .withLimits(mapOf("njampm", "llnwsubi"))
                                .withAdditionalProperties(mapOf()))
                        .withAdditionalProperties(mapOf()))
                .withAdditionalProperties(mapOf());
        model = BinaryData.fromObject(model).toObject(K8SScheduling.class);
        Assertions.assertEquals("zevgb", model.defaultProperty().resources().requests().get("qjqabcypmivkwl"));
        Assertions.assertEquals("llnwsubi", model.defaultProperty().resources().limits().get("njampm"));
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