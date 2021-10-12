import java.util.Scanner;

public class Distance {
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt((Math.pow(x2-x1,2) + Math.pow(y2-y1,2)));
    }
    public static void main(String[] args) {
        // Scanner object to get input
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the x coordinate of the first point: ");
        int x1 = scan.nextInt();
        System.out.print("Enter the y coordinate of the first point: ");
        int y1 = scan.nextInt();
        System.out.print("Enter the x coordinate of the second point: ");
        int x2 = scan.nextInt();
        System.out.print("Enter the y coordinate of the second point: ");
        int y2 = scan.nextInt();
        double dis = distance(x1, y1, x2, y2);
        System.out.println("The distance between (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is " + dis);
    }


    // create the distance method below. See the instructions for the signature of the method.


    // Create your main method below. It will get the input (you will need a Scanner), call the distance
    // method, and then print the results.
}
