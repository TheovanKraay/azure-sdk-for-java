// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.MLTableJobOutput;
import com.azure.resourcemanager.machinelearning.models.OutputDeliveryMode;
import org.junit.jupiter.api.Assertions;

public final class MLTableJobOutputTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MLTableJobOutput model = BinaryData.fromString(
            "{\"jobOutputType\":\"mltable\",\"uri\":\"jwqdmr\",\"mode\":\"Upload\",\"description\":\"lppqcaigazwfwlr\"}")
            .toObject(MLTableJobOutput.class);
        Assertions.assertEquals("lppqcaigazwfwlr", model.description());
        Assertions.assertEquals("jwqdmr", model.uri());
        Assertions.assertEquals(OutputDeliveryMode.UPLOAD, model.mode());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MLTableJobOutput model = new MLTableJobOutput().withDescription("lppqcaigazwfwlr")
            .withUri("jwqdmr")
            .withMode(OutputDeliveryMode.UPLOAD);
        model = BinaryData.fromObject(model).toObject(MLTableJobOutput.class);
        Assertions.assertEquals("lppqcaigazwfwlr", model.description());
        Assertions.assertEquals("jwqdmr", model.uri());
        Assertions.assertEquals(OutputDeliveryMode.UPLOAD, model.mode());
    }
}
