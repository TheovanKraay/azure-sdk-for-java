// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.networkcloud.fluent.models.RacksPatchProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** RackPatchParameters represents the body of the request to patch the rack properties. */
@Fluent
public final class RackPatchParameters {
    /*
     * RacksPatchProperties represents the properties of the rack during patching.
     *
     * The list of the resource properties.
     */
    @JsonProperty(value = "properties")
    private RacksPatchProperties innerProperties;

    /*
     * The Azure resource tags that will replace the existing ones.
     */
    @JsonProperty(value = "tags")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tags;

    /** Creates an instance of RackPatchParameters class. */
    public RackPatchParameters() {
    }

    /**
     * Get the innerProperties property: RacksPatchProperties represents the properties of the rack during patching.
     *
     * <p>The list of the resource properties.
     *
     * @return the innerProperties value.
     */
    private RacksPatchProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the tags property: The Azure resource tags that will replace the existing ones.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: The Azure resource tags that will replace the existing ones.
     *
     * @param tags the tags value to set.
     * @return the RackPatchParameters object itself.
     */
    public RackPatchParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the rackLocation property: The free-form description of the rack location. (e.g. “DTN Datacenter, Floor 3,
     * Isle 9, Rack 2B”).
     *
     * @return the rackLocation value.
     */
    public String rackLocation() {
        return this.innerProperties() == null ? null : this.innerProperties().rackLocation();
    }

    /**
     * Set the rackLocation property: The free-form description of the rack location. (e.g. “DTN Datacenter, Floor 3,
     * Isle 9, Rack 2B”).
     *
     * @param rackLocation the rackLocation value to set.
     * @return the RackPatchParameters object itself.
     */
    public RackPatchParameters withRackLocation(String rackLocation) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RacksPatchProperties();
        }
        this.innerProperties().withRackLocation(rackLocation);
        return this;
    }

    /**
     * Get the rackSerialNumber property: The globally unique identifier for the rack.
     *
     * @return the rackSerialNumber value.
     */
    public String rackSerialNumber() {
        return this.innerProperties() == null ? null : this.innerProperties().rackSerialNumber();
    }

    /**
     * Set the rackSerialNumber property: The globally unique identifier for the rack.
     *
     * @param rackSerialNumber the rackSerialNumber value to set.
     * @return the RackPatchParameters object itself.
     */
    public RackPatchParameters withRackSerialNumber(String rackSerialNumber) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RacksPatchProperties();
        }
        this.innerProperties().withRackSerialNumber(rackSerialNumber);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
