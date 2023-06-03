package converter;

public abstract class UnitValueObjectValueConverter {

    public ValueRecord<?, String> splitValue(String value, String delimiter) {
        if (value == null) {
            return null;
        }

        var splitResult = value.split(delimiter);

        return createValueRecord(splitResult);
    }

    protected abstract ValueRecord<?, String> createValueRecord(String[] splitResult) throws NumberFormatException;
}
