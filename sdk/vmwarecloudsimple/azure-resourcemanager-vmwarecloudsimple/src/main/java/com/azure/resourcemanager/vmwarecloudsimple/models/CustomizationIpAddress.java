// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.vmwarecloudsimple.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The CustomizationIpAddress model. */
@Fluent
public final class CustomizationIpAddress {
    /*
     * Argument when Custom ip type is selected
     */
    @JsonProperty(value = "argument")
    private String argument;

    /*
     * Defined Ip Address when Fixed ip type is selected
     */
    @JsonProperty(value = "ipAddress")
    private String ipAddress;

    /*
     * Customization Specification ip type
     */
    @JsonProperty(value = "type")
    private CustomizationIpAddressType type;

    /** Creates an instance of CustomizationIpAddress class. */
    public CustomizationIpAddress() {
    }

    /**
     * Get the argument property: Argument when Custom ip type is selected.
     *
     * @return the argument value.
     */
    public String argument() {
        return this.argument;
    }

    /**
     * Set the argument property: Argument when Custom ip type is selected.
     *
     * @param argument the argument value to set.
     * @return the CustomizationIpAddress object itself.
     */
    public CustomizationIpAddress withArgument(String argument) {
        this.argument = argument;
        return this;
    }

    /**
     * Get the ipAddress property: Defined Ip Address when Fixed ip type is selected.
     *
     * @return the ipAddress value.
     */
    public String ipAddress() {
        return this.ipAddress;
    }

    /**
     * Set the ipAddress property: Defined Ip Address when Fixed ip type is selected.
     *
     * @param ipAddress the ipAddress value to set.
     * @return the CustomizationIpAddress object itself.
     */
    public CustomizationIpAddress withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * Get the type property: Customization Specification ip type.
     *
     * @return the type value.
     */
    public CustomizationIpAddressType type() {
        return this.type;
    }

    /**
     * Set the type property: Customization Specification ip type.
     *
     * @param type the type value to set.
     * @return the CustomizationIpAddress object itself.
     */
    public CustomizationIpAddress withType(CustomizationIpAddressType type) {
        this.type = type;
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
