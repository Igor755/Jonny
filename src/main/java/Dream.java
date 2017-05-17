package main.java;

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
        String first = scanner.next();
        //double First = Double.parseDouble(first);
        System.out.println("two");
        String two = scanner.next();
        //double Two = Double.parseDouble(two);

        System.out.println(Double.parseDouble(first + two));

    }
}
