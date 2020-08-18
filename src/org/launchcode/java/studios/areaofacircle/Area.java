package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Double radius;
        Double area;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        radius = input.nextDouble();

        area = Circle.getArea(radius);
        input.close();

        System.out.println("The area of a circle of radius " + radius + " is " + area);
    }
}
