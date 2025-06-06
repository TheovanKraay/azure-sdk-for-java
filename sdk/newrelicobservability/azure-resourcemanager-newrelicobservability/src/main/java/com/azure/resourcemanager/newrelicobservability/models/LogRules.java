// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.newrelicobservability.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Set of rules for sending logs for the Monitor resource.
 */
@Fluent
public final class LogRules implements JsonSerializable<LogRules> {
    /*
     * Flag specifying if AAD logs should be sent for the Monitor resource.
     */
    private SendAadLogsStatus sendAadLogs;

    /*
     * Flag specifying if subscription logs should be sent for the Monitor resource.
     */
    private SendSubscriptionLogsStatus sendSubscriptionLogs;

    /*
     * Flag specifying if activity logs from Azure resources should be sent for the Monitor resource.
     */
    private SendActivityLogsStatus sendActivityLogs;

    /*
     * List of filtering tags to be used for capturing logs. This only takes effect if SendActivityLogs flag is enabled.
     * If empty, all resources will be captured.
     * If only Exclude action is specified, the rules will apply to the list of all available resources. If Include
     * actions are specified, the rules will only include resources with the associated tags.
     */
    private List<FilteringTag> filteringTags;

    /**
     * Creates an instance of LogRules class.
     */
    public LogRules() {
    }

    /**
     * Get the sendAadLogs property: Flag specifying if AAD logs should be sent for the Monitor resource.
     * 
     * @return the sendAadLogs value.
     */
    public SendAadLogsStatus sendAadLogs() {
        return this.sendAadLogs;
    }

    /**
     * Set the sendAadLogs property: Flag specifying if AAD logs should be sent for the Monitor resource.
     * 
     * @param sendAadLogs the sendAadLogs value to set.
     * @return the LogRules object itself.
     */
    public LogRules withSendAadLogs(SendAadLogsStatus sendAadLogs) {
        this.sendAadLogs = sendAadLogs;
        return this;
    }

    /**
     * Get the sendSubscriptionLogs property: Flag specifying if subscription logs should be sent for the Monitor
     * resource.
     * 
     * @return the sendSubscriptionLogs value.
     */
    public SendSubscriptionLogsStatus sendSubscriptionLogs() {
        return this.sendSubscriptionLogs;
    }

    /**
     * Set the sendSubscriptionLogs property: Flag specifying if subscription logs should be sent for the Monitor
     * resource.
     * 
     * @param sendSubscriptionLogs the sendSubscriptionLogs value to set.
     * @return the LogRules object itself.
     */
    public LogRules withSendSubscriptionLogs(SendSubscriptionLogsStatus sendSubscriptionLogs) {
        this.sendSubscriptionLogs = sendSubscriptionLogs;
        return this;
    }

    /**
     * Get the sendActivityLogs property: Flag specifying if activity logs from Azure resources should be sent for the
     * Monitor resource.
     * 
     * @return the sendActivityLogs value.
     */
    public SendActivityLogsStatus sendActivityLogs() {
        return this.sendActivityLogs;
    }

    /**
     * Set the sendActivityLogs property: Flag specifying if activity logs from Azure resources should be sent for the
     * Monitor resource.
     * 
     * @param sendActivityLogs the sendActivityLogs value to set.
     * @return the LogRules object itself.
     */
    public LogRules withSendActivityLogs(SendActivityLogsStatus sendActivityLogs) {
        this.sendActivityLogs = sendActivityLogs;
        return this;
    }

    /**
     * Get the filteringTags property: List of filtering tags to be used for capturing logs. This only takes effect if
     * SendActivityLogs flag is enabled. If empty, all resources will be captured.
     * If only Exclude action is specified, the rules will apply to the list of all available resources. If Include
     * actions are specified, the rules will only include resources with the associated tags.
     * 
     * @return the filteringTags value.
     */
    public List<FilteringTag> filteringTags() {
        return this.filteringTags;
    }

    /**
     * Set the filteringTags property: List of filtering tags to be used for capturing logs. This only takes effect if
     * SendActivityLogs flag is enabled. If empty, all resources will be captured.
     * If only Exclude action is specified, the rules will apply to the list of all available resources. If Include
     * actions are specified, the rules will only include resources with the associated tags.
     * 
     * @param filteringTags the filteringTags value to set.
     * @return the LogRules object itself.
     */
    public LogRules withFilteringTags(List<FilteringTag> filteringTags) {
        this.filteringTags = filteringTags;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (filteringTags() != null) {
            filteringTags().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("sendAadLogs", this.sendAadLogs == null ? null : this.sendAadLogs.toString());
        jsonWriter.writeStringField("sendSubscriptionLogs",
            this.sendSubscriptionLogs == null ? null : this.sendSubscriptionLogs.toString());
        jsonWriter.writeStringField("sendActivityLogs",
            this.sendActivityLogs == null ? null : this.sendActivityLogs.toString());
        jsonWriter.writeArrayField("filteringTags", this.filteringTags, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of LogRules from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of LogRules if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IOException If an error occurs while reading the LogRules.
     */
    public static LogRules fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            LogRules deserializedLogRules = new LogRules();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("sendAadLogs".equals(fieldName)) {
                    deserializedLogRules.sendAadLogs = SendAadLogsStatus.fromString(reader.getString());
                } else if ("sendSubscriptionLogs".equals(fieldName)) {
                    deserializedLogRules.sendSubscriptionLogs
                        = SendSubscriptionLogsStatus.fromString(reader.getString());
                } else if ("sendActivityLogs".equals(fieldName)) {
                    deserializedLogRules.sendActivityLogs = SendActivityLogsStatus.fromString(reader.getString());
                } else if ("filteringTags".equals(fieldName)) {
                    List<FilteringTag> filteringTags = reader.readArray(reader1 -> FilteringTag.fromJson(reader1));
                    deserializedLogRules.filteringTags = filteringTags;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedLogRules;
        });
    }
}
