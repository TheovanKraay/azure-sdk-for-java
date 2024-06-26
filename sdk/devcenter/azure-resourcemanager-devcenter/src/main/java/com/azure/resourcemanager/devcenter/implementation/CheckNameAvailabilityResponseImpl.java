// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.implementation;

import com.azure.resourcemanager.devcenter.fluent.models.CheckNameAvailabilityResponseInner;
import com.azure.resourcemanager.devcenter.models.CheckNameAvailabilityReason;
import com.azure.resourcemanager.devcenter.models.CheckNameAvailabilityResponse;

public final class CheckNameAvailabilityResponseImpl implements CheckNameAvailabilityResponse {
    private CheckNameAvailabilityResponseInner innerObject;

    private final com.azure.resourcemanager.devcenter.DevCenterManager serviceManager;

    CheckNameAvailabilityResponseImpl(CheckNameAvailabilityResponseInner innerObject,
        com.azure.resourcemanager.devcenter.DevCenterManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public Boolean nameAvailable() {
        return this.innerModel().nameAvailable();
    }

    public CheckNameAvailabilityReason reason() {
        return this.innerModel().reason();
    }

    public String message() {
        return this.innerModel().message();
    }

    public CheckNameAvailabilityResponseInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.devcenter.DevCenterManager manager() {
        return this.serviceManager;
    }
}
