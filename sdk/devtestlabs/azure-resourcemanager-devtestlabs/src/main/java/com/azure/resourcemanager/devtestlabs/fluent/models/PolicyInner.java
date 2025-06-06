// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.devtestlabs.models.PolicyEvaluatorType;
import com.azure.resourcemanager.devtestlabs.models.PolicyFactName;
import com.azure.resourcemanager.devtestlabs.models.PolicyStatus;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.Map;

/**
 * A Policy.
 */
@Fluent
public final class PolicyInner extends Resource {
    /*
     * The properties of the resource.
     */
    private PolicyProperties innerProperties = new PolicyProperties();

    /*
     * The type of the resource.
     */
    private String type;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /**
     * Creates an instance of PolicyInner class.
     */
    public PolicyInner() {
    }

    /**
     * Get the innerProperties property: The properties of the resource.
     * 
     * @return the innerProperties value.
     */
    private PolicyProperties innerProperties() {
        return this.innerProperties;
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
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
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
     * {@inheritDoc}
     */
    @Override
    public PolicyInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PolicyInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the description property: The description of the policy.
     * 
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: The description of the policy.
     * 
     * @param description the description value to set.
     * @return the PolicyInner object itself.
     */
    public PolicyInner withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PolicyProperties();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Get the status property: The status of the policy.
     * 
     * @return the status value.
     */
    public PolicyStatus status() {
        return this.innerProperties() == null ? null : this.innerProperties().status();
    }

    /**
     * Set the status property: The status of the policy.
     * 
     * @param status the status value to set.
     * @return the PolicyInner object itself.
     */
    public PolicyInner withStatus(PolicyStatus status) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PolicyProperties();
        }
        this.innerProperties().withStatus(status);
        return this;
    }

    /**
     * Get the factName property: The fact name of the policy (e.g. LabVmCount, LabVmSize, MaxVmsAllowedPerLab, etc.
     * 
     * @return the factName value.
     */
    public PolicyFactName factName() {
        return this.innerProperties() == null ? null : this.innerProperties().factName();
    }

    /**
     * Set the factName property: The fact name of the policy (e.g. LabVmCount, LabVmSize, MaxVmsAllowedPerLab, etc.
     * 
     * @param factName the factName value to set.
     * @return the PolicyInner object itself.
     */
    public PolicyInner withFactName(PolicyFactName factName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PolicyProperties();
        }
        this.innerProperties().withFactName(factName);
        return this;
    }

    /**
     * Get the factData property: The fact data of the policy.
     * 
     * @return the factData value.
     */
    public String factData() {
        return this.innerProperties() == null ? null : this.innerProperties().factData();
    }

    /**
     * Set the factData property: The fact data of the policy.
     * 
     * @param factData the factData value to set.
     * @return the PolicyInner object itself.
     */
    public PolicyInner withFactData(String factData) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PolicyProperties();
        }
        this.innerProperties().withFactData(factData);
        return this;
    }

    /**
     * Get the threshold property: The threshold of the policy (i.e. a number for MaxValuePolicy, and a JSON array of
     * values for AllowedValuesPolicy).
     * 
     * @return the threshold value.
     */
    public String threshold() {
        return this.innerProperties() == null ? null : this.innerProperties().threshold();
    }

    /**
     * Set the threshold property: The threshold of the policy (i.e. a number for MaxValuePolicy, and a JSON array of
     * values for AllowedValuesPolicy).
     * 
     * @param threshold the threshold value to set.
     * @return the PolicyInner object itself.
     */
    public PolicyInner withThreshold(String threshold) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PolicyProperties();
        }
        this.innerProperties().withThreshold(threshold);
        return this;
    }

    /**
     * Get the evaluatorType property: The evaluator type of the policy (i.e. AllowedValuesPolicy, MaxValuePolicy).
     * 
     * @return the evaluatorType value.
     */
    public PolicyEvaluatorType evaluatorType() {
        return this.innerProperties() == null ? null : this.innerProperties().evaluatorType();
    }

    /**
     * Set the evaluatorType property: The evaluator type of the policy (i.e. AllowedValuesPolicy, MaxValuePolicy).
     * 
     * @param evaluatorType the evaluatorType value to set.
     * @return the PolicyInner object itself.
     */
    public PolicyInner withEvaluatorType(PolicyEvaluatorType evaluatorType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PolicyProperties();
        }
        this.innerProperties().withEvaluatorType(evaluatorType);
        return this;
    }

    /**
     * Get the createdDate property: The creation date of the policy.
     * 
     * @return the createdDate value.
     */
    public OffsetDateTime createdDate() {
        return this.innerProperties() == null ? null : this.innerProperties().createdDate();
    }

    /**
     * Get the provisioningState property: The provisioning status of the resource.
     * 
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the uniqueIdentifier property: The unique immutable identifier of a resource (Guid).
     * 
     * @return the uniqueIdentifier value.
     */
    public String uniqueIdentifier() {
        return this.innerProperties() == null ? null : this.innerProperties().uniqueIdentifier();
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property innerProperties in model PolicyInner"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(PolicyInner.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("location", location());
        jsonWriter.writeMapField("tags", tags(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PolicyInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PolicyInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the PolicyInner.
     */
    public static PolicyInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PolicyInner deserializedPolicyInner = new PolicyInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedPolicyInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedPolicyInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedPolicyInner.type = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedPolicyInner.withLocation(reader.getString());
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedPolicyInner.withTags(tags);
                } else if ("properties".equals(fieldName)) {
                    deserializedPolicyInner.innerProperties = PolicyProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPolicyInner;
        });
    }
}
