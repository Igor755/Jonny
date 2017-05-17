package main.java;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.EventListener;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;


/**
 * Created by i.metlin on 12.05.2017.
 */
public class Grafics extends JFrame {

    /*private JTextField input = new JTextField("", 10);
    private JLabel label = new JLabel("Jonik MT890");
    Font myFont = new Font("Serif", Font.BOLD, 50);

    //BigDecimal bigDecimal = new BigDecimal(input.toString());

    private JButton button1 = new JButton("1");
    private JButton button2 = new JButton("2");
    private JButton button3 = new JButton("3");
    private JButton button4 = new JButton("4");
    private JButton button5 = new JButton("5");
    private JButton button6 = new JButton("6");
    private JButton button7 = new JButton("7");
    private JButton button8 = new JButton("8");
    private JButton button9 = new JButton("9");
    private JButton button0 = new JButton("0");
    private JButton buttont = new JButton(".");
    private JButton buttonm = new JButton("-");
    private JButton buttonp = new JButton("+");
    private JButton buttonu = new JButton("*");
    private JButton buttond = new JButton("/");
    private JButton buttonr = new JButton("=");
    private JButton buttonC = new JButton("C");

    double firstValue  = 0;
    String operation = "+";

    public Grafics() {

        DecimalFormat format = new DecimalFormat();

        format.setDecimalSeparatorAlwaysShown(false);

        label.setLocation(100, 100);
        label.setSize(280, 230);
        label.setFont(myFont);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(10, 2, 2, 2));

        container.add(input);
        container.add(label);


        container.add(button1);
        container.add(button2);
        container.add(button3);
        container.add(button4);
        container.add(button5);
        container.add(button6);
        container.add(button7);
        container.add(button8);
        container.add(button9);
        container.add(button0);
        container.add(buttonm);
        container.add(buttonp);
        container.add(buttonu);
        container.add(buttont);
        container.add(buttond);
        container.add(buttonr);
        container.add(buttonC);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.setText(input.getText()+"1");
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.setText(input.getText()+"2");

            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.setText(input.getText()+"3");

            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.setText(input.getText()+"4");

            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.setText(input.getText()+"5");

            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.setText(input.getText()+"6");

            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.setText(input.getText()+"7");

            }
        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.setText(input.getText()+"8");

            }
        });
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.setText(input.getText()+"9");

            }
        });
        button0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.setText(input.getText()+"0");

            }
        });
        buttonC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String temp = input.getText();
                input.setText(temp.substring(0,temp.length()-1));
            }
        });
        buttond.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstValue = Double.valueOf(input.getText());
                input.setText("");
                operation = "/";
            }
        });
        buttonp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstValue = Double.valueOf(input.getText());

                input.setText("");
                operation = "+";
            }
        });
        buttonm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstValue = Double.valueOf(input.getText());
                //format.format(input.getText());
                input.setText("");
                operation = "-";
            }
        });
        buttonu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstValue = Double.valueOf(input.getText());
                input.setText("");
                operation = "*";
            }
        });
        buttont.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.setText(input.getText()+".");

            }
        });
        buttonr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double secondValue = Double.valueOf(input.getText());
                if("+".equals(operation)){
                    input.setText((firstValue+secondValue)+"");
                }
                if("-".equals(operation)){
                    input.setText((firstValue-secondValue)+"");
                }
                if("*".equals(operation)){
                    input.setText((firstValue*secondValue)+"");
                }
                if("/".equals(operation)){
                    input.setText((firstValue/secondValue)+"");
                }
                firstValue = 0;
                operation = "+";
            }
        });

*/
    }












