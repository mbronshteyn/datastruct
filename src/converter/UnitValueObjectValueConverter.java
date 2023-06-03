package converter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class UnitValueObjectValueConverter {

    Pattern pattern = Pattern.compile("(\\d+(?:\\.\\d+)?)");

    public ValueRecord<?, String> splitValue(String value, String delimiter) {
        if (value == null) {
            return null;
        }
        return splitValue(value.replace(delimiter, ""));
    }

    public ValueRecord<?, String> splitValue(String value) {
        if (value == null) {
            return null;
        }
        String[] parts = null;
        String numericValue = null;
        String unitValue = null;
        if (value.contains(".")) {
            Matcher matcher = pattern.matcher(value);
            if (matcher.find()) {
                numericValue = matcher.group();
                unitValue = value.substring(numericValue.length(), value.length());
            }
            String group = matcher.group();
        } else {
            parts = value.split("(?<=\\d)(?=\\D)");
            numericValue = parts[0];
            unitValue = parts[1];
        }
        return createValueRecord(numericValue, unitValue);
    }

    protected abstract ValueRecord<?, String> createValueRecord(String numericValue, String literalValue) throws NumberFormatException;
}
