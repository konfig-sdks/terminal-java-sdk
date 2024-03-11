# TripsApi

All URIs are relative to *https://api.sandbox.withterminal.com/tsp/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAllTrips**](TripsApi.md#getAllTrips) | **GET** /trips | List Trips |


<a name="getAllTrips"></a>
# **getAllTrips**
> getAllTrips().cursor(cursor).limit(limit).modifiedAfter(modifiedAfter).modifiedBefore(modifiedBefore).startedAfter(startedAfter).startedBefore(startedBefore).endedAfter(endedAfter).endedBefore(endedBefore).driverIds(driverIds).vehicleIds(vehicleIds).raw(raw).expand(expand).connectionToken(connectionToken).execute();

List Trips

List all trips in the connected account. Trips define a period of time where a vehicle is in motion.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Terminal;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TripsApi;
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
    String startedAfter = "2021-01-06T03:24:53.000Z"; // Only include trips that started after a provided date.
    String startedBefore = "2021-01-06T03:24:53.000Z"; // Only include trips that started before a provided date.
    String endedAfter = "2021-01-06T03:24:53.000Z"; // Only include trips that ended after a provided date.
    String endedBefore = "2021-01-06T03:24:53.000Z"; // Only include trips that ended before a provided date.
    String driverIds = "{{driverId}}"; // Comma separated list of driver IDs to filter for
    String vehicleIds = "{{vehicleId}}"; // Comma separated list of vehicle IDs to filter for
    String raw = "true"; // Include raw responses used to normalize model. Used for debugging or accessing unique properties that are not unified.
    String expand = ""; // Expand resources in the returned response
    String connectionToken = "{{connectionToken}}"; // (Required) The token returned when a user authenticated their account. This authorizes access to a specific account.
    try {
      client
              .trips
              .getAllTrips()
              .cursor(cursor)
              .limit(limit)
              .modifiedAfter(modifiedAfter)
              .modifiedBefore(modifiedBefore)
              .startedAfter(startedAfter)
              .startedBefore(startedBefore)
              .endedAfter(endedAfter)
              .endedBefore(endedBefore)
              .driverIds(driverIds)
              .vehicleIds(vehicleIds)
              .raw(raw)
              .expand(expand)
              .connectionToken(connectionToken)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TripsApi#getAllTrips");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .trips
              .getAllTrips()
              .cursor(cursor)
              .limit(limit)
              .modifiedAfter(modifiedAfter)
              .modifiedBefore(modifiedBefore)
              .startedAfter(startedAfter)
              .startedBefore(startedBefore)
              .endedAfter(endedAfter)
              .endedBefore(endedBefore)
              .driverIds(driverIds)
              .vehicleIds(vehicleIds)
              .raw(raw)
              .expand(expand)
              .connectionToken(connectionToken)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TripsApi#getAllTrips");
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
| **startedAfter** | **String**| Only include trips that started after a provided date. | [optional] |
| **startedBefore** | **String**| Only include trips that started before a provided date. | [optional] |
| **endedAfter** | **String**| Only include trips that ended after a provided date. | [optional] |
| **endedBefore** | **String**| Only include trips that ended before a provided date. | [optional] |
| **driverIds** | **String**| Comma separated list of driver IDs to filter for | [optional] |
| **vehicleIds** | **String**| Comma separated list of vehicle IDs to filter for | [optional] |
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

