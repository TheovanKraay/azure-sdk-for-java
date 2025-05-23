// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.generated;

/**
 * Samples for DscConfiguration Delete.
 */
public final class DscConfigurationDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/automation/resource-manager/Microsoft.Automation/stable/2019-06-01/examples/deleteDscConfiguration.
     * json
     */
    /**
     * Sample code: Delete DSC Configuration.
     * 
     * @param manager Entry point to AutomationManager.
     */
    public static void deleteDSCConfiguration(com.azure.resourcemanager.automation.AutomationManager manager) {
        manager.dscConfigurations()
            .deleteWithResponse("rg", "myAutomationAccount33", "TemplateBasic", com.azure.core.util.Context.NONE);
    }
}
