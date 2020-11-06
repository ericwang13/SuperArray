public class SuperArray {
    private String[] data;
    private int size;

    public SuperArray() {
        data = new String[10];
        size = 0;
    }

    public SuperArray(int initialCapacity) {
        data = new String[initialCapacity];
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean add(String element) {
        if (size >= data.length) {
            resize();
        }
        data[size] = element;
        size++;
        return true;
    }

    public void add(int index, String element) {
        String prev = element;
        String tmp;
        size++;
        for (int i = index; i < size; i++) {
            tmp = data[i];
            data[i] = prev;
            prev = tmp;
        }
    }

    public void remove(int index) {
        String prev = null;
        String tmp;
        for (int i = size; i >= index; i--) {
            tmp = data[i];
            data[i] = prev;
            prev = tmp;
        }
        size--;
    }

    public String get(int index) {
        return data[index];
    }

    public String set(int index, String element) {
        String replaced = data[index];
        data[index] = element;
        return replaced;
    }

    public void resize() {
        String[] original = data;
        data = new String[original.length * 2 + 1];
        for (int i = 0; i < original.length; i++) {
            data[i] = original[i];
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        data = new String[10];
        size = 0;
    }

    public String toString() {
        String result = "[" + data[0];
        for (int i = 1; i < size; i++) {
            result += ", " + data[i];
        }
        return result + "]";
    }
}