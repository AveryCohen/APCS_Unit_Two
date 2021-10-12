import java.util.Scanner;

public class FindThePower {
    public static int findPower(double num1, double pow1) {

        return (int)Math.pow(num1, pow1);
    }
    public static void main(String[] args) {
        // Scanner object to get input
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the base: ");
        double num1 = scan.nextDouble();
        System.out.print("Enter the exponent: ");
        double pow1 = scan.nextDouble();
        int product = findPower(num1, pow1);
        System.out.println((int)num1 + "^" + (int)pow1 + " = " + product);
    }


    // create a main method below and follow the given requirements carefully.
    // Remember to create a Scanner object in order to get input from the user.
    // You will need to uncomment the FindThePower test in order to get it to run.
}
