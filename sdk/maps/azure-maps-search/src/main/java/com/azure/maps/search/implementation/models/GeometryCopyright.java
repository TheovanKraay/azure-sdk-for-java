// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.search.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Copyright information of a geometry of a Boundary object.
 */
@Fluent
public final class GeometryCopyright implements JsonSerializable<GeometryCopyright> {
    /*
     * The name of the data provider
     */
    private String sourceName;

    /*
     * The copyright string for the data provider
     */
    private String copyright;

    /**
     * Creates an instance of GeometryCopyright class.
     */
    public GeometryCopyright() {
    }

    /**
     * Get the sourceName property: The name of the data provider.
     * 
     * @return the sourceName value.
     */
    public String getSourceName() {
        return this.sourceName;
    }

    /**
     * Set the sourceName property: The name of the data provider.
     * 
     * @param sourceName the sourceName value to set.
     * @return the GeometryCopyright object itself.
     */
    public GeometryCopyright setSourceName(String sourceName) {
        this.sourceName = sourceName;
        return this;
    }

    /**
     * Get the copyright property: The copyright string for the data provider.
     * 
     * @return the copyright value.
     */
    public String getCopyright() {
        return this.copyright;
    }

    /**
     * Set the copyright property: The copyright string for the data provider.
     * 
     * @param copyright the copyright value to set.
     * @return the GeometryCopyright object itself.
     */
    public GeometryCopyright setCopyright(String copyright) {
        this.copyright = copyright;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("sourceName", this.sourceName);
        jsonWriter.writeStringField("copyright", this.copyright);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of GeometryCopyright from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of GeometryCopyright if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the GeometryCopyright.
     */
    public static GeometryCopyright fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            GeometryCopyright deserializedGeometryCopyright = new GeometryCopyright();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("sourceName".equals(fieldName)) {
                    deserializedGeometryCopyright.sourceName = reader.getString();
                } else if ("copyright".equals(fieldName)) {
                    deserializedGeometryCopyright.copyright = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedGeometryCopyright;
        });
    }
}
