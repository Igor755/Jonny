import java.util.Scanner;
import java.util.*;
import java.math.*;

/**
 * Created by i.metlin on 16.06.2017.
 */
public class Biginteger {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hou much numbers?");
        int k = scanner.nextInt();

        System.out.println("Is big number?");
        int n = scanner.nextInt();

        BigInteger lotteryOdds = BigInteger.valueOf(1);
        for (int i = 1; i <= k; i++)
            lotteryOdds = lotteryOdds
                    .multiply(BigInteger.valueOf(n-i+1))
                    .divide(BigInteger.valueOf(i));
        System.out.println("Your Chance 1 in" + lotteryOdds + "Good luck!");
    }
}
