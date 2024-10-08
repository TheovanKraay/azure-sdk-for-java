// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.MariaDBSource;

public final class MariaDBSourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MariaDBSource model = BinaryData.fromString(
            "{\"type\":\"MariaDBSource\",\"query\":\"dataxmobnehbbchtcoel\",\"queryTimeout\":\"datafnpxumgnjmsk\",\"additionalColumns\":\"dataeuogjiowande\",\"sourceRetryCount\":\"dataebpalz\",\"sourceRetryWait\":\"dataptg\",\"maxConcurrentConnections\":\"datarz\",\"disableMetricsCollection\":\"datacfdsvmptnrz\",\"\":{\"ovqpnxpufvggv\":\"datacncdazwtlgora\"}}")
            .toObject(MariaDBSource.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MariaDBSource model = new MariaDBSource().withSourceRetryCount("dataebpalz")
            .withSourceRetryWait("dataptg")
            .withMaxConcurrentConnections("datarz")
            .withDisableMetricsCollection("datacfdsvmptnrz")
            .withQueryTimeout("datafnpxumgnjmsk")
            .withAdditionalColumns("dataeuogjiowande")
            .withQuery("dataxmobnehbbchtcoel");
        model = BinaryData.fromObject(model).toObject(MariaDBSource.class);
    }
}
