// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Output of the task that gets TDE certificates in Base64 encoded format. */
@Immutable
public final class GetTdeCertificatesSqlTaskOutput {
    /*
     * Mapping from certificate name to base 64 encoded format.
     */
    @JsonProperty(value = "base64EncodedCertificates", access = JsonProperty.Access.WRITE_ONLY)
    private String base64EncodedCertificates;

    /*
     * Validation errors
     */
    @JsonProperty(value = "validationErrors", access = JsonProperty.Access.WRITE_ONLY)
    private List<ReportableException> validationErrors;

    /** Creates an instance of GetTdeCertificatesSqlTaskOutput class. */
    public GetTdeCertificatesSqlTaskOutput() {
    }

    /**
     * Get the base64EncodedCertificates property: Mapping from certificate name to base 64 encoded format.
     *
     * @return the base64EncodedCertificates value.
     */
    public String base64EncodedCertificates() {
        return this.base64EncodedCertificates;
    }

    /**
     * Get the validationErrors property: Validation errors.
     *
     * @return the validationErrors value.
     */
    public List<ReportableException> validationErrors() {
        return this.validationErrors;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (validationErrors() != null) {
            validationErrors().forEach(e -> e.validate());
        }
    }
}
