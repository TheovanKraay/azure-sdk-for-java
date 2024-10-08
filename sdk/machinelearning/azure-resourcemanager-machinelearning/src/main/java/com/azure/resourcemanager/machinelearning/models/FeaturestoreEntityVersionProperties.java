// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * DTO object representing feature entity version.
 */
@Fluent
public final class FeaturestoreEntityVersionProperties extends AssetBase {
    /*
     * Specifies index columns
     */
    private List<IndexColumn> indexColumns;

    /*
     * Specifies the asset stage
     */
    private String stage;

    /*
     * Provisioning state for the featurestore entity version.
     */
    private AssetProvisioningState provisioningState;

    /**
     * Creates an instance of FeaturestoreEntityVersionProperties class.
     */
    public FeaturestoreEntityVersionProperties() {
    }

    /**
     * Get the indexColumns property: Specifies index columns.
     * 
     * @return the indexColumns value.
     */
    public List<IndexColumn> indexColumns() {
        return this.indexColumns;
    }

    /**
     * Set the indexColumns property: Specifies index columns.
     * 
     * @param indexColumns the indexColumns value to set.
     * @return the FeaturestoreEntityVersionProperties object itself.
     */
    public FeaturestoreEntityVersionProperties withIndexColumns(List<IndexColumn> indexColumns) {
        this.indexColumns = indexColumns;
        return this;
    }

    /**
     * Get the stage property: Specifies the asset stage.
     * 
     * @return the stage value.
     */
    public String stage() {
        return this.stage;
    }

    /**
     * Set the stage property: Specifies the asset stage.
     * 
     * @param stage the stage value to set.
     * @return the FeaturestoreEntityVersionProperties object itself.
     */
    public FeaturestoreEntityVersionProperties withStage(String stage) {
        this.stage = stage;
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state for the featurestore entity version.
     * 
     * @return the provisioningState value.
     */
    public AssetProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FeaturestoreEntityVersionProperties withIsArchived(Boolean isArchived) {
        super.withIsArchived(isArchived);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FeaturestoreEntityVersionProperties withIsAnonymous(Boolean isAnonymous) {
        super.withIsAnonymous(isAnonymous);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FeaturestoreEntityVersionProperties withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FeaturestoreEntityVersionProperties withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FeaturestoreEntityVersionProperties withProperties(Map<String, String> properties) {
        super.withProperties(properties);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (indexColumns() != null) {
            indexColumns().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("description", description());
        jsonWriter.writeMapField("tags", tags(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeMapField("properties", properties(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeBooleanField("isArchived", isArchived());
        jsonWriter.writeBooleanField("isAnonymous", isAnonymous());
        jsonWriter.writeArrayField("indexColumns", this.indexColumns, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("stage", this.stage);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of FeaturestoreEntityVersionProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of FeaturestoreEntityVersionProperties if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the FeaturestoreEntityVersionProperties.
     */
    public static FeaturestoreEntityVersionProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            FeaturestoreEntityVersionProperties deserializedFeaturestoreEntityVersionProperties
                = new FeaturestoreEntityVersionProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("description".equals(fieldName)) {
                    deserializedFeaturestoreEntityVersionProperties.withDescription(reader.getString());
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedFeaturestoreEntityVersionProperties.withTags(tags);
                } else if ("properties".equals(fieldName)) {
                    Map<String, String> properties = reader.readMap(reader1 -> reader1.getString());
                    deserializedFeaturestoreEntityVersionProperties.withProperties(properties);
                } else if ("isArchived".equals(fieldName)) {
                    deserializedFeaturestoreEntityVersionProperties
                        .withIsArchived(reader.getNullable(JsonReader::getBoolean));
                } else if ("isAnonymous".equals(fieldName)) {
                    deserializedFeaturestoreEntityVersionProperties
                        .withIsAnonymous(reader.getNullable(JsonReader::getBoolean));
                } else if ("indexColumns".equals(fieldName)) {
                    List<IndexColumn> indexColumns = reader.readArray(reader1 -> IndexColumn.fromJson(reader1));
                    deserializedFeaturestoreEntityVersionProperties.indexColumns = indexColumns;
                } else if ("stage".equals(fieldName)) {
                    deserializedFeaturestoreEntityVersionProperties.stage = reader.getString();
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedFeaturestoreEntityVersionProperties.provisioningState
                        = AssetProvisioningState.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedFeaturestoreEntityVersionProperties;
        });
    }
}
