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

    }


    static int getSum(int x, int y) {
        int sum;
        sum = x + y;
        return sum;
    }


    static void showSum (int x, int y, int z) {
        int sum;
        sum =x+y+z;
        System.out.println("Sum is " + sum);
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


    static  void showSumToPerson (String name, int a, int b, int c) {
        System.out.println("Start of program");
        sayHello(name);
        showSum(a, b, c);
        System.out.println("End of Program");
    }







}
