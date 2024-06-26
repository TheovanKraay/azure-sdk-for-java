// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.databox.models.UpdateJobDetails;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Job Properties for update. */
@Fluent
public final class UpdateJobProperties {
    /*
     * Details of a job to be updated.
     */
    @JsonProperty(value = "details")
    private UpdateJobDetails details;

    /** Creates an instance of UpdateJobProperties class. */
    public UpdateJobProperties() {
    }

    /**
     * Get the details property: Details of a job to be updated.
     *
     * @return the details value.
     */
    public UpdateJobDetails details() {
        return this.details;
    }

    /**
     * Set the details property: Details of a job to be updated.
     *
     * @param details the details value to set.
     * @return the UpdateJobProperties object itself.
     */
    public UpdateJobProperties withDetails(UpdateJobDetails details) {
        this.details = details;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (details() != null) {
            details().validate();
        }
    }
}
