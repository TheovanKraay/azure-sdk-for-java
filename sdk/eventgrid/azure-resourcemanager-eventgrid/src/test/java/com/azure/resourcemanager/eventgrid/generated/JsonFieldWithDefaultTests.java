// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.eventgrid.models.JsonFieldWithDefault;
import org.junit.jupiter.api.Assertions;

public final class JsonFieldWithDefaultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        JsonFieldWithDefault model = BinaryData.fromString("{\"sourceField\":\"ibuyvpirf\",\"defaultValue\":\"pnqn\"}")
            .toObject(JsonFieldWithDefault.class);
        Assertions.assertEquals("ibuyvpirf", model.sourceField());
        Assertions.assertEquals("pnqn", model.defaultValue());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        JsonFieldWithDefault model = new JsonFieldWithDefault().withSourceField("ibuyvpirf").withDefaultValue("pnqn");
        model = BinaryData.fromObject(model).toObject(JsonFieldWithDefault.class);
        Assertions.assertEquals("ibuyvpirf", model.sourceField());
        Assertions.assertEquals("pnqn", model.defaultValue());
    }
}
