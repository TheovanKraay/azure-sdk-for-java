// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.containerservicefleet.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The node image upgrade type.
 */
public final class NodeImageSelectionType extends ExpandableStringEnum<NodeImageSelectionType> {
    /**
     * Use the latest image version when upgrading nodes. Clusters may use different image versions (e.g.,
     * 'AKSUbuntu-1804gen2containerd-2021.10.12' and 'AKSUbuntu-1804gen2containerd-2021.10.19') because, for example,
     * the latest available version is different in different regions.
     */
    public static final NodeImageSelectionType LATEST = fromString("Latest");

    /**
     * The image versions to upgrade nodes to are selected as described below: for each node pool in managed clusters
     * affected by the update run, the system selects the latest image version such that it is available across all
     * other node pools (in all other clusters) of the same image type. As a result, all node pools of the same image
     * type will be upgraded to the same image version. For example, if the latest image version for image type
     * 'AKSUbuntu-1804gen2containerd' is 'AKSUbuntu-1804gen2containerd-2021.10.12' for a node pool in cluster A in
     * region X, and is 'AKSUbuntu-1804gen2containerd-2021.10.17' for a node pool in cluster B in region Y, the system
     * will upgrade both node pools to image version 'AKSUbuntu-1804gen2containerd-2021.10.12'.
     */
    public static final NodeImageSelectionType CONSISTENT = fromString("Consistent");

    /**
     * Upgrade the nodes to the custom image versions. When set, update run will use node image versions provided in
     * customNodeImageVersions to upgrade the nodes. If set, customNodeImageVersions must not be empty.
     */
    public static final NodeImageSelectionType CUSTOM = fromString("Custom");

    /**
     * Creates a new instance of NodeImageSelectionType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public NodeImageSelectionType() {
    }

    /**
     * Creates or finds a NodeImageSelectionType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding NodeImageSelectionType.
     */
    public static NodeImageSelectionType fromString(String name) {
        return fromString(name, NodeImageSelectionType.class);
    }

    /**
     * Gets known NodeImageSelectionType values.
     * 
     * @return known NodeImageSelectionType values.
     */
    public static Collection<NodeImageSelectionType> values() {
        return values(NodeImageSelectionType.class);
    }
}
