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
 * API tests for IssuesApi
 */
@Disabled
public class IssuesApiTest {

    private static IssuesApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new IssuesApi(apiClient);
    }

    /**
     * List Issues
     *
     * List all issues that have been observed by Terminal. Issues are generated when we observe something that may impact the completeness or accuracy of the data we provide but do not justify a full error. For example, if we lack permissions for a specific resource or need to skip an item due to invalid data.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listObservedEventsTest() throws ApiException {
        String limit = null;
        String cursor = null;
        String lastReportedAfter = null;
        String lastReportedBefore = null;
        String expand = null;
        String connectionId = null;
        String errorCode = null;
        String status = null;
        api.listObservedEvents()
                .limit(limit)
                .cursor(cursor)
                .lastReportedAfter(lastReportedAfter)
                .lastReportedBefore(lastReportedBefore)
                .expand(expand)
                .connectionId(connectionId)
                .errorCode(errorCode)
                .status(status)
                .execute();
        // TODO: test validations
    }

    /**
     * Resolve Issue
     *
     * Mark an issue&#39;s status as &#x60;resolved&#x60; until the issue is observed again.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void markResolvedTest() throws ApiException {
        String issueId = null;
        api.markResolved(issueId)
                .execute();
        // TODO: test validations
    }

}