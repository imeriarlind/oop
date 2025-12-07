package session14.printing;

@FunctionalInterface
public interface Printable {
    void print();

    default void print3D(){
        System.out.println("Print 3D");
    }

    default void maintenance(){
        System.out.println("Doing maintenance for printer!");
    }

    static int getCapacity()
    {
        return 100;
    }
}
