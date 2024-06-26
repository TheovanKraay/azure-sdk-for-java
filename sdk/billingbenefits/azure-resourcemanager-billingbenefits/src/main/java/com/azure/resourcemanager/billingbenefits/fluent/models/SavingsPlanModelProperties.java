// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billingbenefits.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.billingbenefits.models.AppliedScopeProperties;
import com.azure.resourcemanager.billingbenefits.models.AppliedScopeType;
import com.azure.resourcemanager.billingbenefits.models.BillingPlan;
import com.azure.resourcemanager.billingbenefits.models.Commitment;
import com.azure.resourcemanager.billingbenefits.models.ExtendedStatusInfo;
import com.azure.resourcemanager.billingbenefits.models.ProvisioningState;
import com.azure.resourcemanager.billingbenefits.models.RenewProperties;
import com.azure.resourcemanager.billingbenefits.models.Term;
import com.azure.resourcemanager.billingbenefits.models.Utilization;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Savings plan properties. */
@Fluent
public final class SavingsPlanModelProperties {
    /*
     * Display name
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * Provisioning state
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * The provisioning state of the savings plan for display, e.g. Succeeded
     */
    @JsonProperty(value = "displayProvisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String displayProvisioningState;

    /*
     * Subscription that will be charged for purchasing the benefit
     */
    @JsonProperty(value = "billingScopeId")
    private String billingScopeId;

    /*
     * Fully-qualified identifier of the billing profile where the savings plan is applied. Present only for Field-led
     * or Customer-led customers.
     */
    @JsonProperty(value = "billingProfileId", access = JsonProperty.Access.WRITE_ONLY)
    private String billingProfileId;

    /*
     * Fully-qualified identifier of the customer where the savings plan is applied. Present only for Partner-led
     * customers.
     */
    @JsonProperty(value = "customerId", access = JsonProperty.Access.WRITE_ONLY)
    private String customerId;

    /*
     * Fully-qualified identifier of the billing account where the savings plan is applied. Present only for Enterprise
     * Agreement customers.
     */
    @JsonProperty(value = "billingAccountId", access = JsonProperty.Access.WRITE_ONLY)
    private String billingAccountId;

    /*
     * Represent benefit term in ISO 8601 format.
     */
    @JsonProperty(value = "term")
    private Term term;

    /*
     * Represents the billing plan in ISO 8601 format. Required only for monthly billing plans.
     */
    @JsonProperty(value = "billingPlan")
    private BillingPlan billingPlan;

    /*
     * Type of the Applied Scope.
     */
    @JsonProperty(value = "appliedScopeType")
    private AppliedScopeType appliedScopeType;

    /*
     * The applied scope type of the savings plan for display, e.g. Shared
     */
    @JsonProperty(value = "userFriendlyAppliedScopeType", access = JsonProperty.Access.WRITE_ONLY)
    private String userFriendlyAppliedScopeType;

    /*
     * Properties specific to applied scope type. Not required if not applicable.
     */
    @JsonProperty(value = "appliedScopeProperties")
    private AppliedScopeProperties appliedScopeProperties;

    /*
     * Commitment towards the benefit.
     */
    @JsonProperty(value = "commitment")
    private Commitment commitment;

    /*
     * DateTime of the savings plan starts providing benefit from.
     */
    @JsonProperty(value = "effectiveDateTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime effectiveDateTime;

    /*
     * Expiry date time
     */
    @JsonProperty(value = "expiryDateTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime expiryDateTime;

    /*
     * Date time when the savings plan was purchased
     */
    @JsonProperty(value = "purchaseDateTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime purchaseDateTime;

    /*
     * This is the DateTime when the savings plan benefit started.
     */
    @JsonProperty(value = "benefitStartTime")
    private OffsetDateTime benefitStartTime;

    /*
     * The extendedStatusInfo property.
     */
    @JsonProperty(value = "extendedStatusInfo", access = JsonProperty.Access.WRITE_ONLY)
    private ExtendedStatusInfo extendedStatusInfo;

    /*
     * Setting this to true will automatically purchase a new benefit on the expiration date time.
     */
    @JsonProperty(value = "renew")
    private Boolean renew;

    /*
     * Savings plan utilization
     */
    @JsonProperty(value = "utilization", access = JsonProperty.Access.WRITE_ONLY)
    private Utilization utilization;

    /*
     * SavingsPlan Id of the SavingsPlan from which this SavingsPlan is renewed.
     */
    @JsonProperty(value = "renewSource")
    private String renewSource;

    /*
     * SavingsPlan Id of the SavingsPlan which is purchased because of renew.
     */
    @JsonProperty(value = "renewDestination")
    private String renewDestination;

    /*
     * The renewProperties property.
     */
    @JsonProperty(value = "renewProperties")
    private RenewProperties renewProperties;

    /** Creates an instance of SavingsPlanModelProperties class. */
    public SavingsPlanModelProperties() {
    }

    /**
     * Get the displayName property: Display name.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: Display name.
     *
     * @param displayName the displayName value to set.
     * @return the SavingsPlanModelProperties object itself.
     */
    public SavingsPlanModelProperties withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the displayProvisioningState property: The provisioning state of the savings plan for display, e.g.
     * Succeeded.
     *
     * @return the displayProvisioningState value.
     */
    public String displayProvisioningState() {
        return this.displayProvisioningState;
    }

    /**
     * Get the billingScopeId property: Subscription that will be charged for purchasing the benefit.
     *
     * @return the billingScopeId value.
     */
    public String billingScopeId() {
        return this.billingScopeId;
    }

    /**
     * Set the billingScopeId property: Subscription that will be charged for purchasing the benefit.
     *
     * @param billingScopeId the billingScopeId value to set.
     * @return the SavingsPlanModelProperties object itself.
     */
    public SavingsPlanModelProperties withBillingScopeId(String billingScopeId) {
        this.billingScopeId = billingScopeId;
        return this;
    }

    /**
     * Get the billingProfileId property: Fully-qualified identifier of the billing profile where the savings plan is
     * applied. Present only for Field-led or Customer-led customers.
     *
     * @return the billingProfileId value.
     */
    public String billingProfileId() {
        return this.billingProfileId;
    }

    /**
     * Get the customerId property: Fully-qualified identifier of the customer where the savings plan is applied.
     * Present only for Partner-led customers.
     *
     * @return the customerId value.
     */
    public String customerId() {
        return this.customerId;
    }

    /**
     * Get the billingAccountId property: Fully-qualified identifier of the billing account where the savings plan is
     * applied. Present only for Enterprise Agreement customers.
     *
     * @return the billingAccountId value.
     */
    public String billingAccountId() {
        return this.billingAccountId;
    }

    /**
     * Get the term property: Represent benefit term in ISO 8601 format.
     *
     * @return the term value.
     */
    public Term term() {
        return this.term;
    }

    /**
     * Set the term property: Represent benefit term in ISO 8601 format.
     *
     * @param term the term value to set.
     * @return the SavingsPlanModelProperties object itself.
     */
    public SavingsPlanModelProperties withTerm(Term term) {
        this.term = term;
        return this;
    }

    /**
     * Get the billingPlan property: Represents the billing plan in ISO 8601 format. Required only for monthly billing
     * plans.
     *
     * @return the billingPlan value.
     */
    public BillingPlan billingPlan() {
        return this.billingPlan;
    }

    /**
     * Set the billingPlan property: Represents the billing plan in ISO 8601 format. Required only for monthly billing
     * plans.
     *
     * @param billingPlan the billingPlan value to set.
     * @return the SavingsPlanModelProperties object itself.
     */
    public SavingsPlanModelProperties withBillingPlan(BillingPlan billingPlan) {
        this.billingPlan = billingPlan;
        return this;
    }

    /**
     * Get the appliedScopeType property: Type of the Applied Scope.
     *
     * @return the appliedScopeType value.
     */
    public AppliedScopeType appliedScopeType() {
        return this.appliedScopeType;
    }

    /**
     * Set the appliedScopeType property: Type of the Applied Scope.
     *
     * @param appliedScopeType the appliedScopeType value to set.
     * @return the SavingsPlanModelProperties object itself.
     */
    public SavingsPlanModelProperties withAppliedScopeType(AppliedScopeType appliedScopeType) {
        this.appliedScopeType = appliedScopeType;
        return this;
    }

    /**
     * Get the userFriendlyAppliedScopeType property: The applied scope type of the savings plan for display, e.g.
     * Shared.
     *
     * @return the userFriendlyAppliedScopeType value.
     */
    public String userFriendlyAppliedScopeType() {
        return this.userFriendlyAppliedScopeType;
    }

    /**
     * Get the appliedScopeProperties property: Properties specific to applied scope type. Not required if not
     * applicable.
     *
     * @return the appliedScopeProperties value.
     */
    public AppliedScopeProperties appliedScopeProperties() {
        return this.appliedScopeProperties;
    }

    /**
     * Set the appliedScopeProperties property: Properties specific to applied scope type. Not required if not
     * applicable.
     *
     * @param appliedScopeProperties the appliedScopeProperties value to set.
     * @return the SavingsPlanModelProperties object itself.
     */
    public SavingsPlanModelProperties withAppliedScopeProperties(AppliedScopeProperties appliedScopeProperties) {
        this.appliedScopeProperties = appliedScopeProperties;
        return this;
    }

    /**
     * Get the commitment property: Commitment towards the benefit.
     *
     * @return the commitment value.
     */
    public Commitment commitment() {
        return this.commitment;
    }

    /**
     * Set the commitment property: Commitment towards the benefit.
     *
     * @param commitment the commitment value to set.
     * @return the SavingsPlanModelProperties object itself.
     */
    public SavingsPlanModelProperties withCommitment(Commitment commitment) {
        this.commitment = commitment;
        return this;
    }

    /**
     * Get the effectiveDateTime property: DateTime of the savings plan starts providing benefit from.
     *
     * @return the effectiveDateTime value.
     */
    public OffsetDateTime effectiveDateTime() {
        return this.effectiveDateTime;
    }

    /**
     * Get the expiryDateTime property: Expiry date time.
     *
     * @return the expiryDateTime value.
     */
    public OffsetDateTime expiryDateTime() {
        return this.expiryDateTime;
    }

    /**
     * Get the purchaseDateTime property: Date time when the savings plan was purchased.
     *
     * @return the purchaseDateTime value.
     */
    public OffsetDateTime purchaseDateTime() {
        return this.purchaseDateTime;
    }

    /**
     * Get the benefitStartTime property: This is the DateTime when the savings plan benefit started.
     *
     * @return the benefitStartTime value.
     */
    public OffsetDateTime benefitStartTime() {
        return this.benefitStartTime;
    }

    /**
     * Set the benefitStartTime property: This is the DateTime when the savings plan benefit started.
     *
     * @param benefitStartTime the benefitStartTime value to set.
     * @return the SavingsPlanModelProperties object itself.
     */
    public SavingsPlanModelProperties withBenefitStartTime(OffsetDateTime benefitStartTime) {
        this.benefitStartTime = benefitStartTime;
        return this;
    }

    /**
     * Get the extendedStatusInfo property: The extendedStatusInfo property.
     *
     * @return the extendedStatusInfo value.
     */
    public ExtendedStatusInfo extendedStatusInfo() {
        return this.extendedStatusInfo;
    }

    /**
     * Get the renew property: Setting this to true will automatically purchase a new benefit on the expiration date
     * time.
     *
     * @return the renew value.
     */
    public Boolean renew() {
        return this.renew;
    }

    /**
     * Set the renew property: Setting this to true will automatically purchase a new benefit on the expiration date
     * time.
     *
     * @param renew the renew value to set.
     * @return the SavingsPlanModelProperties object itself.
     */
    public SavingsPlanModelProperties withRenew(Boolean renew) {
        this.renew = renew;
        return this;
    }

    /**
     * Get the utilization property: Savings plan utilization.
     *
     * @return the utilization value.
     */
    public Utilization utilization() {
        return this.utilization;
    }

    /**
     * Get the renewSource property: SavingsPlan Id of the SavingsPlan from which this SavingsPlan is renewed.
     *
     * @return the renewSource value.
     */
    public String renewSource() {
        return this.renewSource;
    }

    /**
     * Set the renewSource property: SavingsPlan Id of the SavingsPlan from which this SavingsPlan is renewed.
     *
     * @param renewSource the renewSource value to set.
     * @return the SavingsPlanModelProperties object itself.
     */
    public SavingsPlanModelProperties withRenewSource(String renewSource) {
        this.renewSource = renewSource;
        return this;
    }

    /**
     * Get the renewDestination property: SavingsPlan Id of the SavingsPlan which is purchased because of renew.
     *
     * @return the renewDestination value.
     */
    public String renewDestination() {
        return this.renewDestination;
    }

    /**
     * Set the renewDestination property: SavingsPlan Id of the SavingsPlan which is purchased because of renew.
     *
     * @param renewDestination the renewDestination value to set.
     * @return the SavingsPlanModelProperties object itself.
     */
    public SavingsPlanModelProperties withRenewDestination(String renewDestination) {
        this.renewDestination = renewDestination;
        return this;
    }

    /**
     * Get the renewProperties property: The renewProperties property.
     *
     * @return the renewProperties value.
     */
    public RenewProperties renewProperties() {
        return this.renewProperties;
    }

    /**
     * Set the renewProperties property: The renewProperties property.
     *
     * @param renewProperties the renewProperties value to set.
     * @return the SavingsPlanModelProperties object itself.
     */
    public SavingsPlanModelProperties withRenewProperties(RenewProperties renewProperties) {
        this.renewProperties = renewProperties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (appliedScopeProperties() != null) {
            appliedScopeProperties().validate();
        }
        if (commitment() != null) {
            commitment().validate();
        }
        if (extendedStatusInfo() != null) {
            extendedStatusInfo().validate();
        }
        if (utilization() != null) {
            utilization().validate();
        }
        if (renewProperties() != null) {
            renewProperties().validate();
        }
    }
}
