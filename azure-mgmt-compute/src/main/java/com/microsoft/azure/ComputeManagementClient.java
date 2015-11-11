/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.13.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure;

import com.microsoft.rest.AzureClient;
import com.microsoft.rest.credentials.ServiceClientCredentials;
import com.squareup.okhttp.Interceptor;
import java.util.List;

/**
 * The interface for ComputeManagementClient class.
 */
public interface ComputeManagementClient {
    /**
     * Gets the URI used as the base for all cloud service requests.
     * @return The BaseUri value.
     */
    String getBaseUri();

    /**
     * Gets the list of interceptors the OkHttp client will execute.
     * @return the list of interceptors.
     */
    List<Interceptor> getClientInterceptors();

    /**
     * Gets the {@link AzureClient} used for long running operations.
     * @return the azure client;
     */
    AzureClient getAzureClient();

    /**
     * Gets The management credentials for Azure..
     *
     * @return the credentials value.
     */
    ServiceClientCredentials getCredentials();

    /**
     * Gets Gets subscription credentials which uniquely identify Microsoft Azure subscription. The subscription ID forms part of the URI for every service call..
     *
     * @return the subscriptionId value.
     */
    String getSubscriptionId();

    /**
     * Sets Gets subscription credentials which uniquely identify Microsoft Azure subscription. The subscription ID forms part of the URI for every service call..
     *
     * @param subscriptionId the subscriptionId value.
     */
    void setSubscriptionId(String subscriptionId);

    /**
     * Gets Client Api Version..
     *
     * @return the apiVersion value.
     */
    String getApiVersion();

    /**
     * Gets Gets or sets the preferred language for the response..
     *
     * @return the acceptLanguage value.
     */
    String getAcceptLanguage();

    /**
     * Sets Gets or sets the preferred language for the response..
     *
     * @param acceptLanguage the acceptLanguage value.
     */
    void setAcceptLanguage(String acceptLanguage);

    /**
     * Gets The retry timeout for Long Running Operations..
     *
     * @return the longRunningOperationRetryTimeout value.
     */
    int getLongRunningOperationRetryTimeout();

    /**
     * Sets The retry timeout for Long Running Operations..
     *
     * @param longRunningOperationRetryTimeout the longRunningOperationRetryTimeout value.
     */
    void setLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout);

    /**
     * Gets the AvailabilitySets object to access its operations.
     * @return the availabilitySets value.
     */
    AvailabilitySets getAvailabilitySets();

    /**
     * Gets the VirtualMachineExtensionImages object to access its operations.
     * @return the virtualMachineExtensionImages value.
     */
    VirtualMachineExtensionImages getVirtualMachineExtensionImages();

    /**
     * Gets the VirtualMachineExtensions object to access its operations.
     * @return the virtualMachineExtensions value.
     */
    VirtualMachineExtensions getVirtualMachineExtensions();

    /**
     * Gets the VirtualMachineImages object to access its operations.
     * @return the virtualMachineImages value.
     */
    VirtualMachineImages getVirtualMachineImages();

    /**
     * Gets the Usage object to access its operations.
     * @return the usage value.
     */
    Usage getUsage();

    /**
     * Gets the VirtualMachineSizes object to access its operations.
     * @return the virtualMachineSizes value.
     */
    VirtualMachineSizes getVirtualMachineSizes();

    /**
     * Gets the VirtualMachines object to access its operations.
     * @return the virtualMachines value.
     */
    VirtualMachines getVirtualMachines();

    /**
     * Gets the VirtualMachineScaleSets object to access its operations.
     * @return the virtualMachineScaleSets value.
     */
    VirtualMachineScaleSets getVirtualMachineScaleSets();

    /**
     * Gets the VirtualMachineScaleSetVMs object to access its operations.
     * @return the virtualMachineScaleSetVMs value.
     */
    VirtualMachineScaleSetVMs getVirtualMachineScaleSetVMs();

}
