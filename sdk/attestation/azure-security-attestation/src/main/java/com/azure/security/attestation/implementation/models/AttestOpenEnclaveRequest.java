// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.security.attestation.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.Base64Url;
import com.azure.core.util.CoreUtils;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Attestation request for Intel SGX enclaves. */
@Fluent
public final class AttestOpenEnclaveRequest {
    /*
     * OpenEnclave report from the enclave to be attested
     */
    @JsonProperty(value = "report")
    private Base64Url report;

    /*
     * Runtime data provided by the enclave at the time of report generation.
     * The MAA will verify that the first 32 bytes of the report_data field of
     * the quote contains the SHA256 hash of the decoded "data" field of the
     * runtime data.
     */
    @JsonProperty(value = "runtimeData")
    private RuntimeData runtimeData;

    /*
     * Base64Url encoded "InitTime data". The MAA will verify that the init
     * data was known to the enclave. Note that InitTimeData is invalid for
     * CoffeeLake processors.
     */
    @JsonProperty(value = "initTimeData")
    private InitTimeData initTimeData;

    /*
     * Attest against the provided draft policy. Note that the resulting token
     * cannot be validated.
     */
    @JsonProperty(value = "draftPolicyForAttestation")
    private String draftPolicyForAttestation;

    /**
     * Get the report property: OpenEnclave report from the enclave to be attested.
     *
     * @return the report value.
     */
    public byte[] getReport() {
        if (this.report == null) {
            return new byte[0];
        }
        return this.report.decodedBytes();
    }

    /**
     * Set the report property: OpenEnclave report from the enclave to be attested.
     *
     * @param report the report value to set.
     * @return the AttestOpenEnclaveRequest object itself.
     */
    public AttestOpenEnclaveRequest setReport(byte[] report) {
        if (report == null) {
            this.report = null;
        } else {
            this.report = Base64Url.encode(CoreUtils.clone(report));
        }
        return this;
    }

    /**
     * Get the runtimeData property: Runtime data provided by the enclave at the time of report generation. The MAA will
     * verify that the first 32 bytes of the report_data field of the quote contains the SHA256 hash of the decoded
     * "data" field of the runtime data.
     *
     * @return the runtimeData value.
     */
    public RuntimeData getRuntimeData() {
        return this.runtimeData;
    }

    /**
     * Set the runtimeData property: Runtime data provided by the enclave at the time of report generation. The MAA will
     * verify that the first 32 bytes of the report_data field of the quote contains the SHA256 hash of the decoded
     * "data" field of the runtime data.
     *
     * @param runtimeData the runtimeData value to set.
     * @return the AttestOpenEnclaveRequest object itself.
     */
    public AttestOpenEnclaveRequest setRuntimeData(RuntimeData runtimeData) {
        this.runtimeData = runtimeData;
        return this;
    }

    /**
     * Get the initTimeData property: Base64Url encoded "InitTime data". The MAA will verify that the init data was
     * known to the enclave. Note that InitTimeData is invalid for CoffeeLake processors.
     *
     * @return the initTimeData value.
     */
    public InitTimeData getInitTimeData() {
        return this.initTimeData;
    }

    /**
     * Set the initTimeData property: Base64Url encoded "InitTime data". The MAA will verify that the init data was
     * known to the enclave. Note that InitTimeData is invalid for CoffeeLake processors.
     *
     * @param initTimeData the initTimeData value to set.
     * @return the AttestOpenEnclaveRequest object itself.
     */
    public AttestOpenEnclaveRequest setInitTimeData(InitTimeData initTimeData) {
        this.initTimeData = initTimeData;
        return this;
    }

    /**
     * Get the draftPolicyForAttestation property: Attest against the provided draft policy. Note that the resulting
     * token cannot be validated.
     *
     * @return the draftPolicyForAttestation value.
     */
    public String getDraftPolicyForAttestation() {
        return this.draftPolicyForAttestation;
    }

    /**
     * Set the draftPolicyForAttestation property: Attest against the provided draft policy. Note that the resulting
     * token cannot be validated.
     *
     * @param draftPolicyForAttestation the draftPolicyForAttestation value to set.
     * @return the AttestOpenEnclaveRequest object itself.
     */
    public AttestOpenEnclaveRequest setDraftPolicyForAttestation(String draftPolicyForAttestation) {
        this.draftPolicyForAttestation = draftPolicyForAttestation;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getRuntimeData() != null) {
            getRuntimeData().validate();
        }
        if (getInitTimeData() != null) {
            getInitTimeData().validate();
        }
    }
}
