import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set {

    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();
        // Set<Integer> set1=new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(2);
        System.out.println("HashSet "+set+" always random.");

        System.out.println();
        TreeSet<Integer> set2 = new TreeSet<>();
        // Set<Integer> set1=new HashSet<>();
        set2.add(10);
        set2.add(20);
        set2.add(2);
        System.out.println("TreeSet "+set2+" always sorted.");
        System.out.println();

        LinkedHashSet<Integer> set3 = new LinkedHashSet<>();
        // Set<Integer> set1=new HashSet<>();
        set3.add(10);
        set3.add(20);
        set3.add(2);
        System.out.println("LinkedHashSet "+set3+" same order as input.");
    }
}