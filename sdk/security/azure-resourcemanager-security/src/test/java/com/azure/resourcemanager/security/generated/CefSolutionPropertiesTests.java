// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.CefSolutionProperties;
import com.azure.resourcemanager.security.models.ConnectedWorkspace;
import org.junit.jupiter.api.Assertions;

public final class CefSolutionPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CefSolutionProperties model =
            BinaryData
                .fromString(
                    "{\"hostname\":\"ijjj\",\"agent\":\"va\",\"lastEventReceived\":\"a\",\"deviceVendor\":\"knxkvccxetyvkunm\",\"deviceType\":\"nohikkgq\",\"workspace\":{\"id\":\"wpin\"},\"\":{\"hmedeilbjywfcfxz\":\"datavabbx\",\"vjslczwcii\":\"datarzzihvwypus\",\"vxadqacfrgnawbab\":\"datajsllfryvd\",\"yq\":\"datafbktyjmfczlf\"}}")
                .toObject(CefSolutionProperties.class);
        Assertions.assertEquals("knxkvccxetyvkunm", model.deviceVendor());
        Assertions.assertEquals("nohikkgq", model.deviceType());
        Assertions.assertEquals("wpin", model.workspace().id());
        Assertions.assertEquals("ijjj", model.hostname());
        Assertions.assertEquals("va", model.agent());
        Assertions.assertEquals("a", model.lastEventReceived());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CefSolutionProperties model =
            new CefSolutionProperties()
                .withDeviceVendor("knxkvccxetyvkunm")
                .withDeviceType("nohikkgq")
                .withWorkspace(new ConnectedWorkspace().withId("wpin"))
                .withHostname("ijjj")
                .withAgent("va")
                .withLastEventReceived("a");
        model = BinaryData.fromObject(model).toObject(CefSolutionProperties.class);
        Assertions.assertEquals("knxkvccxetyvkunm", model.deviceVendor());
        Assertions.assertEquals("nohikkgq", model.deviceType());
        Assertions.assertEquals("wpin", model.workspace().id());
        Assertions.assertEquals("ijjj", model.hostname());
        Assertions.assertEquals("va", model.agent());
        Assertions.assertEquals("a", model.lastEventReceived());
    }
}
