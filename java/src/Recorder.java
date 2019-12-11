public class Recorder {
    public int crashedByEngine = 0;
    public int crashedByFlap = 0;
    public int crashedByPilot = 0;
    public int totalCrashes = 0;

    public Recorder() {
        this.simulate();
    }

    public void simulate() {
        for (int i = 0; i < 1000000; i++) {
            Airplane plane = new Airplane(i);
            try {
                plane.flight();
            } catch (CrashException e) {
                totalCrashes++;
                e.printStackTrace();
            }
        }
    }

    public void printResults() {

    }
}
