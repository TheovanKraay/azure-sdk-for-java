// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.cdn.models.ProfileLogScrubbing;
import java.io.IOException;

/**
 * The JSON object containing profile update parameters.
 */
@Fluent
public final class ProfilePropertiesUpdateParameters implements JsonSerializable<ProfilePropertiesUpdateParameters> {
    /*
     * Send and receive timeout on forwarding request to the origin. When timeout is reached, the request fails and
     * returns.
     */
    private Integer originResponseTimeoutSeconds;

    /*
     * Defines rules to scrub sensitive fields in logs
     */
    private ProfileLogScrubbing logScrubbing;

    /**
     * Creates an instance of ProfilePropertiesUpdateParameters class.
     */
    public ProfilePropertiesUpdateParameters() {
    }

    /**
     * Get the originResponseTimeoutSeconds property: Send and receive timeout on forwarding request to the origin. When
     * timeout is reached, the request fails and returns.
     * 
     * @return the originResponseTimeoutSeconds value.
     */
    public Integer originResponseTimeoutSeconds() {
        return this.originResponseTimeoutSeconds;
    }

    /**
     * Set the originResponseTimeoutSeconds property: Send and receive timeout on forwarding request to the origin. When
     * timeout is reached, the request fails and returns.
     * 
     * @param originResponseTimeoutSeconds the originResponseTimeoutSeconds value to set.
     * @return the ProfilePropertiesUpdateParameters object itself.
     */
    public ProfilePropertiesUpdateParameters withOriginResponseTimeoutSeconds(Integer originResponseTimeoutSeconds) {
        this.originResponseTimeoutSeconds = originResponseTimeoutSeconds;
        return this;
    }

    /**
     * Get the logScrubbing property: Defines rules to scrub sensitive fields in logs.
     * 
     * @return the logScrubbing value.
     */
    public ProfileLogScrubbing logScrubbing() {
        return this.logScrubbing;
    }

    /**
     * Set the logScrubbing property: Defines rules to scrub sensitive fields in logs.
     * 
     * @param logScrubbing the logScrubbing value to set.
     * @return the ProfilePropertiesUpdateParameters object itself.
     */
    public ProfilePropertiesUpdateParameters withLogScrubbing(ProfileLogScrubbing logScrubbing) {
        this.logScrubbing = logScrubbing;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (logScrubbing() != null) {
            logScrubbing().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeNumberField("originResponseTimeoutSeconds", this.originResponseTimeoutSeconds);
        jsonWriter.writeJsonField("logScrubbing", this.logScrubbing);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ProfilePropertiesUpdateParameters from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ProfilePropertiesUpdateParameters if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ProfilePropertiesUpdateParameters.
     */
    public static ProfilePropertiesUpdateParameters fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ProfilePropertiesUpdateParameters deserializedProfilePropertiesUpdateParameters
                = new ProfilePropertiesUpdateParameters();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("originResponseTimeoutSeconds".equals(fieldName)) {
                    deserializedProfilePropertiesUpdateParameters.originResponseTimeoutSeconds
                        = reader.getNullable(JsonReader::getInt);
                } else if ("logScrubbing".equals(fieldName)) {
                    deserializedProfilePropertiesUpdateParameters.logScrubbing = ProfileLogScrubbing.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedProfilePropertiesUpdateParameters;
        });
    }
}
