package Opdracht2;
import java.util.Random;


public class Motor {

    private boolean isRunning = false;
    private int roundsPerMinute = 0;
    private float fuel;
    private int baseRPM = 800;

    public Motor() {

    }

    public void start() {
        isRunning = true;
        roundsPerMinute = 800;
    }

    public void stop() {
        isRunning = false;
    }

    public void pushGasPedal(int gasPedalPercentage) {
        if (roundsPerMinute == 0) {
            System.out.println("Please start engine");
        }
        else {
            if (roundsPerMinute <= 5800) {
                setRoundsPerMinute(newRoundsPerMinute(baseRPM*gasPedalPercentage));
                System.out.println(roundsPerMinute);
            }
            else {
                setRoundsPerMinute(newRoundsPerMinute(5800));
            }
        }
    }
    public int newRoundsPerMinute(int roundsPerMinute) {
        int minRPM = roundsPerMinute - 200;
        int maxRPM = roundsPerMinute + 200;

        Random random = new Random();
        int tempRPM = random.nextInt((maxRPM - minRPM) + 1) + minRPM;
        return tempRPM;
    }

    public boolean isRunning() {
        return isRunning;
    }

    public int getRoundsPerMinute() {
        return roundsPerMinute;
    }

    public void setRoundsPerMinute(int roundsPerMinute) {
        this.roundsPerMinute = roundsPerMinute;
    }
}
