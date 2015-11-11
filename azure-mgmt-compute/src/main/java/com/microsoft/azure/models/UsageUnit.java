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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for UsageUnit.
 */
public enum UsageUnit {
    COUNT("Count");

    private String value;

    private UsageUnit(String value) {
        this.value = value;
    }

    @JsonValue
    public String toValue() {
        return this.value;
    }

    @JsonCreator
    public static UsageUnit fromValue(String value) {
        UsageUnit[] items = UsageUnit.values();
        for (UsageUnit item : items) {
            if (item.toValue().equals(value)) {
                return item;
            }
        }
        return null;
    }
}
