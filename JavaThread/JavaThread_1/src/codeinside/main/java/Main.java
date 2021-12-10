package codeinside.main.java;

public class Main {
    static EggThread oneOption;
    static ChickenThread AnotherOption;

    public static void main(String[] args) {
        oneOption = new EggThread();
        AnotherOption = new ChickenThread();

        System.out.println("Что появилось раньше?");

        oneOption.start();
        AnotherOption.start();
        try {
            oneOption.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            AnotherOption.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
