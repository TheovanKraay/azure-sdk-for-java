// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

/**
 * Samples for Catalogs Sync.
 */
public final class CatalogsSyncSamples {
    /*
     * x-ms-original-file:
     * specification/devcenter/resource-manager/Microsoft.DevCenter/stable/2024-02-01/examples/Catalogs_Sync.json
     */
    /**
     * Sample code: Catalogs_Sync.
     * 
     * @param manager Entry point to DevCenterManager.
     */
    public static void catalogsSync(com.azure.resourcemanager.devcenter.DevCenterManager manager) {
        manager.catalogs().sync("rg1", "Contoso", "CentralCatalog", com.azure.core.util.Context.NONE);
    }
}
