// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.sql.models.SyncDirection;
import com.azure.resourcemanager.sql.models.SyncMemberDbType;
import com.azure.resourcemanager.sql.models.SyncMemberState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.UUID;

/** Properties of a sync member. */
@Fluent
public final class SyncMemberProperties {
    /*
     * Database type of the sync member.
     */
    @JsonProperty(value = "databaseType")
    private SyncMemberDbType databaseType;

    /*
     * ARM resource id of the sync agent in the sync member.
     */
    @JsonProperty(value = "syncAgentId")
    private String syncAgentId;

    /*
     * SQL Server database id of the sync member.
     */
    @JsonProperty(value = "sqlServerDatabaseId")
    private UUID sqlServerDatabaseId;

    /*
     * ARM resource id of the sync member logical database, for sync members in Azure.
     */
    @JsonProperty(value = "syncMemberAzureDatabaseResourceId")
    private String syncMemberAzureDatabaseResourceId;

    /*
     * Whether to use private link connection.
     */
    @JsonProperty(value = "usePrivateLinkConnection")
    private Boolean usePrivateLinkConnection;

    /*
     * Private endpoint name of the sync member if use private link connection is enabled, for sync members in Azure.
     */
    @JsonProperty(value = "privateEndpointName", access = JsonProperty.Access.WRITE_ONLY)
    private String privateEndpointName;

    /*
     * Server name of the member database in the sync member
     */
    @JsonProperty(value = "serverName")
    private String serverName;

    /*
     * Database name of the member database in the sync member.
     */
    @JsonProperty(value = "databaseName")
    private String databaseName;

    /*
     * User name of the member database in the sync member.
     */
    @JsonProperty(value = "userName")
    private String username;

    /*
     * Password of the member database in the sync member.
     */
    @JsonProperty(value = "password")
    private String password;

    /*
     * Sync direction of the sync member.
     */
    @JsonProperty(value = "syncDirection")
    private SyncDirection syncDirection;

    /*
     * Sync state of the sync member.
     */
    @JsonProperty(value = "syncState", access = JsonProperty.Access.WRITE_ONLY)
    private SyncMemberState syncState;

    /** Creates an instance of SyncMemberProperties class. */
    public SyncMemberProperties() {
    }

    /**
     * Get the databaseType property: Database type of the sync member.
     *
     * @return the databaseType value.
     */
    public SyncMemberDbType databaseType() {
        return this.databaseType;
    }

    /**
     * Set the databaseType property: Database type of the sync member.
     *
     * @param databaseType the databaseType value to set.
     * @return the SyncMemberProperties object itself.
     */
    public SyncMemberProperties withDatabaseType(SyncMemberDbType databaseType) {
        this.databaseType = databaseType;
        return this;
    }

    /**
     * Get the syncAgentId property: ARM resource id of the sync agent in the sync member.
     *
     * @return the syncAgentId value.
     */
    public String syncAgentId() {
        return this.syncAgentId;
    }

    /**
     * Set the syncAgentId property: ARM resource id of the sync agent in the sync member.
     *
     * @param syncAgentId the syncAgentId value to set.
     * @return the SyncMemberProperties object itself.
     */
    public SyncMemberProperties withSyncAgentId(String syncAgentId) {
        this.syncAgentId = syncAgentId;
        return this;
    }

    /**
     * Get the sqlServerDatabaseId property: SQL Server database id of the sync member.
     *
     * @return the sqlServerDatabaseId value.
     */
    public UUID sqlServerDatabaseId() {
        return this.sqlServerDatabaseId;
    }

    /**
     * Set the sqlServerDatabaseId property: SQL Server database id of the sync member.
     *
     * @param sqlServerDatabaseId the sqlServerDatabaseId value to set.
     * @return the SyncMemberProperties object itself.
     */
    public SyncMemberProperties withSqlServerDatabaseId(UUID sqlServerDatabaseId) {
        this.sqlServerDatabaseId = sqlServerDatabaseId;
        return this;
    }

