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

    public void pushGasPedal() {
        // roundsPerMinute ++
    }

    public boolean isRunning() {
        return isRunning;
    }

    public int getRoundsPerMinute() {
        return roundsPerMinute;
    }
}
