// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.powerbidedicated.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.powerbidedicated.models.OperationListResult;

public final class OperationListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OperationListResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"name\":\"xgjvtbv\",\"display\":{\"provider\":\"szdnr\",\"resource\":\"qguhmuo\",\"operation\":\"f\",\"description\":\"wzwbnguitn\"},\"origin\":\"izgazxu\",\"properties\":{}},{\"name\":\"ckyfih\",\"display\":{\"provider\":\"dfvzwdzuhty\",\"resource\":\"isdkfthwxmnteiw\",\"operation\":\"pvkmijcmmxdcuf\",\"description\":\"srp\"},\"origin\":\"zidnsezcxtbzsgfy\",\"properties\":{}}],\"nextLink\":\"ewmdw\"}")
                .toObject(OperationListResult.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OperationListResult model = new OperationListResult();
        model = BinaryData.fromObject(model).toObject(OperationListResult.class);
    }
}