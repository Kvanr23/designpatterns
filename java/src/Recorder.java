public class Recorder {
    public Recorder() {

    }

    public void simulate() {
        for (int i = 0; i < 1000000; i++) {
            Airplane plane = new Airplane();
            plane.flight();
        }
    }
}
