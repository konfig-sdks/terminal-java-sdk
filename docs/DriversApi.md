# DriversApi

All URIs are relative to *https://api.sandbox.withterminal.com/tsp/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getDetails**](DriversApi.md#getDetails) | **GET** /drivers/{id} | Get Driver |
| [**list**](DriversApi.md#list) | **GET** /drivers | List Drivers |


<a name="getDetails"></a>
# **getDetails**
> getDetails(id).raw(raw).expand(expand).connectionToken(connectionToken).execute();

Get Driver

Get the details of a specific driver

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Terminal;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DriversApi;
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
    String id = "{{driverId}}"; // (Required) 
    String raw = "true"; // Include raw responses used to normalize model. Used for debugging or accessing unique properties that are not unified.
    String expand = ""; // Expand resources in the returned response
    String connectionToken = "{{connectionToken}}"; // (Required) The token returned when a user authenticated their account. This authorizes access to a specific account.
    try {
      client
              .drivers
              .getDetails(id)
              .raw(raw)
              .expand(expand)
              .connectionToken(connectionToken)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DriversApi#getDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .drivers
              .getDetails(id)
              .raw(raw)
              .expand(expand)
              .connectionToken(connectionToken)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling DriversApi#getDetails");
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

<a name="list"></a>
# **list**
> list().cursor(cursor).limit(limit).modifiedAfter(modifiedAfter).modifiedBefore(modifiedBefore).raw(raw).expand(expand).connectionToken(connectionToken).execute();

List Drivers

List all of the drivers in the connected account

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Terminal;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DriversApi;
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
              .drivers
              .list()
              .cursor(cursor)
              .limit(limit)
              .modifiedAfter(modifiedAfter)
              .modifiedBefore(modifiedBefore)
              .raw(raw)
              .expand(expand)
              .connectionToken(connectionToken)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DriversApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .drivers
              .list()
              .cursor(cursor)
              .limit(limit)
              .modifiedAfter(modifiedAfter)
              .modifiedBefore(modifiedBefore)
              .raw(raw)
              .expand(expand)
              .connectionToken(connectionToken)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling DriversApi#list");
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

