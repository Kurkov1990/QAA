package my_tests;

public class AnimalL28 {

    String name;
    String color;

    public int var;
    private int var1;
    protected int var3;

    int var4; //package


    public void Walk (String place) {
        System.out.println ("We are walking here: " + place);
        var = 10;
    }

    public void sleep (String sleep) {
        System.out.println ("Zzzzz");
        var1 = 20;
        var3 = 50;
        var4 = 70;
    }

    public void sound () {
        System.out.println ("Hello");
    }


}
