package e20e21e22;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Cone extends ThreeDShape implements Fillable {
    private int height;
    private int radius;
    @Override
    int calculatePerimeter() {
        return (int) (2*Math.PI*radius);
    }

    @Override
    int calculateArea() {
        return (int) (Math.PI*radius*(radius+Math.sqrt(height*height)+(radius*radius)));
    }

    @Override
    int calculateVolume() {
        return (int) (Math.PI*radius*radius*(height/3));
    }

    @Override
    public void fill(int value) {
        if (calculateVolume()==value) {
            System.out.println("The figure is filled");
        }
    }
}
