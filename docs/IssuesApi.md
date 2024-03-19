# IssuesApi

All URIs are relative to *https://api.sandbox.withterminal.com/tsp/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**listObservedEvents**](IssuesApi.md#listObservedEvents) | **GET** /issues | List Issues |
| [**markResolved**](IssuesApi.md#markResolved) | **POST** /issues/{issueId}/resolve | Resolve Issue |


<a name="listObservedEvents"></a>
# **listObservedEvents**
> listObservedEvents().limit(limit).cursor(cursor).lastReportedAfter(lastReportedAfter).lastReportedBefore(lastReportedBefore).expand(expand).connectionId(connectionId).errorCode(errorCode).status(status).execute();

List Issues

List all issues that have been observed by Terminal. Issues are generated when we observe something that may impact the completeness or accuracy of the data we provide but do not justify a full error. For example, if we lack permissions for a specific resource or need to skip an item due to invalid data.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Terminal;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IssuesApi;
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
    String limit = "1"; // The maximum number of results to return in a page.
    String cursor = "{{nextCursor}}"; // Pagination cursor to start requests from
    String lastReportedAfter = "1973-09-17"; // Timestamp to start when the issue was last observed
    String lastReportedBefore = "1973-09-17"; // Timestamp to end when the issue was last observed
    String expand = ""; // Expand related resources to see all details
    String connectionId = "conn_01GV12VR4DJP70GD1ZBK0SDWFH"; // Filter issues to a specific connection
    String errorCode = "exceeded_retention_window"; // Filter issues to a specific error code
    String status = "ongoing"; // Filter issues to a specific status
    try {
      client
              .issues
              .listObservedEvents()
              .limit(limit)
              .cursor(cursor)
              .lastReportedAfter(lastReportedAfter)
              .lastReportedBefore(lastReportedBefore)
              .expand(expand)
              .connectionId(connectionId)
              .errorCode(errorCode)
              .status(status)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling IssuesApi#listObservedEvents");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .issues
              .listObservedEvents()
              .limit(limit)
              .cursor(cursor)
              .lastReportedAfter(lastReportedAfter)
              .lastReportedBefore(lastReportedBefore)
              .expand(expand)
              .connectionId(connectionId)
              .errorCode(errorCode)
              .status(status)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling IssuesApi#listObservedEvents");
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
| **limit** | **String**| The maximum number of results to return in a page. | [optional] |
| **cursor** | **String**| Pagination cursor to start requests from | [optional] |
| **lastReportedAfter** | **String**| Timestamp to start when the issue was last observed | [optional] |
| **lastReportedBefore** | **String**| Timestamp to end when the issue was last observed | [optional] |
| **expand** | **String**| Expand related resources to see all details | [optional] |
| **connectionId** | **String**| Filter issues to a specific connection | [optional] |
| **errorCode** | **String**| Filter issues to a specific error code | [optional] |
| **status** | **String**| Filter issues to a specific status | [optional] |

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

<a name="markResolved"></a>
# **markResolved**
> markResolved(issueId).execute();

Resolve Issue

Mark an issue&#39;s status as &#x60;resolved&#x60; until the issue is observed again.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Terminal;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IssuesApi;
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
    String issueId = "qui tempor"; // (Required) 
    try {
      client
              .issues
              .markResolved(issueId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling IssuesApi#markResolved");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .issues
              .markResolved(issueId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling IssuesApi#markResolved");
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
| **issueId** | **String**| (Required)  | |

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

