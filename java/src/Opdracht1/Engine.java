package Opdracht1;

public class Engine extends Part {

    public Engine() {
        super((int)(1.0f/0.001f));
    }

    @Override
    public void throwException() throws EngineException {
        throw new EngineException("Engine failed");
    }
}
