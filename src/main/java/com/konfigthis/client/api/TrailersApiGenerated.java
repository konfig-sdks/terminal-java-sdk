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

public class TrailersApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public TrailersApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public TrailersApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call getAllTrailersCall(String limit, String cursor, String expand, String raw, String modifiedAfter, String modifiedBefore, String connectionToken, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/trailers";

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

        if (expand != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("expand", expand));
        }

        if (raw != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("raw", raw));
        }

        if (modifiedAfter != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("modifiedAfter", modifiedAfter));
        }

        if (modifiedBefore != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("modifiedBefore", modifiedBefore));
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
    private okhttp3.Call getAllTrailersValidateBeforeCall(String limit, String cursor, String expand, String raw, String modifiedAfter, String modifiedBefore, String connectionToken, final ApiCallback _callback) throws ApiException {
        return getAllTrailersCall(limit, cursor, expand, raw, modifiedAfter, modifiedBefore, connectionToken, _callback);

    }


    private ApiResponse<Void> getAllTrailersWithHttpInfo(String limit, String cursor, String expand, String raw, String modifiedAfter, String modifiedBefore, String connectionToken) throws ApiException {
        okhttp3.Call localVarCall = getAllTrailersValidateBeforeCall(limit, cursor, expand, raw, modifiedAfter, modifiedBefore, connectionToken, null);
        return localVarApiClient.execute(localVarCall);
    }

    private okhttp3.Call getAllTrailersAsync(String limit, String cursor, String expand, String raw, String modifiedAfter, String modifiedBefore, String connectionToken, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAllTrailersValidateBeforeCall(limit, cursor, expand, raw, modifiedAfter, modifiedBefore, connectionToken, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public class GetAllTrailersRequestBuilder {
        private String limit;
        private String cursor;
        private String expand;
        private String raw;
        private String modifiedAfter;
        private String modifiedBefore;
        private String connectionToken;

        private GetAllTrailersRequestBuilder() {
        }

        /**
         * Set limit
         * @param limit The maximum number of results to return in a page. (optional)
         * @return GetAllTrailersRequestBuilder
         */
        public GetAllTrailersRequestBuilder limit(String limit) {
            this.limit = limit;
            return this;
        }
        
        /**
         * Set cursor
         * @param cursor Pagination cursor to start requests from (optional)
         * @return GetAllTrailersRequestBuilder
         */
        public GetAllTrailersRequestBuilder cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }
        
        /**
         * Set expand
         * @param expand Expand resources in the returned response (optional)
         * @return GetAllTrailersRequestBuilder
         */
        public GetAllTrailersRequestBuilder expand(String expand) {
            this.expand = expand;
            return this;
        }
        
        /**
         * Set raw
         * @param raw Include raw responses used to normalize model. Used for debugging or accessing unique properties that are not unified. (optional)
         * @return GetAllTrailersRequestBuilder
         */
        public GetAllTrailersRequestBuilder raw(String raw) {
            this.raw = raw;
            return this;
        }
        
        /**
         * Set modifiedAfter
         * @param modifiedAfter Only include records that were last modified after a provided date. (optional)
         * @return GetAllTrailersRequestBuilder
         */
        public GetAllTrailersRequestBuilder modifiedAfter(String modifiedAfter) {
            this.modifiedAfter = modifiedAfter;
            return this;
        }
        
        /**
         * Set modifiedBefore
         * @param modifiedBefore Only include records that were last modified before a provided date. (optional)
         * @return GetAllTrailersRequestBuilder
         */
        public GetAllTrailersRequestBuilder modifiedBefore(String modifiedBefore) {
            this.modifiedBefore = modifiedBefore;
            return this;
        }
        
        /**
         * Set connectionToken
         * @param connectionToken (Required) The token returned when a user authenticated their account. This authorizes access to a specific account. (optional)
         * @return GetAllTrailersRequestBuilder
         */
        public GetAllTrailersRequestBuilder connectionToken(String connectionToken) {
            this.connectionToken = connectionToken;
            return this;
        }
        
        /**
         * Build call for getAllTrailers
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
            return getAllTrailersCall(limit, cursor, expand, raw, modifiedAfter, modifiedBefore, connectionToken, _callback);
        }


        /**
         * Execute getAllTrailers request
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
         </table>
         */
        public void execute() throws ApiException {
            getAllTrailersWithHttpInfo(limit, cursor, expand, raw, modifiedAfter, modifiedBefore, connectionToken);
        }

        /**
         * Execute getAllTrailers request with HTTP info returned
         * @return ApiResponse&lt;Void&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
            return getAllTrailersWithHttpInfo(limit, cursor, expand, raw, modifiedAfter, modifiedBefore, connectionToken);
        }

        /**
         * Execute getAllTrailers request (asynchronously)
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
            return getAllTrailersAsync(limit, cursor, expand, raw, modifiedAfter, modifiedBefore, connectionToken, _callback);
        }
    }

    /**
     * List Trailers
     * List Trailers
     * @return GetAllTrailersRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public GetAllTrailersRequestBuilder getAllTrailers() throws IllegalArgumentException {
        return new GetAllTrailersRequestBuilder();
    }
    private okhttp3.Call listLatestLocationsCall(String limit, String cursor, String expand, String raw, String connectionToken, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/trailers/locations";

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

        if (expand != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("expand", expand));
        }

        if (raw != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("raw", raw));
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
    private okhttp3.Call listLatestLocationsValidateBeforeCall(String limit, String cursor, String expand, String raw, String connectionToken, final ApiCallback _callback) throws ApiException {
        return listLatestLocationsCall(limit, cursor, expand, raw, connectionToken, _callback);

    }


    private ApiResponse<Void> listLatestLocationsWithHttpInfo(String limit, String cursor, String expand, String raw, String connectionToken) throws ApiException {
        okhttp3.Call localVarCall = listLatestLocationsValidateBeforeCall(limit, cursor, expand, raw, connectionToken, null);
        return localVarApiClient.execute(localVarCall);
    }

    private okhttp3.Call listLatestLocationsAsync(String limit, String cursor, String expand, String raw, String connectionToken, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = listLatestLocationsValidateBeforeCall(limit, cursor, expand, raw, connectionToken, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public class ListLatestLocationsRequestBuilder {
        private String limit;
        private String cursor;
        private String expand;
        private String raw;
        private String connectionToken;

        private ListLatestLocationsRequestBuilder() {
        }

        /**
         * Set limit
         * @param limit The maximum number of results to return in a page. (optional)
         * @return ListLatestLocationsRequestBuilder
         */
        public ListLatestLocationsRequestBuilder limit(String limit) {
            this.limit = limit;
            return this;
        }
        
        /**
         * Set cursor
         * @param cursor Pagination cursor to start requests from (optional)
         * @return ListLatestLocationsRequestBuilder
         */
        public ListLatestLocationsRequestBuilder cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }
        
        /**
         * Set expand
         * @param expand Expand resources in the returned response (optional)
         * @return ListLatestLocationsRequestBuilder
         */
        public ListLatestLocationsRequestBuilder expand(String expand) {
            this.expand = expand;
            return this;
        }
        
        /**
         * Set raw
         * @param raw Include raw responses used to normalize model. Used for debugging or accessing unique properties that are not unified. (optional)
         * @return ListLatestLocationsRequestBuilder
         */
        public ListLatestLocationsRequestBuilder raw(String raw) {
            this.raw = raw;
            return this;
        }
        
        /**
         * Set connectionToken
         * @param connectionToken (Required) The token returned when a user authenticated their account. This authorizes access to a specific account. (optional)
         * @return ListLatestLocationsRequestBuilder
         */
        public ListLatestLocationsRequestBuilder connectionToken(String connectionToken) {
            this.connectionToken = connectionToken;
            return this;
        }
        
        /**
         * Build call for listLatestLocations
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
            return listLatestLocationsCall(limit, cursor, expand, raw, connectionToken, _callback);
        }


        /**
         * Execute listLatestLocations request
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
         </table>
         */
        public void execute() throws ApiException {
            listLatestLocationsWithHttpInfo(limit, cursor, expand, raw, connectionToken);
        }

        /**
         * Execute listLatestLocations request with HTTP info returned
         * @return ApiResponse&lt;Void&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
            return listLatestLocationsWithHttpInfo(limit, cursor, expand, raw, connectionToken);
        }

        /**
         * Execute listLatestLocations request (asynchronously)
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
            return listLatestLocationsAsync(limit, cursor, expand, raw, connectionToken, _callback);
        }
    }

    /**
     * Latest Trailer Locations
     * Latest Trailer Locations
     * @return ListLatestLocationsRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ListLatestLocationsRequestBuilder listLatestLocations() throws IllegalArgumentException {
        return new ListLatestLocationsRequestBuilder();
    }
}
