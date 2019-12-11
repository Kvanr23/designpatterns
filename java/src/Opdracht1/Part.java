package Opdracht1;

import java.util.Random;

public class Part {

    protected int failChance;

    public Part(int failChance) {
        this.failChance = failChance;
    }

    public void calculate() throws PartException {
        Random rand = new Random();

        if(rand.nextInt() == 1) {
            throw new PartException("Flap failed!");
        }
        else {
            // Do nothing.
        }
    }
}
