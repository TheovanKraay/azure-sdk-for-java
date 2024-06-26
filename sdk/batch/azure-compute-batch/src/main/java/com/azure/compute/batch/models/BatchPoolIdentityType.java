// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * BatchPoolIdentityType enums.
 */
public final class BatchPoolIdentityType extends ExpandableStringEnum<BatchPoolIdentityType> {

    /**
     * Batch pool has user assigned identities with it.
     */
    @Generated
    public static final BatchPoolIdentityType USER_ASSIGNED = fromString("UserAssigned");

    /**
     * Batch pool has no identity associated with it. Setting `None` in update pool will remove existing identities.
     */
    @Generated
    public static final BatchPoolIdentityType NONE = fromString("None");

    /**
     * Creates a new instance of BatchPoolIdentityType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public BatchPoolIdentityType() {
    }

    /**
     * Creates or finds a BatchPoolIdentityType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding BatchPoolIdentityType.
     */
    @Generated
    public static BatchPoolIdentityType fromString(String name) {
        return fromString(name, BatchPoolIdentityType.class);
    }

    /**
     * Gets known BatchPoolIdentityType values.
     *
     * @return known BatchPoolIdentityType values.
     */
    @Generated
    public static Collection<BatchPoolIdentityType> values() {
        return values(BatchPoolIdentityType.class);
    }
}
