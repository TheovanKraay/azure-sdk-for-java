// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.webpubsub.models.Sku;

public final class SkuTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Sku model =
            BinaryData
                .fromString(
                    "{\"resourceType\":\"wsmystuluqypf\",\"sku\":{\"name\":\"lerchpq\",\"tier\":\"Free\",\"size\":\"jbabwidf\",\"family\":\"sspuunnoxyhkx\",\"capacity\":1867309112},\"capacity\":{\"minimum\":219828682,\"maximum\":1280530722,\"default\":1330535763,\"allowedValues\":[1962921409,569330196,235411748,1037485333],\"scaleType\":\"Manual\"}}")
                .toObject(Sku.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Sku model = new Sku();
        model = BinaryData.fromObject(model).toObject(Sku.class);
    }
}
