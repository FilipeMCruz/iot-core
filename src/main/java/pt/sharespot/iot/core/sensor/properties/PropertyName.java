package pt.sharespot.iot.core.sensor.properties;

public enum PropertyName {
    DATA_ID {
        public String path(Integer sensorID) {
            return "dataId";
        }
    }, DEVICE_ID {
        public String path(Integer sensorID) {
            return "device.id";
        }
    }, DEVICE_NAME {
        public String path(Integer sensorID) {
            return "device.name";
        }
    }, DEVICE_RECORDS {
        public String path(Integer sensorID) {
            return "device.records";
        }
    }, READ_PERMISSIONS {
        public String path(Integer sensorID) {
            return "device.domains.read";
        }
    }, READ_WRITE_PERMISSIONS {
        public String path(Integer sensorID) {
            return "device.domains.readWrite";
        }
    }, REPORTED_AT {
        public String path(Integer sensorID) {
            return "reportedAt";
        }
    }, LATITUDE {
        public String path(Integer sensorID) {
            return "measures." + sensorID + ".gps.latitude";
        }
    }, LONGITUDE {
        public String path(Integer sensorID) {
            return "measures." + sensorID + ".gps.longitude";
        }
    }, ALTITUDE {
        public String path(Integer sensorID) {
            return "measures." + sensorID + ".gps.altitude";
        }
    }, TEMPERATURE {
        public String path(Integer sensorID) {
            return "measures." + sensorID + ".temperature.celsius";
        }
    }, MOTION {
        public String path(Integer sensorID) {
            return "measures." + sensorID + ".motion.value";
        }
    }, VELOCITY {
        public String path(Integer sensorID) {
            return "measures." + sensorID + ".velocity.kilometersPerHour";
        }
    }, AQI {
        public String path(Integer sensorID) {
            return "measures." + sensorID + ".aqi.value";
        }
    }, AIR_HUMIDITY_GRAMS_PER_CUBIC_METER {
        public String path(Integer sensorID) {
            return "measures." + sensorID + ".airHumidity.gramsPerCubicMeter";
        }
    }, AIR_HUMIDITY_RELATIVE_PERCENTAGE {
        public String path(Integer sensorID) {
            return "measures." + sensorID + ".airHumidity.relativePercentage";
        }
    }, AIR_PRESSURE {
        public String path(Integer sensorID) {
            return "measures." + sensorID + ".airPressure.hectoPascal";
        }
    }, WATER_PRESSURE {
        public String path(Integer sensorID) {
            return "measures." + sensorID + ".waterPressure.bar";
        }
    }, BATTERY_PERCENTAGE {
        public String path(Integer sensorID) {
            return "measures." + sensorID + ".battery.percentage";
        }
    }, BATTERY_VOLTS {
        public String path(Integer sensorID) {
            return "measures." + sensorID + ".battery.volts";
        }
    }, BATTERY_MIN_VOLTS {
        public String path(Integer sensorID) {
            return "measures." + sensorID + ".battery.minVolts";
        }
    }, BATTERY_MAX_VOLTS {
        public String path(Integer sensorID) {
            return "measures." + sensorID + ".battery.maxVolts";
        }
    }, PH {
        public String path(Integer sensorID) {
            return "measures." + sensorID + ".ph.value";
        }
    }, SOIL_MOISTURE {
        public String path(Integer sensorID) {
            return "measures." + sensorID + ".soilMoisture.relativePercentage";
        }
    }, ILLUMINANCE {
        public String path(Integer sensorID) {
            return "measures." + sensorID + ".illuminance.lux";
        }
    }, TRIGGER {
        public String path(Integer sensorID) {
            return "measures." + sensorID + ".trigger.value";
        }
    }, DISTANCE {
        public String path(Integer sensorID) {
            return "measures." + sensorID + ".distance.millimeters";
        }
    }, MIN_DISTANCE {
        public String path(Integer sensorID) {
            return "measures." + sensorID + ".distance.minMillimeters";
        }
    }, MAX_DISTANCE {
        public String path(Integer sensorID) {
            return "measures." + sensorID + ".distance.maxMillimeters";
        }
    }, OCCUPATION {
        public String path(Integer sensorID) {
            return "measures." + sensorID + ".occupation.percentage";
        }
    }, SOIL_CONDUCTIVITY {
        public String path(Integer sensorID) {
            return "measures." + sensorID + ".soilConductivity.microSiemensPerCentimeter";
        }
    }, CO2 {
        public String path(Integer sensorID) {
            return "measures." + sensorID + ".co2.ppm";
        }
    }, CO {
        public String path(Integer sensorID) {
            return "measures." + sensorID + ".co.ppm";
        }
    }, NH3 {
        public String path(Integer sensorID) {
            return "measures." + sensorID + ".nh3.ppm";
        }
    }, O3 {
        public String path(Integer sensorID) {
            return "measures." + sensorID + ".o3.ppm";
        }
    }, NO2 {
        public String path(Integer sensorID) {
            return "measures." + sensorID + ".no2.ppm";
        }
    }, VOC {
        public String path(Integer sensorID) {
            return "measures." + sensorID + ".voc.ppm";
        }
    }, PM2_5 {
        public String path(Integer sensorID) {
            return "measures." + sensorID + ".pm2_5.microGramsPerCubicMeter";
        }
    }, PM10 {
        public String path(Integer sensorID) {
            return "measures." + sensorID + ".pm10.microGramsPerCubicMeter";
        }
    }, DEVICE_DOWNLINK {
        public String path(Integer sensorID) {
            return "device.downlink";
        }
    };

    public String path(Integer sensorID) {
        return "";
    }
}
