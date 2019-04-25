package my_tests;

public class ImitationLesson28 {

    public static void main(String[] args) {

        CatL28 cat = new CatL28();
        DogL28 dog = new DogL28 ();

        cat.name = "Vasya";
        dog.name = "Bobik";

        cat.color = "White";
        dog.color = "Black";

        cat.Walk ( "Park" );
        dog.Walk ( "Backyard" );

        cat.feed ( "milk" );
        dog.sit ();

        dog.var = 10;

        dog.setWeight ( 2 );

        dog.sound ();
        cat.sound ();


    }

}
