package e20e21e22;

public class Main {
    public static void main(String[] args) {

        Shape hexagon = new Hexagon(5);
        Shape triangle = new Triangle(4, 6);
        Shape rectangle = new Rectangle(10,3);
        System.out.println(hexagon.calculateArea() + " " + hexagon.calculatePerimeter());
        System.out.println(triangle.calculateArea() + " " + triangle.calculatePerimeter());
        System.out.println(rectangle.calculateArea() + " " + rectangle.calculatePerimeter());
        System.out.println("--------------------------------------------");

        ThreeDShape cube = new Cube(11);
        System.out.println("Perimeter: " + cube.calculatePerimeter() + " Area: " + cube.calculateArea() + " Volume: " + cube.calculateVolume());
        ThreeDShape cone = new Cone(10,10);
        System.out.println("Perimeter: " + cone.calculatePerimeter() + " Area: " + cone.calculateArea() + " Volume: " + cone.calculateVolume());

    }
}
