package pt.sharespot.iot.core.sensor.properties;

public enum PropertyName {
    DATA_ID {
        public String path() {
            return "dataId";
        }
    },
    DEVICE_ID {
        public String path() {
            return "device.id";
        }
    },
    DEVICE_NAME {
        public String path() {
            return "device.name";
        }
    },
    DEVICE_RECORDS {
        public String path() {
            return "device.records";
        }
    },
    READ_PERMISSIONS {
        public String path() {
            return "device.domains.read";
        }
    },
    READ_WRITE_PERMISSIONS {
        public String path() {
            return "device.domains.readWrite";
        }
    },
    REPORTED_AT {
        public String path() {
            return "reportedAt";
        }
    },
    LATITUDE {
        public String path() {
            return "data.gps.latitude";
        }
    },
    LONGITUDE {
        public String path() {
            return "data.gps.longitude";
        }
    },
    ALTITUDE {
        public String path() {
            return "data.gps.altitude";
        }
    },
    TEMPERATURE {
        public String path() {
            return "data.temp.celsius";
        }
    },
    MOTION {
        public String path() {
            return "data.motion.value";
        }
    },
    VELOCITY {
        public String path() {
            return "data.velocity.kmperh";
        }
    },
    AQI {
        public String path() {
            return "data.aqi.eaqi";
        }
    },
    HUMIDITY {
        public String path() {
            return "data.humidity.gramspercubicmeter";
        }
    },
    PRESSURE {
        public String path() {
            return "data.pressure.hPa";
        }
    },
    BATTERY_PERCENTAGE {
        public String path() {
            return "data.battery.percentage";
        }
    },
    BATTERY_VOLTS {
        public String path() {
            return "data.battery.volts";
        }
    },
    SOIL_MOISTURE {
        public String path() {
            return "data.moisture.percentage";
        }
    },
    ILLUMINANCE {
        public String path() {
            return "data.illuminance.lux";
        }
    },
    ALARM {
        public String path() {
            return "data.alarm.value";
        }
    };

    public String path() {
        return "";
    }
}
