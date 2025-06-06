// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakeanalytics.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.datalakeanalytics.fluent.models.DataLakeAnalyticsAccountBasicInner;
import com.azure.resourcemanager.datalakeanalytics.fluent.models.DataLakeAnalyticsAccountInner;
import com.azure.resourcemanager.datalakeanalytics.fluent.models.NameAvailabilityInformationInner;
import com.azure.resourcemanager.datalakeanalytics.models.CheckNameAvailabilityParameters;
import com.azure.resourcemanager.datalakeanalytics.models.CreateDataLakeAnalyticsAccountParameters;
import com.azure.resourcemanager.datalakeanalytics.models.UpdateDataLakeAnalyticsAccountParameters;

/**
 * An instance of this class provides access to all the operations defined in AccountsClient.
 */
public interface AccountsClient {
    /**
     * Gets the first page of Data Lake Analytics accounts, if any, within the current subscription. This includes a
     * link to the next page, if any.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the first page of Data Lake Analytics accounts, if any, within the current subscription as paginated
     * response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DataLakeAnalyticsAccountBasicInner> list();

    /**
     * Gets the first page of Data Lake Analytics accounts, if any, within the current subscription. This includes a
     * link to the next page, if any.
     * 
     * @param filter OData filter. Optional.
     * @param top The number of items to return. Optional.
     * @param skip The number of items to skip over before returning elements. Optional.
     * @param select OData Select statement. Limits the properties on each entry to just those requested, e.g.
     * Categories?$select=CategoryName,Description. Optional.
     * @param orderby OrderBy clause. One or more comma-separated expressions with an optional "asc" (the default) or
     * "desc" depending on the order you'd like the values sorted, e.g. Categories?$orderby=CategoryName desc. Optional.
     * @param count The Boolean value of true or false to request a count of the matching resources included with the
     * resources in the response, e.g. Categories?$count=true. Optional.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the first page of Data Lake Analytics accounts, if any, within the current subscription as paginated
     * response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DataLakeAnalyticsAccountBasicInner> list(String filter, Integer top, Integer skip, String select,
        String orderby, Boolean count, Context context);

    /**
     * Gets the first page of Data Lake Analytics accounts, if any, within a specific resource group. This includes a
     * link to the next page, if any.
     * 
     * @param resourceGroupName The name of the Azure resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the first page of Data Lake Analytics accounts, if any, within a specific resource group as paginated
     * response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DataLakeAnalyticsAccountBasicInner> listByResourceGroup(String resourceGroupName);

    /**
     * Gets the first page of Data Lake Analytics accounts, if any, within a specific resource group. This includes a
     * link to the next page, if any.
     * 
     * @param resourceGroupName The name of the Azure resource group.
     * @param filter OData filter. Optional.
     * @param top The number of items to return. Optional.
     * @param skip The number of items to skip over before returning elements. Optional.
     * @param select OData Select statement. Limits the properties on each entry to just those requested, e.g.
     * Categories?$select=CategoryName,Description. Optional.
     * @param orderby OrderBy clause. One or more comma-separated expressions with an optional "asc" (the default) or
     * "desc" depending on the order you'd like the values sorted, e.g. Categories?$orderby=CategoryName desc. Optional.
     * @param count The Boolean value of true or false to request a count of the matching resources included with the
     * resources in the response, e.g. Categories?$count=true. Optional.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the first page of Data Lake Analytics accounts, if any, within a specific resource group as paginated
     * response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DataLakeAnalyticsAccountBasicInner> listByResourceGroup(String resourceGroupName, String filter,
        Integer top, Integer skip, String select, String orderby, Boolean count, Context context);

    /**
     * Creates the specified Data Lake Analytics account. This supplies the user with computation services for Data Lake
     * Analytics workloads.
     * 
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Analytics account.
     * @param parameters Parameters supplied to create a new Data Lake Analytics account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of a Data Lake Analytics account object, containing all information
     * associated with the named Data Lake Analytics account.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<DataLakeAnalyticsAccountInner>, DataLakeAnalyticsAccountInner>
        beginCreate(String resourceGroupName, String accountName, CreateDataLakeAnalyticsAccountParameters parameters);

    /**
     * Creates the specified Data Lake Analytics account. This supplies the user with computation services for Data Lake
     * Analytics workloads.
     * 
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Analytics account.
     * @param parameters Parameters supplied to create a new Data Lake Analytics account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of a Data Lake Analytics account object, containing all information
     * associated with the named Data Lake Analytics account.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<DataLakeAnalyticsAccountInner>, DataLakeAnalyticsAccountInner> beginCreate(
        String resourceGroupName, String accountName, CreateDataLakeAnalyticsAccountParameters parameters,
        Context context);

    /**
     * Creates the specified Data Lake Analytics account. This supplies the user with computation services for Data Lake
     * Analytics workloads.
     * 
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Analytics account.
     * @param parameters Parameters supplied to create a new Data Lake Analytics account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Data Lake Analytics account object, containing all information associated with the named Data Lake
     * Analytics account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DataLakeAnalyticsAccountInner create(String resourceGroupName, String accountName,
        CreateDataLakeAnalyticsAccountParameters parameters);

    /**
     * Creates the specified Data Lake Analytics account. This supplies the user with computation services for Data Lake
     * Analytics workloads.
     * 
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Analytics account.
     * @param parameters Parameters supplied to create a new Data Lake Analytics account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Data Lake Analytics account object, containing all information associated with the named Data Lake
     * Analytics account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DataLakeAnalyticsAccountInner create(String resourceGroupName, String accountName,
        CreateDataLakeAnalyticsAccountParameters parameters, Context context);

    /**
     * Gets details of the specified Data Lake Analytics account.
     * 
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Analytics account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details of the specified Data Lake Analytics account along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DataLakeAnalyticsAccountInner> getByResourceGroupWithResponse(String resourceGroupName, String accountName,
        Context context);

    /**
     * Gets details of the specified Data Lake Analytics account.
     * 
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Analytics account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details of the specified Data Lake Analytics account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DataLakeAnalyticsAccountInner getByResourceGroup(String resourceGroupName, String accountName);

    /**
     * Updates the Data Lake Analytics account object specified by the accountName with the contents of the account
     * object.
     * 
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Analytics account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of a Data Lake Analytics account object, containing all information
     * associated with the named Data Lake Analytics account.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<DataLakeAnalyticsAccountInner>, DataLakeAnalyticsAccountInner>
        beginUpdate(String resourceGroupName, String accountName);

    /**
     * Updates the Data Lake Analytics account object specified by the accountName with the contents of the account
     * object.
     * 
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Analytics account.
     * @param parameters Parameters supplied to the update Data Lake Analytics account operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of a Data Lake Analytics account object, containing all information
     * associated with the named Data Lake Analytics account.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<DataLakeAnalyticsAccountInner>, DataLakeAnalyticsAccountInner> beginUpdate(
        String resourceGroupName, String accountName, UpdateDataLakeAnalyticsAccountParameters parameters,
        Context context);

    /**
     * Updates the Data Lake Analytics account object specified by the accountName with the contents of the account
     * object.
     * 
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Analytics account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Data Lake Analytics account object, containing all information associated with the named Data Lake
     * Analytics account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DataLakeAnalyticsAccountInner update(String resourceGroupName, String accountName);

    /**
     * Updates the Data Lake Analytics account object specified by the accountName with the contents of the account
     * object.
     * 
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Analytics account.
     * @param parameters Parameters supplied to the update Data Lake Analytics account operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Data Lake Analytics account object, containing all information associated with the named Data Lake
     * Analytics account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DataLakeAnalyticsAccountInner update(String resourceGroupName, String accountName,
        UpdateDataLakeAnalyticsAccountParameters parameters, Context context);

    /**
     * Begins the delete process for the Data Lake Analytics account object specified by the account name.
     * 
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Analytics account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String accountName);

    /**
     * Begins the delete process for the Data Lake Analytics account object specified by the account name.
     * 
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Analytics account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String accountName, Context context);

    /**
     * Begins the delete process for the Data Lake Analytics account object specified by the account name.
     * 
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Analytics account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String accountName);

    /**
     * Begins the delete process for the Data Lake Analytics account object specified by the account name.
     * 
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Analytics account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String accountName, Context context);

    /**
     * Checks whether the specified account name is available or taken.
     * 
     * @param location The resource location without whitespace.
     * @param parameters Parameters supplied to check the Data Lake Analytics account name availability.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return data Lake Analytics account name availability result information along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<NameAvailabilityInformationInner> checkNameAvailabilityWithResponse(String location,
        CheckNameAvailabilityParameters parameters, Context context);

    /**
     * Checks whether the specified account name is available or taken.
     * 
     * @param location The resource location without whitespace.
     * @param parameters Parameters supplied to check the Data Lake Analytics account name availability.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return data Lake Analytics account name availability result information.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NameAvailabilityInformationInner checkNameAvailability(String location, CheckNameAvailabilityParameters parameters);
}
