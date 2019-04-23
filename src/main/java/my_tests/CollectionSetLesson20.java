package my_tests;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionSetLesson20 {
    public static void main(String[] args) {


        Set<Integer> set = new HashSet<>();

        set.add(10);
        set.add(11);
        set.add(10);
        set.add(11);
        set.add(12);

        System.out.println(set.size());

        Iterator<Integer> iterator = set.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();
        for ( int i : set) {
            System.out.println(i);
        }

        System.out.println();
        set.remove(10);
        for ( int i : set) {
            System.out.println(i);
        }

        System.out.println(set.size());
        System.out.println(set.contains(11));
        set.clear();
        System.out.println(set.size());



    }
}
