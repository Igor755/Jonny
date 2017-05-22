package main.java;

//работал через запятую, через точку выбивал Exception
//смена запятой на точку производится с помщью локализации формата, причем поменять ее можно даже у самого сканера
//http://www.sql.ru/forum/942830/doube-parse-hitryy-format
//http://www.cyberforum.ru/java-j2se/thread1815171.html
//не забывать закрывать потоки, иначе продолжает работать

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
/**
 * Created by i.metlin on 11.05.2017.
 */
public class Dream {
    public static void main(String[] args) {

        Grafics app = new Grafics();
        app.setVisible(true);








/*
        DecimalFormatSymbols otherSymbols = new DecimalFormatSymbols(Locale.US);
        String pattern = "#.######";
        DecimalFormat decimalFormat = new DecimalFormat(pattern, otherSymbols);


        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        System.out.println("first");
        Double first = scanner.nextDouble();

        System.out.println("two");
        Double two = scanner.nextDouble();

        System.out.println(decimalFormat.format(first + two));

       scanner.close();
*/
    }

    }

