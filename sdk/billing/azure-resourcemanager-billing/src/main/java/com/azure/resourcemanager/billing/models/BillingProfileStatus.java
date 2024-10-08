// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The status of the billing profile.
 */
public final class BillingProfileStatus extends ExpandableStringEnum<BillingProfileStatus> {
    /**
     * Static value Other for BillingProfileStatus.
     */
    public static final BillingProfileStatus OTHER = fromString("Other");

    /**
     * Static value Active for BillingProfileStatus.
     */
    public static final BillingProfileStatus ACTIVE = fromString("Active");

    /**
     * Static value Disabled for BillingProfileStatus.
     */
    public static final BillingProfileStatus DISABLED = fromString("Disabled");

    /**
     * Static value Warned for BillingProfileStatus.
     */
    public static final BillingProfileStatus WARNED = fromString("Warned");

    /**
     * Static value Deleted for BillingProfileStatus.
     */
    public static final BillingProfileStatus DELETED = fromString("Deleted");

    /**
     * Static value UnderReview for BillingProfileStatus.
     */
    public static final BillingProfileStatus UNDER_REVIEW = fromString("UnderReview");

    /**
     * Creates a new instance of BillingProfileStatus value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public BillingProfileStatus() {
    }

    /**
     * Creates or finds a BillingProfileStatus from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding BillingProfileStatus.
     */
    public static BillingProfileStatus fromString(String name) {
        return fromString(name, BillingProfileStatus.class);
    }

    /**
     * Gets known BillingProfileStatus values.
     * 
     * @return known BillingProfileStatus values.
     */
    public static Collection<BillingProfileStatus> values() {
        return values(BillingProfileStatus.class);
    }
}
