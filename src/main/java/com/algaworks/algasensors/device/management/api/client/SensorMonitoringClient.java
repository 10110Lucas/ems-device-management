package com.algaworks.algasensors.device.management.api.client;

import com.algaworks.algasensors.device.management.api.model.SensorMonitoringOutput;
import io.hypersistence.tsid.TSID;

public interface SensorMonitoringClient {

    void enbleMonitoring(TSID sensorId);
    void disableMonitoring(TSID sensorId);

    SensorMonitoringOutput getDetail(TSID sensorId);
}
