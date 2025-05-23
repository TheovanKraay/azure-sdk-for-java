// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The provisioning state of the rack SKU resource.
 */
public final class RackSkuProvisioningState extends ExpandableStringEnum<RackSkuProvisioningState> {
    /**
     * Static value Canceled for RackSkuProvisioningState.
     */
    public static final RackSkuProvisioningState CANCELED = fromString("Canceled");

    /**
     * Static value Failed for RackSkuProvisioningState.
     */
    public static final RackSkuProvisioningState FAILED = fromString("Failed");

    /**
     * Static value Succeeded for RackSkuProvisioningState.
     */
    public static final RackSkuProvisioningState SUCCEEDED = fromString("Succeeded");

    /**
     * Creates a new instance of RackSkuProvisioningState value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public RackSkuProvisioningState() {
    }

    /**
     * Creates or finds a RackSkuProvisioningState from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding RackSkuProvisioningState.
     */
    public static RackSkuProvisioningState fromString(String name) {
        return fromString(name, RackSkuProvisioningState.class);
    }

    /**
     * Gets known RackSkuProvisioningState values.
     * 
     * @return known RackSkuProvisioningState values.
     */
    public static Collection<RackSkuProvisioningState> values() {
        return values(RackSkuProvisioningState.class);
    }
}
