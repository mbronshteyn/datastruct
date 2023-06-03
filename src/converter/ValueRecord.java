package converter;

public class ValueRecord<T, String> {
    private T value;
    private String unit;

    public ValueRecord(T value, String unit) {
        this.value = value;
        this.unit = unit;
    }

    public T getValue() {
        return value;
    }

    public String getUnit() {
        return unit;
    }
}
