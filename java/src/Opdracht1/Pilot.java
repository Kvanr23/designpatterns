package Opdracht1;

public class Pilot extends Part {

    public Pilot() {
        super((int)(1.0f/0.005f));
    }

    @Override
    public void throwException() throws PilotException {
        throw new PilotException("Pilot failure");
    }
}
