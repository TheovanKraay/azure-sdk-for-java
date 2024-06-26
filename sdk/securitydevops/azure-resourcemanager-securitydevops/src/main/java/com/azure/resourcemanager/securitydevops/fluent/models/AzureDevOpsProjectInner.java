// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securitydevops.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.securitydevops.models.AzureDevOpsProjectProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Azure DevOps Project Proxy Resource. */
@Fluent
public final class AzureDevOpsProjectInner extends ProxyResource {
    /*
     * AzureDevOps Project properties.
     */
    @JsonProperty(value = "properties")
    private AzureDevOpsProjectProperties properties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /** Creates an instance of AzureDevOpsProjectInner class. */
    public AzureDevOpsProjectInner() {
    }

    /**
     * Get the properties property: AzureDevOps Project properties.
     *
     * @return the properties value.
     */
    public AzureDevOpsProjectProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: AzureDevOps Project properties.
     *
     * @param properties the properties value to set.
     * @return the AzureDevOpsProjectInner object itself.
     */
    public AzureDevOpsProjectInner withProperties(AzureDevOpsProjectProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }
}
