# AuthenticationApi

All URIs are relative to *https://api.sandbox.withterminal.com/tsp/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**exchangeToken**](AuthenticationApi.md#exchangeToken) | **POST** /public-token/exchange | Public Token Exchange |


<a name="exchangeToken"></a>
# **exchangeToken**
> exchangeToken().authenticationExchangeTokenRequest(authenticationExchangeTokenRequest).execute();

Public Token Exchange

Exchange the &#x60;publicToken&#x60; returned by our hosted authentication flow for a long lived connection token that will be used when requesting data from a customer&#39;s TSP.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Terminal;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AuthenticationApi;
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
    String publicToken = "publicToken_example";
    try {
      client
              .authentication
              .exchangeToken()
              .publicToken(publicToken)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#exchangeToken");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .authentication
              .exchangeToken()
              .publicToken(publicToken)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#exchangeToken");
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
| **authenticationExchangeTokenRequest** | [**AuthenticationExchangeTokenRequest**](AuthenticationExchangeTokenRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

