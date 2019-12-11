package Opdracht1;

public class Recorder {

    public int totalCrashes = 0;

    public Recorder() {

        this.simulate();
    }

    public void simulate() {
        for (int i = 0; i < 1000000; i++) {
            Airplane plane = new Airplane(i);
//            System.out.println(i);
            try {
                plane.flight();
            } catch (CrashException e) {
                totalCrashes++;
//                e.printStackTrace();
            }
        }
    }

    public void printResults() {
        System.out.print("Total crashes: ");
        System.out.println(totalCrashes);
    }
}
