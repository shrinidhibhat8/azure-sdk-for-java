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

import com.microsoft.rest.BaseResource;

/**
 * Describes the uri of a disk.
 */
public class VirtualHardDisk {
    /**
     * Gets or sets the virtual hard disk's uri. It should be a valid Uri to a
     * virtual hard disk.
     */
    private String uri;

    /**
     * Get the uri value.
     *
     * @return the uri value
     */ 
    public String getUri() {
        return this.uri;
    }

    /**
     * Set the uri value.
     *
     * @param uri the uri value to set
     */
    public void setUri(String uri) {
        this.uri = uri;
    }

}
