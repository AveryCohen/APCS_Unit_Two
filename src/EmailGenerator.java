import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class EmailGenerator {
    public static String makeUserName(String firstAndLast){
        String p1 = firstAndLast.substring(0,1);
        int space = firstAndLast.indexOf(" ");
        space ++;
        String p2 = firstAndLast.substring(space);
        int p3 = (int) (Math.random() * 90) + 10;
        String uppercaseUserName = p1 + p2 + p3;
        String userName = uppercaseUserName.toLowerCase();

        return userName;

    }
    public  static String makeEmail(String usersUserName, String emailExtension){
        return usersUserName + "@" + emailExtension;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter your full name (first and last name): ");
        String firstAndLast = scan.nextLine();
        String usersUserName = makeUserName(firstAndLast);
        System.out.print("Please enter your email extension (Example: for the email 'johnnyapple@gmail.com' the email extension would be 'gmail.com'): ");
        String emailExtension = scan.nextLine();
        String email = makeEmail(usersUserName, emailExtension);
        System.out.println("Your randomly generated email address is: " + email);

    }
}
