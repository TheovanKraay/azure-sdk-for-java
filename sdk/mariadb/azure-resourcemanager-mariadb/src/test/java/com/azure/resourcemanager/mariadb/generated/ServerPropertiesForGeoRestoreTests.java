// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mariadb.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mariadb.models.GeoRedundantBackup;
import com.azure.resourcemanager.mariadb.models.MinimalTlsVersionEnum;
import com.azure.resourcemanager.mariadb.models.PublicNetworkAccessEnum;
import com.azure.resourcemanager.mariadb.models.ServerPropertiesForGeoRestore;
import com.azure.resourcemanager.mariadb.models.ServerVersion;
import com.azure.resourcemanager.mariadb.models.SslEnforcementEnum;
import com.azure.resourcemanager.mariadb.models.StorageAutogrow;
import com.azure.resourcemanager.mariadb.models.StorageProfile;
import org.junit.jupiter.api.Assertions;

public final class ServerPropertiesForGeoRestoreTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ServerPropertiesForGeoRestore model =
            BinaryData
                .fromString(
                    "{\"createMode\":\"GeoRestore\",\"sourceServerId\":\"qxwbpokulpiu\",\"version\":\"10.2\",\"sslEnforcement\":\"Enabled\",\"minimalTlsVersion\":\"TLS1_2\",\"publicNetworkAccess\":\"Enabled\",\"storageProfile\":{\"backupRetentionDays\":361598801,\"geoRedundantBackup\":\"Disabled\",\"storageMB\":1435742005,\"storageAutogrow\":\"Enabled\"}}")
                .toObject(ServerPropertiesForGeoRestore.class);
        Assertions.assertEquals(ServerVersion.ONE_ZERO_TWO, model.version());
        Assertions.assertEquals(SslEnforcementEnum.ENABLED, model.sslEnforcement());
        Assertions.assertEquals(MinimalTlsVersionEnum.TLS1_2, model.minimalTlsVersion());
        Assertions.assertEquals(PublicNetworkAccessEnum.ENABLED, model.publicNetworkAccess());
        Assertions.assertEquals(361598801, model.storageProfile().backupRetentionDays());
        Assertions.assertEquals(GeoRedundantBackup.DISABLED, model.storageProfile().geoRedundantBackup());
        Assertions.assertEquals(1435742005, model.storageProfile().storageMB());
        Assertions.assertEquals(StorageAutogrow.ENABLED, model.storageProfile().storageAutogrow());
        Assertions.assertEquals("qxwbpokulpiu", model.sourceServerId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ServerPropertiesForGeoRestore model =
            new ServerPropertiesForGeoRestore()
                .withVersion(ServerVersion.ONE_ZERO_TWO)
                .withSslEnforcement(SslEnforcementEnum.ENABLED)
                .withMinimalTlsVersion(MinimalTlsVersionEnum.TLS1_2)
                .withPublicNetworkAccess(PublicNetworkAccessEnum.ENABLED)
                .withStorageProfile(
                    new StorageProfile()
                        .withBackupRetentionDays(361598801)
                        .withGeoRedundantBackup(GeoRedundantBackup.DISABLED)
                        .withStorageMB(1435742005)
                        .withStorageAutogrow(StorageAutogrow.ENABLED))
                .withSourceServerId("qxwbpokulpiu");
        model = BinaryData.fromObject(model).toObject(ServerPropertiesForGeoRestore.class);
        Assertions.assertEquals(ServerVersion.ONE_ZERO_TWO, model.version());
        Assertions.assertEquals(SslEnforcementEnum.ENABLED, model.sslEnforcement());
        Assertions.assertEquals(MinimalTlsVersionEnum.TLS1_2, model.minimalTlsVersion());
        Assertions.assertEquals(PublicNetworkAccessEnum.ENABLED, model.publicNetworkAccess());
        Assertions.assertEquals(361598801, model.storageProfile().backupRetentionDays());
        Assertions.assertEquals(GeoRedundantBackup.DISABLED, model.storageProfile().geoRedundantBackup());
        Assertions.assertEquals(1435742005, model.storageProfile().storageMB());
        Assertions.assertEquals(StorageAutogrow.ENABLED, model.storageProfile().storageAutogrow());
        Assertions.assertEquals("qxwbpokulpiu", model.sourceServerId());
    }
}
