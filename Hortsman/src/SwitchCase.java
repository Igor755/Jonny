import java.util.Scanner;

/**
 * Created by i.metlin on 15.06.2017.
 */

//Хортсман Глава 1, страница 106
public class SwitchCase {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Select an option (1, 2, 3, 4)");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Number 1");
                break;
            case 2:
                System.out.println("Number 2");
                break;
            case 3:
                System.out.println("Number 3");
                break;
            case 4:
                System.out.println("Number 4");
                break;
            default:
                System.out.println("error");
                break;

        }
    }
}
