// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.
package com.azure.search.documents.indexes.implementation.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Describes an error condition for the API.
 */
@Immutable
public final class SearchError implements JsonSerializable<SearchError> {

    /*
     * One of a server-defined set of error codes.
     */
    private String code;

    /*
     * A human-readable representation of the error.
     */
    private final String message;

    /*
     * An array of details about specific errors that led to this reported error.
     */
    private List<SearchError> details;

    /**
     * Creates an instance of SearchError class.
     *
     * @param message the message value to set.
     */
    public SearchError(String message) {
        this.message = message;
    }

    /**
     * Get the code property: One of a server-defined set of error codes.
     *
     * @return the code value.
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Get the message property: A human-readable representation of the error.
     *
     * @return the message value.
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Get the details property: An array of details about specific errors that led to this reported error.
     *
     * @return the details value.
     */
    public List<SearchError> getDetails() {
        return this.details;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SearchError from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of SearchError if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the SearchError.
     */
    public static SearchError fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            // Buffer the next JSON object as SearchError can take two forms:
            //
            // - A SearchError object
            // - A SearchError object wrapped in an "error" node.
            JsonReader bufferedReader = reader.bufferObject();
            // Get to the START_OBJECT token.
            bufferedReader.nextToken();
            while (bufferedReader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = bufferedReader.getFieldName();
                bufferedReader.nextToken();
                if ("error".equals(fieldName)) {
                    // If the SearchError was wrapped in the "error" node begin reading it now.
                    return readSearchError(bufferedReader);
                } else {
                    bufferedReader.skipChildren();
                }
            }
            // Otherwise reset the JsonReader and read the whole JSON object.
            return readSearchError(bufferedReader.reset());
        });
    }

    private static SearchError readSearchError(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            boolean messageFound = false;
            String message = null;
            String code = null;
            List<SearchError> details = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("message".equals(fieldName)) {
                    message = reader.getString();
                    messageFound = true;
                } else if ("code".equals(fieldName)) {
                    code = reader.getString();
                } else if ("details".equals(fieldName)) {
                    details = reader.readArray(reader1 -> SearchError.fromJson(reader1));
                } else {
                    reader.skipChildren();
                }
            }
            if (messageFound) {
                SearchError deserializedSearchError = new SearchError(message);
                deserializedSearchError.code = code;
                deserializedSearchError.details = details;
                return deserializedSearchError;
            }
            throw new IllegalStateException("Missing required property: message");
        });
    }
}
