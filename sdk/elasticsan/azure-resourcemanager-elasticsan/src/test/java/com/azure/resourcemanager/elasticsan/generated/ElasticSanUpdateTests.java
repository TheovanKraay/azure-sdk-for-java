// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elasticsan.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.elasticsan.models.AutoScalePolicyEnforcement;
import com.azure.resourcemanager.elasticsan.models.AutoScaleProperties;
import com.azure.resourcemanager.elasticsan.models.ElasticSanUpdate;
import com.azure.resourcemanager.elasticsan.models.PublicNetworkAccess;
import com.azure.resourcemanager.elasticsan.models.ScaleUpProperties;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ElasticSanUpdateTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ElasticSanUpdate model = BinaryData.fromString(
            "{\"properties\":{\"baseSizeTiB\":674653859163101275,\"extendedCapacitySizeTiB\":4081336864797272567,\"publicNetworkAccess\":\"Disabled\",\"autoScaleProperties\":{\"scaleUpProperties\":{\"unusedSizeTiB\":4286548881937925421,\"increaseCapacityUnitByTiB\":4273120658248809986,\"capacityUnitScaleUpLimitTiB\":4617663659478224869,\"autoScalePolicyEnforcement\":\"Enabled\"}}},\"tags\":{\"kiiuxhqyudxor\":\"ys\",\"poczvyifqrvkdvjs\":\"qn\",\"d\":\"lrmv\",\"zwtruwiqzbqjvsov\":\"watkpnpulexxb\"}}")
            .toObject(ElasticSanUpdate.class);
        Assertions.assertEquals("ys", model.tags().get("kiiuxhqyudxor"));
        Assertions.assertEquals(674653859163101275L, model.baseSizeTiB());
        Assertions.assertEquals(4081336864797272567L, model.extendedCapacitySizeTiB());
        Assertions.assertEquals(PublicNetworkAccess.DISABLED, model.publicNetworkAccess());
        Assertions.assertEquals(4286548881937925421L, model.autoScaleProperties().scaleUpProperties().unusedSizeTiB());
        Assertions.assertEquals(4273120658248809986L,
            model.autoScaleProperties().scaleUpProperties().increaseCapacityUnitByTiB());
        Assertions.assertEquals(4617663659478224869L,
            model.autoScaleProperties().scaleUpProperties().capacityUnitScaleUpLimitTiB());
        Assertions.assertEquals(AutoScalePolicyEnforcement.ENABLED,
            model.autoScaleProperties().scaleUpProperties().autoScalePolicyEnforcement());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ElasticSanUpdate model = new ElasticSanUpdate()
            .withTags(mapOf("kiiuxhqyudxor", "ys", "poczvyifqrvkdvjs", "qn", "d", "lrmv", "zwtruwiqzbqjvsov",
                "watkpnpulexxb"))
            .withBaseSizeTiB(674653859163101275L)
            .withExtendedCapacitySizeTiB(4081336864797272567L)
            .withPublicNetworkAccess(PublicNetworkAccess.DISABLED)
            .withAutoScaleProperties(new AutoScaleProperties()
                .withScaleUpProperties(new ScaleUpProperties().withUnusedSizeTiB(4286548881937925421L)
                    .withIncreaseCapacityUnitByTiB(4273120658248809986L)
                    .withCapacityUnitScaleUpLimitTiB(4617663659478224869L)
                    .withAutoScalePolicyEnforcement(AutoScalePolicyEnforcement.ENABLED)));
        model = BinaryData.fromObject(model).toObject(ElasticSanUpdate.class);
        Assertions.assertEquals("ys", model.tags().get("kiiuxhqyudxor"));
        Assertions.assertEquals(674653859163101275L, model.baseSizeTiB());
        Assertions.assertEquals(4081336864797272567L, model.extendedCapacitySizeTiB());
        Assertions.assertEquals(PublicNetworkAccess.DISABLED, model.publicNetworkAccess());
        Assertions.assertEquals(4286548881937925421L, model.autoScaleProperties().scaleUpProperties().unusedSizeTiB());
        Assertions.assertEquals(4273120658248809986L,
            model.autoScaleProperties().scaleUpProperties().increaseCapacityUnitByTiB());
        Assertions.assertEquals(4617663659478224869L,
            model.autoScaleProperties().scaleUpProperties().capacityUnitScaleUpLimitTiB());
        Assertions.assertEquals(AutoScalePolicyEnforcement.ENABLED,
            model.autoScaleProperties().scaleUpProperties().autoScalePolicyEnforcement());
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
