// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.SapEccResourceDatasetTypeProperties;

public final class SapEccResourceDatasetTypePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SapEccResourceDatasetTypeProperties model = BinaryData.fromString("{\"path\":\"databxehujcqgzwvx\"}")
            .toObject(SapEccResourceDatasetTypeProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SapEccResourceDatasetTypeProperties model
            = new SapEccResourceDatasetTypeProperties().withPath("databxehujcqgzwvx");
        model = BinaryData.fromObject(model).toObject(SapEccResourceDatasetTypeProperties.class);
    }
}
