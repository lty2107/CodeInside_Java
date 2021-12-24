package codeinside.main.java_1;

public class Main {
    static EggThread oneOption;
    static ChickenThread AnotherOption;

    public static void main(String[] args) {
        oneOption = new EggThread();
        AnotherOption = new ChickenThread();

        System.out.println("Что появилось раньше?");

        oneOption.start();
        AnotherOption.start();

        if (oneOption.isAlive()){
            try {
                oneOption.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Яйцо победило");
        }
        else {
            System.out.println("Курица победила");
        }
    }
}
