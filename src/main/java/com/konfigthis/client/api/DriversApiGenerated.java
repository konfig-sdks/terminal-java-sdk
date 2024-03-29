/*
 * Terminal API
 * Terminal is a unified API that makes it easy to integrate with the leading telematics service providers.  Contact Support:  Name: Terminal  Email: connect@withterminal.com
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiCallback;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.Pair;
import com.konfigthis.client.ProgressRequestBody;
import com.konfigthis.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;



import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class DriversApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public DriversApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public DriversApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    private okhttp3.Call getDetailsCall(String id, String raw, String expand, String connectionToken, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/drivers/{id}"
            .replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (raw != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("raw", raw));
        }

        if (expand != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("expand", expand));
        }

        if (connectionToken != null) {
            localVarHeaderParams.put("connection-token", localVarApiClient.parameterToString(connectionToken));
        }

        final String[] localVarAccepts = {
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getDetailsValidateBeforeCall(String id, String raw, String expand, String connectionToken, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getDetails(Async)");
        }

        return getDetailsCall(id, raw, expand, connectionToken, _callback);

    }


    private ApiResponse<Void> getDetailsWithHttpInfo(String id, String raw, String expand, String connectionToken) throws ApiException {
        okhttp3.Call localVarCall = getDetailsValidateBeforeCall(id, raw, expand, connectionToken, null);
        return localVarApiClient.execute(localVarCall);
    }

    private okhttp3.Call getDetailsAsync(String id, String raw, String expand, String connectionToken, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = getDetailsValidateBeforeCall(id, raw, expand, connectionToken, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public class GetDetailsRequestBuilder {
        private final String id;
        private String raw;
        private String expand;
        private String connectionToken;

        private GetDetailsRequestBuilder(String id) {
            this.id = id;
        }

        /**
         * Set raw
         * @param raw Include raw responses used to normalize model. Used for debugging or accessing unique properties that are not unified. (optional)
         * @return GetDetailsRequestBuilder
         */
        public GetDetailsRequestBuilder raw(String raw) {
            this.raw = raw;
            return this;
        }
        
        /**
         * Set expand
         * @param expand Expand resources in the returned response (optional)
         * @return GetDetailsRequestBuilder
         */
        public GetDetailsRequestBuilder expand(String expand) {
            this.expand = expand;
            return this;
        }
        
        /**
         * Set connectionToken
         * @param connectionToken (Required) The token returned when a user authenticated their account. This authorizes access to a specific account. (optional)
         * @return GetDetailsRequestBuilder
         */
        public GetDetailsRequestBuilder connectionToken(String connectionToken) {
            this.connectionToken = connectionToken;
            return this;
        }
        
        /**
         * Build call for getDetails
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getDetailsCall(id, raw, expand, connectionToken, _callback);
        }


        /**
         * Execute getDetails request
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
         </table>
         */
        public void execute() throws ApiException {
            getDetailsWithHttpInfo(id, raw, expand, connectionToken);
        }

        /**
         * Execute getDetails request with HTTP info returned
         * @return ApiResponse&lt;Void&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
            return getDetailsWithHttpInfo(id, raw, expand, connectionToken);
        }

        /**
         * Execute getDetails request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Void> _callback) throws ApiException {
            return getDetailsAsync(id, raw, expand, connectionToken, _callback);
        }
    }

    /**
     * Get Driver
     * Get the details of a specific driver
     * @param id (Required)  (required)
     * @return GetDetailsRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public GetDetailsRequestBuilder getDetails(String id) throws IllegalArgumentException {
        if (id == null) throw new IllegalArgumentException("\"id\" is required but got null");
            

        return new GetDetailsRequestBuilder(id);
    }
    private okhttp3.Call listCall(String cursor, String limit, String modifiedAfter, String modifiedBefore, String raw, String expand, String connectionToken, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/drivers";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (cursor != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("cursor", cursor));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (modifiedAfter != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("modifiedAfter", modifiedAfter));
        }

        if (modifiedBefore != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("modifiedBefore", modifiedBefore));
        }

        if (raw != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("raw", raw));
        }

        if (expand != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("expand", expand));
        }

        if (connectionToken != null) {
            localVarHeaderParams.put("connection-token", localVarApiClient.parameterToString(connectionToken));
        }

        final String[] localVarAccepts = {
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listValidateBeforeCall(String cursor, String limit, String modifiedAfter, String modifiedBefore, String raw, String expand, String connectionToken, final ApiCallback _callback) throws ApiException {
        return listCall(cursor, limit, modifiedAfter, modifiedBefore, raw, expand, connectionToken, _callback);

    }


    private ApiResponse<Void> listWithHttpInfo(String cursor, String limit, String modifiedAfter, String modifiedBefore, String raw, String expand, String connectionToken) throws ApiException {
        okhttp3.Call localVarCall = listValidateBeforeCall(cursor, limit, modifiedAfter, modifiedBefore, raw, expand, connectionToken, null);
        return localVarApiClient.execute(localVarCall);
    }

    private okhttp3.Call listAsync(String cursor, String limit, String modifiedAfter, String modifiedBefore, String raw, String expand, String connectionToken, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = listValidateBeforeCall(cursor, limit, modifiedAfter, modifiedBefore, raw, expand, connectionToken, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public class ListRequestBuilder {
        private String cursor;
        private String limit;
        private String modifiedAfter;
        private String modifiedBefore;
        private String raw;
        private String expand;
        private String connectionToken;

        private ListRequestBuilder() {
        }

        /**
         * Set cursor
         * @param cursor Pagination cursor to start requests from (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }
        
        /**
         * Set limit
         * @param limit The maximum number of results to return in a page. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder limit(String limit) {
            this.limit = limit;
            return this;
        }
        
        /**
         * Set modifiedAfter
         * @param modifiedAfter Only include records that were last modified after a provided date. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder modifiedAfter(String modifiedAfter) {
            this.modifiedAfter = modifiedAfter;
            return this;
        }
        
        /**
         * Set modifiedBefore
         * @param modifiedBefore Only include records that were last modified before a provided date. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder modifiedBefore(String modifiedBefore) {
            this.modifiedBefore = modifiedBefore;
            return this;
        }
        
        /**
         * Set raw
         * @param raw Include raw responses used to normalize model. Used for debugging or accessing unique properties that are not unified. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder raw(String raw) {
            this.raw = raw;
            return this;
        }
        
        /**
         * Set expand
         * @param expand Expand resources in the returned response (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder expand(String expand) {
            this.expand = expand;
            return this;
        }
        
        /**
         * Set connectionToken
         * @param connectionToken (Required) The token returned when a user authenticated their account. This authorizes access to a specific account. (optional)
         * @return ListRequestBuilder
         */
        public ListRequestBuilder connectionToken(String connectionToken) {
            this.connectionToken = connectionToken;
            return this;
        }
        
        /**
         * Build call for list
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return listCall(cursor, limit, modifiedAfter, modifiedBefore, raw, expand, connectionToken, _callback);
        }


        /**
         * Execute list request
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
         </table>
         */
        public void execute() throws ApiException {
            listWithHttpInfo(cursor, limit, modifiedAfter, modifiedBefore, raw, expand, connectionToken);
        }

        /**
         * Execute list request with HTTP info returned
         * @return ApiResponse&lt;Void&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
            return listWithHttpInfo(cursor, limit, modifiedAfter, modifiedBefore, raw, expand, connectionToken);
        }

        /**
         * Execute list request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Void> _callback) throws ApiException {
            return listAsync(cursor, limit, modifiedAfter, modifiedBefore, raw, expand, connectionToken, _callback);
        }
    }

    /**
     * List Drivers
     * List all of the drivers in the connected account
     * @return ListRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ListRequestBuilder list() throws IllegalArgumentException {
        return new ListRequestBuilder();
    }
}
