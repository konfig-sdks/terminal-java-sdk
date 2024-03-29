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

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SafetyApi
 */
@Disabled
public class SafetyApiTest {

    private static SafetyApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new SafetyApi(apiClient);
    }

    /**
     * List Safety Events
     *
     * List all safety events detected by the provider.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getEventsTest() throws ApiException {
        String cursor = null;
        String limit = null;
        String modifiedAfter = null;
        String modifiedBefore = null;
        String startedAfter = null;
        String startedBefore = null;
        String driverIds = null;
        String vehicleIds = null;
        String expand = null;
        String raw = null;
        String connectionToken = null;
        api.getEvents()
                .cursor(cursor)
                .limit(limit)
                .modifiedAfter(modifiedAfter)
                .modifiedBefore(modifiedBefore)
                .startedAfter(startedAfter)
                .startedBefore(startedBefore)
                .driverIds(driverIds)
                .vehicleIds(vehicleIds)
                .expand(expand)
                .raw(raw)
                .connectionToken(connectionToken)
                .execute();
        // TODO: test validations
    }

}
