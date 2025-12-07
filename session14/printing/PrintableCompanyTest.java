package session14.printing;

public class PrintableCompanyTest {
    public static void main(String[] args) {
        Printable [] printers = new Printable[2];
        printers[0] = new Printer(123, "Hp");
        printers[1] = new CopierPrinter(123, "Hp");

        for (int i = 0; i < printers.length; i++) {
            printers[i].print();
        }

        Copying [] copiers = new  Copying[2];
        copiers[0] = new CopierPrinter(123, "Hp");
        copiers[0] = new Copier("A1234D", "Hp");
        for (int i = 0; i < copiers.length; i++) {
            copiers[i].copy();
        }
    }
}
