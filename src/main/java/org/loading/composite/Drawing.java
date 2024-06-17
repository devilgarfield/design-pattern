package org.loading.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * composite
 */
public class Drawing implements Shape {
    private final List<Shape> shapes = new ArrayList<>();

    @Override
    public void draw(String color) {
        shapes.forEach(shape -> shape.draw(color));
    }

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public void removeShape(Shape shape) {
        shapes.remove(shape);
    }

    public void clearShapes() {
        System.out.println("clear all shapes");
        shapes.clear();
    }
}
