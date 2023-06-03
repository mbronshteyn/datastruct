package converter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class UnitValueObjectValueConverter {

    Pattern patternNumeric = Pattern.compile("\\d+");
    Pattern patternLiteral = Pattern.compile("\\D+");

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
        String[] parts;
        if (value.contains(".")) {
            parts = value.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");
        } else {
            parts = value.split("(?<=\\d)(?=\\D)");
        }
        return createValueRecord(parts[0], parts[1]);
    }

    protected abstract ValueRecord<?, String> createValueRecord(String numericValue, String literalValue) throws NumberFormatException;
}
