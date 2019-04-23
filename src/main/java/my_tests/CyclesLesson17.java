package my_tests;

public class CyclesLesson17 {
    public static void main(String[] args) {

        System.out.println("Start Program");

        for (int i=0; i < 10; i++) {
            System.out.println( i * 10);
        }

        System.out.println("End Program");

        for (int i=10; i>0; i--) {
            System.out.println(i);
        }

        int[] array = new int[10];

        for (int i=0; i<10; i++) {
            array[i] = i * 2;
        }

        for (int i=0; i<10; i++) {
            System.out.println("Element with index " + i + " " + array[i]);
        }

        // for each
        System.out.println();
        for (int element : array) {
            System.out.println(element);
        }


        int i = 0;
        boolean bool = true;
        while (bool) {
            System.out.println("While " + i);
            i++;
            if (i == 5) {
                bool = false;
            }
        }

        i =5 ;

        do {
            System.out.println("Do: " + i);
            i ++;
        } while (i < 5);




    }

}
