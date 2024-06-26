// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.hybridnetwork.fluent.models.NetworkServiceDesignVersionInner;
import com.azure.resourcemanager.hybridnetwork.fluent.models.NetworkServiceDesignVersionUpdateStateInner;
import com.azure.resourcemanager.hybridnetwork.models.TagsObject;

/**
 * An instance of this class provides access to all the operations defined in NetworkServiceDesignVersionsClient.
 */
public interface NetworkServiceDesignVersionsClient {
    /**
     * Deletes the specified network service design version.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param publisherName The name of the publisher.
     * @param networkServiceDesignGroupName The name of the network service design group.
     * @param networkServiceDesignVersionName The name of the network service design version. The name should conform to
     * the SemVer 2.0.0 specification: https://semver.org/spec/v2.0.0.html.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String publisherName,
        String networkServiceDesignGroupName, String networkServiceDesignVersionName);

    /**
     * Deletes the specified network service design version.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param publisherName The name of the publisher.
     * @param networkServiceDesignGroupName The name of the network service design group.
     * @param networkServiceDesignVersionName The name of the network service design version. The name should conform to
     * the SemVer 2.0.0 specification: https://semver.org/spec/v2.0.0.html.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String publisherName,
        String networkServiceDesignGroupName, String networkServiceDesignVersionName, Context context);

    /**
     * Deletes the specified network service design version.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param publisherName The name of the publisher.
     * @param networkServiceDesignGroupName The name of the network service design group.
     * @param networkServiceDesignVersionName The name of the network service design version. The name should conform to
     * the SemVer 2.0.0 specification: https://semver.org/spec/v2.0.0.html.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String publisherName, String networkServiceDesignGroupName,
        String networkServiceDesignVersionName);

    /**
     * Deletes the specified network service design version.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param publisherName The name of the publisher.
     * @param networkServiceDesignGroupName The name of the network service design group.
     * @param networkServiceDesignVersionName The name of the network service design version. The name should conform to
     * the SemVer 2.0.0 specification: https://semver.org/spec/v2.0.0.html.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String publisherName, String networkServiceDesignGroupName,
        String networkServiceDesignVersionName, Context context);

    /**
     * Creates or updates a network service design version.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param publisherName The name of the publisher.
     * @param networkServiceDesignGroupName The name of the network service design group.
     * @param networkServiceDesignVersionName The name of the network service design version. The name should conform to
     * the SemVer 2.0.0 specification: https://semver.org/spec/v2.0.0.html.
     * @param parameters Parameters supplied to the create or update network service design version operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of network service design version.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<NetworkServiceDesignVersionInner>, NetworkServiceDesignVersionInner> beginCreateOrUpdate(
        String resourceGroupName, String publisherName, String networkServiceDesignGroupName,
        String networkServiceDesignVersionName, NetworkServiceDesignVersionInner parameters);

    /**
     * Creates or updates a network service design version.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param publisherName The name of the publisher.
     * @param networkServiceDesignGroupName The name of the network service design group.
     * @param networkServiceDesignVersionName The name of the network service design version. The name should conform to
     * the SemVer 2.0.0 specification: https://semver.org/spec/v2.0.0.html.
     * @param parameters Parameters supplied to the create or update network service design version operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of network service design version.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<NetworkServiceDesignVersionInner>, NetworkServiceDesignVersionInner> beginCreateOrUpdate(
        String resourceGroupName, String publisherName, String networkServiceDesignGroupName,
        String networkServiceDesignVersionName, NetworkServiceDesignVersionInner parameters, Context context);

    /**
     * Creates or updates a network service design version.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param publisherName The name of the publisher.
     * @param networkServiceDesignGroupName The name of the network service design group.
     * @param networkServiceDesignVersionName The name of the network service design version. The name should conform to
     * the SemVer 2.0.0 specification: https://semver.org/spec/v2.0.0.html.
     * @param parameters Parameters supplied to the create or update network service design version operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return network service design version.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NetworkServiceDesignVersionInner createOrUpdate(String resourceGroupName, String publisherName,
        String networkServiceDesignGroupName, String networkServiceDesignVersionName,
        NetworkServiceDesignVersionInner parameters);

    /**
     * Creates or updates a network service design version.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param publisherName The name of the publisher.
     * @param networkServiceDesignGroupName The name of the network service design group.
     * @param networkServiceDesignVersionName The name of the network service design version. The name should conform to
     * the SemVer 2.0.0 specification: https://semver.org/spec/v2.0.0.html.
     * @param parameters Parameters supplied to the create or update network service design version operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return network service design version.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NetworkServiceDesignVersionInner createOrUpdate(String resourceGroupName, String publisherName,
        String networkServiceDesignGroupName, String networkServiceDesignVersionName,
        NetworkServiceDesignVersionInner parameters, Context context);

    /**
     * Gets information about a network service design version.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param publisherName The name of the publisher.
     * @param networkServiceDesignGroupName The name of the network service design group.
     * @param networkServiceDesignVersionName The name of the network service design version. The name should conform to
     * the SemVer 2.0.0 specification: https://semver.org/spec/v2.0.0.html.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about a network service design version along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<NetworkServiceDesignVersionInner> getWithResponse(String resourceGroupName, String publisherName,
        String networkServiceDesignGroupName, String networkServiceDesignVersionName, Context context);

    /**
     * Gets information about a network service design version.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param publisherName The name of the publisher.
     * @param networkServiceDesignGroupName The name of the network service design group.
     * @param networkServiceDesignVersionName The name of the network service design version. The name should conform to
     * the SemVer 2.0.0 specification: https://semver.org/spec/v2.0.0.html.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about a network service design version.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NetworkServiceDesignVersionInner get(String resourceGroupName, String publisherName,
        String networkServiceDesignGroupName, String networkServiceDesignVersionName);

    /**
     * Updates a network service design version resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param publisherName The name of the publisher.
     * @param networkServiceDesignGroupName The name of the network service design group.
     * @param networkServiceDesignVersionName The name of the network service design version. The name should conform to
     * the SemVer 2.0.0 specification: https://semver.org/spec/v2.0.0.html.
     * @param parameters Parameters supplied to the create or update network service design version operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return network service design version along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<NetworkServiceDesignVersionInner> updateWithResponse(String resourceGroupName, String publisherName,
        String networkServiceDesignGroupName, String networkServiceDesignVersionName, TagsObject parameters,
        Context context);

    /**
     * Updates a network service design version resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param publisherName The name of the publisher.
     * @param networkServiceDesignGroupName The name of the network service design group.
     * @param networkServiceDesignVersionName The name of the network service design version. The name should conform to
     * the SemVer 2.0.0 specification: https://semver.org/spec/v2.0.0.html.
     * @param parameters Parameters supplied to the create or update network service design version operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return network service design version.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NetworkServiceDesignVersionInner update(String resourceGroupName, String publisherName,
        String networkServiceDesignGroupName, String networkServiceDesignVersionName, TagsObject parameters);

    /**
     * Gets information about a list of network service design versions under a network service design group.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param publisherName The name of the publisher.
     * @param networkServiceDesignGroupName The name of the network service design group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about a list of network service design versions under a network service design group as
     * paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<NetworkServiceDesignVersionInner> listByNetworkServiceDesignGroup(String resourceGroupName,
        String publisherName, String networkServiceDesignGroupName);

    /**
     * Gets information about a list of network service design versions under a network service design group.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param publisherName The name of the publisher.
     * @param networkServiceDesignGroupName The name of the network service design group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about a list of network service design versions under a network service design group as
     * paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<NetworkServiceDesignVersionInner> listByNetworkServiceDesignGroup(String resourceGroupName,
        String publisherName, String networkServiceDesignGroupName, Context context);

    /**
     * Update network service design version state.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param publisherName The name of the publisher.
     * @param networkServiceDesignGroupName The name of the network service design group.
     * @param networkServiceDesignVersionName The name of the network service design version. The name should conform to
     * the SemVer 2.0.0 specification: https://semver.org/spec/v2.0.0.html.
     * @param parameters Parameters supplied to update the state of network service design version.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of publisher network service design version update request definition.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<NetworkServiceDesignVersionUpdateStateInner>, NetworkServiceDesignVersionUpdateStateInner>
        beginUpdateState(String resourceGroupName, String publisherName, String networkServiceDesignGroupName,
            String networkServiceDesignVersionName, NetworkServiceDesignVersionUpdateStateInner parameters);

    /**
     * Update network service design version state.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param publisherName The name of the publisher.
     * @param networkServiceDesignGroupName The name of the network service design group.
     * @param networkServiceDesignVersionName The name of the network service design version. The name should conform to
     * the SemVer 2.0.0 specification: https://semver.org/spec/v2.0.0.html.
     * @param parameters Parameters supplied to update the state of network service design version.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of publisher network service design version update request definition.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<NetworkServiceDesignVersionUpdateStateInner>, NetworkServiceDesignVersionUpdateStateInner>
        beginUpdateState(String resourceGroupName, String publisherName, String networkServiceDesignGroupName,
            String networkServiceDesignVersionName, NetworkServiceDesignVersionUpdateStateInner parameters,
            Context context);

    /**
     * Update network service design version state.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param publisherName The name of the publisher.
     * @param networkServiceDesignGroupName The name of the network service design group.
     * @param networkServiceDesignVersionName The name of the network service design version. The name should conform to
     * the SemVer 2.0.0 specification: https://semver.org/spec/v2.0.0.html.
     * @param parameters Parameters supplied to update the state of network service design version.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return publisher network service design version update request definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NetworkServiceDesignVersionUpdateStateInner updateState(String resourceGroupName, String publisherName,
        String networkServiceDesignGroupName, String networkServiceDesignVersionName,
        NetworkServiceDesignVersionUpdateStateInner parameters);

    /**
     * Update network service design version state.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param publisherName The name of the publisher.
     * @param networkServiceDesignGroupName The name of the network service design group.
     * @param networkServiceDesignVersionName The name of the network service design version. The name should conform to
     * the SemVer 2.0.0 specification: https://semver.org/spec/v2.0.0.html.
     * @param parameters Parameters supplied to update the state of network service design version.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return publisher network service design version update request definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NetworkServiceDesignVersionUpdateStateInner updateState(String resourceGroupName, String publisherName,
        String networkServiceDesignGroupName, String networkServiceDesignVersionName,
        NetworkServiceDesignVersionUpdateStateInner parameters, Context context);
}
