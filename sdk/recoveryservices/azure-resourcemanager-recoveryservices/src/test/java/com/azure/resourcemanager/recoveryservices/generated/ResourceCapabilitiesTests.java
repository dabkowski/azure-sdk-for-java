// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservices.models.CapabilitiesProperties;
import com.azure.resourcemanager.recoveryservices.models.DnsZone;
import com.azure.resourcemanager.recoveryservices.models.ResourceCapabilities;
import com.azure.resourcemanager.recoveryservices.models.VaultSubResourceType;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ResourceCapabilitiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ResourceCapabilities model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"dnsZones\":[{\"subResource\":\"AzureSiteRecovery\"},{\"subResource\":\"AzureBackup_secondary\"}]},\"type\":\"zjhcrzevdphlx\"}")
                .toObject(ResourceCapabilities.class);
        Assertions.assertEquals("zjhcrzevdphlx", model.type());
        Assertions
            .assertEquals(VaultSubResourceType.AZURE_SITE_RECOVERY, model.properties().dnsZones().get(0).subResource());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ResourceCapabilities model =
            new ResourceCapabilities()
                .withType("zjhcrzevdphlx")
                .withProperties(
                    new CapabilitiesProperties()
                        .withDnsZones(
                            Arrays
                                .asList(
                                    new DnsZone().withSubResource(VaultSubResourceType.AZURE_SITE_RECOVERY),
                                    new DnsZone().withSubResource(VaultSubResourceType.AZURE_BACKUP_SECONDARY))));
        model = BinaryData.fromObject(model).toObject(ResourceCapabilities.class);
        Assertions.assertEquals("zjhcrzevdphlx", model.type());
        Assertions
            .assertEquals(VaultSubResourceType.AZURE_SITE_RECOVERY, model.properties().dnsZones().get(0).subResource());
    }
}
