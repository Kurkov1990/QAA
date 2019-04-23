package my_tests;

public class LogicOperatorsLesson14 {

    public static void main(String[] args) {

        int a;
        a = 10;
        int b = a;
        System.out.println(b);

        int c, d;

        c=d=b;

        System.out.println(c + " " + d);

        a = 13;
        b = 5;
        System.out.println(a % b);

        a = 15;
        b = 10;
        System.out.println();
        System.out.println(a > b);
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(!(true)); //oposition

        int i=0;
        i++;
        System.out.println(i);
        i--;
        System.out.println(i);
        i=5;
        System.out.println(i++);

        i=3;
        a= i++;
        System.out.println(a);
        i=3;
        a=++i;
        System.out.println(a);

        a=10;
        b=20;

        System.out.println(a > b || a < b); //or
        System.out.println(a > b && a < b); // and


        a=9;
        System.out.println(Math.pow(a,3));
        System.out.println(Math.sqrt(a));

        a=10;
        a+=5;
        System.out.println(a);



    }
}
