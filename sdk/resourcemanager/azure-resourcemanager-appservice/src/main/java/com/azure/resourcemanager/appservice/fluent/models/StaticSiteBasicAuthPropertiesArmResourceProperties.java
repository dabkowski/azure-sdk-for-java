// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** StaticSiteBasicAuthPropertiesARMResource resource specific properties. */
@Fluent
public final class StaticSiteBasicAuthPropertiesArmResourceProperties {
    /*
     * The password for basic auth.
     */
    @JsonProperty(value = "password")
    private String password;

    /*
     * Url to the secret in Key Vault.
     */
    @JsonProperty(value = "secretUrl")
    private String secretUrl;

    /*
     * State indicating if basic auth is enabled and for what environments it is active.
     */
    @JsonProperty(value = "applicableEnvironmentsMode", required = true)
    private String applicableEnvironmentsMode;

    /*
     * The list of enabled environments for Basic Auth if ApplicableEnvironmentsMode is set to SpecifiedEnvironments.
     */
    @JsonProperty(value = "environments")
    private List<String> environments;

    /*
     * State indicating if basic auth has a secret and what type it is.
     */
    @JsonProperty(value = "secretState", access = JsonProperty.Access.WRITE_ONLY)
    private String secretState;

    /** Creates an instance of StaticSiteBasicAuthPropertiesArmResourceProperties class. */
    public StaticSiteBasicAuthPropertiesArmResourceProperties() {
    }

    /**
     * Get the password property: The password for basic auth.
     *
     * @return the password value.
     */
    public String password() {
        return this.password;
    }

    /**
     * Set the password property: The password for basic auth.
     *
     * @param password the password value to set.
     * @return the StaticSiteBasicAuthPropertiesArmResourceProperties object itself.
     */
    public StaticSiteBasicAuthPropertiesArmResourceProperties withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Get the secretUrl property: Url to the secret in Key Vault.
     *
     * @return the secretUrl value.
     */
    public String secretUrl() {
        return this.secretUrl;
    }

    /**
     * Set the secretUrl property: Url to the secret in Key Vault.
     *
     * @param secretUrl the secretUrl value to set.
     * @return the StaticSiteBasicAuthPropertiesArmResourceProperties object itself.
     */
    public StaticSiteBasicAuthPropertiesArmResourceProperties withSecretUrl(String secretUrl) {
        this.secretUrl = secretUrl;
        return this;
    }

    /**
     * Get the applicableEnvironmentsMode property: State indicating if basic auth is enabled and for what environments
     * it is active.
     *
     * @return the applicableEnvironmentsMode value.
     */
    public String applicableEnvironmentsMode() {
        return this.applicableEnvironmentsMode;
    }

    /**
     * Set the applicableEnvironmentsMode property: State indicating if basic auth is enabled and for what environments
     * it is active.
     *
     * @param applicableEnvironmentsMode the applicableEnvironmentsMode value to set.
     * @return the StaticSiteBasicAuthPropertiesArmResourceProperties object itself.
     */
    public StaticSiteBasicAuthPropertiesArmResourceProperties withApplicableEnvironmentsMode(
        String applicableEnvironmentsMode) {
        this.applicableEnvironmentsMode = applicableEnvironmentsMode;
        return this;
    }

    /**
     * Get the environments property: The list of enabled environments for Basic Auth if ApplicableEnvironmentsMode is
     * set to SpecifiedEnvironments.
     *
     * @return the environments value.
     */
    public List<String> environments() {
        return this.environments;
    }

    /**
     * Set the environments property: The list of enabled environments for Basic Auth if ApplicableEnvironmentsMode is
     * set to SpecifiedEnvironments.
     *
     * @param environments the environments value to set.
     * @return the StaticSiteBasicAuthPropertiesArmResourceProperties object itself.
     */
    public StaticSiteBasicAuthPropertiesArmResourceProperties withEnvironments(List<String> environments) {
        this.environments = environments;
        return this;
    }

    /**
     * Get the secretState property: State indicating if basic auth has a secret and what type it is.
     *
     * @return the secretState value.
     */
    public String secretState() {
        return this.secretState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (applicableEnvironmentsMode() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property applicableEnvironmentsMode in model"
                            + " StaticSiteBasicAuthPropertiesArmResourceProperties"));
        }
    }

    private static final ClientLogger LOGGER =
        new ClientLogger(StaticSiteBasicAuthPropertiesArmResourceProperties.class);
}
