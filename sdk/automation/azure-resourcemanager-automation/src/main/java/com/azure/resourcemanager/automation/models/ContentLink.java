// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Definition of the content link.
 */
@Fluent
public final class ContentLink implements JsonSerializable<ContentLink> {
    /*
     * Gets or sets the uri of the runbook content.
     */
    private String uri;

    /*
     * Gets or sets the hash.
     */
    private ContentHash contentHash;

    /*
     * Gets or sets the version of the content.
     */
    private String version;

    /**
     * Creates an instance of ContentLink class.
     */
    public ContentLink() {
    }

    /**
     * Get the uri property: Gets or sets the uri of the runbook content.
     * 
     * @return the uri value.
     */
    public String uri() {
        return this.uri;
    }

    /**
     * Set the uri property: Gets or sets the uri of the runbook content.
     * 
     * @param uri the uri value to set.
     * @return the ContentLink object itself.
     */
    public ContentLink withUri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * Get the contentHash property: Gets or sets the hash.
     * 
     * @return the contentHash value.
     */
    public ContentHash contentHash() {
        return this.contentHash;
    }

    /**
     * Set the contentHash property: Gets or sets the hash.
     * 
     * @param contentHash the contentHash value to set.
     * @return the ContentLink object itself.
     */
    public ContentLink withContentHash(ContentHash contentHash) {
        this.contentHash = contentHash;
        return this;
    }

    /**
     * Get the version property: Gets or sets the version of the content.
     * 
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the version property: Gets or sets the version of the content.
     * 
     * @param version the version value to set.
     * @return the ContentLink object itself.
     */
    public ContentLink withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (contentHash() != null) {
            contentHash().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("uri", this.uri);
        jsonWriter.writeJsonField("contentHash", this.contentHash);
        jsonWriter.writeStringField("version", this.version);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ContentLink from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ContentLink if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ContentLink.
     */
    public static ContentLink fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ContentLink deserializedContentLink = new ContentLink();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("uri".equals(fieldName)) {
                    deserializedContentLink.uri = reader.getString();
                } else if ("contentHash".equals(fieldName)) {
                    deserializedContentLink.contentHash = ContentHash.fromJson(reader);
                } else if ("version".equals(fieldName)) {
                    deserializedContentLink.version = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedContentLink;
        });
    }
}
