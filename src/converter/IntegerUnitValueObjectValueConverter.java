package converter;

public class IntegerUnitValueObjectValueConverter extends UnitValueObjectValueConverter {
    @Override
    protected ValueRecord<Integer, String> createValueRecord(String numericValue, String literalValue) throws NumberFormatException {
        Integer intValue = Integer.valueOf(numericValue);
        return new ValueRecord<>(intValue, literalValue);
    }

    /**
    public static void main(String[] args) {
        String test = "200-kva";
        IntegerUnitValueObjectValueConverter integerUnitValueObjectValueConverter = new IntegerUnitValueObjectValueConverter();
        var stringValueRecord = integerUnitValueObjectValueConverter.splitValue(test, "-");
        System.out.println("Value: " + stringValueRecord.getValue());
        System.out.println("Unit: " + stringValueRecord.getUnit());

        System.out.println("\n=======================\n=======================\n");

        test = "200kva";
        stringValueRecord = integerUnitValueObjectValueConverter.splitValue(test);
        System.out.println("Value: " + stringValueRecord.getValue());
        System.out.println("Unit: " + stringValueRecord.getUnit());
    }
     **/
}
