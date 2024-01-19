import java.util.Scanner; // import Scanner class
public class salary{

    static Scanner console = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter your hourly pay:");
        double salary = console.nextInt();
        System.out.println("How many hours a week do you work?");
        int clock = console.nextInt();
        double pay = salary * clock;
        System.out.println("You make : " + tax(pay) + "$ Per Paycheck After taxes");

        
    }

    public static double tax(double salary){
        System.out.println("What's the tax rate of your state by percentage?");
        double tax_rate = (console.nextDouble());
        double ends = (salary /tax_rate * 100);
        return ends;

    }

}