// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.Objects;

/** The ExtractiveSummarizationLROResult model. */
@Fluent
public final class ExtractiveSummarizationLROResult extends AnalyzeTextLROResult {
    /*
     * The results property.
     */
    private ExtractiveSummarizationResult results;

    /** Creates an instance of ExtractiveSummarizationLROResult class. */
    public ExtractiveSummarizationLROResult() {}

    /**
     * Get the results property: The results property.
     *
     * @return the results value.
     */
    public ExtractiveSummarizationResult getResults() {
        return this.results;
    }

    /**
     * Set the results property: The results property.
     *
     * @param results the results value to set.
     * @return the ExtractiveSummarizationLROResult object itself.
     */
    public ExtractiveSummarizationLROResult setResults(ExtractiveSummarizationResult results) {
        this.results = results;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ExtractiveSummarizationLROResult setTaskName(String taskName) {
        super.setTaskName(taskName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ExtractiveSummarizationLROResult setLastUpdateDateTime(OffsetDateTime lastUpdateDateTime) {
        super.setLastUpdateDateTime(lastUpdateDateTime);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ExtractiveSummarizationLROResult setStatus(State status) {
        super.setStatus(status);
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField(
                "kind", Objects.toString(AnalyzeTextLROResultsKind.EXTRACTIVE_SUMMARIZATION_LRORESULTS, null));
        jsonWriter.writeStringField("lastUpdateDateTime", Objects.toString(getLastUpdateDateTime(), null));
        jsonWriter.writeStringField("status", Objects.toString(getStatus(), null));
        jsonWriter.writeStringField("taskName", getTaskName());
        jsonWriter.writeJsonField("results", this.results);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ExtractiveSummarizationLROResult from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of ExtractiveSummarizationLROResult if the JsonReader was pointing to an instance of it, or
     *     null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties or the
     *     polymorphic discriminator.
     * @throws IOException If an error occurs while reading the ExtractiveSummarizationLROResult.
     */
    public static ExtractiveSummarizationLROResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(
                reader -> {
                    ExtractiveSummarizationLROResult deserializedExtractiveSummarizationLROResult =
                            new ExtractiveSummarizationLROResult();
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("kind".equals(fieldName)) {
                            String kind = reader.getString();
                            if (!"ExtractiveSummarizationLROResults".equals(kind)) {
                                throw new IllegalStateException(
                                        "'kind' was expected to be non-null and equal to 'ExtractiveSummarizationLROResults'. The found 'kind' was '"
                                                + kind
                                                + "'.");
                            }
                        } else if ("lastUpdateDateTime".equals(fieldName)) {
                            deserializedExtractiveSummarizationLROResult.setLastUpdateDateTime(
                                    reader.getNullable(
                                            nonNullReader -> OffsetDateTime.parse(nonNullReader.getString())));
                        } else if ("status".equals(fieldName)) {
                            deserializedExtractiveSummarizationLROResult.setStatus(
                                    State.fromString(reader.getString()));
                        } else if ("taskName".equals(fieldName)) {
                            deserializedExtractiveSummarizationLROResult.setTaskName(reader.getString());
                        } else if ("results".equals(fieldName)) {
                            deserializedExtractiveSummarizationLROResult.results =
                                    ExtractiveSummarizationResult.fromJson(reader);
                        } else {
                            reader.skipChildren();
                        }
                    }

                    return deserializedExtractiveSummarizationLROResult;
                });
    }
}
