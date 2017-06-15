import javax.swing.*;
import java.util.Scanner;

/**
 * Created by i.metlin on 15.06.2017.
 */

//Хортсман, глава 1, страница 87, чтение входных данных
public class ReadInputData {
    public static void main(String[] args){
        /*Scanner scaner = new Scanner(System.in);


        System.out.println("Как вас зовут?");
        String name = scaner.nextLine();

        System.out.println("Сколько вам лет?");
        int age = scaner.nextInt();

        System.out.println(name + " in next you have " + (age + 1));*/

        String name = JOptionPane.showInputDialog("What is your name?");
        String input = JOptionPane.showInputDialog("How old is you?");
        int age = Integer.parseInt(input);

        System.out.println(name + " in next year you have " + (age + 1));
        System.exit(0);



    }
}
