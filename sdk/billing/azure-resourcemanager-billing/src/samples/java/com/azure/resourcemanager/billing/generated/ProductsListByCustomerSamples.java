// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.generated;

/** Samples for Products ListByCustomer. */
public final class ProductsListByCustomerSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2020-05-01/examples/ProductsListByCustomer.json
     */
    /**
     * Sample code: ProductsListByInvoiceSection.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void productsListByInvoiceSection(com.azure.resourcemanager.billing.BillingManager manager) {
        manager.products().listByCustomer("{billingAccountName}", "{customerName}", com.azure.core.util.Context.NONE);
    }
}
