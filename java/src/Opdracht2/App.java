package Opdracht2;

import javax.swing.*;
import java.net.MalformedURLException;

public class App {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new App();
            }
        });
    }

    App() {
//        String[] args = {"ggg", "vvv"};

        try {
            GuiT.createAndShowGUI();
        }
        catch (MalformedURLException e) {
            //YOLO
            e.printStackTrace();
        }
    }
}
