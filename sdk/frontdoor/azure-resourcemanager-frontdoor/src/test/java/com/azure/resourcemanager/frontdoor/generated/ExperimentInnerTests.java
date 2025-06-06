// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.frontdoor.fluent.models.ExperimentInner;
import com.azure.resourcemanager.frontdoor.models.Endpoint;
import com.azure.resourcemanager.frontdoor.models.State;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ExperimentInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ExperimentInner model = BinaryData.fromString(
            "{\"properties\":{\"description\":\"jmonfdgn\",\"endpointA\":{\"name\":\"ypuuwwltvuqjctze\",\"endpoint\":\"eifzzhmk\"},\"endpointB\":{\"name\":\"vflyhbxcu\",\"endpoint\":\"hxgsrboldfor\"},\"enabledState\":\"Disabled\",\"resourceState\":\"Enabling\",\"status\":\"izbfhfovvacq\",\"scriptFileUri\":\"tuodxeszabbelaw\"},\"location\":\"muaslzkw\",\"tags\":{\"ahnomdrkywu\":\"oycqucwy\",\"lniexz\":\"psvfuurutlwexxwl\",\"tybbwwpgda\":\"rzpgep\"},\"id\":\"chzyvlixqnrk\",\"name\":\"xkjibnxmy\",\"type\":\"uxswqrntvl\"}")
            .toObject(ExperimentInner.class);
        Assertions.assertEquals("muaslzkw", model.location());
        Assertions.assertEquals("oycqucwy", model.tags().get("ahnomdrkywu"));
        Assertions.assertEquals("jmonfdgn", model.description());
        Assertions.assertEquals("ypuuwwltvuqjctze", model.endpointA().name());
        Assertions.assertEquals("eifzzhmk", model.endpointA().endpoint());
        Assertions.assertEquals("vflyhbxcu", model.endpointB().name());
        Assertions.assertEquals("hxgsrboldfor", model.endpointB().endpoint());
        Assertions.assertEquals(State.DISABLED, model.enabledState());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ExperimentInner model = new ExperimentInner().withLocation("muaslzkw")
            .withTags(mapOf("ahnomdrkywu", "oycqucwy", "lniexz", "psvfuurutlwexxwl", "tybbwwpgda", "rzpgep"))
            .withDescription("jmonfdgn")
            .withEndpointA(new Endpoint().withName("ypuuwwltvuqjctze").withEndpoint("eifzzhmk"))
            .withEndpointB(new Endpoint().withName("vflyhbxcu").withEndpoint("hxgsrboldfor"))
            .withEnabledState(State.DISABLED);
        model = BinaryData.fromObject(model).toObject(ExperimentInner.class);
        Assertions.assertEquals("muaslzkw", model.location());
        Assertions.assertEquals("oycqucwy", model.tags().get("ahnomdrkywu"));
        Assertions.assertEquals("jmonfdgn", model.description());
        Assertions.assertEquals("ypuuwwltvuqjctze", model.endpointA().name());
        Assertions.assertEquals("eifzzhmk", model.endpointA().endpoint());
        Assertions.assertEquals("vflyhbxcu", model.endpointB().name());
        Assertions.assertEquals("hxgsrboldfor", model.endpointB().endpoint());
        Assertions.assertEquals(State.DISABLED, model.enabledState());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
