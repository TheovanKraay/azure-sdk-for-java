// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Details of the customer managed key associated with the workspace.
 */
@Fluent
public final class WorkspaceKeyDetails {
    /*
     * Workspace Key sub-resource name
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Workspace Key sub-resource key vault url
     */
    @JsonProperty(value = "keyVaultUrl")
    private String keyVaultUrl;

    /**
     * Creates an instance of WorkspaceKeyDetails class.
     */
    public WorkspaceKeyDetails() {
    }

    /**
     * Get the name property: Workspace Key sub-resource name.
     * 
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: Workspace Key sub-resource name.
     * 
     * @param name the name value to set.
     * @return the WorkspaceKeyDetails object itself.
     */
    public WorkspaceKeyDetails setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the keyVaultUrl property: Workspace Key sub-resource key vault url.
     * 
     * @return the keyVaultUrl value.
     */
    public String getKeyVaultUrl() {
        return this.keyVaultUrl;
    }

    /**
     * Set the keyVaultUrl property: Workspace Key sub-resource key vault url.
     * 
     * @param keyVaultUrl the keyVaultUrl value to set.
     * @return the WorkspaceKeyDetails object itself.
     */
    public WorkspaceKeyDetails setKeyVaultUrl(String keyVaultUrl) {
        this.keyVaultUrl = keyVaultUrl;
        return this;
    }
}
