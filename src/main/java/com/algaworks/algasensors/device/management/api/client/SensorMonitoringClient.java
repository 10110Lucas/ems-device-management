package com.algaworks.algasensors.device.management.api.client;

import io.hypersistence.tsid.TSID;

public interface SensorMonitoringClient {

    void enbleMonitoring(TSID tsid);
    void disableMonitoring(TSID tsid);
}
