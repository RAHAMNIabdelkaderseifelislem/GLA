/*
 * created by: aek426rahmani
 * date: 27-12-2022
 */

// relize code that follows the OCP principle
package com.aek426rahmani.examples;

import java.util.ArrayList;
import java.util.List;

public class AreaCalculator {
    private List<Shape> shapes = new ArrayList<>();

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public double totalArea() {
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.area();
        }
        return totalArea;
    }
}