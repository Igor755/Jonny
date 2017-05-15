package main.java;

import java.util.EventListener;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;


/**
 * Created by i.metlin on 12.05.2017.
 */
public class Grafics extends JFrame {

    private JTextField input = new JTextField("", 5);
    private JLabel label = new JLabel("Machine");
    private JButton button = new JButton("Press");

    public Grafics() {

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3,2,2,2));
        container.add(label);
        container.add(input);




    }


}
