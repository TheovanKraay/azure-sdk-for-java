// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mariadb.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mariadb.fluent.models.TopQueryStatisticsInputProperties;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;

public final class TopQueryStatisticsInputPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        TopQueryStatisticsInputProperties model =
            BinaryData
                .fromString(
                    "{\"numberOfTopQueries\":2042226827,\"aggregationFunction\":\"opwi\",\"observedMetric\":\"ighxpk\",\"observationStartTime\":\"2021-10-17T14:26:29Z\",\"observationEndTime\":\"2021-07-23T09:06:10Z\",\"aggregationWindow\":\"baiuebbaumny\"}")
                .toObject(TopQueryStatisticsInputProperties.class);
        Assertions.assertEquals(2042226827, model.numberOfTopQueries());
        Assertions.assertEquals("opwi", model.aggregationFunction());
        Assertions.assertEquals("ighxpk", model.observedMetric());
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-17T14:26:29Z"), model.observationStartTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-23T09:06:10Z"), model.observationEndTime());
        Assertions.assertEquals("baiuebbaumny", model.aggregationWindow());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        TopQueryStatisticsInputProperties model =
            new TopQueryStatisticsInputProperties()
                .withNumberOfTopQueries(2042226827)
                .withAggregationFunction("opwi")
                .withObservedMetric("ighxpk")
                .withObservationStartTime(OffsetDateTime.parse("2021-10-17T14:26:29Z"))
                .withObservationEndTime(OffsetDateTime.parse("2021-07-23T09:06:10Z"))
                .withAggregationWindow("baiuebbaumny");
        model = BinaryData.fromObject(model).toObject(TopQueryStatisticsInputProperties.class);
        Assertions.assertEquals(2042226827, model.numberOfTopQueries());
        Assertions.assertEquals("opwi", model.aggregationFunction());
        Assertions.assertEquals("ighxpk", model.observedMetric());
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-17T14:26:29Z"), model.observationStartTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-23T09:06:10Z"), model.observationEndTime());
        Assertions.assertEquals("baiuebbaumny", model.aggregationWindow());
    }
}