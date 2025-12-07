package session14.printing;

public class Printer implements Printable {
    private int id;
    private String model;

    public Printer(int id, String model) {
        this.id = id;
        this.model = model;
    }

    @Override
    public void print() {
        System.out.println("Printer " + id + " " + model+" is printing....");
    }

}
