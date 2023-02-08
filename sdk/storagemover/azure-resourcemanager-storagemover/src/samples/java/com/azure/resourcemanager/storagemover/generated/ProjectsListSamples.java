// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagemover.generated;

/** Samples for Projects List. */
public final class ProjectsListSamples {
    /*
     * x-ms-original-file: specification/storagemover/resource-manager/Microsoft.StorageMover/stable/2023-03-01/examples/Projects_List.json
     */
    /**
     * Sample code: Projects_List.
     *
     * @param manager Entry point to StorageMoverManager.
     */
    public static void projectsList(com.azure.resourcemanager.storagemover.StorageMoverManager manager) {
        manager.projects().list("examples-rg", "examples-storageMoverName", com.azure.core.util.Context.NONE);
    }
}