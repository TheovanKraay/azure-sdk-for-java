// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.customerinsights.generated;

/** Samples for RelationshipLinks Delete. */
public final class RelationshipLinksDeleteSamples {
    /*
     * x-ms-original-file: specification/customer-insights/resource-manager/Microsoft.CustomerInsights/stable/2017-04-26/examples/RelationshipLinksDelete.json
     */
    /**
     * Sample code: RelationshipLinks_Delete.
     *
     * @param manager Entry point to CustomerInsightsManager.
     */
    public static void relationshipLinksDelete(
        com.azure.resourcemanager.customerinsights.CustomerInsightsManager manager) {
        manager.relationshipLinks().delete("TestHubRG", "sdkTestHub", "Somelink", com.azure.core.util.Context.NONE);
    }
}