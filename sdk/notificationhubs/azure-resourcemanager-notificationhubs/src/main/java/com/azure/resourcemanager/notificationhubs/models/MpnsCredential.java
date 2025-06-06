// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.notificationhubs.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.notificationhubs.fluent.models.MpnsCredentialProperties;
import java.io.IOException;

/**
 * Description of a NotificationHub MpnsCredential.
 */
@Fluent
public final class MpnsCredential implements JsonSerializable<MpnsCredential> {
    /*
     * Properties of NotificationHub MpnsCredential.
     */
    private MpnsCredentialProperties innerProperties;

    /**
     * Creates an instance of MpnsCredential class.
     */
    public MpnsCredential() {
    }

    /**
     * Get the innerProperties property: Properties of NotificationHub MpnsCredential.
     * 
     * @return the innerProperties value.
     */
    private MpnsCredentialProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the mpnsCertificate property: The MPNS certificate.
     * 
     * @return the mpnsCertificate value.
     */
    public String mpnsCertificate() {
        return this.innerProperties() == null ? null : this.innerProperties().mpnsCertificate();
    }

    /**
     * Set the mpnsCertificate property: The MPNS certificate.
     * 
     * @param mpnsCertificate the mpnsCertificate value to set.
     * @return the MpnsCredential object itself.
     */
    public MpnsCredential withMpnsCertificate(String mpnsCertificate) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MpnsCredentialProperties();
        }
        this.innerProperties().withMpnsCertificate(mpnsCertificate);
        return this;
    }

    /**
     * Get the certificateKey property: The certificate key for this credential.
     * 
     * @return the certificateKey value.
     */
    public String certificateKey() {
        return this.innerProperties() == null ? null : this.innerProperties().certificateKey();
    }

    /**
     * Set the certificateKey property: The certificate key for this credential.
     * 
     * @param certificateKey the certificateKey value to set.
     * @return the MpnsCredential object itself.
     */
    public MpnsCredential withCertificateKey(String certificateKey) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MpnsCredentialProperties();
        }
        this.innerProperties().withCertificateKey(certificateKey);
        return this;
    }

    /**
     * Get the thumbprint property: The MPNS certificate Thumbprint.
     * 
     * @return the thumbprint value.
     */
    public String thumbprint() {
        return this.innerProperties() == null ? null : this.innerProperties().thumbprint();
    }

    /**
     * Set the thumbprint property: The MPNS certificate Thumbprint.
     * 
     * @param thumbprint the thumbprint value to set.
     * @return the MpnsCredential object itself.
     */
    public MpnsCredential withThumbprint(String thumbprint) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MpnsCredentialProperties();
        }
        this.innerProperties().withThumbprint(thumbprint);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MpnsCredential from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MpnsCredential if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the MpnsCredential.
     */
    public static MpnsCredential fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MpnsCredential deserializedMpnsCredential = new MpnsCredential();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("properties".equals(fieldName)) {
                    deserializedMpnsCredential.innerProperties = MpnsCredentialProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedMpnsCredential;
        });
    }
}
