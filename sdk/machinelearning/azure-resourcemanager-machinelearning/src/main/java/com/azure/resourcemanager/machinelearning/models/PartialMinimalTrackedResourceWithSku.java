// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Strictly used in update requests. */
@Fluent
public final class PartialMinimalTrackedResourceWithSku extends PartialMinimalTrackedResource {
    /*
     * Sku details required for ARM contract for Autoscaling.
     */
    @JsonProperty(value = "sku")
    private PartialSku sku;

    /** Creates an instance of PartialMinimalTrackedResourceWithSku class. */
    public PartialMinimalTrackedResourceWithSku() {
    }

    /**
     * Get the sku property: Sku details required for ARM contract for Autoscaling.
     *
     * @return the sku value.
     */
    public PartialSku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: Sku details required for ARM contract for Autoscaling.
     *
     * @param sku the sku value to set.
     * @return the PartialMinimalTrackedResourceWithSku object itself.
     */
    public PartialMinimalTrackedResourceWithSku withSku(PartialSku sku) {
        this.sku = sku;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public PartialMinimalTrackedResourceWithSku withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (sku() != null) {
            sku().validate();
        }
    }
}