    /**
     * Get the syncMemberAzureDatabaseResourceId property: ARM resource id of the sync member logical database, for sync
     * members in Azure.
     *
     * @return the syncMemberAzureDatabaseResourceId value.
     */
    public String syncMemberAzureDatabaseResourceId() {
        return this.syncMemberAzureDatabaseResourceId;
    }

    /**
     * Set the syncMemberAzureDatabaseResourceId property: ARM resource id of the sync member logical database, for sync
     * members in Azure.
     *
     * @param syncMemberAzureDatabaseResourceId the syncMemberAzureDatabaseResourceId value to set.
     * @return the SyncMemberProperties object itself.
     */
    public SyncMemberProperties withSyncMemberAzureDatabaseResourceId(String syncMemberAzureDatabaseResourceId) {
        this.syncMemberAzureDatabaseResourceId = syncMemberAzureDatabaseResourceId;
        return this;
    }

    /**
     * Get the usePrivateLinkConnection property: Whether to use private link connection.
     *
     * @return the usePrivateLinkConnection value.
     */
    public Boolean usePrivateLinkConnection() {
        return this.usePrivateLinkConnection;
    }

    /**
     * Set the usePrivateLinkConnection property: Whether to use private link connection.
     *
     * @param usePrivateLinkConnection the usePrivateLinkConnection value to set.
     * @return the SyncMemberProperties object itself.
     */
    public SyncMemberProperties withUsePrivateLinkConnection(Boolean usePrivateLinkConnection) {
        this.usePrivateLinkConnection = usePrivateLinkConnection;
        return this;
    }

    /**
     * Get the privateEndpointName property: Private endpoint name of the sync member if use private link connection is
     * enabled, for sync members in Azure.
     *
     * @return the privateEndpointName value.
     */
    public String privateEndpointName() {
        return this.privateEndpointName;
    }

    /**
     * Get the serverName property: Server name of the member database in the sync member.
     *
     * @return the serverName value.
     */
    public String serverName() {
        return this.serverName;
    }

    /**
     * Set the serverName property: Server name of the member database in the sync member.
     *
     * @param serverName the serverName value to set.
     * @return the SyncMemberProperties object itself.
     */
    public SyncMemberProperties withServerName(String serverName) {
        this.serverName = serverName;
        return this;
    }

    /**
     * Get the databaseName property: Database name of the member database in the sync member.
     *
     * @return the databaseName value.
     */
    public String databaseName() {
        return this.databaseName;
    }

    /**
     * Set the databaseName property: Database name of the member database in the sync member.
     *
     * @param databaseName the databaseName value to set.
     * @return the SyncMemberProperties object itself.
     */
    public SyncMemberProperties withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * Get the username property: User name of the member database in the sync member.
     *
     * @return the username value.
     */
    public String username() {
        return this.username;
    }

    /**
     * Set the username property: User name of the member database in the sync member.
     *
     * @param username the username value to set.
     * @return the SyncMemberProperties object itself.
     */
    public SyncMemberProperties withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password property: Password of the member database in the sync member.
     *
     * @return the password value.
     */
    public String password() {
        return this.password;
    }

    /**
     * Set the password property: Password of the member database in the sync member.
     *
     * @param password the password value to set.
     * @return the SyncMemberProperties object itself.
     */
    public SyncMemberProperties withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Get the syncDirection property: Sync direction of the sync member.
     *
     * @return the syncDirection value.
     */
    public SyncDirection syncDirection() {
        return this.syncDirection;
    }

    /**
     * Set the syncDirection property: Sync direction of the sync member.
     *
     * @param syncDirection the syncDirection value to set.
     * @return the SyncMemberProperties object itself.
     */
    public SyncMemberProperties withSyncDirection(SyncDirection syncDirection) {
        this.syncDirection = syncDirection;
        return this;
    }

    /**
     * Get the syncState property: Sync state of the sync member.
     *
     * @return the syncState value.
     */
    public SyncMemberState syncState() {
        return this.syncState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
