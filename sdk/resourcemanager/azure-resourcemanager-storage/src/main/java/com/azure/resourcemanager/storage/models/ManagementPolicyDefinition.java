// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * An object that defines the Lifecycle rule. Each definition is made up with a filters set and an actions set.
 */
@Fluent
public final class ManagementPolicyDefinition implements JsonSerializable<ManagementPolicyDefinition> {
    /*
     * An object that defines the action set.
     */
    private ManagementPolicyAction actions;

    /*
     * An object that defines the filter set.
     */
    private ManagementPolicyFilter filters;

    /**
     * Creates an instance of ManagementPolicyDefinition class.
     */
    public ManagementPolicyDefinition() {
    }

    /**
     * Get the actions property: An object that defines the action set.
     * 
     * @return the actions value.
     */
    public ManagementPolicyAction actions() {
        return this.actions;
    }

    /**
     * Set the actions property: An object that defines the action set.
     * 
     * @param actions the actions value to set.
     * @return the ManagementPolicyDefinition object itself.
     */
    public ManagementPolicyDefinition withActions(ManagementPolicyAction actions) {
        this.actions = actions;
        return this;
    }

    /**
     * Get the filters property: An object that defines the filter set.
     * 
     * @return the filters value.
     */
    public ManagementPolicyFilter filters() {
        return this.filters;
    }

    /**
     * Set the filters property: An object that defines the filter set.
     * 
     * @param filters the filters value to set.
     * @return the ManagementPolicyDefinition object itself.
     */
    public ManagementPolicyDefinition withFilters(ManagementPolicyFilter filters) {
        this.filters = filters;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (actions() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property actions in model ManagementPolicyDefinition"));
        } else {
            actions().validate();
        }
        if (filters() != null) {
            filters().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ManagementPolicyDefinition.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("actions", this.actions);
        jsonWriter.writeJsonField("filters", this.filters);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ManagementPolicyDefinition from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ManagementPolicyDefinition if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ManagementPolicyDefinition.
     */
    public static ManagementPolicyDefinition fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ManagementPolicyDefinition deserializedManagementPolicyDefinition = new ManagementPolicyDefinition();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("actions".equals(fieldName)) {
                    deserializedManagementPolicyDefinition.actions = ManagementPolicyAction.fromJson(reader);
                } else if ("filters".equals(fieldName)) {
                    deserializedManagementPolicyDefinition.filters = ManagementPolicyFilter.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedManagementPolicyDefinition;
        });
    }
}
