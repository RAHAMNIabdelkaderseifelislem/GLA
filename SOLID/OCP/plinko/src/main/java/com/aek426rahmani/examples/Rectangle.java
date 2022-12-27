/*
 * created by: aek426rahmani
 * date: 27-12-2022
 */
package main.java.com.aek426rahmani.examples;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }
}

