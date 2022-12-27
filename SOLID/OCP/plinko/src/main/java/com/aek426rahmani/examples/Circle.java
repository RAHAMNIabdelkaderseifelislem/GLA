/*
 * created by: aek426rahmani
 * date: 27-12-2022
 */
package main.java.com.aek426rahmani.examples;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}