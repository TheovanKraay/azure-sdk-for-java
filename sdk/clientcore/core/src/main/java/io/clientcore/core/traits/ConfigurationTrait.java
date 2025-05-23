// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package io.clientcore.core.traits;

import io.clientcore.core.utils.configuration.Configuration;

/**
 * A {@link io.clientcore.core.traits trait} providing a consistent interface for setting {@link Configuration}.
 *
 * @param <T> The concrete type that implements the trait. This is required so that fluent operations can continue to
 * return the concrete type, rather than the trait type.
 *
 * @see io.clientcore.core.traits
 * @see Configuration
 */
public interface ConfigurationTrait<T extends ConfigurationTrait<T>> {
    /**
     * Sets the client-specific configuration used to retrieve client or global configuration properties when building a
     * client.
     *
     * @param configuration Configuration store used to retrieve client configurations.
     *
     * @return Returns the same concrete type with the appropriate properties updated, to allow for fluent chaining of
     * operations.
     */
    T configuration(Configuration configuration);
}
