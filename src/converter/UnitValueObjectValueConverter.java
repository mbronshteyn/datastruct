package converter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class UnitValueObjectValueConverter {

    private static final String DEFAULT_DELIMITER = "-";

    Pattern pattern = Pattern.compile("(\\d+(?:\\.\\d+)?)");

    public ValueRecord<? extends Number, String> splitValueWithDefaultDelimiter (String value) {
        return this.splitValue(value, DEFAULT_DELIMITER);
    }

    public ValueRecord<? extends Number, String> splitValue(String value, String delimiter) {
        if (value == null) {
            return null;
        }
        // remove delimiter as we will not need to look for numeric value
        return splitValue(value.replace(delimiter, ""));
    }

    public ValueRecord<? extends Number, String> splitValue(String value) {
        if (value == null) {
            return null;
        }
        String numericValue;
        String unitValue;
        Matcher matcher = pattern.matcher(value);
        // look for numeric value and get the rest as unit value
        if (matcher.find()) {
            numericValue = matcher.group();
            unitValue = value.substring(numericValue.length());
        } else {
            // this is a sample, add more meaningful error message, if needed
            throw new RuntimeException("Wrong input: " + value);
        }
        return createValueRecord(numericValue, unitValue);
    }

    protected abstract ValueRecord<? extends Number, String> createValueRecord(String numericValue, String literalValue) throws NumberFormatException;
}
