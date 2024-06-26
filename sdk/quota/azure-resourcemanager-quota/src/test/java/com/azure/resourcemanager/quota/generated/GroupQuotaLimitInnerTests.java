// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.quota.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.quota.fluent.models.GroupQuotaLimitInner;
import com.azure.resourcemanager.quota.models.GroupQuotaDetails;
import org.junit.jupiter.api.Assertions;

public final class GroupQuotaLimitInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        GroupQuotaLimitInner model = BinaryData.fromString(
            "{\"properties\":{\"region\":\"lljfmppeeb\",\"limit\":8706154927582120085,\"comment\":\"abkyqduujitcjcz\",\"name\":{\"value\":\"vndhkrwpdapp\",\"localizedValue\":\"bdkvwrwjf\"},\"unit\":\"snhu\",\"availableLimit\":8316497364859549457,\"allocatedToSubscriptions\":{\"value\":[{\"subscriptionId\":\"dhugjzzdatqxhocd\",\"quotaAllocated\":6124720690477162345}]}},\"id\":\"gphuticndvka\",\"name\":\"zwyiftyhxhur\",\"type\":\"k\"}")
            .toObject(GroupQuotaLimitInner.class);
        Assertions.assertEquals("lljfmppeeb", model.properties().region());
        Assertions.assertEquals(8706154927582120085L, model.properties().limit());
        Assertions.assertEquals("abkyqduujitcjcz", model.properties().comment());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        GroupQuotaLimitInner model
            = new GroupQuotaLimitInner().withProperties(new GroupQuotaDetails().withRegion("lljfmppeeb")
                .withLimit(8706154927582120085L)
                .withComment("abkyqduujitcjcz"));
        model = BinaryData.fromObject(model).toObject(GroupQuotaLimitInner.class);
        Assertions.assertEquals("lljfmppeeb", model.properties().region());
        Assertions.assertEquals(8706154927582120085L, model.properties().limit());
        Assertions.assertEquals("abkyqduujitcjcz", model.properties().comment());
    }
}
