public class SuperArray {
    private String[] data;
    private int size;

    public SuperArray() {
        data = new String[10];
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
        data = new String[original.length + 1];
        for (int i = 0; i < original.length; i++) {
            data[i] = original[i];
        }
    }
}