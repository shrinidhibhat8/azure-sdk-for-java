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

import com.microsoft.azure.models.PageImpl;
import com.microsoft.azure.models.VirtualMachineScaleSet;
import com.microsoft.azure.models.VirtualMachineScaleSetInstanceView;
import com.microsoft.azure.models.VirtualMachineScaleSetListResult;
import com.microsoft.azure.models.VirtualMachineScaleSetListSkusResult;
import com.microsoft.azure.models.VirtualMachineScaleSetVMInstanceIDs;
import com.microsoft.azure.models.VirtualMachineScaleSetVMInstanceRequiredIDs;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponse;
import com.squareup.okhttp.ResponseBody;
import java.io.IOException;
import java.lang.InterruptedException;
import retrofit.Call;
import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.Header;
import retrofit.http.HTTP;
import retrofit.http.Path;
import retrofit.http.POST;
import retrofit.http.PUT;
import retrofit.http.Query;
import retrofit.http.Url;

/**
 * An instance of this class provides access to all the operations defined
 * in VirtualMachineScaleSets.
 */
public interface VirtualMachineScaleSets {
    /**
     * The interface defining all the services for VirtualMachineScaleSets to be
     * used by Retrofit to perform actually REST calls.
     */
    interface VirtualMachineScaleSetsService {
        @PUT("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets/{name}")
        Call<ResponseBody> createOrUpdate(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("subscriptionId") String subscriptionId, @Body VirtualMachineScaleSet parameters, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @POST("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets/{vmScaleSetName}/deallocate")
        Call<ResponseBody> deallocate(@Path("resourceGroupName") String resourceGroupName, @Path("vmScaleSetName") String vmScaleSetName, @Path("subscriptionId") String subscriptionId, @Body VirtualMachineScaleSetVMInstanceIDs vmInstanceIDs, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @HTTP(path = "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets/{vmScaleSetName}", method = "DELETE", hasBody = true)
        Call<ResponseBody> delete(@Path("resourceGroupName") String resourceGroupName, @Path("vmScaleSetName") String vmScaleSetName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @GET("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets/{vmScaleSetName}")
        Call<ResponseBody> get(@Path("resourceGroupName") String resourceGroupName, @Path("vmScaleSetName") String vmScaleSetName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @POST("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets/{vmScaleSetName}/delete")
        Call<ResponseBody> deleteInstances(@Path("resourceGroupName") String resourceGroupName, @Path("vmScaleSetName") String vmScaleSetName, @Path("subscriptionId") String subscriptionId, @Body VirtualMachineScaleSetVMInstanceRequiredIDs vmInstanceIDs, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @GET("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets/{vmScaleSetName}/instanceView")
        Call<ResponseBody> getInstanceView(@Path("resourceGroupName") String resourceGroupName, @Path("vmScaleSetName") String vmScaleSetName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @GET("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets")
        Call<ResponseBody> list(@Path("resourceGroupName") String resourceGroupName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @GET("/subscriptions/{subscriptionId}/providers/Microsoft.Compute/virtualMachineScaleSets")
        Call<ResponseBody> listAll(@Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @GET("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets/{vmScaleSetName}/skus")
        Call<ResponseBody> listSkus(@Path("resourceGroupName") String resourceGroupName, @Path("vmScaleSetName") String vmScaleSetName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @POST("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets/{vmScaleSetName}/poweroff")
        Call<ResponseBody> powerOff(@Path("resourceGroupName") String resourceGroupName, @Path("vmScaleSetName") String vmScaleSetName, @Path("subscriptionId") String subscriptionId, @Body VirtualMachineScaleSetVMInstanceIDs vmInstanceIDs, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @POST("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets/{vmScaleSetName}/restart")
        Call<ResponseBody> restart(@Path("resourceGroupName") String resourceGroupName, @Path("vmScaleSetName") String vmScaleSetName, @Path("subscriptionId") String subscriptionId, @Body VirtualMachineScaleSetVMInstanceIDs vmInstanceIDs, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @POST("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets/{vmScaleSetName}/start")
        Call<ResponseBody> start(@Path("resourceGroupName") String resourceGroupName, @Path("vmScaleSetName") String vmScaleSetName, @Path("subscriptionId") String subscriptionId, @Body VirtualMachineScaleSetVMInstanceIDs vmInstanceIDs, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @POST("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets/{vmScaleSetName}/manualupgrade")
        Call<ResponseBody> updateInstances(@Path("resourceGroupName") String resourceGroupName, @Path("vmScaleSetName") String vmScaleSetName, @Path("subscriptionId") String subscriptionId, @Body VirtualMachineScaleSetVMInstanceRequiredIDs vmInstanceIDs, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @GET
        Call<ResponseBody> listNext(@Url String nextPageLink, @Header("accept-language") String acceptLanguage);

        @GET
        Call<ResponseBody> listAllNext(@Url String nextPageLink, @Header("accept-language") String acceptLanguage);

        @GET
        Call<ResponseBody> listSkusNext(@Url String nextPageLink, @Header("accept-language") String acceptLanguage);

    }
    /**
     * The operation to create or update a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param name Parameters supplied to the Create Virtual Machine Scale Set operation.
     * @param parameters Parameters supplied to the Create Virtual Machine Scale Set operation.
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the VirtualMachineScaleSet object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<VirtualMachineScaleSet> createOrUpdate(String resourceGroupName, String name, VirtualMachineScaleSet parameters) throws ServiceException, IOException, InterruptedException;

    /**
     * The operation to create or update a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param name Parameters supplied to the Create Virtual Machine Scale Set operation.
     * @param parameters Parameters supplied to the Create Virtual Machine Scale Set operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> createOrUpdateAsync(String resourceGroupName, String name, VirtualMachineScaleSet parameters, final ServiceCallback<VirtualMachineScaleSet> serviceCallback);

    /**
     * The operation to deallocate virtual machines in a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set.
     * @param vmInstanceIDs The list of virtual machine scale set instance IDs.
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the ServiceResponse object if successful.
     */
    ServiceResponse<Void> deallocate(String resourceGroupName, String vmScaleSetName, VirtualMachineScaleSetVMInstanceIDs vmInstanceIDs) throws ServiceException, IOException, InterruptedException;

    /**
     * The operation to deallocate virtual machines in a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set.
     * @param vmInstanceIDs The list of virtual machine scale set instance IDs.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> deallocateAsync(String resourceGroupName, String vmScaleSetName, VirtualMachineScaleSetVMInstanceIDs vmInstanceIDs, final ServiceCallback<Void> serviceCallback);

    /**
     * The operation to delete a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set.
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the ServiceResponse object if successful.
     */
    ServiceResponse<Void> delete(String resourceGroupName, String vmScaleSetName) throws ServiceException, IOException, InterruptedException;

    /**
     * The operation to delete a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> deleteAsync(String resourceGroupName, String vmScaleSetName, final ServiceCallback<Void> serviceCallback);

    /**
     * The operation to get a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set.
     * @throws ServiceException exception thrown from REST call
     * @return the VirtualMachineScaleSet object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<VirtualMachineScaleSet> get(String resourceGroupName, String vmScaleSetName) throws ServiceException;

    /**
     * The operation to get a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getAsync(String resourceGroupName, String vmScaleSetName, final ServiceCallback<VirtualMachineScaleSet> serviceCallback);

    /**
     * The operation to delete virtual machines in a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set.
     * @param vmInstanceIDs The list of virtual machine scale set instance IDs.
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the ServiceResponse object if successful.
     */
    ServiceResponse<Void> deleteInstances(String resourceGroupName, String vmScaleSetName, VirtualMachineScaleSetVMInstanceRequiredIDs vmInstanceIDs) throws ServiceException, IOException, InterruptedException;

    /**
     * The operation to delete virtual machines in a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set.
     * @param vmInstanceIDs The list of virtual machine scale set instance IDs.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> deleteInstancesAsync(String resourceGroupName, String vmScaleSetName, VirtualMachineScaleSetVMInstanceRequiredIDs vmInstanceIDs, final ServiceCallback<Void> serviceCallback);

    /**
     * The operation to get a virtual machine scale set instance view.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set.
     * @throws ServiceException exception thrown from REST call
     * @return the VirtualMachineScaleSetInstanceView object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<VirtualMachineScaleSetInstanceView> getInstanceView(String resourceGroupName, String vmScaleSetName) throws ServiceException;

    /**
     * The operation to get a virtual machine scale set instance view.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getInstanceViewAsync(String resourceGroupName, String vmScaleSetName, final ServiceCallback<VirtualMachineScaleSetInstanceView> serviceCallback);

    /**
     * The operation to list virtual machine scale sets under a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws ServiceException exception thrown from REST call
     * @return the VirtualMachineScaleSetListResult object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<VirtualMachineScaleSetListResult> list(String resourceGroupName) throws ServiceException;

    /**
     * The operation to list virtual machine scale sets under a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listAsync(String resourceGroupName, final ServiceCallback<VirtualMachineScaleSetListResult> serviceCallback);

    /**
     * Gets the list of Virtual Machine Scale Sets in the subscription. Use nextLink property in the response to get the next page of Virtual Machine Scale Sets. Do this till nextLink is not null to fetch all the Virtual Machine Scale Sets.
     *
     * @throws ServiceException exception thrown from REST call
     * @return the PageImpl&lt;VirtualMachineScaleSet&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PageImpl<VirtualMachineScaleSet>> listAll() throws ServiceException;

    /**
     * Gets the list of Virtual Machine Scale Sets in the subscription. Use nextLink property in the response to get the next page of Virtual Machine Scale Sets. Do this till nextLink is not null to fetch all the Virtual Machine Scale Sets.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listAllAsync(final ServiceCallback<PageImpl<VirtualMachineScaleSet>> serviceCallback);

    /**
     * The operation to list available skus for a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set.
     * @throws ServiceException exception thrown from REST call
     * @return the VirtualMachineScaleSetListSkusResult object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<VirtualMachineScaleSetListSkusResult> listSkus(String resourceGroupName, String vmScaleSetName) throws ServiceException;

    /**
     * The operation to list available skus for a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listSkusAsync(String resourceGroupName, String vmScaleSetName, final ServiceCallback<VirtualMachineScaleSetListSkusResult> serviceCallback);

    /**
     * The operation to power off (stop) virtual machines in a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set.
     * @param vmInstanceIDs The list of virtual machine scale set instance IDs.
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the ServiceResponse object if successful.
     */
    ServiceResponse<Void> powerOff(String resourceGroupName, String vmScaleSetName, VirtualMachineScaleSetVMInstanceIDs vmInstanceIDs) throws ServiceException, IOException, InterruptedException;

    /**
     * The operation to power off (stop) virtual machines in a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set.
     * @param vmInstanceIDs The list of virtual machine scale set instance IDs.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> powerOffAsync(String resourceGroupName, String vmScaleSetName, VirtualMachineScaleSetVMInstanceIDs vmInstanceIDs, final ServiceCallback<Void> serviceCallback);

    /**
     * The operation to restart virtual machines in a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set.
     * @param vmInstanceIDs The list of virtual machine scale set instance IDs.
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the ServiceResponse object if successful.
     */
    ServiceResponse<Void> restart(String resourceGroupName, String vmScaleSetName, VirtualMachineScaleSetVMInstanceIDs vmInstanceIDs) throws ServiceException, IOException, InterruptedException;

    /**
     * The operation to restart virtual machines in a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set.
     * @param vmInstanceIDs The list of virtual machine scale set instance IDs.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> restartAsync(String resourceGroupName, String vmScaleSetName, VirtualMachineScaleSetVMInstanceIDs vmInstanceIDs, final ServiceCallback<Void> serviceCallback);

    /**
     * The operation to start virtual machines in a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set.
     * @param vmInstanceIDs The list of virtual machine scale set instance IDs.
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the ServiceResponse object if successful.
     */
    ServiceResponse<Void> start(String resourceGroupName, String vmScaleSetName, VirtualMachineScaleSetVMInstanceIDs vmInstanceIDs) throws ServiceException, IOException, InterruptedException;

    /**
     * The operation to start virtual machines in a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set.
     * @param vmInstanceIDs The list of virtual machine scale set instance IDs.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> startAsync(String resourceGroupName, String vmScaleSetName, VirtualMachineScaleSetVMInstanceIDs vmInstanceIDs, final ServiceCallback<Void> serviceCallback);

    /**
     * The operation to manually upgrade virtual machines in a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set.
     * @param vmInstanceIDs The list of virtual machine scale set instance IDs.
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the ServiceResponse object if successful.
     */
    ServiceResponse<Void> updateInstances(String resourceGroupName, String vmScaleSetName, VirtualMachineScaleSetVMInstanceRequiredIDs vmInstanceIDs) throws ServiceException, IOException, InterruptedException;

    /**
     * The operation to manually upgrade virtual machines in a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmScaleSetName The name of the virtual machine scale set.
     * @param vmInstanceIDs The list of virtual machine scale set instance IDs.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> updateInstancesAsync(String resourceGroupName, String vmScaleSetName, VirtualMachineScaleSetVMInstanceRequiredIDs vmInstanceIDs, final ServiceCallback<Void> serviceCallback);

    /**
     * The operation to list virtual machine scale sets under a resource group.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws ServiceException exception thrown from REST call
     * @return the VirtualMachineScaleSetListResult object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<VirtualMachineScaleSetListResult> listNext(String nextPageLink) throws ServiceException;

    /**
     * The operation to list virtual machine scale sets under a resource group.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listNextAsync(String nextPageLink, final ServiceCallback<VirtualMachineScaleSetListResult> serviceCallback);

    /**
     * Gets the list of Virtual Machine Scale Sets in the subscription. Use nextLink property in the response to get the next page of Virtual Machine Scale Sets. Do this till nextLink is not null to fetch all the Virtual Machine Scale Sets.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws ServiceException exception thrown from REST call
     * @return the PageImpl&lt;VirtualMachineScaleSet&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PageImpl<VirtualMachineScaleSet>> listAllNext(String nextPageLink) throws ServiceException;

    /**
     * Gets the list of Virtual Machine Scale Sets in the subscription. Use nextLink property in the response to get the next page of Virtual Machine Scale Sets. Do this till nextLink is not null to fetch all the Virtual Machine Scale Sets.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listAllNextAsync(String nextPageLink, final ServiceCallback<PageImpl<VirtualMachineScaleSet>> serviceCallback);

    /**
     * The operation to list available skus for a virtual machine scale set.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws ServiceException exception thrown from REST call
     * @return the VirtualMachineScaleSetListSkusResult object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<VirtualMachineScaleSetListSkusResult> listSkusNext(String nextPageLink) throws ServiceException;

    /**
     * The operation to list available skus for a virtual machine scale set.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listSkusNextAsync(String nextPageLink, final ServiceCallback<VirtualMachineScaleSetListSkusResult> serviceCallback);

}
