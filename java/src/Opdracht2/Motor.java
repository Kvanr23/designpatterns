package Opdracht2;
import java.util.Random;


public class Motor {

    private boolean isRunning = false;
    private int roundsPerMinute = 0;
    private float fuel;

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

    }

    public int newRoundsPerMinute(int roundsPerMinute) {
        int minRPM = roundsPerMinute - 200;
        int maxRPM = roundsPerMinute + 200;

        Random random = new Random();
        int tempRPM = random.nextInt((maxRPM - minRPM) + 1) + minRPM;
        this.roundsPerMinute = tempRPM;
        return tempRPM;
    }

    public boolean isRunning() {
        return isRunning;
    }

    public int getRoundsPerMinute() {
        return roundsPerMinute;
    }
}
