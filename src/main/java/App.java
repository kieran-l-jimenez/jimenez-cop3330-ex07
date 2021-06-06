import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Kieran Jimenez
 */
/*
 *           "Area of a Rectangular Room" output
 *What is the length of the room in feet? 15
 *What is the width of the room in feet? 20
 *You entered dimensions of 15 feet by 20 feet.
 *The area is
 *300 square feet
 *27.871 square meters
 */
public class App
{
    static Scanner in = new Scanner(System.in);
    static double conversionFactor = 0.09290304;

    public static void main(String[] args)
    {
        App myApp = new App();

        System.out.print("What is the length of the room in feet? ");
        int length = in.nextInt();
        System.out.print("What is the width of the room in feet? ");
        int width = in.nextInt();

        System.out.printf("You entered the dimensions of %d feet by %d feet.\n", length, width);
        System.out.println("The area is");

        double areaF = length * width;
        System.out.printf("%.0f square feet\n", areaF);
        double areaM = myApp.convertAreaFeetToMeters(areaF);
        System.out.printf("%.3f square meters\n", areaM);
    }

    public double convertAreaFeetToMeters(double area)
    {
        return area * conversionFactor;
    }
}