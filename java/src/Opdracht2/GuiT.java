package Opdracht2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;

public class GuiT extends JPanel implements ActionListener {

    private static JButton startEngine_Button = new JButton("Start Engine"),
            stopEngine_Button = new JButton("Stop Engine");
    private JLabel isRunning_Label = new JLabel();
    private static JLabel toeren_Label = new JLabel();

    public int x = 0;

    public GuiT() throws MalformedURLException {
        Motor motor = new Motor();

        setLayout(new BorderLayout());

        add(startEngine_Button, BorderLayout.PAGE_START);
        add(isRunning_Label, BorderLayout.CENTER);
        isRunning_Label.setText("OK");
        add(toeren_Label, BorderLayout.LINE_END);
        toeren_Label.setText("Toeren");

        Timer timer = new Timer(1, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                isRunning_Label.setText("Engine running: " + motor.isRunning());
                toeren_Label.setText(Integer.toString(motor.getRoundsPerMinute()));
                revalidate();
            }
        });
        timer.start();



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
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startEngine_Button) {

        }
    }

    public static void createAndShowGUI() throws MalformedURLException {
        JFrame frame = new JFrame("ClientGUI");

        frame.setMinimumSize(new Dimension(500, 400));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new GuiT());

        frame.setSize(500, 400);
        frame.setVisible(true);
    }
}
