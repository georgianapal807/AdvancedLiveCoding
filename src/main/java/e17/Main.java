package e17;

public class Main {
    public static void main(String[] args) {

        MeasurementConverter measurementConverter1 = new MeasurementConverter();
        System.out.println(measurementConverter1.converter(2, ConversionType.CENTIMETERS_TO_INCHES));
    }
}
