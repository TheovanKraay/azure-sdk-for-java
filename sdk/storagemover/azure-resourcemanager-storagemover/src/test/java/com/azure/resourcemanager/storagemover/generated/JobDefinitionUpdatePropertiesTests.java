// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagemover.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.storagemover.fluent.models.JobDefinitionUpdateProperties;
import com.azure.resourcemanager.storagemover.models.CopyMode;
import org.junit.jupiter.api.Assertions;

public final class JobDefinitionUpdatePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        JobDefinitionUpdateProperties model =
            BinaryData
                .fromString("{\"description\":\"ujjugwdkcglh\",\"copyMode\":\"Additive\",\"agentName\":\"jdyggdtji\"}")
                .toObject(JobDefinitionUpdateProperties.class);
        Assertions.assertEquals("ujjugwdkcglh", model.description());
        Assertions.assertEquals(CopyMode.ADDITIVE, model.copyMode());
        Assertions.assertEquals("jdyggdtji", model.agentName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        JobDefinitionUpdateProperties model =
            new JobDefinitionUpdateProperties()
                .withDescription("ujjugwdkcglh")
                .withCopyMode(CopyMode.ADDITIVE)
                .withAgentName("jdyggdtji");
        model = BinaryData.fromObject(model).toObject(JobDefinitionUpdateProperties.class);
        Assertions.assertEquals("ujjugwdkcglh", model.description());
        Assertions.assertEquals(CopyMode.ADDITIVE, model.copyMode());
        Assertions.assertEquals("jdyggdtji", model.agentName());
    }
}
