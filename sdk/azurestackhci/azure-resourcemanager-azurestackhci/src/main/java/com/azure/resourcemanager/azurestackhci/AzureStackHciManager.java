// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci;

import com.azure.core.credential.TokenCredential;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.HttpPipelinePosition;
import com.azure.core.http.policy.AddDatePolicy;
import com.azure.core.http.policy.AddHeadersFromContextPolicy;
import com.azure.core.http.policy.HttpLoggingPolicy;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.core.http.policy.HttpPolicyProviders;
import com.azure.core.http.policy.RequestIdPolicy;
import com.azure.core.http.policy.RetryOptions;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.management.http.policy.ArmChallengeAuthenticationPolicy;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.util.Configuration;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.azurestackhci.fluent.AzureStackHciClient;
import com.azure.resourcemanager.azurestackhci.implementation.ArcSettingsImpl;
import com.azure.resourcemanager.azurestackhci.implementation.AzureStackHciClientBuilder;
import com.azure.resourcemanager.azurestackhci.implementation.ClustersImpl;
import com.azure.resourcemanager.azurestackhci.implementation.DeploymentSettingsImpl;
import com.azure.resourcemanager.azurestackhci.implementation.EdgeDevicesImpl;
import com.azure.resourcemanager.azurestackhci.implementation.ExtensionsImpl;
import com.azure.resourcemanager.azurestackhci.implementation.OffersImpl;
import com.azure.resourcemanager.azurestackhci.implementation.OperationsImpl;
import com.azure.resourcemanager.azurestackhci.implementation.PublishersImpl;
import com.azure.resourcemanager.azurestackhci.implementation.SecuritySettingsImpl;
import com.azure.resourcemanager.azurestackhci.implementation.SkusImpl;
import com.azure.resourcemanager.azurestackhci.implementation.UpdateRunsImpl;
import com.azure.resourcemanager.azurestackhci.implementation.UpdatesImpl;
import com.azure.resourcemanager.azurestackhci.implementation.UpdateSummariesOperationsImpl;
import com.azure.resourcemanager.azurestackhci.models.ArcSettings;
import com.azure.resourcemanager.azurestackhci.models.Clusters;
import com.azure.resourcemanager.azurestackhci.models.DeploymentSettings;
import com.azure.resourcemanager.azurestackhci.models.EdgeDevices;
import com.azure.resourcemanager.azurestackhci.models.Extensions;
import com.azure.resourcemanager.azurestackhci.models.Offers;
import com.azure.resourcemanager.azurestackhci.models.Operations;
import com.azure.resourcemanager.azurestackhci.models.Publishers;
import com.azure.resourcemanager.azurestackhci.models.SecuritySettings;
import com.azure.resourcemanager.azurestackhci.models.Skus;
import com.azure.resourcemanager.azurestackhci.models.UpdateRuns;
import com.azure.resourcemanager.azurestackhci.models.Updates;
import com.azure.resourcemanager.azurestackhci.models.UpdateSummariesOperations;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Entry point to AzureStackHciManager.
 * Azure Stack HCI management service.
 */
public final class AzureStackHciManager {
    private ArcSettings arcSettings;

    private Clusters clusters;

    private DeploymentSettings deploymentSettings;

    private EdgeDevices edgeDevices;

    private Extensions extensions;

    private Offers offers;

    private Operations operations;

    private Publishers publishers;

    private SecuritySettings securitySettings;

    private Skus skus;

    private UpdateRuns updateRuns;

    private UpdateSummariesOperations updateSummariesOperations;

    private Updates updates;

    private final AzureStackHciClient clientObject;

