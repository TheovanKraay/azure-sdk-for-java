// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.vision.face.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response body for adding face.
 */
@Immutable
public final class AddFaceResult {

    /*
     * Persisted Face ID of the added face, which is persisted and will not expire. Different from faceId which is created in "Detect" and will expire in 24 hours after the detection call.
     */
    @Generated
    @JsonProperty(value = "persistedFaceId")
    private final String persistedFaceId;

    /**
     * Creates an instance of AddFaceResult class.
     *
     * @param persistedFaceId the persistedFaceId value to set.
     */
    @Generated
    @JsonCreator
    private AddFaceResult(@JsonProperty(value = "persistedFaceId") String persistedFaceId) {
        this.persistedFaceId = persistedFaceId;
    }

    /**
     * Get the persistedFaceId property: Persisted Face ID of the added face, which is persisted and will not expire.
     * Different from faceId which is created in "Detect" and will expire in 24 hours after the detection call.
     *
     * @return the persistedFaceId value.
     */
    @Generated
    public String getPersistedFaceId() {
        return this.persistedFaceId;
    }
}
