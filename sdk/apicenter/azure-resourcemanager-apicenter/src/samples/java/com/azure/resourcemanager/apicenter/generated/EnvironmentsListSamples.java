// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apicenter.generated;

/**
 * Samples for Environments List.
 */
public final class EnvironmentsListSamples {
    /*
     * x-ms-original-file:
     * specification/apicenter/resource-manager/Microsoft.ApiCenter/stable/2024-03-01/examples/Environments_List.json
     */
    /**
     * Sample code: Environments_ListByWorkspace.
     * 
     * @param manager Entry point to ApiCenterManager.
     */
    public static void environmentsListByWorkspace(com.azure.resourcemanager.apicenter.ApiCenterManager manager) {
        manager.environments().list("contoso-resources", "contoso", "default", null, com.azure.core.util.Context.NONE);
    }
}
