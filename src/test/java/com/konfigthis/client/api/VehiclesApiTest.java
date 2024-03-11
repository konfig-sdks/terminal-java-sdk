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
 * API tests for VehiclesApi
 */
@Disabled
public class VehiclesApiTest {

    private static VehiclesApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new VehiclesApi(apiClient);
    }

    /**
     * List Vehicles
     *
     * List all of the vehicles in the connected account
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllTest() throws ApiException {
        String cursor = null;
        String limit = null;
        String modifiedAfter = null;
        String modifiedBefore = null;
        String raw = null;
        String expand = null;
        String connectionToken = null;
        api.getAll()
                .cursor(cursor)
                .limit(limit)
                .modifiedAfter(modifiedAfter)
                .modifiedBefore(modifiedBefore)
                .raw(raw)
                .expand(expand)
                .connectionToken(connectionToken)
                .execute();
        // TODO: test validations
    }

    /**
     * Get Vehicle
     *
     * Get the details of a specific vehicle
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDetailsTest() throws ApiException {
        String id = null;
        String raw = null;
        String expand = null;
        String connectionToken = null;
        api.getDetails(id)
                .raw(raw)
                .expand(expand)
                .connectionToken(connectionToken)
                .execute();
        // TODO: test validations
    }

    /**
     * Historical Vehicle Stats
     *
     * List historical stats and logs about the vehicle.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getHistoricalStatsTest() throws ApiException {
        String vehicleId = null;
        String cursor = null;
        String limit = null;
        String expand = null;
        String startAt = null;
        String endAt = null;
        String types = null;
        String raw = null;
        String connectionToken = null;
        api.getHistoricalStats(vehicleId)
                .cursor(cursor)
                .limit(limit)
                .expand(expand)
                .startAt(startAt)
                .endAt(endAt)
                .types(types)
                .raw(raw)
                .connectionToken(connectionToken)
                .execute();
        // TODO: test validations
    }

    /**
     * Latest Vehicle Locations
     *
     * List the latest location of the vehicles in the connected account. This endpoint will call the provider&#39;s API in real time to get the latest location of the vehicle.  _Please note: this endpoint will exclude vehicles that have no last known location._
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getLatestLocationsTest() throws ApiException {
        String cursor = null;
        String limit = null;
        String raw = null;
        String vehicleIds = null;
        String expand = null;
        String connectionToken = null;
        api.getLatestLocations()
                .cursor(cursor)
                .limit(limit)
                .raw(raw)
                .vehicleIds(vehicleIds)
                .expand(expand)
                .connectionToken(connectionToken)
                .execute();
        // TODO: test validations
    }

    /**
     * Historical Vehicle Locations
     *
     * List the historical breadcrumb locations for a vehicle.  _Note:_  Given the large volume of location data available, we encourage customers to accept compressed (&#x60;gzip&#x60;) responses in order to maximize throughput. This is supported with many popular HTTP clients. Result limits vary depending on if results are compressed or not.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listHistoricalLocationsTest() throws ApiException {
        String vehicleId = null;
        String cursor = null;
        String limit = null;
        String startAt = null;
        String endAt = null;
        String raw = null;
        String connectionToken = null;
        api.listHistoricalLocations(vehicleId)
                .cursor(cursor)
                .limit(limit)
                .startAt(startAt)
                .endAt(endAt)
                .raw(raw)
                .connectionToken(connectionToken)
                .execute();
        // TODO: test validations
    }

}
