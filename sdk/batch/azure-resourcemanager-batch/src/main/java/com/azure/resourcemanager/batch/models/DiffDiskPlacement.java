// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Specifies the ephemeral disk placement for operating system disk for all VMs in the pool.
 *
 * <p>This property can be used by user in the request to choose which location the operating system should be in. e.g.,
 * cache disk space for Ephemeral OS disk provisioning. For more information on Ephemeral OS disk size requirements,
 * please refer to Ephemeral OS disk size requirements for Windows VMs at
 * https://docs.microsoft.com/en-us/azure/virtual-machines/windows/ephemeral-os-disks#size-requirements and Linux VMs at
 * https://docs.microsoft.com/en-us/azure/virtual-machines/linux/ephemeral-os-disks#size-requirements.
 */
public enum DiffDiskPlacement {
    /** Enum value CacheDisk. */
    CACHE_DISK("CacheDisk");

    /** The actual serialized value for a DiffDiskPlacement instance. */
    private final String value;

    DiffDiskPlacement(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a DiffDiskPlacement instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed DiffDiskPlacement object, or null if unable to parse.
     */
    @JsonCreator
    public static DiffDiskPlacement fromString(String value) {
        if (value == null) {
            return null;
        }
        DiffDiskPlacement[] items = DiffDiskPlacement.values();
        for (DiffDiskPlacement item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    /** {@inheritDoc} */
    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
