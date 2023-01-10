// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.fluent.models.SqlAgentConfigurationInner;
import com.azure.resourcemanager.sql.models.SqlAgentConfigurationPropertiesState;

/** Samples for SqlAgent CreateOrUpdate. */
public final class SqlAgentCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/stable/2021-11-01/examples/SqlAgentConfigurationPut.json
     */
    /**
     * Sample code: Puts new sql agent configuration to instance.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void putsNewSqlAgentConfigurationToInstance(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .sqlServers()
            .manager()
            .serviceClient()
            .getSqlAgents()
            .createOrUpdateWithResponse(
                "sqlcrudtest-7398",
                "sqlcrudtest-4645",
                new SqlAgentConfigurationInner().withState(SqlAgentConfigurationPropertiesState.ENABLED),
                Context.NONE);
    }
}