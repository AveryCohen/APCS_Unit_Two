import java.util.Scanner;

public class Names {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("First name: ");
        String firstName = scan.nextLine();
        System.out.print("Last name: ");
        String lastName = scan.nextLine();
        lastName.charAt(lastName.length()-1)
        System.out.println(firstName + " " + lastName);
        System.out.println(firstName.length() + lastName.length());
        System.out.println(firstName.substring(0,1) + lastName.substring(0,1));
        System.out.println(firstName.compareTo(lastName));
        System.out.println(firstName.indexOf());




        // Get the first and last names as separate variables (use the Scanner object to get the input)


        // Use the required string methods to print out the information


    }
}
