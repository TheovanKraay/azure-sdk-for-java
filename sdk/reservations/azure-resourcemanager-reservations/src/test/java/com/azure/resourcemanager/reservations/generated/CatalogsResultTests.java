// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.reservations.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.reservations.models.CatalogsResult;
import org.junit.jupiter.api.Assertions;

public final class CatalogsResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CatalogsResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"resourceType\":\"ufo\",\"name\":\"jywif\",\"billingPlans\":{\"gdf\":[\"Upfront\",\"Monthly\"],\"j\":[\"Upfront\",\"Monthly\",\"Upfront\",\"Upfront\"]},\"terms\":[\"P3Y\",\"P1Y\",\"P5Y\",\"P1Y\"],\"locations\":[\"ktsizntocipaou\",\"jpsq\",\"cmpoyfdkfogkny\",\"jofjd\"],\"skuProperties\":[],\"msrp\":{},\"restrictions\":[],\"tier\":\"pewnw\",\"size\":\"itjz\",\"capabilities\":[]},{\"resourceType\":\"sarhmofc\",\"name\":\"smy\",\"billingPlans\":{\"he\":[\"Monthly\",\"Monthly\",\"Upfront\",\"Monthly\"],\"txukcdmp\":[\"Upfront\",\"Monthly\",\"Upfront\"],\"anzwuxzdxta\":[\"Upfront\",\"Monthly\",\"Upfront\",\"Monthly\"]},\"terms\":[\"P5Y\",\"P1Y\",\"P3Y\",\"P1Y\"],\"locations\":[\"mrqobmtukknr\",\"rtihfxtijbpz\"],\"skuProperties\":[],\"msrp\":{},\"restrictions\":[],\"tier\":\"glzufc\",\"size\":\"kohdbiha\",\"capabilities\":[]}],\"nextLink\":\"fcbjysagithxqha\",\"totalItems\":581861231239656930}")
                .toObject(CatalogsResult.class);
        Assertions.assertEquals(581861231239656930L, model.totalItems());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CatalogsResult model = new CatalogsResult().withTotalItems(581861231239656930L);
        model = BinaryData.fromObject(model).toObject(CatalogsResult.class);
        Assertions.assertEquals(581861231239656930L, model.totalItems());
    }
}