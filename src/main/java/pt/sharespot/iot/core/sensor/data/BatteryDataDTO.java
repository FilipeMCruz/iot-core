package pt.sharespot.iot.core.sensor.data;

public class BatteryDataDTO implements DataTypeDTO {

    public Float percentage;
    public Float volts;

    public Float maxVolts;

    public Float minVolts;

    public BatteryDataDTO andVolts(Float volts) {
        this.volts = volts;
        return this;
    }

    public BatteryDataDTO andPercentage(Float percentage) {
        this.percentage = percentage;
        return this;
    }

    public static BatteryDataDTO ofPercentage(Float percentage) {
        var batteryDataDTO = new BatteryDataDTO();
        batteryDataDTO.percentage = percentage;
        return batteryDataDTO;
    }

    public static BatteryDataDTO ofVolts(Float volts) {
        var batteryDataDTO = new BatteryDataDTO();
        batteryDataDTO.volts = volts;
        return batteryDataDTO;
    }

    public BatteryDataDTO with(Float maxVolts, Float minVolts) {
        var batteryDataDTO = new BatteryDataDTO();
        batteryDataDTO.maxVolts = maxVolts;
        batteryDataDTO.minVolts = minVolts;
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

    public boolean existsMaxVolts() {
        return maxVolts != null;
    }

    public boolean existsMinVolts() {
        return minVolts != null;
    }
}
