// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ExtractiveSummarizationResult model. */
@Fluent
public final class ExtractiveSummarizationResult extends PreBuiltResult {
    /*
     * Response by document
     */
    @JsonProperty(value = "documents", required = true)
    private List<ExtractedSummaryDocumentResultWithDetectedLanguage> documents;

    /** Creates an instance of ExtractiveSummarizationResult class. */
    public ExtractiveSummarizationResult() {}

    /**
     * Get the documents property: Response by document.
     *
     * @return the documents value.
     */
    public List<ExtractedSummaryDocumentResultWithDetectedLanguage> getDocuments() {
        return this.documents;
    }

    /**
     * Set the documents property: Response by document.
     *
     * @param documents the documents value to set.
     * @return the ExtractiveSummarizationResult object itself.
     */
    public ExtractiveSummarizationResult setDocuments(
            List<ExtractedSummaryDocumentResultWithDetectedLanguage> documents) {
        this.documents = documents;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ExtractiveSummarizationResult setErrors(List<InputError> errors) {
        super.setErrors(errors);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ExtractiveSummarizationResult setStatistics(RequestStatistics statistics) {
        super.setStatistics(statistics);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ExtractiveSummarizationResult setModelVersion(String modelVersion) {
        super.setModelVersion(modelVersion);
        return this;
    }
}
