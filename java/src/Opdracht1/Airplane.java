package Opdracht1;

import java.util.ArrayList;

public class Airplane {
    public ArrayList<Engine> engines;
    public ArrayList<Flap> flaps;
    public ArrayList<Pilot> pilots;

    public Airplane(int number) {
        int flightNumber = number;

        engines = new ArrayList<Engine>();
        engines.add(new Engine());
        engines.add(new Engine());
        engines.add(new Engine());
        engines.add(new Engine());

        flaps = new ArrayList<Flap>();
        flaps.add(new Flap());
        flaps.add(new Flap());

        pilots = new ArrayList<Pilot>();
        pilots.add(new Pilot());
        pilots.add(new Pilot());
        pilots.add(new Pilot());
    }

    private boolean flightFailed = false;

    public void flight() throws CrashException {
        // Check Engines
        for (int i = 0; i < engines.size(); i++) {
            try {
                this.engines.get(i).calculate();
            }
            catch (PartException e) {
//                System.out.println(e);
                this.engines.get(i).setFailed(true);
            }
        }

        // Check Flaps
        for (int i = 0; i < flaps.size(); i++) {
            try {
                this.flaps.get(i).calculate();
            }
            catch (PartException e) {
//                System.out.println(e);
                this.flaps.get(i).setFailed(true);
            }
        }

        // Check Pilots
        for (int i = 0; i < pilots.size(); i++) {
            try {
                this.pilots.get(i).calculate();
            }
            catch (PartException e) {
//                System.out.println(e);
                this.pilots.get(i).setFailed(true);
            }
        }

        // Then check for flight failure:
        if(this.engines.get(1).isFailed() && this.engines.get(2).isFailed()) {
            // Only need to check middle 2 for flight failure.
            flightFailed = true;
        }

        if(this.flaps.get(0).isFailed() && this.flaps.get(1).isFailed()) {
            flightFailed = true;

        }

        if(this.pilots.get(0).isFailed() && this.pilots.get(1).isFailed() && this.pilots.get(2).isFailed()) {
            flightFailed = true;
        }


        if(flightFailed) {
            throw new CrashException("Plane crashed!");
        }
    }
}
