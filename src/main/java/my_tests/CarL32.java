package my_tests;

public class CarL32 implements InterfaceLesson32, Interface2L32 {

    @Override
    public void go() {
        System.out.println ("We are driving");
    }

    @Override
    public void stop() {
        System.out.println ("We are stoping");
    }

    @Override
    public void method() {
        System.out.println ("Test method1");
    }

    @Override
    public void method1() {
        System.out.println ("Test method2");
    }


}
