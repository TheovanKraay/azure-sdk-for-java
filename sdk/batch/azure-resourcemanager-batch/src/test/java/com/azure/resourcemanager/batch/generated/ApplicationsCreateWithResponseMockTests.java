// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.batch.BatchManager;
import com.azure.resourcemanager.batch.models.Application;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ApplicationsCreateWithResponseMockTests {
    @Test
    public void testCreateWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"displayName\":\"kyuizabsnmfpp\",\"allowUpdates\":false,\"defaultVersion\":\"evy\"},\"etag\":\"hsgz\",\"tags\":{\"gleohi\":\"bgomfgbegl\",\"eebtijvacvb\":\"etnluankrrfx\",\"evehjkuyxoaf\":\"qzbqqxlajrnwxa\"},\"id\":\"aoqltfaey\",\"name\":\"inmfgvxirp\",\"type\":\"hriypoqeyhlqhy\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        BatchManager manager = BatchManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        Application response = manager.applications()
            .define("wcyyufmhruncu")
            .withExistingBatchAccount("ijpstte", "oqq")
            .withTags(mapOf("jumvqqolihrraio", "cgegydcwbo", "fuojrngif", "aubrjtloq", "dfqwmkyoq", "rzpasccbiuimzdly",
                "lzo", "fdvruz"))
            .withDisplayName("spkcdqzh")
            .withAllowUpdates(false)
            .withDefaultVersion("dunqnd")
            .create();

        Assertions.assertEquals("bgomfgbegl", response.tags().get("gleohi"));
        Assertions.assertEquals("kyuizabsnmfpp", response.displayName());
        Assertions.assertEquals(false, response.allowUpdates());
        Assertions.assertEquals("evy", response.defaultVersion());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
