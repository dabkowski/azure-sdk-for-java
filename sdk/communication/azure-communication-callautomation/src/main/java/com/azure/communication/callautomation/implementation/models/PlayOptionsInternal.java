// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callautomation.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The PlayOptionsInternal model. */
@Fluent
public final class PlayOptionsInternal {
    /*
     * The option to play the provided audio source in loop when set to true
     */
    @JsonProperty(value = "loop", required = true)
    private boolean loop;

    /** Creates an instance of PlayOptionsInternal class. */
    public PlayOptionsInternal() {}

    /**
     * Get the loop property: The option to play the provided audio source in loop when set to true.
     *
     * @return the loop value.
     */
    public boolean isLoop() {
        return this.loop;
    }

    /**
     * Set the loop property: The option to play the provided audio source in loop when set to true.
     *
     * @param loop the loop value to set.
     * @return the PlayOptionsInternal object itself.
     */
    public PlayOptionsInternal setLoop(boolean loop) {
        this.loop = loop;
        return this;
    }
}
