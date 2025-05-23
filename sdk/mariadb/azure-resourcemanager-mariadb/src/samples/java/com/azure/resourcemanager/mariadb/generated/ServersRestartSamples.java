// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mariadb.generated;

/**
 * Samples for Servers Restart.
 */
public final class ServersRestartSamples {
    /*
     * x-ms-original-file:
     * specification/mariadb/resource-manager/Microsoft.DBforMariaDB/stable/2018-06-01/examples/ServerRestart.json
     */
    /**
     * Sample code: ServerRestart.
     * 
     * @param manager Entry point to MariaDBManager.
     */
    public static void serverRestart(com.azure.resourcemanager.mariadb.MariaDBManager manager) {
        manager.servers().restart("TestGroup", "testserver", com.azure.core.util.Context.NONE);
    }
}
