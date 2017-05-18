package main.java;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;
/**
 * Created by i.metlin on 11.05.2017.
 */
public class Dream {
    public static void main(String[] args){

        /*Grafics app = new Grafics();
        app.setVisible(true);
*/


        Scanner scanner = new Scanner(System.in);
        System.out.println("first");
        Double first = scanner.nextDouble();
        //double First = Double.parseDouble(first);
        System.out.println("two");
        Double two = scanner.nextDouble();
        //double Two = Double.parseDouble(two);
        //String s = Double.toString(first + two);
        NumberFormat nf = new DecimalFormat("#.######");

        System.out.println(nf.format(first + two));
       scanner.close();
    }
}
