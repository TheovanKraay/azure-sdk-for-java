// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.chaos.generated;

/**
 * Samples for Capabilities List.
 */
public final class CapabilitiesListSamples {
    /*
     * x-ms-original-file:
     * specification/chaos/resource-manager/Microsoft.Chaos/stable/2024-01-01/examples/ListCapabilities.json
     */
    /**
     * Sample code: List all Capabilities that extend a virtual machine Target resource.
     * 
     * @param manager Entry point to ChaosManager.
     */
    public static void listAllCapabilitiesThatExtendAVirtualMachineTargetResource(
        com.azure.resourcemanager.chaos.ChaosManager manager) {
        manager.capabilities()
            .list("exampleRG", "Microsoft.Compute", "virtualMachines", "exampleVM", "Microsoft-VirtualMachine", null,
                com.azure.core.util.Context.NONE);
    }
}
