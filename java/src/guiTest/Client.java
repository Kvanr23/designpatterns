package guiTest;

import javax.swing.*;
import java.net.MalformedURLException;

public class Client {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Client();
            }
        });
    }

    Client() {
        String[] args = {"ggg", "vvv"};

        try {
            ClientGUI.createAndShowGUI();
        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}