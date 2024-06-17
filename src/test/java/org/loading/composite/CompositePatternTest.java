package org.loading.composite;

import org.junit.jupiter.api.Test;

public class CompositePatternTest {
    @Test
    void compositeTest() {
        //arrange
        Shape circle = new Circle();
        Shape triangle = new Triangle();

        Drawing drawing = new Drawing();
        drawing.addShape(circle);
        drawing.addShape(triangle);

        //act
        drawing.draw("red");
    }
}
