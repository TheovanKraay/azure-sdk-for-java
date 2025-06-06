// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Defines rules that scrub sensitive fields in the Azure Front Door profile logs.
 */
@Fluent
public final class ProfileLogScrubbing implements JsonSerializable<ProfileLogScrubbing> {
    /*
     * State of the log scrubbing config. Default value is Enabled.
     */
    private ProfileScrubbingState state;

    /*
     * List of log scrubbing rules applied to the Azure Front Door profile logs.
     */
    private List<ProfileScrubbingRules> scrubbingRules;

    /**
     * Creates an instance of ProfileLogScrubbing class.
     */
    public ProfileLogScrubbing() {
    }

    /**
     * Get the state property: State of the log scrubbing config. Default value is Enabled.
     * 
     * @return the state value.
     */
    public ProfileScrubbingState state() {
        return this.state;
    }

    /**
     * Set the state property: State of the log scrubbing config. Default value is Enabled.
     * 
     * @param state the state value to set.
     * @return the ProfileLogScrubbing object itself.
     */
    public ProfileLogScrubbing withState(ProfileScrubbingState state) {
        this.state = state;
        return this;
    }

    /**
     * Get the scrubbingRules property: List of log scrubbing rules applied to the Azure Front Door profile logs.
     * 
     * @return the scrubbingRules value.
     */
    public List<ProfileScrubbingRules> scrubbingRules() {
        return this.scrubbingRules;
    }

    /**
     * Set the scrubbingRules property: List of log scrubbing rules applied to the Azure Front Door profile logs.
     * 
     * @param scrubbingRules the scrubbingRules value to set.
     * @return the ProfileLogScrubbing object itself.
     */
    public ProfileLogScrubbing withScrubbingRules(List<ProfileScrubbingRules> scrubbingRules) {
        this.scrubbingRules = scrubbingRules;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (scrubbingRules() != null) {
            scrubbingRules().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("state", this.state == null ? null : this.state.toString());
        jsonWriter.writeArrayField("scrubbingRules", this.scrubbingRules,
            (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ProfileLogScrubbing from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ProfileLogScrubbing if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ProfileLogScrubbing.
     */
    public static ProfileLogScrubbing fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ProfileLogScrubbing deserializedProfileLogScrubbing = new ProfileLogScrubbing();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("state".equals(fieldName)) {
                    deserializedProfileLogScrubbing.state = ProfileScrubbingState.fromString(reader.getString());
                } else if ("scrubbingRules".equals(fieldName)) {
                    List<ProfileScrubbingRules> scrubbingRules
                        = reader.readArray(reader1 -> ProfileScrubbingRules.fromJson(reader1));
                    deserializedProfileLogScrubbing.scrubbingRules = scrubbingRules;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedProfileLogScrubbing;
        });
    }
}
