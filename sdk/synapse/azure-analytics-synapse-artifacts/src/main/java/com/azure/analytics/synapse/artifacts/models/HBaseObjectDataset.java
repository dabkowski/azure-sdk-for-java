// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** HBase server dataset. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("HBaseObject")
@JsonFlatten
@Fluent
public class HBaseObjectDataset extends Dataset {
    /*
     * The table name. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.tableName")
    private Object tableName;

    /** Creates an instance of HBaseObjectDataset class. */
    public HBaseObjectDataset() {}

    /**
     * Get the tableName property: The table name. Type: string (or Expression with resultType string).
     *
     * @return the tableName value.
     */
    public Object getTableName() {
        return this.tableName;
    }

    /**
     * Set the tableName property: The table name. Type: string (or Expression with resultType string).
     *
     * @param tableName the tableName value to set.
     * @return the HBaseObjectDataset object itself.
     */
    public HBaseObjectDataset setTableName(Object tableName) {
        this.tableName = tableName;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public HBaseObjectDataset setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public HBaseObjectDataset setStructure(Object structure) {
        super.setStructure(structure);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public HBaseObjectDataset setSchema(Object schema) {
        super.setSchema(schema);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public HBaseObjectDataset setLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.setLinkedServiceName(linkedServiceName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public HBaseObjectDataset setParameters(Map<String, ParameterSpecification> parameters) {
        super.setParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public HBaseObjectDataset setAnnotations(List<Object> annotations) {
        super.setAnnotations(annotations);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public HBaseObjectDataset setFolder(DatasetFolder folder) {
        super.setFolder(folder);
        return this;
    }
}
