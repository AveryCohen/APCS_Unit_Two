import java.util.Scanner;

public class TemperatureDifference {
    /**
     * This method will calculate the difference in two temperatures, regardless of which one is larger.
     * @param temp1 - an int temperature value
     * @param temp2 - an int temperature value
     * @return the absolute value of the difference between the two temps. Make sure to change the 0
     */
    public static int calculateDifference(int temp1, int temp2) {

        return Math.abs(temp1 - temp2);
    }

    public static void main(String[] args) {
        // Scanner object to get input
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first temperature: ");
        int temp1 = scan.nextInt();
        System.out.print("Enter the second temperature: ");
        int temp2 = scan.nextInt();
        int diff = calculateDifference(temp1, temp2);
        System.out.println("The temperature changed "+ diff + " degrees.");

        // Get the two temperatures from the user as input

        // Call the calculateDifference method and save the result in a variable.

        // Print out the information to the user
    }
}
