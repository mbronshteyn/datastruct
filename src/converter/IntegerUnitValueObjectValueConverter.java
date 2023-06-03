package converter;

public class IntegerUnitValueObjectValueConverter extends UnitValueObjectValueConverter {
    @Override
    protected ValueRecord<Integer, String> createValueRecord(String[] splitResult) throws NumberFormatException {
        Integer intValue = Integer.valueOf(splitResult[0]);
        return new ValueRecord<Integer, String>(intValue, splitResult[1]);
    }

    public static void main(String[] args) {
        String test = "200-kva";
        IntegerUnitValueObjectValueConverter integerUnitValueObjectValueConverter = new IntegerUnitValueObjectValueConverter();
        var stringValueRecord = integerUnitValueObjectValueConverter.splitValue(test, "-");
        System.out.println("Value: " + stringValueRecord.getValue());
        System.out.println("Unit: " + stringValueRecord.getUnit());
    }
}
