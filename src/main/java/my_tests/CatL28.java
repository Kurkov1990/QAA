package my_tests;

public class CatL28 extends AnimalL28 {

    public void feed (String feed) {
        System.out.println ("I'm like: " + feed);
    }

    @Override
    public void sound() {
        System.out.println("Mew mew mew");
    }

}
