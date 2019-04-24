package my_tests;

public class ExceptionsLesson24 {

    public static void main(String[] args) {
        devide(10, 0);
        devide2(10, 1);

        try {
            devide(10, 0);
        } catch (ArithmeticException e) {
            e.printStackTrace ();
        }

    }

    public static void devide (int a, int b) { // ctrl + alt + T
        try {
            System.out.println ( "Result: " + a/b );
        } catch (ArithmeticException e) {
            System.out.println ("Problem!");
        } catch (ArrayIndexOutOfBoundsException ex) {
        }
        finally {
            System.out.println ("finish");
        }
    }

    public static void devide2 (int a, int b) { // ctrl + alt + T
        if (b == 0) {
            throw new ArithmeticException ( "Cannot devide by zero!");
        } else
        System.out.println ( "Result: " + a/b );

    }

}
