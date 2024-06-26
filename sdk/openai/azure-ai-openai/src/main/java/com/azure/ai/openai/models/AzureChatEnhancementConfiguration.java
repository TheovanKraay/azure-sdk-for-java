// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * A representation of the available Azure OpenAI enhancement configurations.
 */
@Fluent
public final class AzureChatEnhancementConfiguration implements JsonSerializable<AzureChatEnhancementConfiguration> {

    /*
     * A representation of the available options for the Azure OpenAI grounding enhancement.
     */
    @Generated
    private AzureChatGroundingEnhancementConfiguration grounding;

    /*
     * A representation of the available options for the Azure OpenAI optical character recognition (OCR) enhancement.
     */
    @Generated
    private AzureChatOCREnhancementConfiguration ocr;

    /**
     * Creates an instance of AzureChatEnhancementConfiguration class.
     */
    @Generated
    public AzureChatEnhancementConfiguration() {
    }

    /**
     * Get the grounding property: A representation of the available options for the Azure OpenAI grounding enhancement.
     *
     * @return the grounding value.
     */
    @Generated
    public AzureChatGroundingEnhancementConfiguration getGrounding() {
        return this.grounding;
    }

    /**
     * Set the grounding property: A representation of the available options for the Azure OpenAI grounding enhancement.
     *
     * @param grounding the grounding value to set.
     * @return the AzureChatEnhancementConfiguration object itself.
     */
    @Generated
    public AzureChatEnhancementConfiguration setGrounding(AzureChatGroundingEnhancementConfiguration grounding) {
        this.grounding = grounding;
        return this;
    }

    /**
     * Get the ocr property: A representation of the available options for the Azure OpenAI optical character
     * recognition (OCR) enhancement.
     *
     * @return the ocr value.
     */
    @Generated
    public AzureChatOCREnhancementConfiguration getOcr() {
        return this.ocr;
    }

    /**
     * Set the ocr property: A representation of the available options for the Azure OpenAI optical character
     * recognition (OCR) enhancement.
     *
     * @param ocr the ocr value to set.
     * @return the AzureChatEnhancementConfiguration object itself.
     */
    @Generated
    public AzureChatEnhancementConfiguration setOcr(AzureChatOCREnhancementConfiguration ocr) {
        this.ocr = ocr;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("grounding", this.grounding);
        jsonWriter.writeJsonField("ocr", this.ocr);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AzureChatEnhancementConfiguration from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of AzureChatEnhancementConfiguration if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AzureChatEnhancementConfiguration.
     */
    @Generated
    public static AzureChatEnhancementConfiguration fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AzureChatEnhancementConfiguration deserializedAzureChatEnhancementConfiguration
                = new AzureChatEnhancementConfiguration();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("grounding".equals(fieldName)) {
                    deserializedAzureChatEnhancementConfiguration.grounding
                        = AzureChatGroundingEnhancementConfiguration.fromJson(reader);
                } else if ("ocr".equals(fieldName)) {
                    deserializedAzureChatEnhancementConfiguration.ocr
                        = AzureChatOCREnhancementConfiguration.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedAzureChatEnhancementConfiguration;
        });
    }
}
