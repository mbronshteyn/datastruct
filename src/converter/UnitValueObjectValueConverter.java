package converter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class UnitValueObjectValueConverter {

    Pattern pattern = Pattern.compile("(\\d+(?:\\.\\d+)?)");

    public ValueRecord<? extends Number, String> splitValue(String value, String delimiter) {
        if (value == null) {
            return null;
        }
        return splitValue(value.replace(delimiter, ""));
    }

    public ValueRecord<? extends Number, String> splitValue(String value) {
        if (value == null) {
            return null;
        }
        String numericValue;
        String unitValue;
        Matcher matcher = pattern.matcher(value);
        if (matcher.find()) {
            numericValue = matcher.group();
            unitValue = value.substring(numericValue.length());
        } else {
            throw new RuntimeException("Wrong input: " + value);
        }
        return createValueRecord(numericValue, unitValue);
    }

    protected abstract ValueRecord<? extends Number, String> createValueRecord(String numericValue, String literalValue) throws NumberFormatException;
}
