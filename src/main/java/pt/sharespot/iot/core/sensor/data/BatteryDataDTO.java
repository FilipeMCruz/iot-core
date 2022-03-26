package pt.sharespot.iot.core.sensor.data;

public class BatteryDataDTO implements DataTypeDTO {

    public Double percentage;
    public Double volts;

    public BatteryDataDTO andVolts(Double volts) {
        this.volts = volts;
        return this;
    }

    public BatteryDataDTO andPercentage(Double percentage) {
        this.percentage = percentage;
        return this;
    }

    public static BatteryDataDTO withPercentage(Double percentage) {
        var batteryDataDTO = new BatteryDataDTO();
        batteryDataDTO.percentage = percentage;
        return batteryDataDTO;
    }

    public static BatteryDataDTO withVolts(Double volts) {
        var batteryDataDTO = new BatteryDataDTO();
        batteryDataDTO.volts = volts;
        return batteryDataDTO;
    }

    @Override
    public boolean exists() {
        return volts != null || percentage != null;
    }

    public boolean existsPercentage() {
        return percentage != null;
    }

    public boolean existsVolts() {
        return volts != null;
    }
}
