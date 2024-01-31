package preparation.preparation_11_wrapper;

public class Pair <K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        setKey(key);
        setValue(value);
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
