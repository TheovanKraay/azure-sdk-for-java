// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.relay.generated;

import com.azure.resourcemanager.relay.models.Sku;
import com.azure.resourcemanager.relay.models.SkuTier;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for Namespaces CreateOrUpdate.
 */
public final class NamespacesCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/relay/resource-manager/Microsoft.Relay/stable/2017-04-01/examples/NameSpaces/RelayNameSpaceCreate.
     * json
     */
    /**
     * Sample code: RelayNamespaceCreate.
     * 
     * @param manager Entry point to RelayManager.
     */
    public static void relayNamespaceCreate(com.azure.resourcemanager.relay.RelayManager manager) {
        manager.namespaces()
            .define("example-RelayNamespace-01")
            .withRegion("West US")
            .withExistingResourceGroup("resourcegroup")
            .withTags(mapOf("tag1", "value1", "tag2", "value2"))
            .withSku(new Sku().withTier(SkuTier.STANDARD))
            .create();
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
