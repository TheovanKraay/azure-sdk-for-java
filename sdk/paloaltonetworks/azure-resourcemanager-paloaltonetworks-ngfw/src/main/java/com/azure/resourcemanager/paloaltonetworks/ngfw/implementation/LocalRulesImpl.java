// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.paloaltonetworks.ngfw.fluent.LocalRulesClient;
import com.azure.resourcemanager.paloaltonetworks.ngfw.fluent.models.LocalRulesResourceInner;
import com.azure.resourcemanager.paloaltonetworks.ngfw.fluent.models.RuleCounterInner;
import com.azure.resourcemanager.paloaltonetworks.ngfw.fluent.models.RuleCounterResetInner;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.LocalRules;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.LocalRulesResource;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.RuleCounter;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.RuleCounterReset;

public final class LocalRulesImpl implements LocalRules {
    private static final ClientLogger LOGGER = new ClientLogger(LocalRulesImpl.class);

    private final LocalRulesClient innerClient;

    private final com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager serviceManager;

    public LocalRulesImpl(LocalRulesClient innerClient,
        com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<LocalRulesResource> listByLocalRulestacks(String resourceGroupName,
        String localRulestackName) {
        PagedIterable<LocalRulesResourceInner> inner
            = this.serviceClient().listByLocalRulestacks(resourceGroupName, localRulestackName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new LocalRulesResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<LocalRulesResource> listByLocalRulestacks(String resourceGroupName, String localRulestackName,
        Context context) {
        PagedIterable<LocalRulesResourceInner> inner
            = this.serviceClient().listByLocalRulestacks(resourceGroupName, localRulestackName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new LocalRulesResourceImpl(inner1, this.manager()));
    }

    public Response<LocalRulesResource> getWithResponse(String resourceGroupName, String localRulestackName,
        String priority, Context context) {
        Response<LocalRulesResourceInner> inner
            = this.serviceClient().getWithResponse(resourceGroupName, localRulestackName, priority, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new LocalRulesResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public LocalRulesResource get(String resourceGroupName, String localRulestackName, String priority) {
        LocalRulesResourceInner inner = this.serviceClient().get(resourceGroupName, localRulestackName, priority);
        if (inner != null) {
            return new LocalRulesResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String localRulestackName, String priority) {
        this.serviceClient().delete(resourceGroupName, localRulestackName, priority);
    }

    public void delete(String resourceGroupName, String localRulestackName, String priority, Context context) {
        this.serviceClient().delete(resourceGroupName, localRulestackName, priority, context);
    }

    public Response<RuleCounter> getCountersWithResponse(String resourceGroupName, String localRulestackName,
        String priority, String firewallName, Context context) {
        Response<RuleCounterInner> inner = this.serviceClient()
            .getCountersWithResponse(resourceGroupName, localRulestackName, priority, firewallName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new RuleCounterImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public RuleCounter getCounters(String resourceGroupName, String localRulestackName, String priority) {
        RuleCounterInner inner = this.serviceClient().getCounters(resourceGroupName, localRulestackName, priority);
        if (inner != null) {
            return new RuleCounterImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Void> refreshCountersWithResponse(String resourceGroupName, String localRulestackName,
        String priority, String firewallName, Context context) {
        return this.serviceClient()
            .refreshCountersWithResponse(resourceGroupName, localRulestackName, priority, firewallName, context);
    }

    public void refreshCounters(String resourceGroupName, String localRulestackName, String priority) {
        this.serviceClient().refreshCounters(resourceGroupName, localRulestackName, priority);
    }

    public Response<RuleCounterReset> resetCountersWithResponse(String resourceGroupName, String localRulestackName,
        String priority, String firewallName, Context context) {
        Response<RuleCounterResetInner> inner = this.serviceClient()
            .resetCountersWithResponse(resourceGroupName, localRulestackName, priority, firewallName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new RuleCounterResetImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public RuleCounterReset resetCounters(String resourceGroupName, String localRulestackName, String priority) {
        RuleCounterResetInner inner
            = this.serviceClient().resetCounters(resourceGroupName, localRulestackName, priority);
        if (inner != null) {
            return new RuleCounterResetImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public LocalRulesResource getById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String localRulestackName = ResourceManagerUtils.getValueFromIdByName(id, "localRulestacks");
        if (localRulestackName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'localRulestacks'.", id)));
        }
        String priority = ResourceManagerUtils.getValueFromIdByName(id, "localRules");
        if (priority == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'localRules'.", id)));
        }
        return this.getWithResponse(resourceGroupName, localRulestackName, priority, Context.NONE).getValue();
    }

    public Response<LocalRulesResource> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String localRulestackName = ResourceManagerUtils.getValueFromIdByName(id, "localRulestacks");
        if (localRulestackName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'localRulestacks'.", id)));
        }
        String priority = ResourceManagerUtils.getValueFromIdByName(id, "localRules");
        if (priority == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'localRules'.", id)));
        }
        return this.getWithResponse(resourceGroupName, localRulestackName, priority, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String localRulestackName = ResourceManagerUtils.getValueFromIdByName(id, "localRulestacks");
        if (localRulestackName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'localRulestacks'.", id)));
        }
        String priority = ResourceManagerUtils.getValueFromIdByName(id, "localRules");
        if (priority == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'localRules'.", id)));
        }
        this.delete(resourceGroupName, localRulestackName, priority, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String localRulestackName = ResourceManagerUtils.getValueFromIdByName(id, "localRulestacks");
        if (localRulestackName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'localRulestacks'.", id)));
        }
        String priority = ResourceManagerUtils.getValueFromIdByName(id, "localRules");
        if (priority == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'localRules'.", id)));
        }
        this.delete(resourceGroupName, localRulestackName, priority, context);
    }

    private LocalRulesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager manager() {
        return this.serviceManager;
    }

    public LocalRulesResourceImpl define(String name) {
        return new LocalRulesResourceImpl(name, this.manager());
    }
}
