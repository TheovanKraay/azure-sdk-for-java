// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.translation.text.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Common properties of language script.
 */
@Immutable
public class LanguageScript {

    /*
     * Code identifying the script.
     */
    @Generated
    @JsonProperty(value = "code")
    private final String code;

    /*
     * Display name of the script in the locale requested via Accept-Language header.
     */
    @Generated
    @JsonProperty(value = "name")
    private final String name;

    /*
     * Display name of the language in the locale native for the language.
     */
    @Generated
    @JsonProperty(value = "nativeName")
    private final String nativeName;

    /*
     * Directionality, which is rtl for right-to-left languages or ltr for left-to-right languages.
     */
    @Generated
    @JsonProperty(value = "dir")
    private final LanguageDirectionality directionality;

    /**
     * Creates an instance of LanguageScript class.
     *
     * @param code the code value to set.
     * @param name the name value to set.
     * @param nativeName the nativeName value to set.
     * @param directionality the directionality value to set.
     */
    @Generated
    @JsonCreator
    protected LanguageScript(@JsonProperty(value = "code") String code, @JsonProperty(value = "name") String name,
        @JsonProperty(value = "nativeName") String nativeName,
        @JsonProperty(value = "dir") LanguageDirectionality directionality) {
        this.code = code;
        this.name = name;
        this.nativeName = nativeName;
        this.directionality = directionality;
    }

    /**
     * Get the code property: Code identifying the script.
     *
     * @return the code value.
     */
    @Generated
    public String getCode() {
        return this.code;
    }

    /**
     * Get the name property: Display name of the script in the locale requested via Accept-Language header.
     *
     * @return the name value.
     */
    @Generated
    public String getName() {
        return this.name;
    }

    /**
     * Get the nativeName property: Display name of the language in the locale native for the language.
     *
     * @return the nativeName value.
     */
    @Generated
    public String getNativeName() {
        return this.nativeName;
    }

    /**
     * Get the directionality property: Directionality, which is rtl for right-to-left languages or ltr for
     * left-to-right languages.
     *
     * @return the directionality value.
     */
    @Generated
    public LanguageDirectionality getDirectionality() {
        return this.directionality;
    }
}
