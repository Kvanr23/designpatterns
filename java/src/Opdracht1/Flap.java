package Opdracht1;

public class Flap extends Part {

    public Flap() {

        super((int)(1.0f/0.0005f));
    }

    @Override
    public void throwException() throws FlapException {
        throw new FlapException("Flap failed");
    }
}
