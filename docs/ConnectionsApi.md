# ConnectionsApi

All URIs are relative to *https://api.sandbox.withterminal.com/tsp/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCustomConnection**](ConnectionsApi.md#createCustomConnection) | **POST** /connections | Create Connection |
| [**getCurrentDetails**](ConnectionsApi.md#getCurrentDetails) | **GET** /connections/current | Get Current Connection |
| [**listAll**](ConnectionsApi.md#listAll) | **GET** /connections | List All Connections |
| [**updateCurrentConnectionDetails**](ConnectionsApi.md#updateCurrentConnectionDetails) | **PATCH** /connections/current | Update Current Connection |


<a name="createCustomConnection"></a>
# **createCustomConnection**
> createCustomConnection().connectionsCreateCustomConnectionRequest(connectionsCreateCustomConnectionRequest).execute();

Create Connection

Create a new connection via API. This endpoint can be used to provide a completely custom connection creation experience for your customers.  For most use cases we recommend using the [Link UI](./rhuaxk9205cn8-link-component) to create connections.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Terminal;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ConnectionsApi;
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
    List<String> tags = Arrays.asList();
    ConnectionsCreateCustomConnectionRequestBackfill backfill = new ConnectionsCreateCustomConnectionRequestBackfill();
    ConnectionsCreateCustomConnectionRequestCompany company = new ConnectionsCreateCustomConnectionRequestCompany();
    ConnectionsCreateCustomConnectionRequestCredentials credentials = new ConnectionsCreateCustomConnectionRequestCredentials();
    String externalId = "externalId_example";
    String provider = "provider_example";
    String syncMode = "syncMode_example";
    try {
      client
              .connections
              .createCustomConnection()
              .tags(tags)
              .backfill(backfill)
              .company(company)
              .credentials(credentials)
              .externalId(externalId)
              .provider(provider)
              .syncMode(syncMode)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectionsApi#createCustomConnection");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .connections
              .createCustomConnection()
              .tags(tags)
              .backfill(backfill)
              .company(company)
              .credentials(credentials)
              .externalId(externalId)
              .provider(provider)
              .syncMode(syncMode)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectionsApi#createCustomConnection");
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
| **connectionsCreateCustomConnectionRequest** | [**ConnectionsCreateCustomConnectionRequest**](ConnectionsCreateCustomConnectionRequest.md)|  | [optional] |

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

<a name="getCurrentDetails"></a>
# **getCurrentDetails**
> getCurrentDetails().connectionToken(connectionToken).execute();

Get Current Connection

Get the details of the current active connection. The current connection is derived from the provided connection token.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Terminal;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ConnectionsApi;
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
    String connectionToken = "{{connectionToken}}"; // (Required) The token returned when a user authenticated their account. This authorizes access to a specific account.
    try {
      client
              .connections
              .getCurrentDetails()
              .connectionToken(connectionToken)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectionsApi#getCurrentDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .connections
              .getCurrentDetails()
              .connectionToken(connectionToken)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectionsApi#getCurrentDetails");
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

<a name="listAll"></a>
# **listAll**
> listAll().cursor(cursor).limit(limit).externalId(externalId).dotNumber(dotNumber).tag(tag).execute();

List All Connections

List all of the connections you have for your application. Connections represent the authenticated access you have to your customer&#39;s TSP data.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Terminal;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ConnectionsApi;
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
    String externalId = "123";
    String dotNumber = "123";
    String tag = "tempor in aliqua"; // Filter connections by tag
    try {
      client
              .connections
              .listAll()
              .cursor(cursor)
              .limit(limit)
              .externalId(externalId)
              .dotNumber(dotNumber)
              .tag(tag)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectionsApi#listAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .connections
              .listAll()
              .cursor(cursor)
              .limit(limit)
              .externalId(externalId)
              .dotNumber(dotNumber)
              .tag(tag)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectionsApi#listAll");
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
| **externalId** | **String**|  | [optional] |
| **dotNumber** | **String**|  | [optional] |
| **tag** | **String**| Filter connections by tag | [optional] |

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

<a name="updateCurrentConnectionDetails"></a>
# **updateCurrentConnectionDetails**
> updateCurrentConnectionDetails().connectionToken(connectionToken).connectionsUpdateCurrentConnectionDetailsRequest(connectionsUpdateCurrentConnectionDetailsRequest).execute();

Update Current Connection

Update the details of the current active connection. The current connection is derived from the provided connection token.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Terminal;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ConnectionsApi;
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
    List<String> tags = Arrays.asList();
    ConnectionsUpdateCurrentConnectionDetailsRequestCompany company = new ConnectionsUpdateCurrentConnectionDetailsRequestCompany();
    String externalId = "externalId_example";
    String status = "status_example";
    String syncMode = "syncMode_example";
    String connectionToken = "{{connectionToken}}"; // (Required) The token returned when a user authenticated their account. This authorizes access to a specific account.
    try {
      client
              .connections
              .updateCurrentConnectionDetails()
              .tags(tags)
              .company(company)
              .externalId(externalId)
              .status(status)
              .syncMode(syncMode)
              .connectionToken(connectionToken)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectionsApi#updateCurrentConnectionDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .connections
              .updateCurrentConnectionDetails()
              .tags(tags)
              .company(company)
              .externalId(externalId)
              .status(status)
              .syncMode(syncMode)
              .connectionToken(connectionToken)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectionsApi#updateCurrentConnectionDetails");
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
| **connectionToken** | **String**| (Required) The token returned when a user authenticated their account. This authorizes access to a specific account. | [optional] |
| **connectionsUpdateCurrentConnectionDetailsRequest** | [**ConnectionsUpdateCurrentConnectionDetailsRequest**](ConnectionsUpdateCurrentConnectionDetailsRequest.md)|  | [optional] |

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

