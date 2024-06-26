// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * A range of exit codes and how the Batch service should respond to exit codes
 * within that range.
 */
@Immutable
public final class ExitCodeRangeMapping implements JsonSerializable<ExitCodeRangeMapping> {

    /*
     * The first exit code in the range.
     */
    @Generated
    private final int start;

    /*
     * The last exit code in the range.
     */
    @Generated
    private final int end;

    /*
     * How the Batch service should respond if the Task exits with an exit code in the range start to end (inclusive).
     */
    @Generated
    private final ExitOptions exitOptions;

    /**
     * Creates an instance of ExitCodeRangeMapping class.
     *
     * @param start the start value to set.
     * @param end the end value to set.
     * @param exitOptions the exitOptions value to set.
     */
    @Generated
    public ExitCodeRangeMapping(int start, int end, ExitOptions exitOptions) {
        this.start = start;
        this.end = end;
        this.exitOptions = exitOptions;
    }

    /**
     * Get the start property: The first exit code in the range.
     *
     * @return the start value.
     */
    @Generated
    public int getStart() {
        return this.start;
    }

    /**
     * Get the end property: The last exit code in the range.
     *
     * @return the end value.
     */
    @Generated
    public int getEnd() {
        return this.end;
    }

    /**
     * Get the exitOptions property: How the Batch service should respond if the Task exits with an exit code in the
     * range start to end (inclusive).
     *
     * @return the exitOptions value.
     */
    @Generated
    public ExitOptions getExitOptions() {
        return this.exitOptions;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeIntField("start", this.start);
        jsonWriter.writeIntField("end", this.end);
        jsonWriter.writeJsonField("exitOptions", this.exitOptions);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ExitCodeRangeMapping from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of ExitCodeRangeMapping if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ExitCodeRangeMapping.
     */
    @Generated
    public static ExitCodeRangeMapping fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            int start = 0;
            int end = 0;
            ExitOptions exitOptions = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("start".equals(fieldName)) {
                    start = reader.getInt();
                } else if ("end".equals(fieldName)) {
                    end = reader.getInt();
                } else if ("exitOptions".equals(fieldName)) {
                    exitOptions = ExitOptions.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }
            return new ExitCodeRangeMapping(start, end, exitOptions);
        });
    }
}
