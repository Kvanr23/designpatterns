package Opdracht2;

public class App {
    public static void main(String[] args) {
        Motor motor = new Motor();
        motor.start();
        System.out.println(motor.isRunning());
        motor.stop();
        System.out.println(motor.isRunning());
    }
}
