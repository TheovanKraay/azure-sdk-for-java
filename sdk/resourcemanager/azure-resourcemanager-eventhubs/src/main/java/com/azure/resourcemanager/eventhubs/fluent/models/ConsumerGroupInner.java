// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * Single item in List or Get Consumer group operation.
 */
@Fluent
public final class ConsumerGroupInner extends ProxyResource {
    /*
     * Single item in List or Get Consumer group operation
     */
    private ConsumerGroupProperties innerProperties;

    /*
     * The system meta data relating to this resource.
     */
    private SystemData systemData;

    /*
     * The geo-location where the resource lives
     */
    private String location;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * The type of the resource.
     */
    private String type;

    /**
     * Creates an instance of ConsumerGroupInner class.
     */
    public ConsumerGroupInner() {
    }

    /**
     * Get the innerProperties property: Single item in List or Get Consumer group operation.
     * 
     * @return the innerProperties value.
     */
    private ConsumerGroupProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: The system meta data relating to this resource.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the location property: The geo-location where the resource lives.
     * 
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the createdAt property: Exact time the message was created.
     * 
     * @return the createdAt value.
     */
    public OffsetDateTime createdAt() {
        return this.innerProperties() == null ? null : this.innerProperties().createdAt();
    }

    /**
     * Get the updatedAt property: The exact time the message was updated.
     * 
     * @return the updatedAt value.
     */
    public OffsetDateTime updatedAt() {
        return this.innerProperties() == null ? null : this.innerProperties().updatedAt();
    }

    /**
     * Get the userMetadata property: User Metadata is a placeholder to store user-defined string data with maximum
     * length 1024. e.g. it can be used to store descriptive data, such as list of teams and their contact information
     * also user-defined configuration settings can be stored.
     * 
     * @return the userMetadata value.
     */
    public String userMetadata() {
        return this.innerProperties() == null ? null : this.innerProperties().userMetadata();
    }

    /**
     * Set the userMetadata property: User Metadata is a placeholder to store user-defined string data with maximum
     * length 1024. e.g. it can be used to store descriptive data, such as list of teams and their contact information
     * also user-defined configuration settings can be stored.
     * 
     * @param userMetadata the userMetadata value to set.
     * @return the ConsumerGroupInner object itself.
     */
    public ConsumerGroupInner withUserMetadata(String userMetadata) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ConsumerGroupProperties();
        }
        this.innerProperties().withUserMetadata(userMetadata);
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
     * Reads an instance of ConsumerGroupInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ConsumerGroupInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ConsumerGroupInner.
     */
    public static ConsumerGroupInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ConsumerGroupInner deserializedConsumerGroupInner = new ConsumerGroupInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedConsumerGroupInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedConsumerGroupInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedConsumerGroupInner.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedConsumerGroupInner.innerProperties = ConsumerGroupProperties.fromJson(reader);
                } else if ("systemData".equals(fieldName)) {
                    deserializedConsumerGroupInner.systemData = SystemData.fromJson(reader);
                } else if ("location".equals(fieldName)) {
                    deserializedConsumerGroupInner.location = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedConsumerGroupInner;
        });
    }
}
