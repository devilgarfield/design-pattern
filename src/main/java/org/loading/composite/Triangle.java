package org.loading.composite;

/**
 * leaf
 */
public class Triangle implements Shape {
    @Override
    public void draw(String color) {
        System.out.println("triangle draw color: " + color);
    }
}
