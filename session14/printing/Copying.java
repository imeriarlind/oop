package session14.printing;

@FunctionalInterface
public interface Copying {
    void copy();

    default void maintenance(){
        System.out.println("Doing maintenance for printer!");
    }

    static int getCapacity()
    {
        return 5000;
    }
}
