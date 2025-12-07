package session12.shapes;

public abstract class Quadrilateral extends Shape {
    private int sideA;
    private int sideB;
    private int sideC;
    private int sideD;

    public Quadrilateral(int x, int y, int sideA, int sideB, int sideC, int sideD) {
        super(x, y);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.sideD = sideD;
    }

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public int getSideC() {
        return sideC;
    }

    public int getSideD() {
        return sideD;
    }

    @Override
    public double getCircumference() {
        return sideA + sideB + sideC + sideD;
    }
}
