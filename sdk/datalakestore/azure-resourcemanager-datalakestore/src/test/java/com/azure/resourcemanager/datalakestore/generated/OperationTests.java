// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakestore.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datalakestore.models.Operation;
import com.azure.resourcemanager.datalakestore.models.OperationDisplay;

public final class OperationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Operation model = BinaryData.fromString(
            "{\"name\":\"hvpmoue\",\"display\":{\"provider\":\"zxibqeoj\",\"resource\":\"qbzvddntwnd\",\"operation\":\"cbtwnpzaoqvuh\",\"description\":\"cffcyddglmj\"},\"origin\":\"user\"}")
            .toObject(Operation.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Operation model = new Operation().withDisplay(new OperationDisplay());
        model = BinaryData.fromObject(model).toObject(Operation.class);
    }
}
