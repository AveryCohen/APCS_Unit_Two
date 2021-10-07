import java.util.Locale;
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("First name: ");
        String firstName = scan.nextLine();
        System.out.print("Middle name: ");
        String middleName = scan.nextLine();
        System.out.print("Last name: ");
        String lastName = scan.nextLine();
        System.out.print("Age: ");
        int age = scan.nextInt();
        int mid1= firstName.length()/2;
        int mid2= middleName.length()/2;
        int mid3= lastName.length()/2;
        String a1 = firstName.substring(mid1,(mid1 + 1));
        String a2 = a1.toUpperCase();
        String b1 = middleName.substring(mid2,(mid2 + 1));
        String b2 = b1.toUpperCase();
        String c1 = lastName.substring(mid3,(mid3 + 1));
        String c2 = c1.toUpperCase();
        String p1 = a2 + b2 + c2;
        String d = firstName.substring(firstName.length()-1, firstName.length());
        String e = middleName.substring(middleName.length()-1, middleName.length());
        String f = lastName.substring(lastName.length()-1, lastName.length());
        String p2 = d + e + f;





}
