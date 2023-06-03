package converter;

public class DoubleUnitValueObjectValueConverter extends UnitValueObjectValueConverter {
    @Override
    protected ValueRecord<Double, String> createValueRecord(String[] splitResult) throws NumberFormatException {
        var doubleValue = Double.valueOf(splitResult[0]);
        return new ValueRecord<Double, String>(doubleValue, splitResult[1]);
    }

    public static void main(String[] args) {
        String test = "200.0-kva";
        DoubleUnitValueObjectValueConverter doubleUnitValueObjectValueConverter = new DoubleUnitValueObjectValueConverter();
        var stringValueRecord = doubleUnitValueObjectValueConverter.splitValue(test, "-");
        System.out.println("Value: " + stringValueRecord.getValue());
        System.out.println("Unit: " + stringValueRecord.getUnit());
    }
}
