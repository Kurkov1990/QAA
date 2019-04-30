package my_tests;

public class InterfacesL32 {
    public static void main(String[] args) {

        CarL32 car = new CarL32 ();
        PlaneL32 plane = new PlaneL32 ();

        car.go();
        car.stop();

        car.method ();
        car.method1 ();

        plane.go ();
        plane.stop ();

    }
}
