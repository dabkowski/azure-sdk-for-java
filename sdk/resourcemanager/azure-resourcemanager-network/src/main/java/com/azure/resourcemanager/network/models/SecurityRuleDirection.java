// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The direction of the rule. The direction specifies if rule will be evaluated on incoming or outgoing traffic. */
public final class SecurityRuleDirection extends ExpandableStringEnum<SecurityRuleDirection> {
    /** Static value Inbound for SecurityRuleDirection. */
    public static final SecurityRuleDirection INBOUND = fromString("Inbound");

    /** Static value Outbound for SecurityRuleDirection. */
    public static final SecurityRuleDirection OUTBOUND = fromString("Outbound");

    /**
     * Creates a new instance of SecurityRuleDirection value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public SecurityRuleDirection() {
    }

    /**
     * Creates or finds a SecurityRuleDirection from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SecurityRuleDirection.
     */
    @JsonCreator
    public static SecurityRuleDirection fromString(String name) {
        return fromString(name, SecurityRuleDirection.class);
    }

    /**
     * Gets known SecurityRuleDirection values.
     *
     * @return known SecurityRuleDirection values.
     */
    public static Collection<SecurityRuleDirection> values() {
        return values(SecurityRuleDirection.class);
    }
}
