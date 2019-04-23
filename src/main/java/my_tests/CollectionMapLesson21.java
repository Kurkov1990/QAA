package my_tests;

import java.util.*;

public class CollectionMapLesson21 {

    public static void main(String[] args) {

        Map<Integer, String>  map = new HashMap<>();

        map.put(1, "Black");
        map.put(2, "White");
        map.put(3, "Yellow");
        map.put(10, "green");

        map.get(1);

        System.out.println(map.get(1));

        System.out.println();
        System.out.println(map.size());
       // map.clear();

        System.out.println(map.containsKey(10));
        System.out.println(map.containsKey(15));


        System.out.println(map.containsValue("Black"));

        Set<Integer> keys = map.keySet();

        Iterator<Integer> iterator = keys.iterator();

        while (iterator.hasNext()) {
            System.out.println(map.get(iterator.next()));
        }

              System.out.println();
        System.out.println(map.get(2));
        map.put(2, "qwerty");
        System.out.println(map.get(2));


        Map<String, String> map2 = new HashMap<>();
        System.out.println();
        map2.put("bl", "Black");
        map2.put("wh", "White");
        System.out.println(map2.get(1));
        System.out.println(map2.get(2));





    }

}
