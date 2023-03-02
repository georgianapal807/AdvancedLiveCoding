package e20e21e22;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Cube extends ThreeDShape{

    private int side;
    @Override
    int calculatePerimeter() {
        return 12*side;
    }

    @Override
    int calculateArea() {
        return 6*side*side;
    }

    @Override
    int calculateVolume() {
        return side*side*side;
    }
}
