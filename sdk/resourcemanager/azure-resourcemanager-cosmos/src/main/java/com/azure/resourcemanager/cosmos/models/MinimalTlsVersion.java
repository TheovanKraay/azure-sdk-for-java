// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Indicates the minimum allowed Tls version. The default is Tls 1.0, except for Cassandra and Mongo API's, which only
 * work with Tls 1.2.
 */
public final class MinimalTlsVersion extends ExpandableStringEnum<MinimalTlsVersion> {
    /** Static value Tls for MinimalTlsVersion. */
    public static final MinimalTlsVersion TLS = fromString("Tls");

    /** Static value Tls11 for MinimalTlsVersion. */
    public static final MinimalTlsVersion TLS11 = fromString("Tls11");

    /** Static value Tls12 for MinimalTlsVersion. */
    public static final MinimalTlsVersion TLS12 = fromString("Tls12");

    /**
     * Creates a new instance of MinimalTlsVersion value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public MinimalTlsVersion() {
    }

    /**
     * Creates or finds a MinimalTlsVersion from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding MinimalTlsVersion.
     */
    @JsonCreator
    public static MinimalTlsVersion fromString(String name) {
        return fromString(name, MinimalTlsVersion.class);
    }

    /**
     * Gets known MinimalTlsVersion values.
     *
     * @return known MinimalTlsVersion values.
     */
    public static Collection<MinimalTlsVersion> values() {
        return values(MinimalTlsVersion.class);
    }
}