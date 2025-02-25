// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.RestoreRequest;
import com.azure.resourcemanager.recoveryservicesbackup.models.RestoreRequestResource;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class RestoreRequestResourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RestoreRequestResource model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"objectType\":\"RestoreRequest\"},\"eTag\":\"qzrnkcqvyxlwhz\",\"location\":\"sicohoqqnwvlry\",\"tags\":{\"konocu\":\"hheunmmqhgyx\"},\"id\":\"oklyaxuconuq\",\"name\":\"zf\",\"type\":\"beypewrmjmw\"}")
                .toObject(RestoreRequestResource.class);
        Assertions.assertEquals("sicohoqqnwvlry", model.location());
        Assertions.assertEquals("hheunmmqhgyx", model.tags().get("konocu"));
        Assertions.assertEquals("qzrnkcqvyxlwhz", model.etag());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RestoreRequestResource model =
            new RestoreRequestResource()
                .withLocation("sicohoqqnwvlry")
                .withTags(mapOf("konocu", "hheunmmqhgyx"))
                .withProperties(new RestoreRequest())
                .withEtag("qzrnkcqvyxlwhz");
        model = BinaryData.fromObject(model).toObject(RestoreRequestResource.class);
        Assertions.assertEquals("sicohoqqnwvlry", model.location());
        Assertions.assertEquals("hheunmmqhgyx", model.tags().get("konocu"));
        Assertions.assertEquals("qzrnkcqvyxlwhz", model.etag());
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
