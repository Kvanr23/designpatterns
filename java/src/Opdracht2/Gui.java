package Opdracht2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui {
    private JButton startEngineButton;
    private JButton stopEngineButton;

    public Gui(Motor motor) {


        startEngineButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                motor.start();
            }
        });


        stopEngineButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                motor.stop();
            }
        });
    }
}
