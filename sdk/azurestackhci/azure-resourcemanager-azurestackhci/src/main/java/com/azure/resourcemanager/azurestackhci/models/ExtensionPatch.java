// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.azurestackhci.fluent.models.ExtensionPatchProperties;
import java.io.IOException;

/**
 * Extension Details to update.
 */
@Fluent
public final class ExtensionPatch implements JsonSerializable<ExtensionPatch> {
    /*
     * Describes Machine Extension Properties that can be updated.
     */
    private ExtensionPatchProperties innerProperties;

    /**
     * Creates an instance of ExtensionPatch class.
     */
    public ExtensionPatch() {
    }

    /**
     * Get the innerProperties property: Describes Machine Extension Properties that can be updated.
     * 
     * @return the innerProperties value.
     */
    private ExtensionPatchProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the extensionParameters property: Describes the properties of a Machine Extension that can be updated.
     * 
     * @return the extensionParameters value.
     */
    public ExtensionPatchParameters extensionParameters() {
        return this.innerProperties() == null ? null : this.innerProperties().extensionParameters();
    }

    /**
     * Set the extensionParameters property: Describes the properties of a Machine Extension that can be updated.
     * 
     * @param extensionParameters the extensionParameters value to set.
     * @return the ExtensionPatch object itself.
     */
    public ExtensionPatch withExtensionParameters(ExtensionPatchParameters extensionParameters) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExtensionPatchProperties();
        }
        this.innerProperties().withExtensionParameters(extensionParameters);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ExtensionPatch from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ExtensionPatch if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ExtensionPatch.
     */
    public static ExtensionPatch fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ExtensionPatch deserializedExtensionPatch = new ExtensionPatch();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("properties".equals(fieldName)) {
                    deserializedExtensionPatch.innerProperties = ExtensionPatchProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedExtensionPatch;
        });
    }
}
