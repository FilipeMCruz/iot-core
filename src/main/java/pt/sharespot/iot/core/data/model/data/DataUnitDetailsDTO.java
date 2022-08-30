package pt.sharespot.iot.core.data.model.data;

import pt.sharespot.iot.core.data.model.data.types.*;
import pt.sharespot.iot.core.data.model.properties.PropertyName;

public class DataUnitDetailsDTO {

    public GPSDataDTO gps;

    public TemperatureDataDTO temperature;

    public MotionDataDTO motion;

    public AirQualityDataDTO aqi;

    public VelocityDataDTO velocity;

    public AirHumidityDataDTO airHumidity;

    public AirPressureDataDTO airPressure;

    public BatteryDataDTO battery;

    public SoilMoistureDataDTO soilMoisture;

    public IlluminanceDataDTO illuminance;

    public TriggerDataDTO trigger;

    public WaterPressureDataDTO waterPressure;

    public DistanceDataDTO distance;

    public PHDataDTO ph;

    public OccupationDataDTO occupation;

    public SoilConductivityDataDTO soilConductivity;

    public CO2DataDTO co2;

    public CODataDTO co;

    public NH3DataDTO nh3;

    public NO2DataDTO no2;

    public O3DataDTO o3;

    public VOCDataDTO voc;

    public PM2_5DataDTO pm2_5;

    public PM10DataDTO pm10;

    public boolean hasProperty(PropertyName property) {
        return switch (property) {
            case ALTITUDE -> gps != null && gps.existsAltitude();
            case LATITUDE, LONGITUDE -> gps != null && gps.exists();
            case TEMPERATURE -> temperature != null && temperature.exists();
            case VELOCITY -> velocity != null && velocity.exists();
            case AIR_HUMIDITY_RELATIVE_PERCENTAGE -> airHumidity != null && airHumidity.existsRelativePercentage();
            case AIR_HUMIDITY_GRAMS_PER_CUBIC_METER -> airHumidity != null && airHumidity.existsGramsPerCubicMeter();
            case AIR_PRESSURE -> airPressure != null && airPressure.exists();
            case MOTION -> motion != null && motion.exists();
            case AQI -> aqi != null && aqi.exists();
            case BATTERY_PERCENTAGE -> battery != null && battery.existsPercentage();
            case BATTERY_VOLTS -> battery != null && battery.existsVolts();
            case SOIL_MOISTURE -> soilMoisture != null && soilMoisture.exists();
            case ILLUMINANCE -> illuminance != null && illuminance.exists();
            case WATER_PRESSURE -> waterPressure != null && waterPressure.exists();
            case BATTERY_MAX_VOLTS -> battery != null && battery.existsMaxVolts();
            case BATTERY_MIN_VOLTS -> battery != null && battery.existsMinVolts();
            case DISTANCE -> distance != null && distance.exists();
            case MAX_DISTANCE -> distance != null && distance.existsMaxDistance();
            case MIN_DISTANCE -> distance != null && distance.existsMinDistance();
            case PH -> ph != null && ph.exists();
            case OCCUPATION -> occupation != null && occupation.exists();
            case SOIL_CONDUCTIVITY -> soilConductivity != null && soilConductivity.exists();
            case CO2 -> co2 != null && co2.exists();
            case CO -> co != null && co.exists();
            case NH3 -> nh3 != null && nh3.exists();
            case NO2 -> no2 != null && no2.exists();
            case O3 -> o3 != null && o3.exists();
            case VOC -> voc != null && voc.exists();
            case PM2_5 -> pm2_5 != null && pm2_5.exists();
            case PM10 -> pm10 != null && pm10.exists();
            case TRIGGER -> trigger != null && trigger.exists();
            default -> false;
        };
    }

    public DataUnitDetailsDTO withCO2(CO2DataDTO co2) {
        this.co2 = co2;
        return this;
    }

    public DataUnitDetailsDTO withPM2_5(PM2_5DataDTO pm2_5) {
        this.pm2_5 = pm2_5;
        return this;
    }

    public DataUnitDetailsDTO withPM10(PM10DataDTO pm10) {
        this.pm10 = pm10;
        return this;
    }

    public DataUnitDetailsDTO withCO(CODataDTO co) {
        this.co = co;
        return this;
    }

    public DataUnitDetailsDTO withNH3(NH3DataDTO nh3) {
        this.nh3 = nh3;
        return this;
    }

    public DataUnitDetailsDTO withNO2(NO2DataDTO no2) {
        this.no2 = no2;
        return this;
    }

    public DataUnitDetailsDTO withO3(O3DataDTO o3) {
        this.o3 = o3;
        return this;
    }

    public DataUnitDetailsDTO withVOC(VOCDataDTO voc) {
        this.voc = voc;
        return this;
    }

    public DataUnitDetailsDTO withBattery(BatteryDataDTO battery) {
        this.battery = battery;
        return this;
    }

    public DataUnitDetailsDTO withSoilConductivity(SoilConductivityDataDTO soilConductivity) {
        this.soilConductivity = soilConductivity;
        return this;
    }

    public DataUnitDetailsDTO withOccupation(OccupationDataDTO occupation) {
        this.occupation = occupation;
        return this;
    }

    public DataUnitDetailsDTO withDistance(DistanceDataDTO distance) {
        this.distance = distance;
        return this;
    }

    public DataUnitDetailsDTO withPh(PHDataDTO ph) {
        this.ph = ph;
        return this;
    }

    public DataUnitDetailsDTO withWaterPressure(WaterPressureDataDTO waterPressure) {
        this.waterPressure = waterPressure;
        return this;
    }

    public DataUnitDetailsDTO withTrigger(TriggerDataDTO alarm) {
        this.trigger = alarm;
        return this;
    }

    public DataUnitDetailsDTO withIlluminance(IlluminanceDataDTO illuminance) {
        this.illuminance = illuminance;
        return this;
    }

    public DataUnitDetailsDTO withSoilMoisture(SoilMoistureDataDTO moisture) {
        this.soilMoisture = moisture;
        return this;
    }

    public DataUnitDetailsDTO withGps(GPSDataDTO gps) {
        this.gps = gps;
        return this;
    }

    public DataUnitDetailsDTO withTemperature(TemperatureDataDTO temperature) {
        this.temperature = temperature;
        return this;
    }

    public DataUnitDetailsDTO withMotion(MotionDataDTO motion) {
        this.motion = motion;
        return this;
    }

    public DataUnitDetailsDTO withAQI(AirQualityDataDTO aqi) {
        this.aqi = aqi;
        return this;
    }

    public DataUnitDetailsDTO withVelocity(VelocityDataDTO velocity) {
        this.velocity = velocity;
        return this;
    }

    public DataUnitDetailsDTO withAirHumidity(AirHumidityDataDTO humidity) {
        this.airHumidity = humidity;
        return this;
    }

    public DataUnitDetailsDTO withAirPressure(AirPressureDataDTO pressure) {
        this.airPressure = pressure;
        return this;
    }
}
