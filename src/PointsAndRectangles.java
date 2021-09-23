import java.awt.Rectangle;
import java.awt.Point;
import java.awt.Dimension;
import java.util.Scanner;
public class PointsAndRectangles
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the x coordinate: ");
        int x = scan.nextInt();
        System.out.print("Enter the y coordinate: ");
        int y = scan.nextInt();
        System.out.print("Enter the length: ");
        int height = scan.nextInt();
        System.out.print("Enter the width: ");
        int width = scan.nextInt();
        Point p = new Point(x, y);
        Dimension d = new Dimension(width, height);
        Rectangle r = new Rectangle(p, d);
        System.out.println(p);
        System.out.println(d);
        System.out.println(r);





        // create print statements and get input for the x and y values.

        //Instantiate a Point object p. Hint: you will need the keyword "new"


        // create print statements and get input for the length and width

        //Instantiate a Dimension object d.

        //Instantiate a Rectangle object r.

        // Print each object p, d, and r on a separate line.
    }
}