package session12.shapes;

public abstract class Shape {
    private int x;
    private int y;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract double getArea();

    public abstract double getCircumference();

    @Override
    public String toString() {
        return String.format("%s vizatohet ne koordinatat [%d,%d], siperfaqja: %.2f, perimetri, %.2f", getClass().getSimpleName(), x, y, getArea(), getCircumference());
    }
}
