package org.launchcode.java.demos;

/**
 * "In this modifies, I use method Scanner for user have an acess for inputing numbers."
 */

import java.util.Scanner;

/**
 * Created by LaunchCode
 * "Modified by Drownedre"
 */
public class Point {

    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    /**
     * "The algorithm to calculate the coordinates."
     */

    public double computeDistanceFromOrigin() {
        return Math.sqrt((x*x + y*y));
    }

    public Point computeMidpoint(Point p) {

        double midpointX = (x + p.getX()) / 2;
        double midpointY = (y + p.getY()) / 2;

        return new Point(midpointX, midpointY);
    }

    public String toString() {
        return "x=" + x + ", y=" + y;
    }

    public static void main(String[] args) {

        /**
         * "Using Scanner class and Double conversion (parsing) from String to Double for the input system."
         */
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the number of first x: ");
        double p1x = Double.parseDouble(sc.nextLine());
        System.out.print("Enter the number of first y: ");
        double p1y = Double.parseDouble(sc.nextLine());

        /**
         * "The input then used as the point of X and Y coordinate."
         */
        Point p1 = new Point(p1x,p1y);
        System.out.println(p1);

        System.out.print("Enter the number of second x: ");
        double p2x = Double.parseDouble(sc.nextLine());
        System.out.print("Enter the number of second y: ");
        double p2y = Double.parseDouble(sc.nextLine());
        
        Point p2 = new Point(p2x,p2y);
        System.out.println(p2);

        /**
         * "The point then will be calculated by the algorithm of midpoint."
         */
        System.out.println("p1 distance from origin: " + p1.computeDistanceFromOrigin());

        System.out.println("midpoint of p1 and p2: " + p1.computeMidpoint(p2));
    }
}
