package e20e21e22;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Triangle extends Shape{

    private int side;
    private int height;

    @Override
    int calculatePerimeter() {
        return side*3;
    }

    @Override
    int calculateArea() {
        return side*height/2;
    }
}
