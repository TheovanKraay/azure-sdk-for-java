// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.quota.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.quota.fluent.models.QuotaAllocationRequestStatusInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * List of QuotaAllocation Request Status.
 */
@Fluent
public final class QuotaAllocationRequestStatusList {
    /*
     * List of QuotaAllocation Request Status
     */
    @JsonProperty(value = "value")
    private List<QuotaAllocationRequestStatusInner> value;

    /*
     * The URL to use for getting the next set of results.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Creates an instance of QuotaAllocationRequestStatusList class.
     */
    public QuotaAllocationRequestStatusList() {
    }

    /**
     * Get the value property: List of QuotaAllocation Request Status.
     * 
     * @return the value value.
     */
    public List<QuotaAllocationRequestStatusInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of QuotaAllocation Request Status.
     * 
     * @param value the value value to set.
     * @return the QuotaAllocationRequestStatusList object itself.
     */
    public QuotaAllocationRequestStatusList withValue(List<QuotaAllocationRequestStatusInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to use for getting the next set of results.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
