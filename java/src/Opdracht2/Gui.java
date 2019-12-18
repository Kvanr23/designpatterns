package Opdracht2;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;

public class Gui extends JPanel implements ActionListener {

    private static JButton startEngine_Button = new JButton("Start Engine"),
            stopEngine_Button = new JButton("Stop Engine");

    private static JLabel toeren = new JLabel();

    private static JSlider gasPedal_Slider = new JSlider(1, 100);


    public int x = 0;

    public Gui() throws MalformedURLException {
        Motor motor = new Motor();

        setLayout(new BorderLayout());

        add(startEngine_Button, BorderLayout.PAGE_START);
        add(gasPedal_Slider, BorderLayout.PAGE_END);
        gasPedal_Slider.setValue(1);


        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                x++;
                revalidate();
            }
        });

        startEngine_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                motor.start();
                System.out.println(motor.isRunning());
                remove(startEngine_Button);

                add(stopEngine_Button, BorderLayout.PAGE_START);

                revalidate();
                repaint();
            }
        });
        stopEngine_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                motor.stop();
                System.out.println(motor.isRunning());
                remove(stopEngine_Button);

                add(startEngine_Button, BorderLayout.PAGE_START);

                revalidate();
                repaint();
            }
        });
        gasPedal_Slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent changeEvent) {
                motor.pushGasPedal(gasPedal_Slider.getValue());
//                System.out.println(gasPedal_Slider.getValue());
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startEngine_Button) {

        }
    }

    public static void createAndShowGUI() throws MalformedURLException {
        JFrame frame = new JFrame("ClientGUI");

        frame.setMinimumSize(new Dimension(500, 400));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new Gui());

        frame.setSize(500, 400);
        frame.setVisible(true);
    }
}
