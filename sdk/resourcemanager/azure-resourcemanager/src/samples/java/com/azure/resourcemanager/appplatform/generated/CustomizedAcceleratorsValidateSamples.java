// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.generated;

import com.azure.resourcemanager.appplatform.models.AcceleratorGitRepository;
import com.azure.resourcemanager.appplatform.models.AcceleratorSshSetting;
import com.azure.resourcemanager.appplatform.models.CustomizedAcceleratorProperties;
import java.util.Arrays;

/**
 * Samples for CustomizedAccelerators Validate.
 */
public final class CustomizedAcceleratorsValidateSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/stable/2023-12-01/examples/
     * CustomizedAccelerators_Validate.json
     */
    /**
     * Sample code: CustomizedAccelerators_Validate.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void customizedAcceleratorsValidate(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.springServices()
            .manager()
            .serviceClient()
            .getCustomizedAccelerators()
            .validate("myResourceGroup", "myservice", "default", "acc-name",
                new CustomizedAcceleratorProperties().withDisplayName("acc-name")
                    .withDescription("acc-desc")
                    .withIconUrl("acc-icon")
                    .withAcceleratorTags(Arrays.asList("tag-a", "tag-b"))
                    .withGitRepository(new AcceleratorGitRepository().withUrl("git-url")
                        .withIntervalInSeconds(70)
                        .withBranch("git-branch")
                        .withCommit("12345")
                        .withGitTag("git-tag")
                        .withAuthSetting(new AcceleratorSshSetting().withHostKey("fakeTokenPlaceholder")
                            .withHostKeyAlgorithm("fakeTokenPlaceholder")
                            .withPrivateKey("fakeTokenPlaceholder"))),
                com.azure.core.util.Context.NONE);
    }
}
