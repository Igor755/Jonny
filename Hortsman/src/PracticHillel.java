import java.util.Scanner;

/**
 * Created by i.metlin on 21.06.2017.
 */
//Нахождение суммы четных элементов числа, если необходимо для нечетных нужно поменять if (x % 2 == 1)
public class PracticHillel {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input numbers");


        int x = scanner.nextInt();

        int sum = 0;

        while (x != 0) {

            if (x % 2 < 1)
                sum = sum + (x % 10);
            x = x / 10;


        }
        System.out.println(sum);
    }

}

