// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Status of notification.
 */
public final class DelayNotificationStatus extends ExpandableStringEnum<DelayNotificationStatus> {
    /**
     * Static value Active for DelayNotificationStatus.
     */
    public static final DelayNotificationStatus ACTIVE = fromString("Active");

    /**
     * Static value Resolved for DelayNotificationStatus.
     */
    public static final DelayNotificationStatus RESOLVED = fromString("Resolved");

    /**
     * Creates a new instance of DelayNotificationStatus value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public DelayNotificationStatus() {
    }

    /**
     * Creates or finds a DelayNotificationStatus from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding DelayNotificationStatus.
     */
    public static DelayNotificationStatus fromString(String name) {
        return fromString(name, DelayNotificationStatus.class);
    }

    /**
     * Gets known DelayNotificationStatus values.
     * 
     * @return known DelayNotificationStatus values.
     */
    public static Collection<DelayNotificationStatus> values() {
        return values(DelayNotificationStatus.class);
    }
}
