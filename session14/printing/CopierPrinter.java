package session14.printing;

public class CopierPrinter implements Copying, Printable {
    private int id;
    private String model;

    public CopierPrinter(int id, String model) {
        this.id = id;
        this.model = model;
    }

    @Override
    public void print() {
        System.out.println("Pritner " + id + " " + model+" is printing....");
    }

    @Override
    public void copy() {
        System.out.println("Copier " + id + " " + model+" is copying...."+Copying.getCapacity());
    }

    @Override
    public void maintenance() {
        Printable.super.maintenance();
        Copying.super.maintenance();
    }
}
