package my_tests;

public class MethodsLessons22 {

    public static void main(String[] args) {

        int a = 13;
        int b = 3;

       int sum;
       String name = "Andrii";

       sum = getSum(a, b);
        System.out.println("Sum = " + sum );
       sum = getSum(10, 150);

        System.out.println("Sum = " + sum );
        System.out.println();
       showSum(10, 20, 40);

        System.out.println();
        saySmth();
        System.out.println();
        sayHello(name);

        showSumToPerson (name, a, b, sum);
        System.out.println();
        boolean result = (showSum(10, 11, 12));
        System.out.println(result);

        System.out.println();
        int result1;
        result1 = getSum(1, 10);
        System.out.println(result1);
        System.out.println();
       result1 = getSum(1, 5, 25);
        System.out.println(result1);

        sayHello ("name1", "name2");

        int[] array = {1, 10, 12, 8};

        int sum3 = getSum (array, "Jack");
        System.out.println(sum3 + 100);


    }

    static int getSum(int x, int y) {
        int sum;
        sum = x + y;
        return sum;
    }


    static int getSum(int x, int y, int z) {
        int sum;
        sum = x + y + z;
        return sum;
    }

    static int getSum (int[] array, String name) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Hi " + name);
        System.out.println("Your sum is " + sum );
        return sum;
    }


    static boolean showSum (int x, int y, int z) {
        int sum;
        sum =x+y+z;
        System.out.println("Sum is " + sum);
        return true;
    }


    static void saySmth () {
        System.out.println("Hello");
        System.out.println("I'm running!");
        System.out.println("You see me");
    }


    static void sayHello (String name) {
        System.out.println("Hello " + name + "!");
        System.out.println("Nice to meet you");
    }

    static void sayHello (String name1, String name2) {
        System.out.println("Hello " + name1 + "!");
        System.out.println("Hello " + name2 + "!");
        System.out.println("Nice to meet you");
    }


    static  void showSumToPerson (String name, int a, int b, int c) {
        System.out.println("Start of program");
        sayHello(name);
        showSum(a, b, c);
        System.out.println("End of Program");
    }




}
