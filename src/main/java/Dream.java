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

        NumberFormat nf = new DecimalFormat("#.######");
        //работает через запяту, через точку выбивает Exception()

        Scanner scanner = new Scanner(System.in);
        System.out.println("first");
        Double first = scanner.nextDouble();

        System.out.println("two");
        Double two = scanner.nextDouble();

        System.out.println(nf.format(first + two));
        //не забывать закрывать поток, иначе продолжает работать
       scanner.close();
    }
}
