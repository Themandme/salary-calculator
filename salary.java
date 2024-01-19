import java.util.Scanner; // import Scanner class
public class salary{

    static Scanner console = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter your hourly pay:");
        double salary = console.nextInt();
        double part = salary * 20;
        double full = salary * 40;
        System.out.println("What's the tax rate of your state by percentage?");

        System.out.println("You make : " + tax(part) + "$ Per Paycheck After taxes working part time");
        System.out.println("You make : " + tax(full) + "$ Per Paycheck After taxes working full time");
        
    }
    public static double tax(double salary){
        double tax_rate = console.nextDouble();
        double taxedsalary = (salary * (tax_rate / 100));
        double full = taxedsalary + salary;
        return full;
    }

}