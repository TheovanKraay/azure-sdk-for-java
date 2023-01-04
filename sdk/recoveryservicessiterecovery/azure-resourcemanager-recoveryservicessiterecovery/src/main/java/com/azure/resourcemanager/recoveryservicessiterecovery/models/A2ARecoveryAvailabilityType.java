// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The recovery availability type of the virtual machine. */
public final class A2ARecoveryAvailabilityType extends ExpandableStringEnum<A2ARecoveryAvailabilityType> {
    /** Static value Single for A2ARecoveryAvailabilityType. */
    public static final A2ARecoveryAvailabilityType SINGLE = fromString("Single");

    /** Static value AvailabilitySet for A2ARecoveryAvailabilityType. */
    public static final A2ARecoveryAvailabilityType AVAILABILITY_SET = fromString("AvailabilitySet");

    /** Static value AvailabilityZone for A2ARecoveryAvailabilityType. */
    public static final A2ARecoveryAvailabilityType AVAILABILITY_ZONE = fromString("AvailabilityZone");

    /**
     * Creates or finds a A2ARecoveryAvailabilityType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding A2ARecoveryAvailabilityType.
     */
    @JsonCreator
    public static A2ARecoveryAvailabilityType fromString(String name) {
        return fromString(name, A2ARecoveryAvailabilityType.class);
    }

    /**
     * Gets known A2ARecoveryAvailabilityType values.
     *
     * @return known A2ARecoveryAvailabilityType values.
     */
    public static Collection<A2ARecoveryAvailabilityType> values() {
        return values(A2ARecoveryAvailabilityType.class);
    }
}