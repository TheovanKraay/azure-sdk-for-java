// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcehealth.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Article of event. */
@Fluent
public final class EventPropertiesArticle {
    /*
     * Article content of event.
     */
    @JsonProperty(value = "articleContent")
    private String articleContent;

    /*
     * Article Id
     */
    @JsonProperty(value = "articleId")
    private String articleId;

    /*
     * It provides a map of parameter name and value
     */
    @JsonProperty(value = "parameters")
    private Object parameters;

    /** Creates an instance of EventPropertiesArticle class. */
    public EventPropertiesArticle() {
    }

    /**
     * Get the articleContent property: Article content of event.
     *
     * @return the articleContent value.
     */
    public String articleContent() {
        return this.articleContent;
    }

    /**
     * Set the articleContent property: Article content of event.
     *
     * @param articleContent the articleContent value to set.
     * @return the EventPropertiesArticle object itself.
     */
    public EventPropertiesArticle withArticleContent(String articleContent) {
        this.articleContent = articleContent;
        return this;
    }

    /**
     * Get the articleId property: Article Id.
     *
     * @return the articleId value.
     */
    public String articleId() {
        return this.articleId;
    }

    /**
     * Set the articleId property: Article Id.
     *
     * @param articleId the articleId value to set.
     * @return the EventPropertiesArticle object itself.
     */
    public EventPropertiesArticle withArticleId(String articleId) {
        this.articleId = articleId;
        return this;
    }

    /**
     * Get the parameters property: It provides a map of parameter name and value.
     *
     * @return the parameters value.
     */
    public Object parameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: It provides a map of parameter name and value.
     *
     * @param parameters the parameters value to set.
     * @return the EventPropertiesArticle object itself.
     */
    public EventPropertiesArticle withParameters(Object parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
