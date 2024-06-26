// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.security.fluent.DevOpsConfigurationsClient;
import com.azure.resourcemanager.security.fluent.models.DevOpsConfigurationInner;
import com.azure.resourcemanager.security.models.DevOpsConfiguration;
import com.azure.resourcemanager.security.models.DevOpsConfigurations;

public final class DevOpsConfigurationsImpl implements DevOpsConfigurations {
    private static final ClientLogger LOGGER = new ClientLogger(DevOpsConfigurationsImpl.class);

    private final DevOpsConfigurationsClient innerClient;

    private final com.azure.resourcemanager.security.SecurityManager serviceManager;

    public DevOpsConfigurationsImpl(DevOpsConfigurationsClient innerClient,
        com.azure.resourcemanager.security.SecurityManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<DevOpsConfiguration> list(String resourceGroupName, String securityConnectorName) {
        PagedIterable<DevOpsConfigurationInner> inner
            = this.serviceClient().list(resourceGroupName, securityConnectorName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new DevOpsConfigurationImpl(inner1, this.manager()));
    }

    public PagedIterable<DevOpsConfiguration> list(String resourceGroupName, String securityConnectorName,
        Context context) {
        PagedIterable<DevOpsConfigurationInner> inner
            = this.serviceClient().list(resourceGroupName, securityConnectorName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new DevOpsConfigurationImpl(inner1, this.manager()));
    }

    public Response<DevOpsConfiguration> getWithResponse(String resourceGroupName, String securityConnectorName,
        Context context) {
        Response<DevOpsConfigurationInner> inner
            = this.serviceClient().getWithResponse(resourceGroupName, securityConnectorName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new DevOpsConfigurationImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public DevOpsConfiguration get(String resourceGroupName, String securityConnectorName) {
        DevOpsConfigurationInner inner = this.serviceClient().get(resourceGroupName, securityConnectorName);
        if (inner != null) {
            return new DevOpsConfigurationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public DevOpsConfiguration createOrUpdate(String resourceGroupName, String securityConnectorName,
        DevOpsConfigurationInner devOpsConfiguration) {
        DevOpsConfigurationInner inner
            = this.serviceClient().createOrUpdate(resourceGroupName, securityConnectorName, devOpsConfiguration);
        if (inner != null) {
            return new DevOpsConfigurationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public DevOpsConfiguration createOrUpdate(String resourceGroupName, String securityConnectorName,
        DevOpsConfigurationInner devOpsConfiguration, Context context) {
        DevOpsConfigurationInner inner = this.serviceClient()
            .createOrUpdate(resourceGroupName, securityConnectorName, devOpsConfiguration, context);
        if (inner != null) {
            return new DevOpsConfigurationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public DevOpsConfiguration update(String resourceGroupName, String securityConnectorName,
        DevOpsConfigurationInner devOpsConfiguration) {
        DevOpsConfigurationInner inner
            = this.serviceClient().update(resourceGroupName, securityConnectorName, devOpsConfiguration);
        if (inner != null) {
            return new DevOpsConfigurationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public DevOpsConfiguration update(String resourceGroupName, String securityConnectorName,
        DevOpsConfigurationInner devOpsConfiguration, Context context) {
        DevOpsConfigurationInner inner
            = this.serviceClient().update(resourceGroupName, securityConnectorName, devOpsConfiguration, context);
        if (inner != null) {
            return new DevOpsConfigurationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String securityConnectorName) {
        this.serviceClient().delete(resourceGroupName, securityConnectorName);
    }

    public void delete(String resourceGroupName, String securityConnectorName, Context context) {
        this.serviceClient().delete(resourceGroupName, securityConnectorName, context);
    }

    private DevOpsConfigurationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.security.SecurityManager manager() {
        return this.serviceManager;
    }
}
