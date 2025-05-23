// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresql.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The actions required for private link service connection.
 */
public final class PrivateLinkServiceConnectionStateActionsRequire
    extends ExpandableStringEnum<PrivateLinkServiceConnectionStateActionsRequire> {
    /**
     * Static value None for PrivateLinkServiceConnectionStateActionsRequire.
     */
    public static final PrivateLinkServiceConnectionStateActionsRequire NONE = fromString("None");

    /**
     * Creates a new instance of PrivateLinkServiceConnectionStateActionsRequire value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public PrivateLinkServiceConnectionStateActionsRequire() {
    }

    /**
     * Creates or finds a PrivateLinkServiceConnectionStateActionsRequire from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding PrivateLinkServiceConnectionStateActionsRequire.
     */
    public static PrivateLinkServiceConnectionStateActionsRequire fromString(String name) {
        return fromString(name, PrivateLinkServiceConnectionStateActionsRequire.class);
    }

    /**
     * Gets known PrivateLinkServiceConnectionStateActionsRequire values.
     * 
     * @return known PrivateLinkServiceConnectionStateActionsRequire values.
     */
    public static Collection<PrivateLinkServiceConnectionStateActionsRequire> values() {
        return values(PrivateLinkServiceConnectionStateActionsRequire.class);
    }
}
