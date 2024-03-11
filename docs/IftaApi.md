# IftaApi

All URIs are relative to *https://api.sandbox.withterminal.com/tsp/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getMonthlyReports**](IftaApi.md#getMonthlyReports) | **GET** /ifta/summary | Get IFTA Summary |


<a name="getMonthlyReports"></a>
# **getMonthlyReports**
> getMonthlyReports().cursor(cursor).expand(expand).raw(raw).startMonth(startMonth).endMonth(endMonth).groupBy(groupBy).connectionToken(connectionToken).execute();

Get IFTA Summary

Get all vehicle IFTA reports for the requested time span.  Currently can only increment by full months.   _Note:_ data may change for a few days after the month. We will continue to update those reports to ensure you get accurate results.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Terminal;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IftaApi;
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
    String expand = ""; // Expand resources in the returned response
    String raw = "true"; // Include raw responses used to normalize model. Used for debugging or accessing unique properties that are not unified.
    String startMonth = "2021-01"; // (Required) The month from which to start including vehicle reports
    String endMonth = "2021-01"; // (Required) Include vehicle reports up to and including this month
    String groupBy = "vehicle,jurisdiction"; // Computes the total distance traversed within a specified month range, with the results grouped by either jurisdiction, vehicle, or both. If no grouping parameter is provided, the default grouping is `vehicle,jurisdiction`.
    String connectionToken = "{{connectionToken}}"; // (Required) The token returned when a user authenticated their account. This authorizes access to a specific account.
    try {
      client
              .ifta
              .getMonthlyReports()
              .cursor(cursor)
              .expand(expand)
              .raw(raw)
              .startMonth(startMonth)
              .endMonth(endMonth)
              .groupBy(groupBy)
              .connectionToken(connectionToken)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling IftaApi#getMonthlyReports");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .ifta
              .getMonthlyReports()
              .cursor(cursor)
              .expand(expand)
              .raw(raw)
              .startMonth(startMonth)
              .endMonth(endMonth)
              .groupBy(groupBy)
              .connectionToken(connectionToken)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling IftaApi#getMonthlyReports");
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
| **expand** | **String**| Expand resources in the returned response | [optional] |
| **raw** | **String**| Include raw responses used to normalize model. Used for debugging or accessing unique properties that are not unified. | [optional] |
| **startMonth** | **String**| (Required) The month from which to start including vehicle reports | [optional] |
| **endMonth** | **String**| (Required) Include vehicle reports up to and including this month | [optional] |
| **groupBy** | **String**| Computes the total distance traversed within a specified month range, with the results grouped by either jurisdiction, vehicle, or both. If no grouping parameter is provided, the default grouping is &#x60;vehicle,jurisdiction&#x60;. | [optional] |
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

