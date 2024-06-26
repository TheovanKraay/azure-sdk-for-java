// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.eventgrid.fluent.models.WebhookEventSubscriptionDestinationProperties;
import com.azure.resourcemanager.eventgrid.models.DeliveryAttributeMapping;
import com.azure.resourcemanager.eventgrid.models.TlsVersion;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class WebhookEventSubscriptionDestinationPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        WebhookEventSubscriptionDestinationProperties model = BinaryData.fromString(
            "{\"endpointUrl\":\"cly\",\"endpointBaseUrl\":\"gxvrpjl\",\"maxEventsPerBatch\":116232980,\"preferredBatchSizeInKilobytes\":1979415273,\"azureActiveDirectoryTenantId\":\"ac\",\"azureActiveDirectoryApplicationIdOrUri\":\"nettepdjxqeskoy\",\"deliveryAttributeMappings\":[{\"type\":\"DeliveryAttributeMapping\",\"name\":\"lpckaewsedves\"},{\"type\":\"DeliveryAttributeMapping\",\"name\":\"xegqphr\"}],\"minimumTlsVersionAllowed\":\"1.0\"}")
            .toObject(WebhookEventSubscriptionDestinationProperties.class);
        Assertions.assertEquals("cly", model.endpointUrl());
        Assertions.assertEquals(116232980, model.maxEventsPerBatch());
        Assertions.assertEquals(1979415273, model.preferredBatchSizeInKilobytes());
        Assertions.assertEquals("ac", model.azureActiveDirectoryTenantId());
        Assertions.assertEquals("nettepdjxqeskoy", model.azureActiveDirectoryApplicationIdOrUri());
        Assertions.assertEquals("lpckaewsedves", model.deliveryAttributeMappings().get(0).name());
        Assertions.assertEquals(TlsVersion.ONE_ZERO, model.minimumTlsVersionAllowed());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        WebhookEventSubscriptionDestinationProperties model
            = new WebhookEventSubscriptionDestinationProperties().withEndpointUrl("cly")
                .withMaxEventsPerBatch(116232980)
                .withPreferredBatchSizeInKilobytes(1979415273)
                .withAzureActiveDirectoryTenantId("ac")
                .withAzureActiveDirectoryApplicationIdOrUri("nettepdjxqeskoy")
                .withDeliveryAttributeMappings(Arrays.asList(new DeliveryAttributeMapping().withName("lpckaewsedves"),
                    new DeliveryAttributeMapping().withName("xegqphr")))
                .withMinimumTlsVersionAllowed(TlsVersion.ONE_ZERO);
        model = BinaryData.fromObject(model).toObject(WebhookEventSubscriptionDestinationProperties.class);
        Assertions.assertEquals("cly", model.endpointUrl());
        Assertions.assertEquals(116232980, model.maxEventsPerBatch());
        Assertions.assertEquals(1979415273, model.preferredBatchSizeInKilobytes());
        Assertions.assertEquals("ac", model.azureActiveDirectoryTenantId());
        Assertions.assertEquals("nettepdjxqeskoy", model.azureActiveDirectoryApplicationIdOrUri());
        Assertions.assertEquals("lpckaewsedves", model.deliveryAttributeMappings().get(0).name());
        Assertions.assertEquals(TlsVersion.ONE_ZERO, model.minimumTlsVersionAllowed());
    }
}
