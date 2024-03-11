# HoursOfServiceApi

All URIs are relative to *https://api.sandbox.withterminal.com/tsp/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAvailableTime**](HoursOfServiceApi.md#getAvailableTime) | **GET** /hos/available-time | Available Time for Drivers |
| [**getDailyLogs**](HoursOfServiceApi.md#getDailyLogs) | **GET** /hos/daily-logs | List HOS Daily Logs |
| [**listHosLogs**](HoursOfServiceApi.md#listHosLogs) | **GET** /hos/logs | List HOS Logs |


<a name="getAvailableTime"></a>
# **getAvailableTime**
> getAvailableTime().cursor(cursor).limit(limit).driverIds(driverIds).expand(expand).raw(raw).connectionToken(connectionToken).execute();

Available Time for Drivers

List available time for the driver. This endpoint provides live access to the driver&#39;s available time. Different than most endpoints, this endpoint calls the provider&#39;s API in real time to get the latest available time for the driver. This endpoint is useful for building real time applications that need to know the driver&#39;s available time.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Terminal;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.HoursOfServiceApi;
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
    String driverIds = "{{driverId}}"; // Comma separated list of driver IDs to filter for
    String expand = ""; // Expand resources in the returned response
    String raw = "true"; // Include raw responses used to normalize model. Used for debugging or accessing unique properties that are not unified.
    String connectionToken = "{{connectionToken}}"; // (Required) The token returned when a user authenticated their account. This authorizes access to a specific account.
    try {
      client
              .hoursOfService
              .getAvailableTime()
              .cursor(cursor)
              .limit(limit)
              .driverIds(driverIds)
              .expand(expand)
              .raw(raw)
              .connectionToken(connectionToken)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling HoursOfServiceApi#getAvailableTime");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .hoursOfService
              .getAvailableTime()
              .cursor(cursor)
              .limit(limit)
              .driverIds(driverIds)
              .expand(expand)
              .raw(raw)
              .connectionToken(connectionToken)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling HoursOfServiceApi#getAvailableTime");
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
| **driverIds** | **String**| Comma separated list of driver IDs to filter for | [optional] |
| **expand** | **String**| Expand resources in the returned response | [optional] |
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

<a name="getDailyLogs"></a>
# **getDailyLogs**
> getDailyLogs().cursor(cursor).limit(limit).startDate(startDate).endDate(endDate).modifiedAfter(modifiedAfter).modifiedBefore(modifiedBefore).driverIds(driverIds).raw(raw).expand(expand).connectionToken(connectionToken).execute();

List HOS Daily Logs

List daily summary of hours of service. Each daily log represents the time a driver spent in each duty status for a given day.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Terminal;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.HoursOfServiceApi;
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
    String startDate = "1995-04-25"; // Only include daily logs from on or after a specific date
    String endDate = "1995-04-25"; // Only include daily logs from on or before a specific date
    String modifiedAfter = "2021-01-06T03:24:53.000Z"; // Only include records that were last modified after a provided date.
    String modifiedBefore = "2021-01-06T03:24:53.000Z"; // Only include records that were last modified before a provided date.
    String driverIds = "{{driverId}}"; // Comma separated list of driver IDs to filter for
    String raw = "true"; // Include raw responses used to normalize model. Used for debugging or accessing unique properties that are not unified.
    String expand = ""; // Expand resources in the returned response
    String connectionToken = "{{connectionToken}}"; // (Required) The token returned when a user authenticated their account. This authorizes access to a specific account.
    try {
      client
              .hoursOfService
              .getDailyLogs()
              .cursor(cursor)
              .limit(limit)
              .startDate(startDate)
              .endDate(endDate)
              .modifiedAfter(modifiedAfter)
              .modifiedBefore(modifiedBefore)
              .driverIds(driverIds)
              .raw(raw)
              .expand(expand)
              .connectionToken(connectionToken)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling HoursOfServiceApi#getDailyLogs");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .hoursOfService
              .getDailyLogs()
              .cursor(cursor)
              .limit(limit)
              .startDate(startDate)
              .endDate(endDate)
              .modifiedAfter(modifiedAfter)
              .modifiedBefore(modifiedBefore)
              .driverIds(driverIds)
              .raw(raw)
              .expand(expand)
              .connectionToken(connectionToken)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling HoursOfServiceApi#getDailyLogs");
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
| **startDate** | **String**| Only include daily logs from on or after a specific date | [optional] |
| **endDate** | **String**| Only include daily logs from on or before a specific date | [optional] |
| **modifiedAfter** | **String**| Only include records that were last modified after a provided date. | [optional] |
| **modifiedBefore** | **String**| Only include records that were last modified before a provided date. | [optional] |
| **driverIds** | **String**| Comma separated list of driver IDs to filter for | [optional] |
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

<a name="listHosLogs"></a>
# **listHosLogs**
> listHosLogs().cursor(cursor).limit(limit).startedAfter(startedAfter).startedBefore(startedBefore).modifiedAfter(modifiedAfter).modifiedBefore(modifiedBefore).driverIds(driverIds).expand(expand).raw(raw).connectionToken(connectionToken).execute();

List HOS Logs

List all hours of service logs. Currently, HOS logs are tracked as the distinct changes in duty status. In the future we will be offering endpoints to expose current HOS status and historical daily summaries.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Terminal;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.HoursOfServiceApi;
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
    String startedAfter = "2021-01-06T03:24:53.000Z"; // Only include records of statuses that started after a provided date.
    String startedBefore = "2021-01-06T03:24:53.000Z"; // Only include records of statuses that started before a provided date.
    String modifiedAfter = "2021-01-06T03:24:53.000Z"; // Only include records that were last modified after a provided date.
    String modifiedBefore = "2021-01-06T03:24:53.000Z"; // Only include records that were last modified before a provided date.
    String driverIds = "{{driverId}}"; // Comma separated list of driver IDs to filter for
    String expand = ""; // Expand resources in the returned response
    String raw = "true"; // Include raw responses used to normalize model. Used for debugging or accessing unique properties that are not unified.
    String connectionToken = "{{connectionToken}}"; // (Required) The token returned when a user authenticated their account. This authorizes access to a specific account.
    try {
      client
              .hoursOfService
              .listHosLogs()
              .cursor(cursor)
              .limit(limit)
              .startedAfter(startedAfter)
              .startedBefore(startedBefore)
              .modifiedAfter(modifiedAfter)
              .modifiedBefore(modifiedBefore)
              .driverIds(driverIds)
              .expand(expand)
              .raw(raw)
              .connectionToken(connectionToken)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling HoursOfServiceApi#listHosLogs");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .hoursOfService
              .listHosLogs()
              .cursor(cursor)
              .limit(limit)
              .startedAfter(startedAfter)
              .startedBefore(startedBefore)
              .modifiedAfter(modifiedAfter)
              .modifiedBefore(modifiedBefore)
              .driverIds(driverIds)
              .expand(expand)
              .raw(raw)
              .connectionToken(connectionToken)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling HoursOfServiceApi#listHosLogs");
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
| **startedAfter** | **String**| Only include records of statuses that started after a provided date. | [optional] |
| **startedBefore** | **String**| Only include records of statuses that started before a provided date. | [optional] |
| **modifiedAfter** | **String**| Only include records that were last modified after a provided date. | [optional] |
| **modifiedBefore** | **String**| Only include records that were last modified before a provided date. | [optional] |
| **driverIds** | **String**| Comma separated list of driver IDs to filter for | [optional] |
| **expand** | **String**| Expand resources in the returned response | [optional] |
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

