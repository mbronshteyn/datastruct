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

        var splitResult = value.split(delimiter);

        return createValueRecord(splitResult[0], splitResult[1]);
    }

    public ValueRecord<?, String> splitValue(String value) {
        if (value == null) {
            return null;
        }

        Matcher matcher = patternLiteral.matcher(value);
        String literalPart = null;
        if (matcher.find()) {
           literalPart = matcher.group();
        }

        matcher = patternNumeric.matcher(value);
        String numericPart = null;
        if (matcher.find()) {
            numericPart = matcher.group();
        }

        return createValueRecord(numericPart, literalPart );
    }

    protected abstract ValueRecord<?, String> createValueRecord(String numericValue, String literalValue) throws NumberFormatException;
}
