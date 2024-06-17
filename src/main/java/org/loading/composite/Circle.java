package org.loading.composite;

/**
 * leaf
 */
public class Circle implements Shape {
    @Override
    public void draw(String color) {
        System.out.println("circle draw color: " + color);
    }
}
