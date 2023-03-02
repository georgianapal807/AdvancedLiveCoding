package e20e21e22;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Hexagon extends Shape{

    private int side;

    @Override
    int calculatePerimeter() {
        return 6*side;
    }

    @Override
    int calculateArea() {
        return (int) (3*Math.sqrt(3)/2*side*side);
    }
}
