// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hdinsight.containers.models.ComparisonOperator;
import com.azure.resourcemanager.hdinsight.containers.models.ComparisonRule;
import com.azure.resourcemanager.hdinsight.containers.models.LoadBasedConfig;
import com.azure.resourcemanager.hdinsight.containers.models.ScaleActionType;
import com.azure.resourcemanager.hdinsight.containers.models.ScalingRule;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class LoadBasedConfigTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        LoadBasedConfig model = BinaryData.fromString(
            "{\"minNodes\":385457826,\"maxNodes\":395045632,\"pollInterval\":1463995661,\"cooldownPeriod\":2026519653,\"scalingRules\":[{\"actionType\":\"scaledown\",\"evaluationCount\":948183907,\"scalingMetric\":\"rvnaenqpeh\",\"comparisonRule\":{\"operator\":\"lessThanOrEqual\",\"threshold\":15.866309}},{\"actionType\":\"scaleup\",\"evaluationCount\":895776000,\"scalingMetric\":\"gmifthnzd\",\"comparisonRule\":{\"operator\":\"lessThanOrEqual\",\"threshold\":6.8623724}}]}")
            .toObject(LoadBasedConfig.class);
        Assertions.assertEquals(385457826, model.minNodes());
        Assertions.assertEquals(395045632, model.maxNodes());
        Assertions.assertEquals(1463995661, model.pollInterval());
        Assertions.assertEquals(2026519653, model.cooldownPeriod());
        Assertions.assertEquals(ScaleActionType.SCALEDOWN, model.scalingRules().get(0).actionType());
        Assertions.assertEquals(948183907, model.scalingRules().get(0).evaluationCount());
        Assertions.assertEquals("rvnaenqpeh", model.scalingRules().get(0).scalingMetric());
        Assertions.assertEquals(ComparisonOperator.LESS_THAN_OR_EQUAL,
            model.scalingRules().get(0).comparisonRule().operator());
        Assertions.assertEquals(15.866309f, model.scalingRules().get(0).comparisonRule().threshold());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        LoadBasedConfig model = new LoadBasedConfig().withMinNodes(385457826)
            .withMaxNodes(395045632)
            .withPollInterval(1463995661)
            .withCooldownPeriod(2026519653)
            .withScalingRules(Arrays.asList(
                new ScalingRule().withActionType(ScaleActionType.SCALEDOWN)
                    .withEvaluationCount(948183907)
                    .withScalingMetric("rvnaenqpeh")
                    .withComparisonRule(new ComparisonRule().withOperator(ComparisonOperator.LESS_THAN_OR_EQUAL)
                        .withThreshold(15.866309f)),
                new ScalingRule().withActionType(ScaleActionType.SCALEUP)
                    .withEvaluationCount(895776000)
                    .withScalingMetric("gmifthnzd")
                    .withComparisonRule(new ComparisonRule().withOperator(ComparisonOperator.LESS_THAN_OR_EQUAL)
                        .withThreshold(6.8623724f))));
        model = BinaryData.fromObject(model).toObject(LoadBasedConfig.class);
        Assertions.assertEquals(385457826, model.minNodes());
        Assertions.assertEquals(395045632, model.maxNodes());
        Assertions.assertEquals(1463995661, model.pollInterval());
        Assertions.assertEquals(2026519653, model.cooldownPeriod());
        Assertions.assertEquals(ScaleActionType.SCALEDOWN, model.scalingRules().get(0).actionType());
        Assertions.assertEquals(948183907, model.scalingRules().get(0).evaluationCount());
        Assertions.assertEquals("rvnaenqpeh", model.scalingRules().get(0).scalingMetric());
        Assertions.assertEquals(ComparisonOperator.LESS_THAN_OR_EQUAL,
            model.scalingRules().get(0).comparisonRule().operator());
        Assertions.assertEquals(15.866309f, model.scalingRules().get(0).comparisonRule().threshold());
    }
}
