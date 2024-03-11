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


import com.konfigthis.client.model.DataManagementMakePassthroughRequestRequest;
import com.konfigthis.client.model.DataManagementRequestSyncManualRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class DataManagementApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public DataManagementApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public DataManagementApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call getSyncStatusCall(String id, String expand, String connectionToken, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/syncs/{id}"
            .replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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
    private okhttp3.Call getSyncStatusValidateBeforeCall(String id, String expand, String connectionToken, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getSyncStatus(Async)");
        }

        return getSyncStatusCall(id, expand, connectionToken, _callback);

    }


    private ApiResponse<Void> getSyncStatusWithHttpInfo(String id, String expand, String connectionToken) throws ApiException {
        okhttp3.Call localVarCall = getSyncStatusValidateBeforeCall(id, expand, connectionToken, null);
        return localVarApiClient.execute(localVarCall);
    }

    private okhttp3.Call getSyncStatusAsync(String id, String expand, String connectionToken, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = getSyncStatusValidateBeforeCall(id, expand, connectionToken, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public class GetSyncStatusRequestBuilder {
        private final String id;
        private String expand;
        private String connectionToken;

        private GetSyncStatusRequestBuilder(String id) {
            this.id = id;
        }

        /**
         * Set expand
         * @param expand Expand related resources in the response to reduce requests. (optional)
         * @return GetSyncStatusRequestBuilder
         */
        public GetSyncStatusRequestBuilder expand(String expand) {
            this.expand = expand;
            return this;
        }
        
        /**
         * Set connectionToken
         * @param connectionToken (Required) The token returned when a user authenticated their account. This authorizes access to a specific account. (optional)
         * @return GetSyncStatusRequestBuilder
         */
        public GetSyncStatusRequestBuilder connectionToken(String connectionToken) {
            this.connectionToken = connectionToken;
            return this;
        }
        
        /**
         * Build call for getSyncStatus
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
            return getSyncStatusCall(id, expand, connectionToken, _callback);
        }


        /**
         * Execute getSyncStatus request
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
         </table>
         */
        public void execute() throws ApiException {
            getSyncStatusWithHttpInfo(id, expand, connectionToken);
        }

        /**
         * Execute getSyncStatus request with HTTP info returned
         * @return ApiResponse&lt;Void&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
            return getSyncStatusWithHttpInfo(id, expand, connectionToken);
        }

        /**
         * Execute getSyncStatus request (asynchronously)
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
            return getSyncStatusAsync(id, expand, connectionToken, _callback);
        }
    }

    /**
     * Get Sync Job Status
     * Get the status of a sync job by ID.
     * @param id (Required)  (required)
     * @return GetSyncStatusRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public GetSyncStatusRequestBuilder getSyncStatus(String id) throws IllegalArgumentException {
        if (id == null) throw new IllegalArgumentException("\"id\" is required but got null");
            

        return new GetSyncStatusRequestBuilder(id);
    }
    private okhttp3.Call listSyncHistoryCall(String limit, String cursor, String status, String expand, String connectionToken, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/syncs";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (cursor != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("cursor", cursor));
        }

        if (status != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("status", status));
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
    private okhttp3.Call listSyncHistoryValidateBeforeCall(String limit, String cursor, String status, String expand, String connectionToken, final ApiCallback _callback) throws ApiException {
        return listSyncHistoryCall(limit, cursor, status, expand, connectionToken, _callback);

    }


    private ApiResponse<Void> listSyncHistoryWithHttpInfo(String limit, String cursor, String status, String expand, String connectionToken) throws ApiException {
        okhttp3.Call localVarCall = listSyncHistoryValidateBeforeCall(limit, cursor, status, expand, connectionToken, null);
        return localVarApiClient.execute(localVarCall);
    }

    private okhttp3.Call listSyncHistoryAsync(String limit, String cursor, String status, String expand, String connectionToken, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = listSyncHistoryValidateBeforeCall(limit, cursor, status, expand, connectionToken, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public class ListSyncHistoryRequestBuilder {
        private String limit;
        private String cursor;
        private String status;
        private String expand;
        private String connectionToken;

        private ListSyncHistoryRequestBuilder() {
        }

        /**
         * Set limit
         * @param limit The maximum number of results to return in a page. (optional)
         * @return ListSyncHistoryRequestBuilder
         */
        public ListSyncHistoryRequestBuilder limit(String limit) {
            this.limit = limit;
            return this;
        }
        
        /**
         * Set cursor
         * @param cursor Pagination cursor to start requests from (optional)
         * @return ListSyncHistoryRequestBuilder
         */
        public ListSyncHistoryRequestBuilder cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }
        
        /**
         * Set status
         * @param status  (optional)
         * @return ListSyncHistoryRequestBuilder
         */
        public ListSyncHistoryRequestBuilder status(String status) {
            this.status = status;
            return this;
        }
        
        /**
         * Set expand
         * @param expand Expand related resources in the response to reduce requests. (optional)
         * @return ListSyncHistoryRequestBuilder
         */
        public ListSyncHistoryRequestBuilder expand(String expand) {
            this.expand = expand;
            return this;
        }
        
        /**
         * Set connectionToken
         * @param connectionToken (Required) The token returned when a user authenticated their account. This authorizes access to a specific account. (optional)
         * @return ListSyncHistoryRequestBuilder
         */
        public ListSyncHistoryRequestBuilder connectionToken(String connectionToken) {
            this.connectionToken = connectionToken;
            return this;
        }
        
        /**
         * Build call for listSyncHistory
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
            return listSyncHistoryCall(limit, cursor, status, expand, connectionToken, _callback);
        }


        /**
         * Execute listSyncHistory request
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
         </table>
         */
        public void execute() throws ApiException {
            listSyncHistoryWithHttpInfo(limit, cursor, status, expand, connectionToken);
        }

        /**
         * Execute listSyncHistory request with HTTP info returned
         * @return ApiResponse&lt;Void&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
            return listSyncHistoryWithHttpInfo(limit, cursor, status, expand, connectionToken);
        }

        /**
         * Execute listSyncHistory request (asynchronously)
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
            return listSyncHistoryAsync(limit, cursor, status, expand, connectionToken, _callback);
        }
    }

    /**
     * List Sync History
     * List a log of all batch sync jobs for the current connection.
     * @return ListSyncHistoryRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ListSyncHistoryRequestBuilder listSyncHistory() throws IllegalArgumentException {
        return new ListSyncHistoryRequestBuilder();
    }
    private okhttp3.Call makePassthroughRequestCall(String connectionToken, DataManagementMakePassthroughRequestRequest dataManagementMakePassthroughRequestRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = dataManagementMakePassthroughRequestRequest;

        // create path and map variables
        String localVarPath = "/passthrough";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call makePassthroughRequestValidateBeforeCall(String connectionToken, DataManagementMakePassthroughRequestRequest dataManagementMakePassthroughRequestRequest, final ApiCallback _callback) throws ApiException {
        return makePassthroughRequestCall(connectionToken, dataManagementMakePassthroughRequestRequest, _callback);

    }


    private ApiResponse<Void> makePassthroughRequestWithHttpInfo(String connectionToken, DataManagementMakePassthroughRequestRequest dataManagementMakePassthroughRequestRequest) throws ApiException {
        okhttp3.Call localVarCall = makePassthroughRequestValidateBeforeCall(connectionToken, dataManagementMakePassthroughRequestRequest, null);
        return localVarApiClient.execute(localVarCall);
    }

    private okhttp3.Call makePassthroughRequestAsync(String connectionToken, DataManagementMakePassthroughRequestRequest dataManagementMakePassthroughRequestRequest, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = makePassthroughRequestValidateBeforeCall(connectionToken, dataManagementMakePassthroughRequestRequest, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public class MakePassthroughRequestRequestBuilder {
        private String body;
        private Object headers;
        private String method;
        private String path;
        private String connectionToken;

        private MakePassthroughRequestRequestBuilder() {
        }

        /**
         * Set body
         * @param body  (optional)
         * @return MakePassthroughRequestRequestBuilder
         */
        public MakePassthroughRequestRequestBuilder body(String body) {
            this.body = body;
            return this;
        }
        
        /**
         * Set headers
         * @param headers  (optional)
         * @return MakePassthroughRequestRequestBuilder
         */
        public MakePassthroughRequestRequestBuilder headers(Object headers) {
            this.headers = headers;
            return this;
        }
        
        /**
         * Set method
         * @param method  (optional)
         * @return MakePassthroughRequestRequestBuilder
         */
        public MakePassthroughRequestRequestBuilder method(String method) {
            this.method = method;
            return this;
        }
        
        /**
         * Set path
         * @param path  (optional)
         * @return MakePassthroughRequestRequestBuilder
         */
        public MakePassthroughRequestRequestBuilder path(String path) {
            this.path = path;
            return this;
        }
        
        /**
         * Set connectionToken
         * @param connectionToken (Required) The token returned when a user authenticated their account. This authorizes access to a specific account. (optional)
         * @return MakePassthroughRequestRequestBuilder
         */
        public MakePassthroughRequestRequestBuilder connectionToken(String connectionToken) {
            this.connectionToken = connectionToken;
            return this;
        }
        
        /**
         * Build call for makePassthroughRequest
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
            DataManagementMakePassthroughRequestRequest dataManagementMakePassthroughRequestRequest = buildBodyParams();
            return makePassthroughRequestCall(connectionToken, dataManagementMakePassthroughRequestRequest, _callback);
        }

        private DataManagementMakePassthroughRequestRequest buildBodyParams() {
            DataManagementMakePassthroughRequestRequest dataManagementMakePassthroughRequestRequest = new DataManagementMakePassthroughRequestRequest();
            dataManagementMakePassthroughRequestRequest.body(this.body);
            dataManagementMakePassthroughRequestRequest.headers(this.headers);
            dataManagementMakePassthroughRequestRequest.method(this.method);
            dataManagementMakePassthroughRequestRequest.path(this.path);
            return dataManagementMakePassthroughRequestRequest;
        }

        /**
         * Execute makePassthroughRequest request
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
         </table>
         */
        public void execute() throws ApiException {
            DataManagementMakePassthroughRequestRequest dataManagementMakePassthroughRequestRequest = buildBodyParams();
            makePassthroughRequestWithHttpInfo(connectionToken, dataManagementMakePassthroughRequestRequest);
        }

        /**
         * Execute makePassthroughRequest request with HTTP info returned
         * @return ApiResponse&lt;Void&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
            DataManagementMakePassthroughRequestRequest dataManagementMakePassthroughRequestRequest = buildBodyParams();
            return makePassthroughRequestWithHttpInfo(connectionToken, dataManagementMakePassthroughRequestRequest);
        }

        /**
         * Execute makePassthroughRequest request (asynchronously)
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
            DataManagementMakePassthroughRequestRequest dataManagementMakePassthroughRequestRequest = buildBodyParams();
            return makePassthroughRequestAsync(connectionToken, dataManagementMakePassthroughRequestRequest, _callback);
        }
    }

    /**
     * Passthrough
     * Make an authenticated request to the underlying telematics provider.   This endpoint helps ensure that you are never limited by Terminal. You can use passthrough requests to access capabilities that may be limited to a specific TSP or not yet in the normalized model.  Our team is here an ready to support custom use cases that may need &#x60;/passthrough&#x60;
     * @return MakePassthroughRequestRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public MakePassthroughRequestRequestBuilder makePassthroughRequest() throws IllegalArgumentException {
        return new MakePassthroughRequestRequestBuilder();
    }
    private okhttp3.Call requestSyncManualCall(String connectionToken, DataManagementRequestSyncManualRequest dataManagementRequestSyncManualRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = dataManagementRequestSyncManualRequest;

        // create path and map variables
        String localVarPath = "/syncs";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call requestSyncManualValidateBeforeCall(String connectionToken, DataManagementRequestSyncManualRequest dataManagementRequestSyncManualRequest, final ApiCallback _callback) throws ApiException {
        return requestSyncManualCall(connectionToken, dataManagementRequestSyncManualRequest, _callback);

    }


    private ApiResponse<Void> requestSyncManualWithHttpInfo(String connectionToken, DataManagementRequestSyncManualRequest dataManagementRequestSyncManualRequest) throws ApiException {
        okhttp3.Call localVarCall = requestSyncManualValidateBeforeCall(connectionToken, dataManagementRequestSyncManualRequest, null);
        return localVarApiClient.execute(localVarCall);
    }

    private okhttp3.Call requestSyncManualAsync(String connectionToken, DataManagementRequestSyncManualRequest dataManagementRequestSyncManualRequest, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = requestSyncManualValidateBeforeCall(connectionToken, dataManagementRequestSyncManualRequest, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public class RequestSyncManualRequestBuilder {
        private Double days;
        private String connectionToken;

        private RequestSyncManualRequestBuilder() {
        }

        /**
         * Set days
         * @param days  (optional)
         * @return RequestSyncManualRequestBuilder
         */
        public RequestSyncManualRequestBuilder days(Double days) {
            this.days = days;
            return this;
        }
        
        /**
         * Set connectionToken
         * @param connectionToken (Required) The token returned when a user authenticated their account. This authorizes access to a specific account. (optional)
         * @return RequestSyncManualRequestBuilder
         */
        public RequestSyncManualRequestBuilder connectionToken(String connectionToken) {
            this.connectionToken = connectionToken;
            return this;
        }
        
        /**
         * Build call for requestSyncManual
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
            DataManagementRequestSyncManualRequest dataManagementRequestSyncManualRequest = buildBodyParams();
            return requestSyncManualCall(connectionToken, dataManagementRequestSyncManualRequest, _callback);
        }

        private DataManagementRequestSyncManualRequest buildBodyParams() {
            DataManagementRequestSyncManualRequest dataManagementRequestSyncManualRequest = new DataManagementRequestSyncManualRequest();
            dataManagementRequestSyncManualRequest.days(this.days);
            return dataManagementRequestSyncManualRequest;
        }

        /**
         * Execute requestSyncManual request
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
         </table>
         */
        public void execute() throws ApiException {
            DataManagementRequestSyncManualRequest dataManagementRequestSyncManualRequest = buildBodyParams();
            requestSyncManualWithHttpInfo(connectionToken, dataManagementRequestSyncManualRequest);
        }

        /**
         * Execute requestSyncManual request with HTTP info returned
         * @return ApiResponse&lt;Void&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
            DataManagementRequestSyncManualRequest dataManagementRequestSyncManualRequest = buildBodyParams();
            return requestSyncManualWithHttpInfo(connectionToken, dataManagementRequestSyncManualRequest);
        }

        /**
         * Execute requestSyncManual request (asynchronously)
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
            DataManagementRequestSyncManualRequest dataManagementRequestSyncManualRequest = buildBodyParams();
            return requestSyncManualAsync(connectionToken, dataManagementRequestSyncManualRequest, _callback);
        }
    }

    /**
     * Request Sync
     * Manually request to sync the current connections data.  By default, Terminal will sync all connections where &#x60;syncMode &#x3D; automatic&#x60; on a regular cadence. For customers that may not need a fleet&#39;s data to be kept up to date and want to reduce their active tracked trucks, you can set &#x60;syncMode &#x3D; manual&#x60; and invoke this endpoint when you want to sync data.  If you&#39;re wondering if this is relevent to your use case then feel free to reach out and we&#39;d be happy to assist.
     * @return RequestSyncManualRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public RequestSyncManualRequestBuilder requestSyncManual() throws IllegalArgumentException {
        return new RequestSyncManualRequestBuilder();
    }
}