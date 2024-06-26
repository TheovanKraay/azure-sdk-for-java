// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.chat.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Content of a chat message.
 */
@Fluent
public final class ChatMessageContent {
    /*
     * Chat message content for messages of types text or html.
     */
    @JsonProperty(value = "message")
    private String message;

    /*
     * Chat message content for messages of type topicUpdated.
     */
    @JsonProperty(value = "topic")
    private String topic;

    /*
     * Chat message content for messages of types participantAdded or participantRemoved.
     */
    @JsonProperty(value = "participants")
    private List<ChatParticipant> participants;

    /*
     * List of attachments for this message
     */
    @JsonProperty(value = "attachments")
    private List<ChatAttachment> attachments;

    /*
     * Identifies a participant in Azure Communication services. A participant is, for example, a phone number or an
     * Azure communication user. This model is polymorphic: Apart from kind and rawId, at most one further property may
     * be set which must match the kind enum value.
     */
    @JsonProperty(value = "initiatorCommunicationIdentifier")
    private CommunicationIdentifierModel initiatorCommunicationIdentifier;

    /**
     * Creates an instance of ChatMessageContent class.
     */
    public ChatMessageContent() {
    }

    /**
     * Get the message property: Chat message content for messages of types text or html.
     * 
     * @return the message value.
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Set the message property: Chat message content for messages of types text or html.
     * 
     * @param message the message value to set.
     * @return the ChatMessageContent object itself.
     */
    public ChatMessageContent setMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get the topic property: Chat message content for messages of type topicUpdated.
     * 
     * @return the topic value.
     */
    public String getTopic() {
        return this.topic;
    }

    /**
     * Set the topic property: Chat message content for messages of type topicUpdated.
     * 
     * @param topic the topic value to set.
     * @return the ChatMessageContent object itself.
     */
    public ChatMessageContent setTopic(String topic) {
        this.topic = topic;
        return this;
    }

    /**
     * Get the participants property: Chat message content for messages of types participantAdded or
     * participantRemoved.
     * 
     * @return the participants value.
     */
    public List<ChatParticipant> getParticipants() {
        return this.participants;
    }

    /**
     * Set the participants property: Chat message content for messages of types participantAdded or
     * participantRemoved.
     * 
     * @param participants the participants value to set.
     * @return the ChatMessageContent object itself.
     */
    public ChatMessageContent setParticipants(List<ChatParticipant> participants) {
        this.participants = participants;
        return this;
    }

    /**
     * Get the attachments property: List of attachments for this message.
     * 
     * @return the attachments value.
     */
    public List<ChatAttachment> getAttachments() {
        return this.attachments;
    }

    /**
     * Set the attachments property: List of attachments for this message.
     * 
     * @param attachments the attachments value to set.
     * @return the ChatMessageContent object itself.
     */
    public ChatMessageContent setAttachments(List<ChatAttachment> attachments) {
        this.attachments = attachments;
        return this;
    }

    /**
     * Get the initiatorCommunicationIdentifier property: Identifies a participant in Azure Communication services. A
     * participant is, for example, a phone number or an Azure communication user. This model is polymorphic: Apart
     * from kind and rawId, at most one further property may be set which must match the kind enum value.
     * 
     * @return the initiatorCommunicationIdentifier value.
     */
    public CommunicationIdentifierModel getInitiatorCommunicationIdentifier() {
        return this.initiatorCommunicationIdentifier;
    }

    /**
     * Set the initiatorCommunicationIdentifier property: Identifies a participant in Azure Communication services. A
     * participant is, for example, a phone number or an Azure communication user. This model is polymorphic: Apart
     * from kind and rawId, at most one further property may be set which must match the kind enum value.
     * 
     * @param initiatorCommunicationIdentifier the initiatorCommunicationIdentifier value to set.
     * @return the ChatMessageContent object itself.
     */
    public ChatMessageContent
        setInitiatorCommunicationIdentifier(CommunicationIdentifierModel initiatorCommunicationIdentifier) {
        this.initiatorCommunicationIdentifier = initiatorCommunicationIdentifier;
        return this;
    }
}
