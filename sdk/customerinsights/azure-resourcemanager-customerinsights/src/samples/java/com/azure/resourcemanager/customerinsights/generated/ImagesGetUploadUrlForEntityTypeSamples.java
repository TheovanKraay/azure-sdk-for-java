// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.customerinsights.generated;

import com.azure.resourcemanager.customerinsights.models.GetImageUploadUrlInput;

/** Samples for Images GetUploadUrlForEntityType. */
public final class ImagesGetUploadUrlForEntityTypeSamples {
    /*
     * x-ms-original-file: specification/customer-insights/resource-manager/Microsoft.CustomerInsights/stable/2017-04-26/examples/ImagesGetUploadUrlForEntityType.json
     */
    /**
     * Sample code: Images_GetUploadUrlForEntityType.
     *
     * @param manager Entry point to CustomerInsightsManager.
     */
    public static void imagesGetUploadUrlForEntityType(
        com.azure.resourcemanager.customerinsights.CustomerInsightsManager manager) {
        manager
            .images()
            .getUploadUrlForEntityTypeWithResponse(
                "TestHubRG",
                "sdkTestHub",
                new GetImageUploadUrlInput()
                    .withEntityType("Profile")
                    .withEntityTypeName("Contact")
                    .withRelativePath("images/profile1.png"),
                com.azure.core.util.Context.NONE);
    }
}