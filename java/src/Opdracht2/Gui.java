package Opdracht2;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Gui {
    private JButton startEngineButton;
    private JButton stopEngineButton;
    private JSlider gasPedalSlider;
    private JLabel roundsPerMinuteLabel;

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
        gasPedalSlider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent changeEvent) {
                System.out.println(gasPedalSlider.getX());
            }
        });
        roundsPerMinuteLabel.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
                motor.getRoundsPerMinute();
            }
        });
    }
}
