package session14.printing;

public class Copier implements Copying{
    private String id;
    private String model;

    public Copier(String id, String model) {
        this.id = id;
        this.model = model;
    }

    @Override
    public void copy() {
        System.out.println("Copier " + id + " " + model+" is copying....");
    }
}
