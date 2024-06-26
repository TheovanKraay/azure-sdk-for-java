// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 5G GUTI.
 */
@Fluent
public final class Guti5G {
    /*
     * Public land mobile network (PLMN) ID. This is made up of the mobile country code and mobile network code, as
     * defined in https://www.itu.int/rec/T-REC-E.212. The values 001-01 and 001-001 can be used for testing and the
     * values 999-99 and 999-999 can be used on internal private networks.
     */
    @JsonProperty(value = "plmn", required = true)
    private PlmnId plmn;

    /*
     * AMF identifier
     */
    @JsonProperty(value = "amfId", required = true)
    private AmfId amfId;

    /*
     * 5G Temporary Mobile Subscriber Identity
     */
    @JsonProperty(value = "fivegTmsi", required = true)
    private int fivegTmsi;

    /**
     * Creates an instance of Guti5G class.
     */
    public Guti5G() {
    }

    /**
     * Get the plmn property: Public land mobile network (PLMN) ID. This is made up of the mobile country code and
     * mobile network code, as defined in https://www.itu.int/rec/T-REC-E.212. The values 001-01 and 001-001 can be
     * used for testing and the values 999-99 and 999-999 can be used on internal private networks.
     * 
     * @return the plmn value.
     */
    public PlmnId plmn() {
        return this.plmn;
    }

    /**
     * Set the plmn property: Public land mobile network (PLMN) ID. This is made up of the mobile country code and
     * mobile network code, as defined in https://www.itu.int/rec/T-REC-E.212. The values 001-01 and 001-001 can be
     * used for testing and the values 999-99 and 999-999 can be used on internal private networks.
     * 
     * @param plmn the plmn value to set.
     * @return the Guti5G object itself.
     */
    public Guti5G withPlmn(PlmnId plmn) {
        this.plmn = plmn;
        return this;
    }

    /**
     * Get the amfId property: AMF identifier.
     * 
     * @return the amfId value.
     */
    public AmfId amfId() {
        return this.amfId;
    }

    /**
     * Set the amfId property: AMF identifier.
     * 
     * @param amfId the amfId value to set.
     * @return the Guti5G object itself.
     */
    public Guti5G withAmfId(AmfId amfId) {
        this.amfId = amfId;
        return this;
    }

    /**
     * Get the fivegTmsi property: 5G Temporary Mobile Subscriber Identity.
     * 
     * @return the fivegTmsi value.
     */
    public int fivegTmsi() {
        return this.fivegTmsi;
    }

    /**
     * Set the fivegTmsi property: 5G Temporary Mobile Subscriber Identity.
     * 
     * @param fivegTmsi the fivegTmsi value to set.
     * @return the Guti5G object itself.
     */
    public Guti5G withFivegTmsi(int fivegTmsi) {
        this.fivegTmsi = fivegTmsi;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (plmn() == null) {
            throw LOGGER
                .logExceptionAsError(new IllegalArgumentException("Missing required property plmn in model Guti5G"));
        } else {
            plmn().validate();
        }
        if (amfId() == null) {
            throw LOGGER
                .logExceptionAsError(new IllegalArgumentException("Missing required property amfId in model Guti5G"));
        } else {
            amfId().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(Guti5G.class);
}
