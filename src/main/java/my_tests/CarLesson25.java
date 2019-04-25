package my_tests;

public class CarLesson25 {


    public CarLesson25() {
        System.out.println ("New car created!");
    }

    public CarLesson25(String color) {
       this.color = color;
    }


    public CarLesson25(int height, int width, int length, String color) {
        this.color = color;
        this.height = height;
        this.length = length;
        this.width = width;
    }


    static int var = 10; // final is used for define constants
    static void method() {
        System.out.println ("Static method.");
    }

    int height;
    int width;
    int length;
    int weight = 2000;
    int maxWeight = 2700;
    String color;
    int speed;
    int maxSpeed = 260;


    public void addWeight(int weight) {
        this.weight+= weight;
        System.out.println ("New weight " + this.weight);
    }

    public void drive(int speed) {
        if (weight <= maxWeight) {
            this.speed = speed;
            System.out.println ("We are driving");
        } else {
            System.out.println ("Cannot drive");
        }
    }

}
