import java.util.Scanner; // import Scanner class
public class salary{

    static Scanner console = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter your hourly pay:");
        double salary = console.nextInt();
        double part = salary * 20;
        double full = salary * 40;
        System.out.println("What's the tax rate of your state by percentage?");
        double tax_rate = console.nextInt();
        tax_rate= tax_rate/100;
        System.out.println("You make : " + part + "$ For every 20 hours of work" );
        System.out.println("You make :" + full + "$ For every 40 hours of work");
        double full_time_post_tax = full * tax_rate;
        double part_time_post_tax = part * tax_rate;
        System.out.println("You make :" + full_time_post_tax + "$ After taxes working full time");
        System.out.println("You make :" + part_time_post_tax + "$ After taxes working part time");
    }

}