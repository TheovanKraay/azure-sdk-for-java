// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Base class for validate operation response.
 */
@Fluent
public final class ValidateOperationResponse implements JsonSerializable<ValidateOperationResponse> {
    /*
     * Gets the validation result
     */
    private List<ErrorDetail> validationResults;

    /**
     * Creates an instance of ValidateOperationResponse class.
     */
    public ValidateOperationResponse() {
    }

    /**
     * Get the validationResults property: Gets the validation result.
     * 
     * @return the validationResults value.
     */
    public List<ErrorDetail> validationResults() {
        return this.validationResults;
    }

    /**
     * Set the validationResults property: Gets the validation result.
     * 
     * @param validationResults the validationResults value to set.
     * @return the ValidateOperationResponse object itself.
     */
    public ValidateOperationResponse withValidationResults(List<ErrorDetail> validationResults) {
        this.validationResults = validationResults;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (validationResults() != null) {
            validationResults().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("validationResults", this.validationResults,
            (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ValidateOperationResponse from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ValidateOperationResponse if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ValidateOperationResponse.
     */
    public static ValidateOperationResponse fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ValidateOperationResponse deserializedValidateOperationResponse = new ValidateOperationResponse();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("validationResults".equals(fieldName)) {
                    List<ErrorDetail> validationResults = reader.readArray(reader1 -> ErrorDetail.fromJson(reader1));
                    deserializedValidateOperationResponse.validationResults = validationResults;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedValidateOperationResponse;
        });
    }
}
