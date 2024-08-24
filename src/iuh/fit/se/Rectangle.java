/*
 * @ (#) Rectangle.java    1.0  8/24/2024
 *
 *Copyright (c) 2024 IUH.All rights reserved
 */
package iuh.fit.se;

/*
 * @description:This class represents a bank with many bank accounts
 * @author: Thu Phuong
 * @version: 1.0
 * @date:8/24/2024
 */
public class Rectangle {
    private double length;
    private double width;
    public Rectangle() {
        this(0.0, 0.0);
        this.length = 0.0;
        this.width = 0.0;
    }
    public Rectangle(double length, double width) {
        if(length < 0 || width < 0)
            throw new IllegalArgumentException("Length and width must be greater than 0");
        this.length = length;
        this.width = width;
    }

    //Tinh chu vi
    public double getPerimeter() {
        return (length + width) * 2;
    }

    //Tinh dien tich
    public double getArea() {
        return length * width;
    }


    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if(length < 0)
            throw new IllegalArgumentException("Length must be greater than 0");
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width < 0)
            throw new IllegalArgumentException("Width must be greater than 0");
        this.width = width;
    }
}
