// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.generated;

/**
 * Samples for RecipientTransfers List.
 */
public final class RecipientTransfersListSamples {
    /*
     * x-ms-original-file:
     * specification/billing/resource-manager/Microsoft.Billing/stable/2024-04-01/examples/recipientTransfersList.json
     */
    /**
     * Sample code: RecipientTransfersList.
     * 
     * @param manager Entry point to BillingManager.
     */
    public static void recipientTransfersList(com.azure.resourcemanager.billing.BillingManager manager) {
        manager.recipientTransfers().list(com.azure.core.util.Context.NONE);
    }
}
