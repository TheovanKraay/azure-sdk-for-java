// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * For regional placement, nodes in the pool will be allocated in the same region.
 * For zonal placement, nodes in the pool will be spread across different zones
 * with best effort balancing.
 */
@Fluent
public final class BatchNodePlacementConfiguration implements JsonSerializable<BatchNodePlacementConfiguration> {

    /*
     * Node placement Policy type on Batch Pools. Allocation policy used by Batch Service to provision the nodes. If not specified, Batch will use the regional policy.
     */
    @Generated
    private BatchNodePlacementPolicyType policy;

    /**
     * Creates an instance of BatchNodePlacementConfiguration class.
     */
    @Generated
    public BatchNodePlacementConfiguration() {
    }

    /**
     * Get the policy property: Node placement Policy type on Batch Pools. Allocation policy used by Batch Service to
     * provision the nodes. If not specified, Batch will use the regional policy.
     *
     * @return the policy value.
     */
    @Generated
    public BatchNodePlacementPolicyType getPolicy() {
        return this.policy;
    }

    /**
     * Set the policy property: Node placement Policy type on Batch Pools. Allocation policy used by Batch Service to
     * provision the nodes. If not specified, Batch will use the regional policy.
     *
     * @param policy the policy value to set.
     * @return the BatchNodePlacementConfiguration object itself.
     */
    @Generated
    public BatchNodePlacementConfiguration setPolicy(BatchNodePlacementPolicyType policy) {
        this.policy = policy;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("policy", this.policy == null ? null : this.policy.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of BatchNodePlacementConfiguration from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of BatchNodePlacementConfiguration if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the BatchNodePlacementConfiguration.
     */
    @Generated
    public static BatchNodePlacementConfiguration fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            BatchNodePlacementConfiguration deserializedBatchNodePlacementConfiguration
                = new BatchNodePlacementConfiguration();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("policy".equals(fieldName)) {
                    deserializedBatchNodePlacementConfiguration.policy
                        = BatchNodePlacementPolicyType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedBatchNodePlacementConfiguration;
        });
    }
}
