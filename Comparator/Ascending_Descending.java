package Comparator;

import java.util.*;

public class Ascending_Descending {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(90);
        l.add(34);
        l.add(15);
        l.add(69);
        l.add(2);

        // Ascending...............................................................................................
        Collections.sort(l);

        // Descending..............................................................................................
        Comparator<Integer> cmp = new Comparator<>() {
            public int compare(Integer n1, Integer n2) {
                return n2 - n1;
            }
        };
        Collections.sort(l, cmp);

        // Lambda Function for
        // comparator...........................................................................
        Collections.sort(l, new Comparator<>() {
            public int compare(Integer n1, Integer n2) {
                return n2 - n1;
            }
        });

        System.out.println(l);
    }
}
