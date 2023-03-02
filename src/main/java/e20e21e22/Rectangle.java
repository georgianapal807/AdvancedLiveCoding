package e20e21e22;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Rectangle extends Shape{
    private int longSide;
    private int shortSide;
    @Override
    int calculatePerimeter() {
        return (longSide*2)+(shortSide*2);
    }

    @Override
    int calculateArea() {
        return longSide*shortSide;
    }
}
