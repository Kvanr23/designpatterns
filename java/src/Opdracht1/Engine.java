package Opdracht1;

import java.util.Random;

public class Engine extends Part {

    private boolean isFailed;

    public Engine() {
        super((int)(1.0f/0.001f));
    }

    public void calculate() throws EngineException {
        Random rand = new Random();

        if(rand.nextInt(chance) == 1) {
            throw new EngineException("Engine failed!");
        }
        else {
            // Do nothing.
        }
    }

    public void setFailed() {
        isFailed = true;
    }

    public boolean isFailed() {
        return isFailed;
    }
}
