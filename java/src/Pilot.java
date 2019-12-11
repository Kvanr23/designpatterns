import java.util.Random;

public class Pilot {
    float failChance = 0.005f;
    int chance = (int) (1.0f/failChance);

    private boolean isFailed;

    public Pilot() {

    }

    public void calculate() throws PilotException {
        Random rand = new Random();

        if(rand.nextInt(chance) == 1) {
            throw new PilotException("Flap failed!");
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
