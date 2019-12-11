package Opdracht1;

import java.util.Random;

public class Part {

    private boolean isFailed;
    private int failChance;

    public Part(int failChance) {
        this.failChance = failChance;
    }

    public void calculate() throws PartException {
        Random rand = new Random();

        if(rand.nextInt(failChance) == 1) {
            throw new PartException("kaas");
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
}
