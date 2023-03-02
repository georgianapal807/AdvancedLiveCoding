package e17;

public class MeasurementConverter {

    public double converter(int value, ConversionType conversionType) {
        return value * conversionType.unit;
    }
}
