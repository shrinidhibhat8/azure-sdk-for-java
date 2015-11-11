/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.13.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.BaseResource;

/**
 * Capture Virtual Machine parameters.
 */
public class VirtualMachineCaptureParameters {
    /**
     * Gets or sets the captured VirtualHardDisk's name prefix.
     */
    @JsonProperty(required = true)
    private String vhdPrefix;

    /**
     * Gets or sets the destination container name.
     */
    @JsonProperty(required = true)
    private String destinationContainerName;

    /**
     * Gets or sets whether it overwrites destination VirtualHardDisk if true,
     * in case of conflict.
     */
    @JsonProperty(required = true)
    private boolean overwriteVhds;

    /**
     * Get the vhdPrefix value.
     *
     * @return the vhdPrefix value
     */ 
    public String getVhdPrefix() {
        return this.vhdPrefix;
    }

    /**
     * Set the vhdPrefix value.
     *
     * @param vhdPrefix the vhdPrefix value to set
     */
    public void setVhdPrefix(String vhdPrefix) {
        this.vhdPrefix = vhdPrefix;
    }

    /**
     * Get the destinationContainerName value.
     *
     * @return the destinationContainerName value
     */ 
    public String getDestinationContainerName() {
        return this.destinationContainerName;
    }

    /**
     * Set the destinationContainerName value.
     *
     * @param destinationContainerName the destinationContainerName value to set
     */
    public void setDestinationContainerName(String destinationContainerName) {
        this.destinationContainerName = destinationContainerName;
    }

    /**
     * Get the overwriteVhds value.
     *
     * @return the overwriteVhds value
     */ 
    public boolean getOverwriteVhds() {
        return this.overwriteVhds;
    }

    /**
     * Set the overwriteVhds value.
     *
     * @param overwriteVhds the overwriteVhds value to set
     */
    public void setOverwriteVhds(boolean overwriteVhds) {
        this.overwriteVhds = overwriteVhds;
    }

}
