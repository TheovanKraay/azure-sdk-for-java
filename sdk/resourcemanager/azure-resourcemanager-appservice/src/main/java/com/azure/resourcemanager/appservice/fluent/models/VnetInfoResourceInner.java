// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.appservice.models.ProxyOnlyResource;
import java.io.IOException;
import java.util.List;

/**
 * Virtual Network information ARM resource.
 */
@Fluent
public final class VnetInfoResourceInner extends ProxyOnlyResource {
    /*
     * Core resource properties
     */
    private VnetInfo innerProperties;

    /*
     * The type of the resource.
     */
    private String type;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /**
     * Creates an instance of VnetInfoResourceInner class.
     */
    public VnetInfoResourceInner() {
    }

    /**
     * Get the innerProperties property: Core resource properties.
     * 
     * @return the innerProperties value.
     */
    private VnetInfo innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VnetInfoResourceInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the vnetResourceId property: The Virtual Network's resource ID.
     * 
     * @return the vnetResourceId value.
     */
    public String vnetResourceId() {
        return this.innerProperties() == null ? null : this.innerProperties().vnetResourceId();
    }

    /**
     * Set the vnetResourceId property: The Virtual Network's resource ID.
     * 
     * @param vnetResourceId the vnetResourceId value to set.
     * @return the VnetInfoResourceInner object itself.
     */
    public VnetInfoResourceInner withVnetResourceId(String vnetResourceId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VnetInfo();
        }
        this.innerProperties().withVnetResourceId(vnetResourceId);
        return this;
    }

    /**
     * Get the certThumbprint property: The client certificate thumbprint.
     * 
     * @return the certThumbprint value.
     */
    public String certThumbprint() {
        return this.innerProperties() == null ? null : this.innerProperties().certThumbprint();
    }

    /**
     * Get the certBlob property: A certificate file (.cer) blob containing the public key of the private key used to
     * authenticate a
     * Point-To-Site VPN connection.
     * 
     * @return the certBlob value.
     */
    public String certBlob() {
        return this.innerProperties() == null ? null : this.innerProperties().certBlob();
    }

    /**
     * Set the certBlob property: A certificate file (.cer) blob containing the public key of the private key used to
     * authenticate a
     * Point-To-Site VPN connection.
     * 
     * @param certBlob the certBlob value to set.
     * @return the VnetInfoResourceInner object itself.
     */
    public VnetInfoResourceInner withCertBlob(String certBlob) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VnetInfo();
        }
        this.innerProperties().withCertBlob(certBlob);
        return this;
    }

    /**
     * Get the routes property: The routes that this Virtual Network connection uses.
     * 
     * @return the routes value.
     */
    public List<VnetRouteInner> routes() {
        return this.innerProperties() == null ? null : this.innerProperties().routes();
    }

    /**
     * Get the resyncRequired property: &lt;code&gt;true&lt;/code&gt; if a resync is required; otherwise,
     * &lt;code&gt;false&lt;/code&gt;.
     * 
     * @return the resyncRequired value.
     */
    public Boolean resyncRequired() {
        return this.innerProperties() == null ? null : this.innerProperties().resyncRequired();
    }

    /**
     * Get the dnsServers property: DNS servers to be used by this Virtual Network. This should be a comma-separated
     * list of IP addresses.
     * 
     * @return the dnsServers value.
     */
    public String dnsServers() {
        return this.innerProperties() == null ? null : this.innerProperties().dnsServers();
    }

    /**
     * Set the dnsServers property: DNS servers to be used by this Virtual Network. This should be a comma-separated
     * list of IP addresses.
     * 
     * @param dnsServers the dnsServers value to set.
     * @return the VnetInfoResourceInner object itself.
     */
    public VnetInfoResourceInner withDnsServers(String dnsServers) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VnetInfo();
        }
        this.innerProperties().withDnsServers(dnsServers);
        return this;
    }

    /**
     * Get the isSwift property: Flag that is used to denote if this is VNET injection.
     * 
     * @return the isSwift value.
     */
    public Boolean isSwift() {
        return this.innerProperties() == null ? null : this.innerProperties().isSwift();
    }

    /**
     * Set the isSwift property: Flag that is used to denote if this is VNET injection.
     * 
     * @param isSwift the isSwift value to set.
     * @return the VnetInfoResourceInner object itself.
     */
    public VnetInfoResourceInner withIsSwift(Boolean isSwift) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VnetInfo();
        }
        this.innerProperties().withIsSwift(isSwift);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
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
        jsonWriter.writeStringField("kind", kind());
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of VnetInfoResourceInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of VnetInfoResourceInner if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the VnetInfoResourceInner.
     */
    public static VnetInfoResourceInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            VnetInfoResourceInner deserializedVnetInfoResourceInner = new VnetInfoResourceInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedVnetInfoResourceInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedVnetInfoResourceInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedVnetInfoResourceInner.type = reader.getString();
                } else if ("kind".equals(fieldName)) {
                    deserializedVnetInfoResourceInner.withKind(reader.getString());
                } else if ("properties".equals(fieldName)) {
                    deserializedVnetInfoResourceInner.innerProperties = VnetInfo.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedVnetInfoResourceInner;
        });
    }
}
