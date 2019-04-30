package my_tests;

public class PlaneL32 implements InterfaceLesson32 {

    @Override
    public void go() {
        System.out.println ("We are flying");
    }

    @Override
    public void stop() {
        System.out.println ("We are landing");
    }

    public void getSpeed(int speed) {
        System.out.println ("Our speed: " + speed);
    }
}
