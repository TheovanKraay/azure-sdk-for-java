// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.quantum.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Detailed pricing information for an sku.
 */
@Fluent
public final class PricingDetail implements JsonSerializable<PricingDetail> {
    /*
     * Unique id for this pricing information.
     */
    private String id;

    /*
     * The unit cost of this sku.
     */
    private String value;

    /**
     * Creates an instance of PricingDetail class.
     */
    public PricingDetail() {
    }

    /**
     * Get the id property: Unique id for this pricing information.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Unique id for this pricing information.
     * 
     * @param id the id value to set.
     * @return the PricingDetail object itself.
     */
    public PricingDetail withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the value property: The unit cost of this sku.
     * 
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: The unit cost of this sku.
     * 
     * @param value the value value to set.
     * @return the PricingDetail object itself.
     */
    public PricingDetail withValue(String value) {
        this.value = value;
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
        jsonWriter.writeStringField("id", this.id);
        jsonWriter.writeStringField("value", this.value);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PricingDetail from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PricingDetail if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the PricingDetail.
     */
    public static PricingDetail fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PricingDetail deserializedPricingDetail = new PricingDetail();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedPricingDetail.id = reader.getString();
                } else if ("value".equals(fieldName)) {
                    deserializedPricingDetail.value = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPricingDetail;
        });
    }
}
