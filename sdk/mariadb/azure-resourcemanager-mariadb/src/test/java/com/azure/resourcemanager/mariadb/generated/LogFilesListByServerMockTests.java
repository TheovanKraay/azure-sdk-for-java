// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mariadb.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.mariadb.MariaDBManager;
import com.azure.resourcemanager.mariadb.models.LogFile;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class LogFilesListByServerMockTests {
    @Test
    public void testListByServer() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"sizeInKB\":2737853825484398958,\"createdTime\":\"2021-09-21T02:12:39Z\",\"lastModifiedTime\":\"2021-01-02T20:06:54Z\",\"type\":\"okkqfqjbvleo\",\"url\":\"ml\"},\"id\":\"iqtqzfavyvnq\",\"name\":\"ybar\",\"type\":\"euayjkqabqgzsles\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        MariaDBManager manager = MariaDBManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<LogFile> response
            = manager.logFiles().listByServer("qjfsmlmbtxhw", "fwsrtawcoezbrhu", com.azure.core.util.Context.NONE);

        Assertions.assertEquals(2737853825484398958L, response.iterator().next().sizeInKB());
        Assertions.assertEquals("okkqfqjbvleo", response.iterator().next().typePropertiesType());
    }
}
