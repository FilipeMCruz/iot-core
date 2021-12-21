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
    TEMPERATURE {
        public String path() {
            return "data.temp.celsius";
        }
    };

    public String path() {
        return "";
    }
}
