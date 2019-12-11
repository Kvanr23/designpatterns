package Opdracht1;

import java.util.Random;

public class Flap {
    float failChance = 0.0005f;
    int chance = (int) (1.0f/failChance);

    private boolean isFailed;

    public Flap() {

    }

    public void calculate() throws FlapException {
        Random rand = new Random();

        if(rand.nextInt(chance) == 1) {
            throw new FlapException("Flap failed!");
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
