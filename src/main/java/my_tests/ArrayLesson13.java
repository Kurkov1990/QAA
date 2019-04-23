package my_tests;

import com.sun.xml.bind.v2.runtime.output.SAXOutput;

public class ArrayLesson13 {

    public static void main(String[] args) {
       String[] names;
       names = new String[3];

       String[] name = new String[3];
       int[] arg = new int[10];

        name[0]="Vasya";
        name[1]="Vasya1";
        name[2]="Vasya3";
        System.out.println(name[0]);
        System.out.println(name[1]);

        arg[3]=15;
        arg[3]=10;
        System.out.println(arg[3]);

        int [] array = {15,12,10,100, 500, 300};
        System.out.println();

        for (int i=0; i < 5; i++) {
            System.out.println(array[i]);
        }

        int[] arr2 = new int[15];

        for (int j=0; j<15; j++) {
            arr2[j] = j*10;
            System.out.println(arr2[j]);
        }
        System.out.println();
        System.out.println(arr2.length);
        System.out.println(arr2[arr2.length-1]);
    }
}
