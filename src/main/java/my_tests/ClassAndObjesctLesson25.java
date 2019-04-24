package my_tests;

public class ClassAndObjesctLesson25 {

    public static void main(String[] args) {

        CarLesson25 car1 = new CarLesson25();
        car1.color="black";
        car1.length = 5000;
        car1.height = 2000;
        car1.width = 2000;

        car1.addWeight(50);
        car1.drive ( 120 );

        car1.addWeight(700);
        car1.drive ( 100 );

        CarLesson25 car2 = new CarLesson25();
        car2.color = "white";
        CarLesson25 car3 = new CarLesson25();
        car3.color = "Red";


        car2.drive ( 100 );
        car3.drive (150);

        CarLesson25 car4 = new CarLesson25("black");

        System.out.println ("car color is " + car4.color);


        CarLesson25 car5 = new CarLesson25(2000, 2100, 2000, "Black");
        System.out.println (car5.height + car5.color + car5.width + car5.length);

        System.out.println ();
        System.out.println (CarLesson25.var);
        CarLesson25.var = 100;

        System.out.println (car1.var);
        System.out.println (car2.var);
        System.out.println (car3.var);

        CarLesson25.method ();

        String.format( "New %s string", "String" );


    }
}