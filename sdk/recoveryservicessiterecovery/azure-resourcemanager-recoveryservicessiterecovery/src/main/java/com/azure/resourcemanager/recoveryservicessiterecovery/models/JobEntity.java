// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** This class contains the minimal job details required to navigate to the desired drill down. */
@Fluent
public final class JobEntity {
    /*
     * The job id.
     */
    @JsonProperty(value = "jobId")
    private String jobId;

    /*
     * The job display name.
     */
    @JsonProperty(value = "jobFriendlyName")
    private String jobFriendlyName;

    /*
     * The object id.
     */
    @JsonProperty(value = "targetObjectId")
    private String targetObjectId;

    /*
     * The object name.
     */
    @JsonProperty(value = "targetObjectName")
    private String targetObjectName;

    /*
     * The workflow affected object type.
     */
    @JsonProperty(value = "targetInstanceType")
    private String targetInstanceType;

    /*
     * The job name. Enum type ScenarioName.
     */
    @JsonProperty(value = "jobScenarioName")
    private String jobScenarioName;

    /** Creates an instance of JobEntity class. */
    public JobEntity() {
    }

    /**
     * Get the jobId property: The job id.
     *
     * @return the jobId value.
     */
    public String jobId() {
        return this.jobId;
    }

    /**
     * Set the jobId property: The job id.
     *
     * @param jobId the jobId value to set.
     * @return the JobEntity object itself.
     */
    public JobEntity withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * Get the jobFriendlyName property: The job display name.
     *
     * @return the jobFriendlyName value.
     */
    public String jobFriendlyName() {
        return this.jobFriendlyName;
    }

    /**
     * Set the jobFriendlyName property: The job display name.
     *
     * @param jobFriendlyName the jobFriendlyName value to set.
     * @return the JobEntity object itself.
     */
    public JobEntity withJobFriendlyName(String jobFriendlyName) {
        this.jobFriendlyName = jobFriendlyName;
        return this;
    }

    /**
     * Get the targetObjectId property: The object id.
     *
     * @return the targetObjectId value.
     */
    public String targetObjectId() {
        return this.targetObjectId;
    }

    /**
     * Set the targetObjectId property: The object id.
     *
     * @param targetObjectId the targetObjectId value to set.
     * @return the JobEntity object itself.
     */
    public JobEntity withTargetObjectId(String targetObjectId) {
        this.targetObjectId = targetObjectId;
        return this;
    }

    /**
     * Get the targetObjectName property: The object name.
     *
     * @return the targetObjectName value.
     */
    public String targetObjectName() {
        return this.targetObjectName;
    }

    /**
     * Set the targetObjectName property: The object name.
     *
     * @param targetObjectName the targetObjectName value to set.
     * @return the JobEntity object itself.
     */
    public JobEntity withTargetObjectName(String targetObjectName) {
        this.targetObjectName = targetObjectName;
        return this;
    }

    /**
     * Get the targetInstanceType property: The workflow affected object type.
     *
     * @return the targetInstanceType value.
     */
    public String targetInstanceType() {
        return this.targetInstanceType;
    }

    /**
     * Set the targetInstanceType property: The workflow affected object type.
     *
     * @param targetInstanceType the targetInstanceType value to set.
     * @return the JobEntity object itself.
     */
    public JobEntity withTargetInstanceType(String targetInstanceType) {
        this.targetInstanceType = targetInstanceType;
        return this;
    }

    /**
     * Get the jobScenarioName property: The job name. Enum type ScenarioName.
     *
     * @return the jobScenarioName value.
     */
    public String jobScenarioName() {
        return this.jobScenarioName;
    }

    /**
     * Set the jobScenarioName property: The job name. Enum type ScenarioName.
     *
     * @param jobScenarioName the jobScenarioName value to set.
     * @return the JobEntity object itself.
     */
    public JobEntity withJobScenarioName(String jobScenarioName) {
        this.jobScenarioName = jobScenarioName;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}