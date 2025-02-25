// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.devcenter.fluent.models.CatalogUpdateProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The catalog's properties for partial update. Properties not provided in the update request will not be changed. */
@Fluent
public final class CatalogUpdate {
    /*
     * Catalog properties for update.
     */
    @JsonProperty(value = "properties")
    private CatalogUpdateProperties innerProperties;

    /*
     * Resource tags.
     */
    @JsonProperty(value = "tags")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tags;

    /** Creates an instance of CatalogUpdate class. */
    public CatalogUpdate() {
    }

    /**
     * Get the innerProperties property: Catalog properties for update.
     *
     * @return the innerProperties value.
     */
    private CatalogUpdateProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the tags property: Resource tags.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Resource tags.
     *
     * @param tags the tags value to set.
     * @return the CatalogUpdate object itself.
     */
    public CatalogUpdate withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the gitHub property: Properties for a GitHub catalog type.
     *
     * @return the gitHub value.
     */
    public GitCatalog gitHub() {
        return this.innerProperties() == null ? null : this.innerProperties().gitHub();
    }

    /**
     * Set the gitHub property: Properties for a GitHub catalog type.
     *
     * @param gitHub the gitHub value to set.
     * @return the CatalogUpdate object itself.
     */
    public CatalogUpdate withGitHub(GitCatalog gitHub) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CatalogUpdateProperties();
        }
        this.innerProperties().withGitHub(gitHub);
        return this;
    }

    /**
     * Get the adoGit property: Properties for an Azure DevOps catalog type.
     *
     * @return the adoGit value.
     */
    public GitCatalog adoGit() {
        return this.innerProperties() == null ? null : this.innerProperties().adoGit();
    }

    /**
     * Set the adoGit property: Properties for an Azure DevOps catalog type.
     *
     * @param adoGit the adoGit value to set.
     * @return the CatalogUpdate object itself.
     */
    public CatalogUpdate withAdoGit(GitCatalog adoGit) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CatalogUpdateProperties();
        }
        this.innerProperties().withAdoGit(adoGit);
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
}
