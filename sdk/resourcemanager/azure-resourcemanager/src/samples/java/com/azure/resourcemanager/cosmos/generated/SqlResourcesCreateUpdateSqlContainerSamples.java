// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated;

import com.azure.resourcemanager.cosmos.models.ClientEncryptionIncludedPath;
import com.azure.resourcemanager.cosmos.models.ClientEncryptionPolicy;
import com.azure.resourcemanager.cosmos.models.ConflictResolutionMode;
import com.azure.resourcemanager.cosmos.models.ConflictResolutionPolicy;
import com.azure.resourcemanager.cosmos.models.ContainerPartitionKey;
import com.azure.resourcemanager.cosmos.models.CreateUpdateOptions;
import com.azure.resourcemanager.cosmos.models.DataType;
import com.azure.resourcemanager.cosmos.models.IncludedPath;
import com.azure.resourcemanager.cosmos.models.IndexKind;
import com.azure.resourcemanager.cosmos.models.Indexes;
import com.azure.resourcemanager.cosmos.models.IndexingMode;
import com.azure.resourcemanager.cosmos.models.IndexingPolicy;
import com.azure.resourcemanager.cosmos.models.PartitionKind;
import com.azure.resourcemanager.cosmos.models.SqlContainerCreateUpdateParameters;
import com.azure.resourcemanager.cosmos.models.SqlContainerResource;
import com.azure.resourcemanager.cosmos.models.UniqueKey;
import com.azure.resourcemanager.cosmos.models.UniqueKeyPolicy;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** Samples for SqlResources CreateUpdateSqlContainer. */
public final class SqlResourcesCreateUpdateSqlContainerSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2023-03-15/examples/CosmosDBSqlContainerCreateUpdate.json
     */
    /**
     * Sample code: CosmosDBSqlContainerCreateUpdate.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void cosmosDBSqlContainerCreateUpdate(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .cosmosDBAccounts()
            .manager()
            .serviceClient()
            .getSqlResources()
            .createUpdateSqlContainer(
                "rg1",
                "ddb1",
                "databaseName",
                "containerName",
                new SqlContainerCreateUpdateParameters()
                    .withLocation("West US")
                    .withTags(mapOf())
                    .withResource(
                        new SqlContainerResource()
                            .withId("containerName")
                            .withIndexingPolicy(
                                new IndexingPolicy()
                                    .withAutomatic(true)
                                    .withIndexingMode(IndexingMode.CONSISTENT)
                                    .withIncludedPaths(
                                        Arrays
                                            .asList(
                                                new IncludedPath()
                                                    .withPath("/*")
                                                    .withIndexes(
                                                        Arrays
                                                            .asList(
                                                                new Indexes()
                                                                    .withDataType(DataType.STRING)
                                                                    .withPrecision(-1)
                                                                    .withKind(IndexKind.RANGE),
                                                                new Indexes()
                                                                    .withDataType(DataType.NUMBER)
                                                                    .withPrecision(-1)
                                                                    .withKind(IndexKind.RANGE)))))
                                    .withExcludedPaths(Arrays.asList()))
                            .withPartitionKey(
                                new ContainerPartitionKey()
                                    .withPaths(Arrays.asList("/AccountNumber"))
                                    .withKind(PartitionKind.HASH))
                            .withDefaultTtl(100)
                            .withUniqueKeyPolicy(
                                new UniqueKeyPolicy()
                                    .withUniqueKeys(
                                        Arrays.asList(new UniqueKey().withPaths(Arrays.asList("/testPath")))))
                            .withConflictResolutionPolicy(
                                new ConflictResolutionPolicy()
                                    .withMode(ConflictResolutionMode.LAST_WRITER_WINS)
                                    .withConflictResolutionPath("/path"))
                            .withClientEncryptionPolicy(
                                new ClientEncryptionPolicy()
                                    .withIncludedPaths(
                                        Arrays
                                            .asList(
                                                new ClientEncryptionIncludedPath()
                                                    .withPath("/path")
                                                    .withClientEncryptionKeyId("fakeTokenPlaceholder")
                                                    .withEncryptionType("Deterministic")
                                                    .withEncryptionAlgorithm("AEAD_AES_256_CBC_HMAC_SHA256")))
                                    .withPolicyFormatVersion(2)))
                    .withOptions(new CreateUpdateOptions()),
                com.azure.core.util.Context.NONE);
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
