package session12.shapes;

public class ShapeTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5, 5, 10);
        shapes[1] = new Rectangle(10, 20, 100, 200);
        shapes[2] = new Square(25, 35, 15);

        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}
