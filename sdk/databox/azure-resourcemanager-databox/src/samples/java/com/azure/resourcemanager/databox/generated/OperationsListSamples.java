// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.generated;

/** Samples for Operations List. */
public final class OperationsListSamples {
    /*
     * x-ms-original-file: specification/databox/resource-manager/Microsoft.DataBox/stable/2021-03-01/examples/OperationsGet.json
     */
    /**
     * Sample code: OperationsGet.
     *
     * @param manager Entry point to DataBoxManager.
     */
    public static void operationsGet(com.azure.resourcemanager.databox.DataBoxManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}