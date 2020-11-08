public class Demo {
    public static void removeDuplicates(SuperArray s) {
        for (int i = 0; i < s.size(); i++) {
            if (s.indexOf(s.get(i)) < i) {
                s.remove(i);
                i--;
            }
        }
    }

    public static SuperArray findOverlap(SuperArray a, SuperArray b) {
        SuperArray overlap = new SuperArray();
        for (int i = 0; i < a.size(); i++) {
            if (b.contains(a.get(i))) {
                overlap.add(a.get(i));
            }
        }
        removeDuplicates(overlap);
        return overlap;
    }
}