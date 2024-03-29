package pt.sharespot.iot.core.data.model.data.types;

public class SoilConductivityDataDTO implements DataTypeDTO {

    public Float microSiemensPerCentimeter;

    public static SoilConductivityDataDTO of(Float microSiemensPerCentimeter) {
        var dataDTO = new SoilConductivityDataDTO();
        dataDTO.microSiemensPerCentimeter = microSiemensPerCentimeter;
        return dataDTO;
    }

    @Override
    public boolean exists() {
        return microSiemensPerCentimeter != null;
    }
}
