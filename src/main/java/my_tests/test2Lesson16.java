public class test2Lesson16 {
    public static void main(String[] args) {
        int i = 3;
        System.out.println("Start of Program");
        if (i > 10) {
            System.out.println("i > 10");
            i++;
            System.out.println(i);
        }
        else if (i < 10 && i > 5) {
            System.out.println("i < 10 and i > 5 ");
            i--;
            System.out.println(i);
        }
        else {
            System.out.println("Nothing");
        }
        System.out.println("End of Program");

        i = 60;
        if (i > 50) {
            System.out.println("i > 50");
            if (i > 90) {
                System.out.println("i > 90");
            }
            else {
                System.out.println("I<=90");
            }
        }
        else {
            System.out.println("i<=50");
        }

        i = 10;
        switch (i) {
            case 1:
                System.out.println("then number is 1");
                break;
            case 2:
                System.out.println("then number is 2");
                break;
            case 3:
                System.out.println("then number is 3");
                break;
            default:
                System.out.println("I don't know this number");
                break;
        }
    }
}
