package com.konfigthis.client;

import com.konfigthis.client.api.AuthenticationApi;
import com.konfigthis.client.api.ConnectionsApi;
import com.konfigthis.client.api.DataManagementApi;
import com.konfigthis.client.api.DevicesApi;
import com.konfigthis.client.api.DriversApi;
import com.konfigthis.client.api.GroupsApi;
import com.konfigthis.client.api.HoursOfServiceApi;
import com.konfigthis.client.api.IftaApi;
import com.konfigthis.client.api.IssuesApi;
import com.konfigthis.client.api.ProvidersApi;
import com.konfigthis.client.api.SafetyApi;
import com.konfigthis.client.api.TrailersApi;
import com.konfigthis.client.api.TripsApi;
import com.konfigthis.client.api.VehiclesApi;

public class Terminal {
    private ApiClient apiClient;
    public final AuthenticationApi authentication;
    public final ConnectionsApi connections;
    public final DataManagementApi dataManagement;
    public final DevicesApi devices;
    public final DriversApi drivers;
    public final GroupsApi groups;
    public final HoursOfServiceApi hoursOfService;
    public final IftaApi ifta;
    public final IssuesApi issues;
    public final ProvidersApi providers;
    public final SafetyApi safety;
    public final TrailersApi trailers;
    public final TripsApi trips;
    public final VehiclesApi vehicles;

    public Terminal() {
        this(null);
    }

    public Terminal(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.authentication = new AuthenticationApi(this.apiClient);
        this.connections = new ConnectionsApi(this.apiClient);
        this.dataManagement = new DataManagementApi(this.apiClient);
        this.devices = new DevicesApi(this.apiClient);
        this.drivers = new DriversApi(this.apiClient);
        this.groups = new GroupsApi(this.apiClient);
        this.hoursOfService = new HoursOfServiceApi(this.apiClient);
        this.ifta = new IftaApi(this.apiClient);
        this.issues = new IssuesApi(this.apiClient);
        this.providers = new ProvidersApi(this.apiClient);
        this.safety = new SafetyApi(this.apiClient);
        this.trailers = new TrailersApi(this.apiClient);
        this.trips = new TripsApi(this.apiClient);
        this.vehicles = new VehiclesApi(this.apiClient);
    }

}
