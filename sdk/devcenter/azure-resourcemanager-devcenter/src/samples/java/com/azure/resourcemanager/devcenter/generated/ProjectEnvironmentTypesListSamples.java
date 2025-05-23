// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

/**
 * Samples for ProjectEnvironmentTypes List.
 */
public final class ProjectEnvironmentTypesListSamples {
    /*
     * x-ms-original-file: specification/devcenter/resource-manager/Microsoft.DevCenter/stable/2024-02-01/examples/
     * ProjectEnvironmentTypes_List.json
     */
    /**
     * Sample code: ProjectEnvironmentTypes_List.
     * 
     * @param manager Entry point to DevCenterManager.
     */
    public static void projectEnvironmentTypesList(com.azure.resourcemanager.devcenter.DevCenterManager manager) {
        manager.projectEnvironmentTypes().list("rg1", "ContosoProj", null, com.azure.core.util.Context.NONE);
    }
}
