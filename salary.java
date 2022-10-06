import java.util.Scanner; // import Scanner class
public class salary{

    static Scanner console = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter your hourly pay:");
        int salary = console.nextInt();
        int part = salary * 20;
        int full = salary * 40;
        System.out.println("You make : " + part + "$ For every 20 hours of work" );
        System.out.println("You make :" + full + "$ For every 40 hours of work");
        int tax_rate = salary *     / 100;
    }

}