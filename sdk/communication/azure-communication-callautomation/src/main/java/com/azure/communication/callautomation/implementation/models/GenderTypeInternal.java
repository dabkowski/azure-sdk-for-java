// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callautomation.implementation.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Voice gender type. */
public final class GenderTypeInternal extends ExpandableStringEnum<GenderTypeInternal> {
    /** Static value male for GenderTypeInternal. */
    public static final GenderTypeInternal MALE = fromString("male");

    /** Static value female for GenderTypeInternal. */
    public static final GenderTypeInternal FEMALE = fromString("female");

    /**
     * Creates a new instance of GenderTypeInternal value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public GenderTypeInternal() {}

    /**
     * Creates or finds a GenderTypeInternal from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding GenderTypeInternal.
     */
    @JsonCreator
    public static GenderTypeInternal fromString(String name) {
        return fromString(name, GenderTypeInternal.class);
    }

    /**
     * Gets known GenderTypeInternal values.
     *
     * @return known GenderTypeInternal values.
     */
    public static Collection<GenderTypeInternal> values() {
        return values(GenderTypeInternal.class);
    }
}
