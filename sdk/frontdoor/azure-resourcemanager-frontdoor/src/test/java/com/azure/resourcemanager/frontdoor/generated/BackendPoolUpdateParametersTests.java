// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated;

import com.azure.core.management.SubResource;
import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.frontdoor.models.Backend;
import com.azure.resourcemanager.frontdoor.models.BackendEnabledState;
import com.azure.resourcemanager.frontdoor.models.BackendPoolUpdateParameters;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class BackendPoolUpdateParametersTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        BackendPoolUpdateParameters model =
            BinaryData
                .fromString(
                    "{\"backends\":[{\"address\":\"fltkacjv\",\"privateLinkAlias\":\"kdlfoa\",\"privateLinkResourceId\":\"gkfpaga\",\"privateLinkLocation\":\"pulpqblylsyxk\",\"privateEndpointStatus\":\"Approved\",\"privateLinkApprovalMessage\":\"jervtia\",\"httpPort\":1353667842,\"httpsPort\":424844999,\"enabledState\":\"Enabled\",\"priority\":993241324,\"weight\":1236978734,\"backendHostHeader\":\"zkfzbeyv\"},{\"address\":\"qi\",\"privateLinkAlias\":\"invkjjxdxrbuu\",\"privateLinkResourceId\":\"clewyhm\",\"privateLinkLocation\":\"paztzpofncck\",\"privateEndpointStatus\":\"Disconnected\",\"privateLinkApprovalMessage\":\"qwhxxbuyqaxzfeqz\",\"httpPort\":1372310139,\"httpsPort\":1415965286,\"enabledState\":\"Disabled\",\"priority\":411799174,\"weight\":110839155,\"backendHostHeader\":\"lt\"},{\"address\":\"mncwsobqwcsdb\",\"privateLinkAlias\":\"dcfhucqdpf\",\"privateLinkResourceId\":\"glsbjjc\",\"privateLinkLocation\":\"vxb\",\"privateEndpointStatus\":\"Approved\",\"privateLinkApprovalMessage\":\"dut\",\"httpPort\":1940918804,\"httpsPort\":272711123,\"enabledState\":\"Disabled\",\"priority\":1360670450,\"weight\":1954508595,\"backendHostHeader\":\"ofudflvkgju\"},{\"address\":\"dknnqvsazn\",\"privateLinkAlias\":\"tor\",\"privateLinkResourceId\":\"sgsahmkycgr\",\"privateLinkLocation\":\"wjue\",\"privateEndpointStatus\":\"Pending\",\"privateLinkApprovalMessage\":\"uruv\",\"httpPort\":973815152,\"httpsPort\":136999503,\"enabledState\":\"Disabled\",\"priority\":1969431903,\"weight\":452446013,\"backendHostHeader\":\"mqoefkifrvtpuqu\"}],\"loadBalancingSettings\":{\"id\":\"lgkfbt\"},\"healthProbeSettings\":{\"id\":\"aongbj\"}}")
                .toObject(BackendPoolUpdateParameters.class);
        Assertions.assertEquals("fltkacjv", model.backends().get(0).address());
        Assertions.assertEquals("kdlfoa", model.backends().get(0).privateLinkAlias());
        Assertions.assertEquals("gkfpaga", model.backends().get(0).privateLinkResourceId());
        Assertions.assertEquals("pulpqblylsyxk", model.backends().get(0).privateLinkLocation());
        Assertions.assertEquals("jervtia", model.backends().get(0).privateLinkApprovalMessage());
        Assertions.assertEquals(1353667842, model.backends().get(0).httpPort());
        Assertions.assertEquals(424844999, model.backends().get(0).httpsPort());
        Assertions.assertEquals(BackendEnabledState.ENABLED, model.backends().get(0).enabledState());
        Assertions.assertEquals(993241324, model.backends().get(0).priority());
        Assertions.assertEquals(1236978734, model.backends().get(0).weight());
        Assertions.assertEquals("zkfzbeyv", model.backends().get(0).backendHostHeader());
        Assertions.assertEquals("lgkfbt", model.loadBalancingSettings().id());
        Assertions.assertEquals("aongbj", model.healthProbeSettings().id());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        BackendPoolUpdateParameters model =
            new BackendPoolUpdateParameters()
                .withBackends(
                    Arrays
                        .asList(
                            new Backend()
                                .withAddress("fltkacjv")
                                .withPrivateLinkAlias("kdlfoa")
                                .withPrivateLinkResourceId("gkfpaga")
                                .withPrivateLinkLocation("pulpqblylsyxk")
                                .withPrivateLinkApprovalMessage("jervtia")
                                .withHttpPort(1353667842)
                                .withHttpsPort(424844999)
                                .withEnabledState(BackendEnabledState.ENABLED)
                                .withPriority(993241324)
                                .withWeight(1236978734)
                                .withBackendHostHeader("zkfzbeyv"),
                            new Backend()
                                .withAddress("qi")
                                .withPrivateLinkAlias("invkjjxdxrbuu")
                                .withPrivateLinkResourceId("clewyhm")
                                .withPrivateLinkLocation("paztzpofncck")
                                .withPrivateLinkApprovalMessage("qwhxxbuyqaxzfeqz")
                                .withHttpPort(1372310139)
                                .withHttpsPort(1415965286)
                                .withEnabledState(BackendEnabledState.DISABLED)
                                .withPriority(411799174)
                                .withWeight(110839155)
                                .withBackendHostHeader("lt"),
                            new Backend()
                                .withAddress("mncwsobqwcsdb")
                                .withPrivateLinkAlias("dcfhucqdpf")
                                .withPrivateLinkResourceId("glsbjjc")
                                .withPrivateLinkLocation("vxb")
                                .withPrivateLinkApprovalMessage("dut")
                                .withHttpPort(1940918804)
                                .withHttpsPort(272711123)
                                .withEnabledState(BackendEnabledState.DISABLED)
                                .withPriority(1360670450)
                                .withWeight(1954508595)
                                .withBackendHostHeader("ofudflvkgju"),
                            new Backend()
                                .withAddress("dknnqvsazn")
                                .withPrivateLinkAlias("tor")
                                .withPrivateLinkResourceId("sgsahmkycgr")
                                .withPrivateLinkLocation("wjue")
                                .withPrivateLinkApprovalMessage("uruv")
                                .withHttpPort(973815152)
                                .withHttpsPort(136999503)
                                .withEnabledState(BackendEnabledState.DISABLED)
                                .withPriority(1969431903)
                                .withWeight(452446013)
                                .withBackendHostHeader("mqoefkifrvtpuqu")))
                .withLoadBalancingSettings(new SubResource().withId("lgkfbt"))
                .withHealthProbeSettings(new SubResource().withId("aongbj"));
        model = BinaryData.fromObject(model).toObject(BackendPoolUpdateParameters.class);
        Assertions.assertEquals("fltkacjv", model.backends().get(0).address());
        Assertions.assertEquals("kdlfoa", model.backends().get(0).privateLinkAlias());
        Assertions.assertEquals("gkfpaga", model.backends().get(0).privateLinkResourceId());
        Assertions.assertEquals("pulpqblylsyxk", model.backends().get(0).privateLinkLocation());
        Assertions.assertEquals("jervtia", model.backends().get(0).privateLinkApprovalMessage());
        Assertions.assertEquals(1353667842, model.backends().get(0).httpPort());
        Assertions.assertEquals(424844999, model.backends().get(0).httpsPort());
        Assertions.assertEquals(BackendEnabledState.ENABLED, model.backends().get(0).enabledState());
        Assertions.assertEquals(993241324, model.backends().get(0).priority());
        Assertions.assertEquals(1236978734, model.backends().get(0).weight());
        Assertions.assertEquals("zkfzbeyv", model.backends().get(0).backendHostHeader());
        Assertions.assertEquals("lgkfbt", model.loadBalancingSettings().id());
        Assertions.assertEquals("aongbj", model.healthProbeSettings().id());
    }
}