// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

/**
 * The properties of the modern reservation recommendation for single scope.
 */
@Immutable
public final class ModernSingleScopeReservationRecommendationProperties
    extends ModernReservationRecommendationProperties {
    /*
     * Shared or single recommendation.
     */
    private String scope = "Single";

    /*
     * Subscription ID associated with single scoped recommendation.
     */
    private UUID subscriptionId;

    /**
     * Creates an instance of ModernSingleScopeReservationRecommendationProperties class.
     */
    public ModernSingleScopeReservationRecommendationProperties() {
    }

    /**
     * Get the scope property: Shared or single recommendation.
     * 
     * @return the scope value.
     */
    @Override
    public String scope() {
        return this.scope;
    }

    /**
     * Get the subscriptionId property: Subscription ID associated with single scoped recommendation.
     * 
     * @return the subscriptionId value.
     */
    public UUID subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (costWithNoReservedInstances() != null) {
            costWithNoReservedInstances().validate();
        }
        if (totalCostWithReservedInstances() != null) {
            totalCostWithReservedInstances().validate();
        }
        if (netSavings() != null) {
            netSavings().validate();
        }
        if (skuProperties() != null) {
            skuProperties().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("scope", this.scope);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ModernSingleScopeReservationRecommendationProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ModernSingleScopeReservationRecommendationProperties if the JsonReader was pointing to an
     * instance of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ModernSingleScopeReservationRecommendationProperties.
     */
    public static ModernSingleScopeReservationRecommendationProperties fromJson(JsonReader jsonReader)
        throws IOException {
        return jsonReader.readObject(reader -> {
            ModernSingleScopeReservationRecommendationProperties deserializedModernSingleScopeReservationRecommendationProperties
                = new ModernSingleScopeReservationRecommendationProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("location".equals(fieldName)) {
                    deserializedModernSingleScopeReservationRecommendationProperties.withLocation(reader.getString());
                } else if ("lookBackPeriod".equals(fieldName)) {
                    deserializedModernSingleScopeReservationRecommendationProperties
                        .withLookBackPeriod(reader.getNullable(JsonReader::getInt));
                } else if ("instanceFlexibilityRatio".equals(fieldName)) {
                    deserializedModernSingleScopeReservationRecommendationProperties
                        .withInstanceFlexibilityRatio(reader.getNullable(JsonReader::getFloat));
                } else if ("instanceFlexibilityGroup".equals(fieldName)) {
                    deserializedModernSingleScopeReservationRecommendationProperties
                        .withInstanceFlexibilityGroup(reader.getString());
                } else if ("normalizedSize".equals(fieldName)) {
                    deserializedModernSingleScopeReservationRecommendationProperties
                        .withNormalizedSize(reader.getString());
                } else if ("recommendedQuantityNormalized".equals(fieldName)) {
                    deserializedModernSingleScopeReservationRecommendationProperties
                        .withRecommendedQuantityNormalized(reader.getNullable(JsonReader::getFloat));
                } else if ("meterId".equals(fieldName)) {
                    deserializedModernSingleScopeReservationRecommendationProperties
                        .withMeterId(reader.getNullable(nonNullReader -> UUID.fromString(nonNullReader.getString())));
                } else if ("term".equals(fieldName)) {
                    deserializedModernSingleScopeReservationRecommendationProperties.withTerm(reader.getString());
                } else if ("costWithNoReservedInstances".equals(fieldName)) {
                    deserializedModernSingleScopeReservationRecommendationProperties
                        .withCostWithNoReservedInstances(Amount.fromJson(reader));
                } else if ("recommendedQuantity".equals(fieldName)) {
                    deserializedModernSingleScopeReservationRecommendationProperties.withRecommendedQuantity(
                        reader.getNullable(nonNullReader -> new BigDecimal(nonNullReader.getString())));
                } else if ("resourceType".equals(fieldName)) {
                    deserializedModernSingleScopeReservationRecommendationProperties
                        .withResourceType(reader.getString());
                } else if ("totalCostWithReservedInstances".equals(fieldName)) {
                    deserializedModernSingleScopeReservationRecommendationProperties
                        .withTotalCostWithReservedInstances(Amount.fromJson(reader));
                } else if ("netSavings".equals(fieldName)) {
                    deserializedModernSingleScopeReservationRecommendationProperties
                        .withNetSavings(Amount.fromJson(reader));
                } else if ("firstUsageDate".equals(fieldName)) {
                    deserializedModernSingleScopeReservationRecommendationProperties.withFirstUsageDate(reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString())));
                } else if ("skuProperties".equals(fieldName)) {
                    List<SkuProperty> skuProperties = reader.readArray(reader1 -> SkuProperty.fromJson(reader1));
                    deserializedModernSingleScopeReservationRecommendationProperties.withSkuProperties(skuProperties);
                } else if ("skuName".equals(fieldName)) {
                    deserializedModernSingleScopeReservationRecommendationProperties.withSkuName(reader.getString());
                } else if ("scope".equals(fieldName)) {
                    deserializedModernSingleScopeReservationRecommendationProperties.scope = reader.getString();
                } else if ("subscriptionId".equals(fieldName)) {
                    deserializedModernSingleScopeReservationRecommendationProperties.subscriptionId
                        = reader.getNullable(nonNullReader -> UUID.fromString(nonNullReader.getString()));
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedModernSingleScopeReservationRecommendationProperties;
        });
    }
}
