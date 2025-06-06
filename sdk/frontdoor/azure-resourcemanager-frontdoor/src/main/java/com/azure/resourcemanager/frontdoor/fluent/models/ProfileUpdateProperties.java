// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.frontdoor.models.State;
import java.io.IOException;

/**
 * Defines the properties of an experiment.
 */
@Fluent
public final class ProfileUpdateProperties implements JsonSerializable<ProfileUpdateProperties> {
    /*
     * The enabled state of the Profile
     */
    private State enabledState;

    /**
     * Creates an instance of ProfileUpdateProperties class.
     */
    public ProfileUpdateProperties() {
    }

    /**
     * Get the enabledState property: The enabled state of the Profile.
     * 
     * @return the enabledState value.
     */
    public State enabledState() {
        return this.enabledState;
    }

    /**
     * Set the enabledState property: The enabled state of the Profile.
     * 
     * @param enabledState the enabledState value to set.
     * @return the ProfileUpdateProperties object itself.
     */
    public ProfileUpdateProperties withEnabledState(State enabledState) {
        this.enabledState = enabledState;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("enabledState", this.enabledState == null ? null : this.enabledState.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ProfileUpdateProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ProfileUpdateProperties if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ProfileUpdateProperties.
     */
    public static ProfileUpdateProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ProfileUpdateProperties deserializedProfileUpdateProperties = new ProfileUpdateProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("enabledState".equals(fieldName)) {
                    deserializedProfileUpdateProperties.enabledState = State.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedProfileUpdateProperties;
        });
    }
}
