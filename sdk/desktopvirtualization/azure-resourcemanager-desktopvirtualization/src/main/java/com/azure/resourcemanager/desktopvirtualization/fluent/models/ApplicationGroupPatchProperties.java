// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** ApplicationGroup properties that can be patched. */
@Fluent
public final class ApplicationGroupPatchProperties {
    /*
     * Description of ApplicationGroup.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * Friendly name of ApplicationGroup.
     */
    @JsonProperty(value = "friendlyName")
    private String friendlyName;

    /*
     * Boolean representing whether the applicationGroup is show in the feed.
     */
    @JsonProperty(value = "showInFeed")
    private Boolean showInFeed;

    /** Creates an instance of ApplicationGroupPatchProperties class. */
    public ApplicationGroupPatchProperties() {
    }

    /**
     * Get the description property: Description of ApplicationGroup.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Description of ApplicationGroup.
     *
     * @param description the description value to set.
     * @return the ApplicationGroupPatchProperties object itself.
     */
    public ApplicationGroupPatchProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the friendlyName property: Friendly name of ApplicationGroup.
     *
     * @return the friendlyName value.
     */
    public String friendlyName() {
        return this.friendlyName;
    }

    /**
     * Set the friendlyName property: Friendly name of ApplicationGroup.
     *
     * @param friendlyName the friendlyName value to set.
     * @return the ApplicationGroupPatchProperties object itself.
     */
    public ApplicationGroupPatchProperties withFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    /**
     * Get the showInFeed property: Boolean representing whether the applicationGroup is show in the feed.
     *
     * @return the showInFeed value.
     */
    public Boolean showInFeed() {
        return this.showInFeed;
    }

    /**
     * Set the showInFeed property: Boolean representing whether the applicationGroup is show in the feed.
     *
     * @param showInFeed the showInFeed value to set.
     * @return the ApplicationGroupPatchProperties object itself.
     */
    public ApplicationGroupPatchProperties withShowInFeed(Boolean showInFeed) {
        this.showInFeed = showInFeed;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
