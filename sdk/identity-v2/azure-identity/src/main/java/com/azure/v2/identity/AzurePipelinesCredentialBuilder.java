// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.v2.identity;

import com.azure.v2.identity.implementation.models.ClientOptions;
import com.azure.v2.identity.implementation.models.ConfidentialClientOptions;
import com.azure.v2.identity.implementation.util.ValidationUtil;
import com.azure.v2.identity.models.TokenCachePersistenceOptions;
import io.clientcore.core.http.models.HttpHeaderName;
import io.clientcore.core.http.pipeline.HttpInstrumentationOptions;
import io.clientcore.core.instrumentation.logging.ClientLogger;
import io.clientcore.core.utils.configuration.Configuration;

import java.util.Arrays;

/**
 * The {@link AzurePipelinesCredentialBuilder} provides a fluent builder for {@link AzurePipelinesCredential}.
 *
 * <pre>
 * &#47;&#47; serviceConnectionId is retrieved from the portal.
 * &#47;&#47; systemAccessToken is retrieved from the pipeline environment as shown.
 * &#47;&#47; You may choose another name for this variable.
 *
 * String systemAccessToken = System.getenv&#40;&quot;SYSTEM_ACCESSTOKEN&quot;&#41;;
 * AzurePipelinesCredential credential = new AzurePipelinesCredentialBuilder&#40;&#41;.clientId&#40;clientId&#41;
 *     .tenantId&#40;tenantId&#41;
 *     .serviceConnectionId&#40;serviceConnectionId&#41;
 *     .systemAccessToken&#40;systemAccessToken&#41;
 *     .build&#40;&#41;;
 * </pre>
 */
public class AzurePipelinesCredentialBuilder extends EntraIdCredentialBuilderBase<AzurePipelinesCredentialBuilder> {
    private static final ClientLogger LOGGER = new ClientLogger(AzurePipelinesCredentialBuilder.class);
    private static final String OIDC_API_VERSION = "7.1";
    private String serviceConnectionId;
    private String systemAccessToken;

    private final ConfidentialClientOptions confidentialClientOptions;

    /**
     * Creates an instance of the {@link AzurePipelinesCredentialBuilder}.
     */
    public AzurePipelinesCredentialBuilder() {
        super();
        confidentialClientOptions = new ConfidentialClientOptions();
    }

    @Override
    ClientOptions getClientOptions() {
        return this.confidentialClientOptions;
    }

    /**
     * Sets the service connection id for the Azure Pipelines service connection. The service connection ID is
     * retrieved from the Service Connection in the portal.
     *
     * @param serviceConnectionId The service connection ID, as found in the query string's resourceId key.
     * @return the updated instance of the builder.
     */
    public AzurePipelinesCredentialBuilder serviceConnectionId(String serviceConnectionId) {
        this.serviceConnectionId = serviceConnectionId;
        return this;
    }

    /**
     * Sets the System Access Token for the Azure Pipelines service connection. The system access token is
     * retrieved from the pipeline variables by assigning it to an environment variable and reading it.
     * See {@link AzurePipelinesCredential} for more information.
     *
     * @param systemAccessToken the system access token for the Azure Pipelines service connection.
     * @return The updated instance of the builder.
     */
    public AzurePipelinesCredentialBuilder systemAccessToken(String systemAccessToken) {
        this.systemAccessToken = systemAccessToken;
        return this;
    }

    /**
     * Configures the persistent shared token cache options and enables the persistent token cache which is disabled
     * by default. If configured, the credential will store tokens in a cache persisted to the machine, protected to
     * the current user, which can be shared by other credentials and processes.
     *
     * @param tokenCachePersistenceOptions the token cache configuration options
     * @return An updated instance of this builder with the token cache options configured.
     */
    public AzurePipelinesCredentialBuilder
        tokenCachePersistenceOptions(TokenCachePersistenceOptions tokenCachePersistenceOptions) {
        this.confidentialClientOptions.setTokenCacheOptions(tokenCachePersistenceOptions);
        return this;
    }

    /**
     * Builds an instance of the {@link AzurePipelinesCredential} with the current configurations. Requires setting
     * the following parameters:
     * <ul>
     * <li>Client ID via {@link #clientId(String)}</li>
     * <li>Tenant ID via {@link #tenantId(String)}</li>
     * <li>Service Connection ID via {@link #serviceConnectionId(String)}</li>
     * <li>System Access Token via {@link #systemAccessToken(String)}</li>
     * </ul>
     * Requires the {@code SYSTEM_OIDCREQUESTURI} environment variable to be set.
     *
     * @throws IllegalArgumentException Thrown when required parameters are set or the environment is not correctly
     * configured.
     * @return an instance of the {@link AzurePipelinesCredential}.
     */
    public AzurePipelinesCredential build() {
        Configuration configuration = confidentialClientOptions.getConfiguration();
        if (configuration == null) {
            configuration = Configuration.getGlobalConfiguration();
        }

        String oidcEndpoint = configuration.get("SYSTEM_OIDCREQUESTURI");

        ValidationUtil.validate(getClass().getSimpleName(), LOGGER,
            Arrays.asList("clientId", "tenantId", "serviceConnectionId", "systemAccessToken", "oidcEndpoint"),
            Arrays.asList(confidentialClientOptions.getClientId(), confidentialClientOptions.getTenantId(),
                serviceConnectionId, this.systemAccessToken, oidcEndpoint));

        String requestUrl = String.format("%s?api-version=%s&serviceConnectionId=%s", oidcEndpoint, OIDC_API_VERSION,
            serviceConnectionId);

        // We need to make a best effort to log these headers.
        // If the user gives us options, we'll sneak the headers in, or make an options with them.
        // If the user gave us a pipeline none of this matters as we can't change a user created pipeline.
        if (confidentialClientOptions.getHttpPipelineOptions().getHttpPipeline() != null) {
            HttpInstrumentationOptions options
                = confidentialClientOptions.getHttpPipelineOptions().getHttpInstrumentationOptions();
            if (options == null) {
                options = new HttpInstrumentationOptions();
            }
            options.addAllowedHeaderName(HttpHeaderName.fromString("x-vss-e2eid"));
            options.addAllowedHeaderName(HttpHeaderName.fromString("x-msedge-ref"));
            confidentialClientOptions.getHttpPipelineOptions().setHttpInstrumentationOptions(options);
        }
        return new AzurePipelinesCredential(requestUrl, systemAccessToken,
            new ConfidentialClientOptions(confidentialClientOptions));
    }
}
