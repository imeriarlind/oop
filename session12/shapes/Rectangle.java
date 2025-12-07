package session12.shapes;

public class Rectangle extends Quadrilateral {
    public Rectangle(int x, int y, int sideA, int sideB) {
        super(x, y, sideA, sideB, sideA, sideB);
    }

    @Override
    public double getArea() {
        return getSideA() * getSideB();
    }
}
