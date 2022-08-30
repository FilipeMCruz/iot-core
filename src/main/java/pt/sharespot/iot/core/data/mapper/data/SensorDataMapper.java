package pt.sharespot.iot.core.data.mapper.data;

import pt.sharespot.iot.core.data.model.data.DataUnitDetailsDTO;
import pt.sharespot.iot.core.data.model.properties.PropertyName;
import pt.sharespot.iot.core.data.buf.SensorData;

public class SensorDataMapper {

    public static SensorData.Builder toBuf(DataUnitDetailsDTO dto) {
        var builder = SensorData.newBuilder();

        if (dto.hasProperty(PropertyName.AQI)) builder.setAqi(AirQualityMapper.toBuf(dto.aqi));

        if (dto.hasProperty(PropertyName.TRIGGER)) builder.setTrigger(TriggerMapper.toBuf(dto.trigger));

        if (dto.hasProperty(PropertyName.BATTERY_VOLTS) || dto.hasProperty(PropertyName.BATTERY_PERCENTAGE))
            builder.setBattery(BatteryMapper.toBuf(dto.battery));

        if (dto.hasProperty(PropertyName.LONGITUDE) || dto.hasProperty(PropertyName.LATITUDE) || dto.hasProperty(PropertyName.ALTITUDE))
            builder.setGps(GPSMapper.toBuf(dto.gps));

        if (dto.hasProperty(PropertyName.AIR_HUMIDITY_RELATIVE_PERCENTAGE) || dto.hasProperty(PropertyName.AIR_HUMIDITY_GRAMS_PER_CUBIC_METER))
            builder.setAirHumidity(AirHumidityMapper.toBuf(dto.airHumidity));

        if (dto.hasProperty(PropertyName.ILLUMINANCE))
            builder.setIlluminance(IlluminanceMapper.toBuf(dto.illuminance));

        if (dto.hasProperty(PropertyName.MOTION))
            builder.setMotion(MotionMapper.toBuf(dto.motion));

        if (dto.hasProperty(PropertyName.AIR_PRESSURE))
            builder.setAirPressure(AirPressureMapper.toBuf(dto.airPressure));

        if (dto.hasProperty(PropertyName.WATER_PRESSURE))
            builder.setWaterPressure(WaterPressureMapper.toBuf(dto.waterPressure));

        if (dto.hasProperty(PropertyName.SOIL_MOISTURE))
            builder.setSoilMoisture(SoilMoistureMapper.toBuf(dto.soilMoisture));

        if (dto.hasProperty(PropertyName.TEMPERATURE))
            builder.setTemperature(TemperatureMapper.toBuf(dto.temperature));

        if (dto.hasProperty(PropertyName.VELOCITY))
            builder.setVelocity(VelocityMapper.toBuf(dto.velocity));

        if (dto.hasProperty(PropertyName.PH))
            builder.setPh(PHMapper.toBuf(dto.ph));

        if (dto.hasProperty(PropertyName.DISTANCE))
            builder.setDistance(DistanceMapper.toBuf(dto.distance));

        if (dto.hasProperty(PropertyName.OCCUPATION))
            builder.setOccupation(OccupationMapper.toBuf(dto.occupation));

        if (dto.hasProperty(PropertyName.SOIL_CONDUCTIVITY))
            builder.setSoilConductivity(SoilConductivityMapper.toBuf(dto.soilConductivity));

        if (dto.hasProperty(PropertyName.CO2))
            builder.setCo2(CO2Mapper.toBuf(dto.co2));

        if (dto.hasProperty(PropertyName.CO))
            builder.setCo(COMapper.toBuf(dto.co));

        if (dto.hasProperty(PropertyName.NH3))
            builder.setNh3(NH3Mapper.toBuf(dto.nh3));

        if (dto.hasProperty(PropertyName.NO2))
            builder.setNo2(NO2Mapper.toBuf(dto.no2));

        if (dto.hasProperty(PropertyName.O3))
            builder.setO3(O3Mapper.toBuf(dto.o3));

        if (dto.hasProperty(PropertyName.VOC))
            builder.setVoc(VOCMapper.toBuf(dto.voc));

        if (dto.hasProperty(PropertyName.PM10))
            builder.setPm10(PM10Mapper.toBuf(dto.pm10));

        if (dto.hasProperty(PropertyName.PM2_5))
            builder.setPm25(PM2_5Mapper.toBuf(dto.pm2_5));

        return builder;
    }

    public static DataUnitDetailsDTO toModel(SensorData buf) {
        var model = new DataUnitDetailsDTO();

        if (buf.hasAqi())
            model.withAQI(AirQualityMapper.toModel(buf.getAqi()));

        if (buf.hasTrigger())
            model.withTrigger(TriggerMapper.toModel(buf.getTrigger()));

        if (buf.hasBattery())
            model.withBattery(BatteryMapper.toModel(buf.getBattery()));

        if (buf.hasGps())
            model.withGps(GPSMapper.toModel(buf.getGps()));

        if (buf.hasAirHumidity())
            model.withAirHumidity(AirHumidityMapper.toModel(buf.getAirHumidity()));

        if (buf.hasIlluminance())
            model.withIlluminance(IlluminanceMapper.toModel(buf.getIlluminance()));

        if (buf.hasMotion())
            model.withMotion(MotionMapper.toModel(buf.getMotion()));

        if (buf.hasAirPressure())
            model.withAirPressure(AirPressureMapper.toModel(buf.getAirPressure()));

        if (buf.hasSoilMoisture())
            model.withSoilMoisture(SoilMoistureMapper.toModel(buf.getSoilMoisture()));

        if (buf.hasTemperature())
            model.withTemperature(TemperatureMapper.toModel(buf.getTemperature()));

        if (buf.hasVelocity())
            model.withVelocity(VelocityMapper.toModel(buf.getVelocity()));

        if (buf.hasPh())
            model.withPh(PHMapper.toModel(buf.getPh()));

        if (buf.hasDistance())
            model.withDistance(DistanceMapper.toModel(buf.getDistance()));

        if (buf.hasOccupation())
            model.withOccupation(OccupationMapper.toModel(buf.getOccupation()));

        if (buf.hasSoilConductivity())
            model.withSoilConductivity(SoilConductivityMapper.toModel(buf.getSoilConductivity()));

        if (buf.hasCo2())
            model.withCO2(CO2Mapper.toModel(buf.getCo2()));

        if (buf.hasCo())
            model.withCO(COMapper.toModel(buf.getCo()));

        if (buf.hasNh3())
            model.withNH3(NH3Mapper.toModel(buf.getNh3()));

        if (buf.hasNo2())
            model.withNO2(NO2Mapper.toModel(buf.getNo2()));

        if (buf.hasO3())
            model.withO3(O3Mapper.toModel(buf.getO3()));

        if (buf.hasVoc())
            model.withVOC(VOCMapper.toModel(buf.getVoc()));

        if (buf.hasPm25())
            model.withPM2_5(PM2_5Mapper.toModel(buf.getPm25()));

        if (buf.hasPm10())
            model.withPM10(PM10Mapper.toModel(buf.getPm10()));

        if (buf.hasWaterPressure())
            model.withWaterPressure(WaterPressureMapper.toModel(buf.getWaterPressure()));

        return model;
    }
}
