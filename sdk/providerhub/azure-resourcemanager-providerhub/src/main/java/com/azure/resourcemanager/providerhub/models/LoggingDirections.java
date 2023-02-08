// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for LoggingDirections. */
public final class LoggingDirections extends ExpandableStringEnum<LoggingDirections> {
    /** Static value None for LoggingDirections. */
    public static final LoggingDirections NONE = fromString("None");

    /** Static value Request for LoggingDirections. */
    public static final LoggingDirections REQUEST = fromString("Request");

    /** Static value Response for LoggingDirections. */
    public static final LoggingDirections RESPONSE = fromString("Response");

    /**
     * Creates a new instance of LoggingDirections value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public LoggingDirections() {
    }

    /**
     * Creates or finds a LoggingDirections from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding LoggingDirections.
     */
    @JsonCreator
    public static LoggingDirections fromString(String name) {
        return fromString(name, LoggingDirections.class);
    }

    /**
     * Gets known LoggingDirections values.
     *
     * @return known LoggingDirections values.
     */
    public static Collection<LoggingDirections> values() {
        return values(LoggingDirections.class);
    }
}