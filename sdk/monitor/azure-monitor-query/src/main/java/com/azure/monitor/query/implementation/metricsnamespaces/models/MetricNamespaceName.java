// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.monitor.query.implementation.metricsnamespaces.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The fully qualified metric namespace name.
 */
@Fluent
public final class MetricNamespaceName implements JsonSerializable<MetricNamespaceName> {
    /*
     * The metric namespace name.
     */
    private String metricNamespaceName;

    /**
     * Creates an instance of MetricNamespaceName class.
     */
    public MetricNamespaceName() {
    }

    /**
     * Get the metricNamespaceName property: The metric namespace name.
     * 
     * @return the metricNamespaceName value.
     */
    public String getMetricNamespaceName() {
        return this.metricNamespaceName;
    }

    /**
     * Set the metricNamespaceName property: The metric namespace name.
     * 
     * @param metricNamespaceName the metricNamespaceName value to set.
     * @return the MetricNamespaceName object itself.
     */
    public MetricNamespaceName setMetricNamespaceName(String metricNamespaceName) {
        this.metricNamespaceName = metricNamespaceName;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("metricNamespaceName", this.metricNamespaceName);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MetricNamespaceName from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MetricNamespaceName if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the MetricNamespaceName.
     */
    public static MetricNamespaceName fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MetricNamespaceName deserializedMetricNamespaceName = new MetricNamespaceName();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("metricNamespaceName".equals(fieldName)) {
                    deserializedMetricNamespaceName.metricNamespaceName = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedMetricNamespaceName;
        });
    }
}
