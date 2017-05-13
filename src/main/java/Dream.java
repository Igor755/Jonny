package main.java;

import java.util.Scanner;
/**
 * Created by i.metlin on 11.05.2017.
 */
public class Dream {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double s1,s2;
        String s3;
        System.out.println("enter 1 zn");
        s1 = scanner.nextDouble();

        System.out.println("enter 2 zn");
        s2 = scanner.nextDouble();

        s3 = Double.toString((s1 + s2));
        //if(s3)
            //s3.append(s3.charAt("0."));
        System.out.println(s3);



    }
}
