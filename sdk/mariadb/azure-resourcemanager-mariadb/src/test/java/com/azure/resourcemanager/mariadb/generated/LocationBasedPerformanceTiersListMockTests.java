// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mariadb.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.mariadb.MariaDBManager;
import com.azure.resourcemanager.mariadb.models.PerformanceTierProperties;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class LocationBasedPerformanceTiersListMockTests {
    @Test
    public void testList() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"id\":\"ratiz\",\"maxBackupRetentionDays\":99900434,\"minBackupRetentionDays\":1624157938,\"maxStorageMB\":349180193,\"minLargeStorageMB\":495908833,\"maxLargeStorageMB\":1489812778,\"minStorageMB\":1206467391,\"serviceLevelObjectives\":[{\"id\":\"f\",\"edition\":\"esgogc\",\"vCore\":978834991,\"hardwareGeneration\":\"nxkrlgnyhmossxkk\",\"maxBackupRetentionDays\":177432619,\"minBackupRetentionDays\":1508156086,\"maxStorageMB\":486654365,\"minStorageMB\":2109005074}]}]}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        MariaDBManager manager =
            MariaDBManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<PerformanceTierProperties> response =
            manager.locationBasedPerformanceTiers().list("xfrdd", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("ratiz", response.iterator().next().id());
        Assertions.assertEquals(99900434, response.iterator().next().maxBackupRetentionDays());
        Assertions.assertEquals(1624157938, response.iterator().next().minBackupRetentionDays());
        Assertions.assertEquals(349180193, response.iterator().next().maxStorageMB());
        Assertions.assertEquals(495908833, response.iterator().next().minLargeStorageMB());
        Assertions.assertEquals(1489812778, response.iterator().next().maxLargeStorageMB());
        Assertions.assertEquals(1206467391, response.iterator().next().minStorageMB());
        Assertions.assertEquals("f", response.iterator().next().serviceLevelObjectives().get(0).id());
        Assertions.assertEquals("esgogc", response.iterator().next().serviceLevelObjectives().get(0).edition());
        Assertions.assertEquals(978834991, response.iterator().next().serviceLevelObjectives().get(0).vCore());
        Assertions
            .assertEquals(
                "nxkrlgnyhmossxkk", response.iterator().next().serviceLevelObjectives().get(0).hardwareGeneration());
        Assertions
            .assertEquals(
                177432619, response.iterator().next().serviceLevelObjectives().get(0).maxBackupRetentionDays());
        Assertions
            .assertEquals(
                1508156086, response.iterator().next().serviceLevelObjectives().get(0).minBackupRetentionDays());
        Assertions.assertEquals(486654365, response.iterator().next().serviceLevelObjectives().get(0).maxStorageMB());
        Assertions.assertEquals(2109005074, response.iterator().next().serviceLevelObjectives().get(0).minStorageMB());
    }
}
