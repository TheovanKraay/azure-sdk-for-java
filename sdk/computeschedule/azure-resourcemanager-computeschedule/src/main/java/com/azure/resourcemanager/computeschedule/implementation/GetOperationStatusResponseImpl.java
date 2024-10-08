// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.computeschedule.implementation;

import com.azure.resourcemanager.computeschedule.fluent.models.GetOperationStatusResponseInner;
import com.azure.resourcemanager.computeschedule.models.GetOperationStatusResponse;
import com.azure.resourcemanager.computeschedule.models.ResourceOperation;
import java.util.Collections;
import java.util.List;

public final class GetOperationStatusResponseImpl implements GetOperationStatusResponse {
    private GetOperationStatusResponseInner innerObject;

    private final com.azure.resourcemanager.computeschedule.ComputeScheduleManager serviceManager;

    GetOperationStatusResponseImpl(GetOperationStatusResponseInner innerObject,
        com.azure.resourcemanager.computeschedule.ComputeScheduleManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<ResourceOperation> results() {
        List<ResourceOperation> inner = this.innerModel().results();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public GetOperationStatusResponseInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.computeschedule.ComputeScheduleManager manager() {
        return this.serviceManager;
    }
}
