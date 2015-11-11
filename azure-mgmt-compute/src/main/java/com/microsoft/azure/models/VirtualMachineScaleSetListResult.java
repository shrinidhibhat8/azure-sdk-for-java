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

import java.util.List;
import com.microsoft.rest.BaseResource;

/**
 * The List Virtual Machine operation response.
 */
public class VirtualMachineScaleSetListResult {
    /**
     * Gets or sets the list of virtual machine scale sets.
     */
    private List<VirtualMachineScaleSet> value;

    /**
     * Get the value value.
     *
     * @return the value value
     */ 
    public List<VirtualMachineScaleSet> getValue() {
        return this.value;
    }

    /**
     * Set the value value.
     *
     * @param value the value value to set
     */
    public void setValue(List<VirtualMachineScaleSet> value) {
        this.value = value;
    }

}
