package pt.sharespot.iot.core.sensor.routing.keys.data;

import pt.sharespot.iot.core.keys.RoutingKey;
import pt.sharespot.iot.core.keys.RoutingKeyOption;

public enum AirQualityDataOptions implements RoutingKey {
    UNIDENTIFIED_AQI_DATA,
    WITH_AQI_DATA,
    WITHOUT_AQI_DATA;

    public String value() {
        if (this == UNIDENTIFIED_AQI_DATA) {
            return "u";
        } else if (this == WITH_AQI_DATA) {
            return "y";
        } else {
            return "n";
        }
    }

    public String details() {
        return this.toString().toLowerCase();
    }

    public static RoutingKeyOption<AirQualityDataOptions> extract(String value) {
        if (value.equalsIgnoreCase("u")) {
            return RoutingKeyOption.of(AirQualityDataOptions.UNIDENTIFIED_AQI_DATA);
        } else if (value.equalsIgnoreCase("y")) {
            return RoutingKeyOption.of(AirQualityDataOptions.WITH_AQI_DATA);
        } else if (value.equalsIgnoreCase("n")) {
            return RoutingKeyOption.of(AirQualityDataOptions.WITHOUT_AQI_DATA);
        } else {
            return RoutingKeyOption.any();
        }
    }
}
