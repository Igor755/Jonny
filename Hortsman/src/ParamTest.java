import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by i.metlin on 26.06.2017.
 */
public class ParamTest {
    public static void main(String[] args) {

        System.out.println("Testing tripValue:");
        double percent = 10;
        System.out.println("Before: percent = " + percent);
        tripleValue(percent);
        System.out.println("After: percent = " + percent);


        System.out.println("\nTesting tripleSalary:");
        Employe harry = new Employe("Harry", 50000);
        System.out.println("Before: salary = " + harry.getSalary());
        tripleSalary(harry);
        System.out.println("After: salary = " + harry.getSalary());

        System.out.println("\nTesting swap: ");
        Employe a = new Employe("Alice", 70000);
        Employe b = new Employe("Bob", 60000);
        System.out.println("Before: a = " + a.getName());
        System.out.println("Before: b = " + b.getName());
        swap(a, b);

        System.out.println("After: a = " + a.getName());
        System.out.println("After: b = " + b.getName());


        
    }

    public static void tripleValue(double x) {
        x = 3 * x;
        System.out.println("End of method: x = " + x);
    }

    public static void tripleSalary(Employe x) {
        x.raiseSalary(200);
        System.out.println("End of method: salary = " + x.getSalary());

    }

    public static void swap(Employe x, Employe y) {
        Employe temp = x;
        x = y;
        y = temp;
        System.out.println("End of method: x = " + x.getName());
        System.out.println("End of method: y = " + y.getName());
    }
}

class Employe {
    public Employe(String n, double s) {
        name = n;
        salary = s;
    }
    public String getName(){
        return name;
    }
    public double getSalary(){
        return  salary;
    }
    public  void raiseSalary(double byPercent){
        double raise = salary * byPercent / 100;
        salary += raise;
    }
    private String name;
    private double salary;
}