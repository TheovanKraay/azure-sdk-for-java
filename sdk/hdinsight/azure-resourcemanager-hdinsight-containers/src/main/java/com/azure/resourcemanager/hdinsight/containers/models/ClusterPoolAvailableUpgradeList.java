// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.hdinsight.containers.fluent.models.ClusterPoolAvailableUpgradeInner;
import java.io.IOException;
import java.util.List;

/**
 * collection of cluster pool available upgrade.
 */
@Fluent
public final class ClusterPoolAvailableUpgradeList implements JsonSerializable<ClusterPoolAvailableUpgradeList> {
    /*
     * Collection of cluster pool available upgrade.
     */
    private List<ClusterPoolAvailableUpgradeInner> value;

    /*
     * The Url of next result page.
     */
    private String nextLink;

    /**
     * Creates an instance of ClusterPoolAvailableUpgradeList class.
     */
    public ClusterPoolAvailableUpgradeList() {
    }

    /**
     * Get the value property: Collection of cluster pool available upgrade.
     * 
     * @return the value value.
     */
    public List<ClusterPoolAvailableUpgradeInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Collection of cluster pool available upgrade.
     * 
     * @param value the value value to set.
     * @return the ClusterPoolAvailableUpgradeList object itself.
     */
    public ClusterPoolAvailableUpgradeList withValue(List<ClusterPoolAvailableUpgradeInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The Url of next result page.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The Url of next result page.
     * 
     * @param nextLink the nextLink value to set.
     * @return the ClusterPoolAvailableUpgradeList object itself.
     */
    public ClusterPoolAvailableUpgradeList withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property value in model ClusterPoolAvailableUpgradeList"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ClusterPoolAvailableUpgradeList.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("nextLink", this.nextLink);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ClusterPoolAvailableUpgradeList from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ClusterPoolAvailableUpgradeList if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ClusterPoolAvailableUpgradeList.
     */
    public static ClusterPoolAvailableUpgradeList fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ClusterPoolAvailableUpgradeList deserializedClusterPoolAvailableUpgradeList
                = new ClusterPoolAvailableUpgradeList();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<ClusterPoolAvailableUpgradeInner> value
                        = reader.readArray(reader1 -> ClusterPoolAvailableUpgradeInner.fromJson(reader1));
                    deserializedClusterPoolAvailableUpgradeList.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedClusterPoolAvailableUpgradeList.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedClusterPoolAvailableUpgradeList;
        });
    }
}
