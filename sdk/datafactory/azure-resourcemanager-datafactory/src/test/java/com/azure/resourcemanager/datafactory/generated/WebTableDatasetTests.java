// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import com.azure.resourcemanager.datafactory.models.WebTableDataset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class WebTableDatasetTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        WebTableDataset model = BinaryData.fromString(
            "{\"type\":\"vsimalbmti\",\"typeProperties\":{\"index\":\"dataensjfl\",\"path\":\"dataftvvqtmvif\"},\"description\":\"gosnxajptcdfmzxa\",\"structure\":\"datalhm\",\"schema\":\"datacnnlsbnucqxhp\",\"linkedServiceName\":{\"referenceName\":\"q\",\"parameters\":{\"oxovlz\":\"datavejoy\",\"rykkxakruuptiicg\":\"datakleldkqdlqqhnt\"}},\"parameters\":{\"ek\":{\"type\":\"Int\",\"defaultValue\":\"dataxccnpxiemacmzt\"},\"rtb\":{\"type\":\"Object\",\"defaultValue\":\"datanbrysgktfmocnqbb\"},\"ohocqxugjxugdcr\":{\"type\":\"String\",\"defaultValue\":\"dataghfuifwxudy\"},\"bdmddg\":{\"type\":\"Float\",\"defaultValue\":\"dataplvhmhurosdjl\"}},\"annotations\":[\"datauyaorservpv\",\"datasorsbegcl\",\"dataex\"],\"folder\":{\"name\":\"qzyhzydyvtuqvi\"},\"\":{\"jx\":\"datansskydigt\",\"cwuzs\":\"dataocsvjekejchxzj\"}}")
            .toObject(WebTableDataset.class);
        Assertions.assertEquals("gosnxajptcdfmzxa", model.description());
        Assertions.assertEquals("q", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.INT, model.parameters().get("ek").type());
        Assertions.assertEquals("qzyhzydyvtuqvi", model.folder().name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        WebTableDataset model = new WebTableDataset().withDescription("gosnxajptcdfmzxa")
            .withStructure("datalhm")
            .withSchema("datacnnlsbnucqxhp")
            .withLinkedServiceName(new LinkedServiceReference().withReferenceName("q")
                .withParameters(mapOf("oxovlz", "datavejoy", "rykkxakruuptiicg", "datakleldkqdlqqhnt")))
            .withParameters(mapOf("ek",
                new ParameterSpecification().withType(ParameterType.INT).withDefaultValue("dataxccnpxiemacmzt"), "rtb",
                new ParameterSpecification().withType(ParameterType.OBJECT).withDefaultValue("datanbrysgktfmocnqbb"),
                "ohocqxugjxugdcr",
                new ParameterSpecification().withType(ParameterType.STRING).withDefaultValue("dataghfuifwxudy"),
                "bdmddg",
                new ParameterSpecification().withType(ParameterType.FLOAT).withDefaultValue("dataplvhmhurosdjl")))
            .withAnnotations(Arrays.asList("datauyaorservpv", "datasorsbegcl", "dataex"))
            .withFolder(new DatasetFolder().withName("qzyhzydyvtuqvi"))
            .withIndex("dataensjfl")
            .withPath("dataftvvqtmvif");
        model = BinaryData.fromObject(model).toObject(WebTableDataset.class);
        Assertions.assertEquals("gosnxajptcdfmzxa", model.description());
        Assertions.assertEquals("q", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.INT, model.parameters().get("ek").type());
        Assertions.assertEquals("qzyhzydyvtuqvi", model.folder().name());
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
