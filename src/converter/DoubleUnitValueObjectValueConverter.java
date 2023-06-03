package converter;

public class DoubleUnitValueObjectValueConverter extends UnitValueObjectValueConverter {
    @Override
    protected ValueRecord<Double, String> createValueRecord(String numericValue, String literalValue) throws NumberFormatException {
        var doubleValue = Double.valueOf(numericValue);
        return new ValueRecord<>(doubleValue, literalValue);
    }

    public static void main(String[] args) {
        String test = "200.0-kva";
        DoubleUnitValueObjectValueConverter doubleUnitValueObjectValueConverter = new DoubleUnitValueObjectValueConverter();
        var stringValueRecord = doubleUnitValueObjectValueConverter.splitValue(test, "-");
        System.out.println("Value: " + stringValueRecord.getValue());
        System.out.println("Unit: " + stringValueRecord.getUnit());
    }
}
