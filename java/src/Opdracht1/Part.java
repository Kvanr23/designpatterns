package Opdracht1;

import java.util.Random;

public abstract class Part {

    private boolean isFailed;
    private int failChance;

    public Part(int failChance) {
        this.failChance = failChance;
    }

    public void calculate() throws PartException {
        Random rand = new Random();

        if(rand.nextInt(failChance) == 1) {
            throwException();
        }
        else {
            // Do nothing.
        }
    }

    public boolean isFailed() {
        return isFailed;
    }

    public void setFailed(boolean failed) {
        isFailed = failed;
    }

    public abstract void throwException() throws PartException;
}
