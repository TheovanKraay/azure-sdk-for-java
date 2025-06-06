// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.resourcemanager.appcontainers.models.ContainerRegistry;
import com.azure.resourcemanager.appcontainers.models.ManagedServiceIdentity;
import com.azure.resourcemanager.appcontainers.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.appcontainers.models.UserAssignedIdentity;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for Builders CreateOrUpdate.
 */
public final class BuildersCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/app/resource-manager/Microsoft.App/preview/2024-08-02-preview/examples/Builders_CreateOrUpdate.json
     */
    /**
     * Sample code: Builders_CreateOrUpdate_0.
     * 
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void
        buildersCreateOrUpdate0(com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager.builders()
            .define("testBuilder")
            .withRegion("eastus")
            .withExistingResourceGroup("rg")
            .withTags(mapOf("company", "Microsoft"))
            .withIdentity(new ManagedServiceIdentity()
                .withType(ManagedServiceIdentityType.SYSTEM_ASSIGNED_USER_ASSIGNED)
                .withUserAssignedIdentities(mapOf(
                    "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/rg1/providers/Microsoft.ManagedIdentity/userAssignedIdentities/identity1",
                    new UserAssignedIdentity())))
            .withEnvironmentId(
                "/subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/rg/providers/Microsoft.App/managedEnvironments/testEnv")
            .withContainerRegistries(Arrays.asList(new ContainerRegistry()
                .withContainerRegistryServer("test.azurecr.io")
                .withIdentityResourceId(
                    "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/rg1/providers/Microsoft.ManagedIdentity/userAssignedIdentities/identity1"),
                new ContainerRegistry().withContainerRegistryServer("test2.azurecr.io")
                    .withIdentityResourceId(
                        "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/rg1/providers/Microsoft.ManagedIdentity/userAssignedIdentities/identity1")))
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
