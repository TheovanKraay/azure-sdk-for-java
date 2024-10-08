// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.trustedsigning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.trustedsigning.fluent.models.CodeSigningAccountInner;
import com.azure.resourcemanager.trustedsigning.models.AccountSku;
import com.azure.resourcemanager.trustedsigning.models.CodeSigningAccountProperties;
import com.azure.resourcemanager.trustedsigning.models.SkuName;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class CodeSigningAccountInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CodeSigningAccountInner model = BinaryData.fromString(
            "{\"properties\":{\"accountUri\":\"jbpzvgnwzsymg\",\"sku\":{\"name\":\"Basic\"},\"provisioningState\":\"Updating\"},\"location\":\"zk\",\"tags\":{\"fcbjysagithxqha\":\"bihanuf\",\"cnpqxuhivyqniwby\":\"ifpikxwczby\",\"grtfwvu\":\"rkxvdum\",\"h\":\"xgaudccs\"},\"id\":\"jcny\",\"name\":\"j\",\"type\":\"kryhtnapczwlokj\"}")
            .toObject(CodeSigningAccountInner.class);
        Assertions.assertEquals("zk", model.location());
        Assertions.assertEquals("bihanuf", model.tags().get("fcbjysagithxqha"));
        Assertions.assertEquals(SkuName.BASIC, model.properties().sku().name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CodeSigningAccountInner model = new CodeSigningAccountInner().withLocation("zk")
            .withTags(mapOf("fcbjysagithxqha", "bihanuf", "cnpqxuhivyqniwby", "ifpikxwczby", "grtfwvu", "rkxvdum", "h",
                "xgaudccs"))
            .withProperties(new CodeSigningAccountProperties().withSku(new AccountSku().withName(SkuName.BASIC)));
        model = BinaryData.fromObject(model).toObject(CodeSigningAccountInner.class);
        Assertions.assertEquals("zk", model.location());
        Assertions.assertEquals("bihanuf", model.tags().get("fcbjysagithxqha"));
        Assertions.assertEquals(SkuName.BASIC, model.properties().sku().name());
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
