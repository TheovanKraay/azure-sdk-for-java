// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models.LogicalNetworkInner;

/** An immutable client-side representation of LogicalNetwork. */
public interface LogicalNetwork {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the properties property: The Logical Network Properties.
     *
     * @return the properties value.
     */
    LogicalNetworkProperties properties();

    /**
     * Gets the location property: Resource Location.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the inner com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models.LogicalNetworkInner object.
     *
     * @return the inner object.
     */
    LogicalNetworkInner innerModel();
}