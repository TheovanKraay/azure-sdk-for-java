// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.AzureFileShareProtectableItem;
import com.azure.resourcemanager.recoveryservicesbackup.models.AzureFileShareType;
import com.azure.resourcemanager.recoveryservicesbackup.models.ProtectionStatus;
import org.junit.jupiter.api.Assertions;

public final class AzureFileShareProtectableItemTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureFileShareProtectableItem model =
            BinaryData
                .fromString(
                    "{\"protectableItemType\":\"AzureFileShare\",\"parentContainerFabricId\":\"bzxliohrdddtfgxq\",\"parentContainerFriendlyName\":\"wpcbbnzqcy\",\"azureFileShareType\":\"XSync\",\"backupManagementType\":\"qofyuicdhzbdy\",\"workloadType\":\"wgbdvibidmhmwffp\",\"friendlyName\":\"muvapc\",\"protectionState\":\"ProtectionFailed\"}")
                .toObject(AzureFileShareProtectableItem.class);
        Assertions.assertEquals("qofyuicdhzbdy", model.backupManagementType());
        Assertions.assertEquals("wgbdvibidmhmwffp", model.workloadType());
        Assertions.assertEquals("muvapc", model.friendlyName());
        Assertions.assertEquals(ProtectionStatus.PROTECTION_FAILED, model.protectionState());
        Assertions.assertEquals("bzxliohrdddtfgxq", model.parentContainerFabricId());
        Assertions.assertEquals("wpcbbnzqcy", model.parentContainerFriendlyName());
        Assertions.assertEquals(AzureFileShareType.XSYNC, model.azureFileShareType());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureFileShareProtectableItem model =
            new AzureFileShareProtectableItem()
                .withBackupManagementType("qofyuicdhzbdy")
                .withWorkloadType("wgbdvibidmhmwffp")
                .withFriendlyName("muvapc")
                .withProtectionState(ProtectionStatus.PROTECTION_FAILED)
                .withParentContainerFabricId("bzxliohrdddtfgxq")
                .withParentContainerFriendlyName("wpcbbnzqcy")
                .withAzureFileShareType(AzureFileShareType.XSYNC);
        model = BinaryData.fromObject(model).toObject(AzureFileShareProtectableItem.class);
        Assertions.assertEquals("qofyuicdhzbdy", model.backupManagementType());
        Assertions.assertEquals("wgbdvibidmhmwffp", model.workloadType());
        Assertions.assertEquals("muvapc", model.friendlyName());
        Assertions.assertEquals(ProtectionStatus.PROTECTION_FAILED, model.protectionState());
        Assertions.assertEquals("bzxliohrdddtfgxq", model.parentContainerFabricId());
        Assertions.assertEquals("wpcbbnzqcy", model.parentContainerFriendlyName());
        Assertions.assertEquals(AzureFileShareType.XSYNC, model.azureFileShareType());
    }
}