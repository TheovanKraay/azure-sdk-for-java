// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.resourcemanager.hdinsight.containers.fluent.models.ClusterPoolUpgradeHistoryInner;

/**
 * An instance of this class provides access to all the operations defined in ClusterPoolUpgradeHistoriesClient.
 */
public interface ClusterPoolUpgradeHistoriesClient {
    /**
     * Returns a list of upgrade history.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterPoolName The name of the cluster pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a list of cluster pool upgrade history as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ClusterPoolUpgradeHistoryInner> list(String resourceGroupName, String clusterPoolName);

    /**
     * Returns a list of upgrade history.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterPoolName The name of the cluster pool.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a list of cluster pool upgrade history as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ClusterPoolUpgradeHistoryInner> list(String resourceGroupName, String clusterPoolName,
        Context context);
}
