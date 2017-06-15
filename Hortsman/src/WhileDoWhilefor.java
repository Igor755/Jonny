import java.util.Scanner;

/**
 * Created by i.metlin on 15.06.2017.
 */
public class WhileDoWhilefor {
    public static void main(String[] args) {
/*while
        Scanner scanner = new Scanner(System.in);
        System.out.println("What kind Sum you need?");
        double goal = scanner.nextDouble();

        System.out.println("How many you can pay in year?");
        double payment = scanner.nextDouble();

        System.out.println("your %");
        double procent = scanner.nextDouble();

        double balance = 0;
        int years = 0;

        while (balance < goal){
            balance +=payment;
            double interest = balance * procent/10;
            balance += interest;
            years++;
        }
        System.out.println("You go to vacation in " + years + " years ");while*/
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*do while
        Scanner scanner = new Scanner(System.in);


        System.out.println("How many you can pay in year?");
        double payment = scanner.nextDouble();

        System.out.println("your %");
        double procent = scanner.nextDouble();

        double balance = 0;
        int years = 0;

        String input;

        do{
            balance += payment;
            double interest = balance * procent/100;
            balance += interest;
            years++;

            System.out.printf("In %d, you have %, 2f%n ", years, balance );

            System.out.print("Go out on Vacation? (Y/N)");
            input = scanner.next();

        }
        while (input.equals("N"));do while*/
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
        /*for
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers? ");
        int k = scanner.nextInt();

        System.out.print("Biggest number?");
        int n = scanner.nextInt();

        int lotteryOdds = 1;
        for (int i = 1; i <= k; i++)
            lotteryOdds = lotteryOdds * (n - 1 + 1) / i;
        System.out.println("Your chance one " + lotteryOdds + " Good Luck!");for*/
    }
}
