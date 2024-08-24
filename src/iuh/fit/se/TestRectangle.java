/*
 * @ (#) TestRectangle.java    1.0  8/24/2024
 *
 *Copyright (c) 2024 IUH.All rights reserved
 */
package iuh.fit.se;

import java.util.Scanner;

/*
 * @description:This class represents a bank with many bank accounts
 * @author: Thu Phuong
 * @version: 1.0
 * @date:8/24/2024
 */
public class TestRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        iuh.fit.se.Rectangle r1 = new iuh.fit.se.Rectangle(5.0,3.0);

        System.out.print("Enter the width of the rectangle: ");
        double width = sc.nextDouble();
        r1.setWidth(width);
        System.out.print("Enter the length of the rectangle: ");
        double length = sc.nextDouble();
        r1.setLength(length);
        System.out.println("Area:" + r1.getArea());
        System.out.println("Perimeter: " + r1.getPerimeter());
        System.out.println("The length of the rectangle is " + r1.getLength());
        System.out.println("The width of the rectangle is " + r1.getWidth());
        System.out.println(r1.toString());
        sc.close();
    }
}
