// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts;

import com.azure.analytics.synapse.artifacts.implementation.IntegrationRuntimesImpl;
import com.azure.analytics.synapse.artifacts.models.ErrorContractException;
import com.azure.analytics.synapse.artifacts.models.IntegrationRuntimeListResponse;
import com.azure.analytics.synapse.artifacts.models.IntegrationRuntimeResource;
import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the asynchronous ArtifactsClient type. */
@ServiceClient(builder = ArtifactsClientBuilder.class, isAsync = true)
public final class IntegrationRuntimesAsyncClient {
    @Generated private final IntegrationRuntimesImpl serviceClient;

    /**
     * Initializes an instance of IntegrationRuntimesAsyncClient class.
     *
     * @param serviceClient the service client implementation.
     */
    @Generated
    IntegrationRuntimesAsyncClient(IntegrationRuntimesImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * List Integration Runtimes.
     *
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of integration runtime resources along with {@link Response} on successful completion of {@link
     *     Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<IntegrationRuntimeListResponse>> listWithResponse() {
        return this.serviceClient.listWithResponseAsync();
    }

    /**
     * List Integration Runtimes.
     *
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of integration runtime resources on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<IntegrationRuntimeListResponse> list() {
        return this.serviceClient.listAsync();
    }

    /**
     * Get Integration Runtime.
     *
     * @param integrationRuntimeName The Integration Runtime name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return integration Runtime along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<IntegrationRuntimeResource>> getWithResponse(String integrationRuntimeName) {
        return this.serviceClient.getWithResponseAsync(integrationRuntimeName);
    }

    /**
     * Get Integration Runtime.
     *
     * @param integrationRuntimeName The Integration Runtime name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return integration Runtime on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<IntegrationRuntimeResource> get(String integrationRuntimeName) {
        return this.serviceClient.getAsync(integrationRuntimeName);
    }
}
