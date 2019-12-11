import java.util.Random;

public class Engine {
    float failChance = 0.001f;
    int chance = (int) (1.0f/failChance);

    private boolean isFailed;

    public Engine() {

    }

    public void calculate() throws EngineException {
        Random rand = new Random();

        if(rand.nextInt(chance) == 1) {
            throw new EngineException("Flap failed!");
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
