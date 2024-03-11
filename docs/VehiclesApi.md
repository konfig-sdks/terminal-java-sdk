# VehiclesApi

All URIs are relative to *https://api.sandbox.withterminal.com/tsp/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAll**](VehiclesApi.md#getAll) | **GET** /vehicles | List Vehicles |
| [**getDetails**](VehiclesApi.md#getDetails) | **GET** /vehicles/{id} | Get Vehicle |
| [**getHistoricalStats**](VehiclesApi.md#getHistoricalStats) | **GET** /vehicles/{vehicleId}/stats/historical | Historical Vehicle Stats |
| [**getLatestLocations**](VehiclesApi.md#getLatestLocations) | **GET** /vehicles/locations | Latest Vehicle Locations |
| [**listHistoricalLocations**](VehiclesApi.md#listHistoricalLocations) | **GET** /vehicles/{vehicleId}/locations | Historical Vehicle Locations |


<a name="getAll"></a>
# **getAll**
> getAll().cursor(cursor).limit(limit).modifiedAfter(modifiedAfter).modifiedBefore(modifiedBefore).raw(raw).expand(expand).connectionToken(connectionToken).execute();

List Vehicles

List all of the vehicles in the connected account

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Terminal;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VehiclesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sandbox.withterminal.com/tsp/v1";
    
    // Configure HTTP bearer authorization: bearerAuth
    configuration.token = "BEARER TOKEN";
    Terminal client = new Terminal(configuration);
    String cursor = "{{nextCursor}}"; // Pagination cursor to start requests from
    String limit = "1"; // The maximum number of results to return in a page.
    String modifiedAfter = "2021-01-06T03:24:53.000Z"; // Only include records that were last modified after a provided date.
    String modifiedBefore = "2021-01-06T03:24:53.000Z"; // Only include records that were last modified before a provided date.
    String raw = "true"; // Include raw responses used to normalize model. Used for debugging or accessing unique properties that are not unified.
    String expand = ""; // Expand resources in the returned response
    String connectionToken = "{{connectionToken}}"; // (Required) The token returned when a user authenticated their account. This authorizes access to a specific account.
    try {
      client
              .vehicles
              .getAll()
              .cursor(cursor)
              .limit(limit)
              .modifiedAfter(modifiedAfter)
              .modifiedBefore(modifiedBefore)
              .raw(raw)
              .expand(expand)
              .connectionToken(connectionToken)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling VehiclesApi#getAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .vehicles
              .getAll()
              .cursor(cursor)
              .limit(limit)
              .modifiedAfter(modifiedAfter)
              .modifiedBefore(modifiedBefore)
              .raw(raw)
              .expand(expand)
              .connectionToken(connectionToken)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling VehiclesApi#getAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cursor** | **String**| Pagination cursor to start requests from | [optional] |
| **limit** | **String**| The maximum number of results to return in a page. | [optional] |
| **modifiedAfter** | **String**| Only include records that were last modified after a provided date. | [optional] |
| **modifiedBefore** | **String**| Only include records that were last modified before a provided date. | [optional] |
| **raw** | **String**| Include raw responses used to normalize model. Used for debugging or accessing unique properties that are not unified. | [optional] |
| **expand** | **String**| Expand resources in the returned response | [optional] |
| **connectionToken** | **String**| (Required) The token returned when a user authenticated their account. This authorizes access to a specific account. | [optional] |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="getDetails"></a>
# **getDetails**
> getDetails(id).raw(raw).expand(expand).connectionToken(connectionToken).execute();

Get Vehicle

Get the details of a specific vehicle

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Terminal;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VehiclesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sandbox.withterminal.com/tsp/v1";
    
    // Configure HTTP bearer authorization: bearerAuth
    configuration.token = "BEARER TOKEN";
    Terminal client = new Terminal(configuration);
    String id = "{{vehicleId}}"; // (Required) 
    String raw = "true"; // Include raw responses used to normalize model. Used for debugging or accessing unique properties that are not unified.
    String expand = ""; // Expand resources in the returned response
    String connectionToken = "{{connectionToken}}"; // (Required) The token returned when a user authenticated their account. This authorizes access to a specific account.
    try {
      client
              .vehicles
              .getDetails(id)
              .raw(raw)
              .expand(expand)
              .connectionToken(connectionToken)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling VehiclesApi#getDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .vehicles
              .getDetails(id)
              .raw(raw)
              .expand(expand)
              .connectionToken(connectionToken)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling VehiclesApi#getDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| (Required)  | |
| **raw** | **String**| Include raw responses used to normalize model. Used for debugging or accessing unique properties that are not unified. | [optional] |
| **expand** | **String**| Expand resources in the returned response | [optional] |
| **connectionToken** | **String**| (Required) The token returned when a user authenticated their account. This authorizes access to a specific account. | [optional] |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="getHistoricalStats"></a>
# **getHistoricalStats**
> getHistoricalStats(vehicleId).cursor(cursor).limit(limit).expand(expand).startAt(startAt).endAt(endAt).types(types).raw(raw).connectionToken(connectionToken).execute();

Historical Vehicle Stats

List historical stats and logs about the vehicle.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Terminal;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VehiclesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sandbox.withterminal.com/tsp/v1";
    
    // Configure HTTP bearer authorization: bearerAuth
    configuration.token = "BEARER TOKEN";
    Terminal client = new Terminal(configuration);
    String vehicleId = "{{vehicleId}}"; // (Required) 
    String cursor = "{{nextCursor}}"; // Pagination cursor to start requests from
    String limit = "1"; // The maximum number of results to return in a page.
    String expand = ""; // Expand resources in the returned response
    String startAt = "2021-01-06T03:24:53.000Z"; // Timestamp to start from - defaults to `TODAY - 1 MONTH`
    String endAt = "2021-01-06T03:24:53.000Z"; // Timestamp to end at - defaults to `TODAY`
    String types = "odometer,engine_state,fuel_level,total_fuel_consumption"; // Comma separated list of vehicle stats to filter for
    String raw = "true"; // Include raw responses used to normalize model. Used for debugging or accessing unique properties that are not unified.
    String connectionToken = "{{connectionToken}}"; // (Required) The token returned when a user authenticated their account. This authorizes access to a specific account.
    try {
      client
              .vehicles
              .getHistoricalStats(vehicleId)
              .cursor(cursor)
              .limit(limit)
              .expand(expand)
              .startAt(startAt)
              .endAt(endAt)
              .types(types)
              .raw(raw)
              .connectionToken(connectionToken)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling VehiclesApi#getHistoricalStats");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .vehicles
              .getHistoricalStats(vehicleId)
              .cursor(cursor)
              .limit(limit)
              .expand(expand)
              .startAt(startAt)
              .endAt(endAt)
              .types(types)
              .raw(raw)
              .connectionToken(connectionToken)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling VehiclesApi#getHistoricalStats");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **vehicleId** | **String**| (Required)  | |
| **cursor** | **String**| Pagination cursor to start requests from | [optional] |
| **limit** | **String**| The maximum number of results to return in a page. | [optional] |
| **expand** | **String**| Expand resources in the returned response | [optional] |
| **startAt** | **String**| Timestamp to start from - defaults to &#x60;TODAY - 1 MONTH&#x60; | [optional] |
| **endAt** | **String**| Timestamp to end at - defaults to &#x60;TODAY&#x60; | [optional] |
| **types** | **String**| Comma separated list of vehicle stats to filter for | [optional] |
| **raw** | **String**| Include raw responses used to normalize model. Used for debugging or accessing unique properties that are not unified. | [optional] |
| **connectionToken** | **String**| (Required) The token returned when a user authenticated their account. This authorizes access to a specific account. | [optional] |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="getLatestLocations"></a>
# **getLatestLocations**
> getLatestLocations().cursor(cursor).limit(limit).raw(raw).vehicleIds(vehicleIds).expand(expand).connectionToken(connectionToken).execute();

Latest Vehicle Locations

List the latest location of the vehicles in the connected account. This endpoint will call the provider&#39;s API in real time to get the latest location of the vehicle.  _Please note: this endpoint will exclude vehicles that have no last known location._

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Terminal;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VehiclesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sandbox.withterminal.com/tsp/v1";
    
    // Configure HTTP bearer authorization: bearerAuth
    configuration.token = "BEARER TOKEN";
    Terminal client = new Terminal(configuration);
    String cursor = "{{nextCursor}}"; // Pagination cursor to start requests from
    String limit = "1"; // The maximum number of results to return in a page.
    String raw = "true"; // Include raw responses used to normalize model. Used for debugging or accessing unique properties that are not unified.
    String vehicleIds = "{{vehicleId}}"; // Comma separated list of vehicle IDs to filter for
    String expand = ""; // Expand resources in the returned response
    String connectionToken = "{{connectionToken}}"; // (Required) The token returned when a user authenticated their account. This authorizes access to a specific account.
    try {
      client
              .vehicles
              .getLatestLocations()
              .cursor(cursor)
              .limit(limit)
              .raw(raw)
              .vehicleIds(vehicleIds)
              .expand(expand)
              .connectionToken(connectionToken)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling VehiclesApi#getLatestLocations");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .vehicles
              .getLatestLocations()
              .cursor(cursor)
              .limit(limit)
              .raw(raw)
              .vehicleIds(vehicleIds)
              .expand(expand)
              .connectionToken(connectionToken)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling VehiclesApi#getLatestLocations");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cursor** | **String**| Pagination cursor to start requests from | [optional] |
| **limit** | **String**| The maximum number of results to return in a page. | [optional] |
| **raw** | **String**| Include raw responses used to normalize model. Used for debugging or accessing unique properties that are not unified. | [optional] |
| **vehicleIds** | **String**| Comma separated list of vehicle IDs to filter for | [optional] |
| **expand** | **String**| Expand resources in the returned response | [optional] |
| **connectionToken** | **String**| (Required) The token returned when a user authenticated their account. This authorizes access to a specific account. | [optional] |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="listHistoricalLocations"></a>
# **listHistoricalLocations**
> listHistoricalLocations(vehicleId).cursor(cursor).limit(limit).startAt(startAt).endAt(endAt).raw(raw).connectionToken(connectionToken).execute();

Historical Vehicle Locations

List the historical breadcrumb locations for a vehicle.  _Note:_  Given the large volume of location data available, we encourage customers to accept compressed (&#x60;gzip&#x60;) responses in order to maximize throughput. This is supported with many popular HTTP clients. Result limits vary depending on if results are compressed or not.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Terminal;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VehiclesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sandbox.withterminal.com/tsp/v1";
    
    // Configure HTTP bearer authorization: bearerAuth
    configuration.token = "BEARER TOKEN";
    Terminal client = new Terminal(configuration);
    String vehicleId = "{{vehicleId}}"; // (Required) Vehicle to retrieve breadcrumb locations for
    String cursor = "{{nextCursor}}"; // Pagination cursor to start requests from
    String limit = "1"; // The maximum number of results to return in a page.
    String startAt = "2021-01-06T03:24:53.000Z"; // Timestamp to start from - defaults to `TODAY - 1 MONTH`
    String endAt = "2021-01-06T03:24:53.000Z"; // Timestamp to end at - defaults to `TODAY`
    String raw = "true"; // Include raw responses used to normalize model. Used for debugging or accessing unique properties that are not unified.
    String connectionToken = "{{connectionToken}}"; // (Required) The token returned when a user authenticated their account. This authorizes access to a specific account.
    try {
      client
              .vehicles
              .listHistoricalLocations(vehicleId)
              .cursor(cursor)
              .limit(limit)
              .startAt(startAt)
              .endAt(endAt)
              .raw(raw)
              .connectionToken(connectionToken)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling VehiclesApi#listHistoricalLocations");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .vehicles
              .listHistoricalLocations(vehicleId)
              .cursor(cursor)
              .limit(limit)
              .startAt(startAt)
              .endAt(endAt)
              .raw(raw)
              .connectionToken(connectionToken)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling VehiclesApi#listHistoricalLocations");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **vehicleId** | **String**| (Required) Vehicle to retrieve breadcrumb locations for | |
| **cursor** | **String**| Pagination cursor to start requests from | [optional] |
| **limit** | **String**| The maximum number of results to return in a page. | [optional] |
| **startAt** | **String**| Timestamp to start from - defaults to &#x60;TODAY - 1 MONTH&#x60; | [optional] |
| **endAt** | **String**| Timestamp to end at - defaults to &#x60;TODAY&#x60; | [optional] |
| **raw** | **String**| Include raw responses used to normalize model. Used for debugging or accessing unique properties that are not unified. | [optional] |
| **connectionToken** | **String**| (Required) The token returned when a user authenticated their account. This authorizes access to a specific account. | [optional] |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

