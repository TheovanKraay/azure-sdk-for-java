// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties of a managed identity. */
@Fluent
public final class IdentityProperties {
    /*
     * Managed identity.
     */
    @JsonProperty(value = "type")
    private ManagedIdentityType type;

    /*
     * The principal id of resource identity.
     */
    @JsonProperty(value = "principalId")
    private String principalId;

    /*
     * The tenant identifier of resource.
     */
    @JsonProperty(value = "tenantId")
    private String tenantId;

    /*
     * The client secret URL of the identity.
     */
    @JsonProperty(value = "clientSecretUrl")
    private String clientSecretUrl;

    /** Creates an instance of IdentityProperties class. */
    public IdentityProperties() {
    }

    /**
     * Get the type property: Managed identity.
     *
     * @return the type value.
     */
    public ManagedIdentityType type() {
        return this.type;
    }

    /**
     * Set the type property: Managed identity.
     *
     * @param type the type value to set.
     * @return the IdentityProperties object itself.
     */
    public IdentityProperties withType(ManagedIdentityType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the principalId property: The principal id of resource identity.
     *
     * @return the principalId value.
     */
    public String principalId() {
        return this.principalId;
    }

    /**
     * Set the principalId property: The principal id of resource identity.
     *
     * @param principalId the principalId value to set.
     * @return the IdentityProperties object itself.
     */
    public IdentityProperties withPrincipalId(String principalId) {
        this.principalId = principalId;
        return this;
    }

    /**
     * Get the tenantId property: The tenant identifier of resource.
     *
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Set the tenantId property: The tenant identifier of resource.
     *
     * @param tenantId the tenantId value to set.
     * @return the IdentityProperties object itself.
     */
    public IdentityProperties withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * Get the clientSecretUrl property: The client secret URL of the identity.
     *
     * @return the clientSecretUrl value.
     */
    public String clientSecretUrl() {
        return this.clientSecretUrl;
    }

    /**
     * Set the clientSecretUrl property: The client secret URL of the identity.
     *
     * @param clientSecretUrl the clientSecretUrl value to set.
     * @return the IdentityProperties object itself.
     */
    public IdentityProperties withClientSecretUrl(String clientSecretUrl) {
        this.clientSecretUrl = clientSecretUrl;
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