    private AzureStackHciManager(HttpPipeline httpPipeline, AzureProfile profile, Duration defaultPollInterval) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        this.clientObject = new AzureStackHciClientBuilder().pipeline(httpPipeline)
            .endpoint(profile.getEnvironment().getResourceManagerEndpoint())
            .subscriptionId(profile.getSubscriptionId())
            .defaultPollInterval(defaultPollInterval)
            .buildClient();
    }

    /**
     * Creates an instance of AzureStackHci service API entry point.
     * 
     * @param credential the credential to use.
     * @param profile the Azure profile for client.
     * @return the AzureStackHci service API instance.
     */
    public static AzureStackHciManager authenticate(TokenCredential credential, AzureProfile profile) {
        Objects.requireNonNull(credential, "'credential' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return configure().authenticate(credential, profile);
    }

    /**
     * Creates an instance of AzureStackHci service API entry point.
     * 
     * @param httpPipeline the {@link HttpPipeline} configured with Azure authentication credential.
     * @param profile the Azure profile for client.
     * @return the AzureStackHci service API instance.
     */
    public static AzureStackHciManager authenticate(HttpPipeline httpPipeline, AzureProfile profile) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return new AzureStackHciManager(httpPipeline, profile, null);
    }

    /**
     * Gets a Configurable instance that can be used to create AzureStackHciManager with optional configuration.
     * 
     * @return the Configurable instance allowing configurations.
     */
    public static Configurable configure() {
        return new AzureStackHciManager.Configurable();
    }

    /**
     * The Configurable allowing configurations to be set.
     */
    public static final class Configurable {
        private static final ClientLogger LOGGER = new ClientLogger(Configurable.class);

        private HttpClient httpClient;
        private HttpLogOptions httpLogOptions;
        private final List<HttpPipelinePolicy> policies = new ArrayList<>();
        private final List<String> scopes = new ArrayList<>();
        private RetryPolicy retryPolicy;
        private RetryOptions retryOptions;
        private Duration defaultPollInterval;

        private Configurable() {
        }

        /**
         * Sets the http client.
         *
         * @param httpClient the HTTP client.
         * @return the configurable object itself.
         */
        public Configurable withHttpClient(HttpClient httpClient) {
            this.httpClient = Objects.requireNonNull(httpClient, "'httpClient' cannot be null.");
            return this;
        }

        /**
         * Sets the logging options to the HTTP pipeline.
         *
         * @param httpLogOptions the HTTP log options.
         * @return the configurable object itself.
         */
        public Configurable withLogOptions(HttpLogOptions httpLogOptions) {
            this.httpLogOptions = Objects.requireNonNull(httpLogOptions, "'httpLogOptions' cannot be null.");
            return this;
        }

        /**
         * Adds the pipeline policy to the HTTP pipeline.
         *
         * @param policy the HTTP pipeline policy.
         * @return the configurable object itself.
         */
        public Configurable withPolicy(HttpPipelinePolicy policy) {
            this.policies.add(Objects.requireNonNull(policy, "'policy' cannot be null."));
            return this;
        }

        /**
         * Adds the scope to permission sets.
         *
         * @param scope the scope.
         * @return the configurable object itself.
         */
        public Configurable withScope(String scope) {
            this.scopes.add(Objects.requireNonNull(scope, "'scope' cannot be null."));
            return this;
        }

        /**
         * Sets the retry policy to the HTTP pipeline.
         *
         * @param retryPolicy the HTTP pipeline retry policy.
         * @return the configurable object itself.
         */
        public Configurable withRetryPolicy(RetryPolicy retryPolicy) {
            this.retryPolicy = Objects.requireNonNull(retryPolicy, "'retryPolicy' cannot be null.");
            return this;
        }

        /**
         * Sets the retry options for the HTTP pipeline retry policy.
         * <p>
         * This setting has no effect, if retry policy is set via {@link #withRetryPolicy(RetryPolicy)}.
         *
         * @param retryOptions the retry options for the HTTP pipeline retry policy.
         * @return the configurable object itself.
         */
        public Configurable withRetryOptions(RetryOptions retryOptions) {
            this.retryOptions = Objects.requireNonNull(retryOptions, "'retryOptions' cannot be null.");
            return this;
        }

        /**
         * Sets the default poll interval, used when service does not provide "Retry-After" header.
         *
         * @param defaultPollInterval the default poll interval.
         * @return the configurable object itself.
         */
        public Configurable withDefaultPollInterval(Duration defaultPollInterval) {
            this.defaultPollInterval
                = Objects.requireNonNull(defaultPollInterval, "'defaultPollInterval' cannot be null.");
            if (this.defaultPollInterval.isNegative()) {
                throw LOGGER
                    .logExceptionAsError(new IllegalArgumentException("'defaultPollInterval' cannot be negative"));
            }
            return this;
        }

        /**
         * Creates an instance of AzureStackHci service API entry point.
         *
         * @param credential the credential to use.
         * @param profile the Azure profile for client.
         * @return the AzureStackHci service API instance.
         */
        public AzureStackHciManager authenticate(TokenCredential credential, AzureProfile profile) {
            Objects.requireNonNull(credential, "'credential' cannot be null.");
            Objects.requireNonNull(profile, "'profile' cannot be null.");

            StringBuilder userAgentBuilder = new StringBuilder();
            userAgentBuilder.append("azsdk-java")
                .append("-")
                .append("com.azure.resourcemanager.azurestackhci")
                .append("/")
                .append("1.0.0-beta.5");
            if (!Configuration.getGlobalConfiguration().get("AZURE_TELEMETRY_DISABLED", false)) {
                userAgentBuilder.append(" (")
                    .append(Configuration.getGlobalConfiguration().get("java.version"))
                    .append("; ")
                    .append(Configuration.getGlobalConfiguration().get("os.name"))
                    .append("; ")
                    .append(Configuration.getGlobalConfiguration().get("os.version"))
                    .append("; auto-generated)");
            } else {
                userAgentBuilder.append(" (auto-generated)");
            }

            if (scopes.isEmpty()) {
                scopes.add(profile.getEnvironment().getManagementEndpoint() + "/.default");
            }
            if (retryPolicy == null) {
                if (retryOptions != null) {
                    retryPolicy = new RetryPolicy(retryOptions);
                } else {
                    retryPolicy = new RetryPolicy("Retry-After", ChronoUnit.SECONDS);
                }
            }
            List<HttpPipelinePolicy> policies = new ArrayList<>();
            policies.add(new UserAgentPolicy(userAgentBuilder.toString()));
            policies.add(new AddHeadersFromContextPolicy());
            policies.add(new RequestIdPolicy());
            policies.addAll(this.policies.stream()
                .filter(p -> p.getPipelinePosition() == HttpPipelinePosition.PER_CALL)
                .collect(Collectors.toList()));
            HttpPolicyProviders.addBeforeRetryPolicies(policies);
            policies.add(retryPolicy);
            policies.add(new AddDatePolicy());
            policies.add(new ArmChallengeAuthenticationPolicy(credential, scopes.toArray(new String[0])));
            policies.addAll(this.policies.stream()
                .filter(p -> p.getPipelinePosition() == HttpPipelinePosition.PER_RETRY)
                .collect(Collectors.toList()));
            HttpPolicyProviders.addAfterRetryPolicies(policies);
            policies.add(new HttpLoggingPolicy(httpLogOptions));
            HttpPipeline httpPipeline = new HttpPipelineBuilder().httpClient(httpClient)
                .policies(policies.toArray(new HttpPipelinePolicy[0]))
                .build();
            return new AzureStackHciManager(httpPipeline, profile, defaultPollInterval);
        }
    }

    /**
     * Gets the resource collection API of ArcSettings. It manages ArcSetting.
     * 
     * @return Resource collection API of ArcSettings.
     */
    public ArcSettings arcSettings() {
        if (this.arcSettings == null) {
            this.arcSettings = new ArcSettingsImpl(clientObject.getArcSettings(), this);
        }
        return arcSettings;
    }

    /**
     * Gets the resource collection API of Clusters. It manages Cluster.
     * 
     * @return Resource collection API of Clusters.
     */
    public Clusters clusters() {
        if (this.clusters == null) {
            this.clusters = new ClustersImpl(clientObject.getClusters(), this);
        }
        return clusters;
    }

    /**
     * Gets the resource collection API of DeploymentSettings. It manages DeploymentSetting.
     * 
     * @return Resource collection API of DeploymentSettings.
     */
    public DeploymentSettings deploymentSettings() {
        if (this.deploymentSettings == null) {
            this.deploymentSettings = new DeploymentSettingsImpl(clientObject.getDeploymentSettings(), this);
        }
        return deploymentSettings;
    }

    /**
     * Gets the resource collection API of EdgeDevices.
     * 
     * @return Resource collection API of EdgeDevices.
     */
    public EdgeDevices edgeDevices() {
        if (this.edgeDevices == null) {
            this.edgeDevices = new EdgeDevicesImpl(clientObject.getEdgeDevices(), this);
        }
        return edgeDevices;
    }

    /**
     * Gets the resource collection API of Extensions. It manages Extension.
     * 
     * @return Resource collection API of Extensions.
     */
    public Extensions extensions() {
        if (this.extensions == null) {
            this.extensions = new ExtensionsImpl(clientObject.getExtensions(), this);
        }
        return extensions;
    }

    /**
     * Gets the resource collection API of Offers.
     * 
     * @return Resource collection API of Offers.
     */
    public Offers offers() {
        if (this.offers == null) {
            this.offers = new OffersImpl(clientObject.getOffers(), this);
        }
        return offers;
    }

    /**
     * Gets the resource collection API of Operations.
     * 
     * @return Resource collection API of Operations.
     */
    public Operations operations() {
        if (this.operations == null) {
            this.operations = new OperationsImpl(clientObject.getOperations(), this);
        }
        return operations;
    }

    /**
     * Gets the resource collection API of Publishers.
     * 
     * @return Resource collection API of Publishers.
     */
    public Publishers publishers() {
        if (this.publishers == null) {
            this.publishers = new PublishersImpl(clientObject.getPublishers(), this);
        }
        return publishers;
    }

    /**
     * Gets the resource collection API of SecuritySettings. It manages SecuritySetting.
     * 
     * @return Resource collection API of SecuritySettings.
     */
    public SecuritySettings securitySettings() {
        if (this.securitySettings == null) {
            this.securitySettings = new SecuritySettingsImpl(clientObject.getSecuritySettings(), this);
        }
        return securitySettings;
    }

    /**
     * Gets the resource collection API of Skus.
     * 
     * @return Resource collection API of Skus.
     */
    public Skus skus() {
        if (this.skus == null) {
            this.skus = new SkusImpl(clientObject.getSkus(), this);
        }
        return skus;
    }

    /**
     * Gets the resource collection API of UpdateRuns. It manages UpdateRun.
     * 
     * @return Resource collection API of UpdateRuns.
     */
    public UpdateRuns updateRuns() {
        if (this.updateRuns == null) {
            this.updateRuns = new UpdateRunsImpl(clientObject.getUpdateRuns(), this);
        }
        return updateRuns;
    }

    /**
     * Gets the resource collection API of UpdateSummariesOperations.
     * 
     * @return Resource collection API of UpdateSummariesOperations.
     */
    public UpdateSummariesOperations updateSummariesOperations() {
        if (this.updateSummariesOperations == null) {
            this.updateSummariesOperations
                = new UpdateSummariesOperationsImpl(clientObject.getUpdateSummariesOperations(), this);
        }
        return updateSummariesOperations;
    }

    /**
     * Gets the resource collection API of Updates. It manages HciUpdate.
     * 
     * @return Resource collection API of Updates.
     */
    public Updates updates() {
        if (this.updates == null) {
            this.updates = new UpdatesImpl(clientObject.getUpdates(), this);
        }
        return updates;
    }

    /**
     * Gets wrapped service client AzureStackHciClient providing direct access to the underlying auto-generated API
     * implementation, based on Azure REST API.
     * 
     * @return Wrapped service client AzureStackHciClient.
     */
    public AzureStackHciClient serviceClient() {
        return this.clientObject;
    }
}
