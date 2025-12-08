package Holiday;
import java.util.ArrayList;
import java.util.List;

public class Pako {
	private final String emri;
	private Akomodimi akomodimi;
    private int nr_musafirve;
    private List<Sherbimi> sherbimet;

    public Pako(String emri, Akomodimi akomodimi, int nr_musafirve, List<Sherbimi> sherbimet) throws HolidayException {
        this.emri = emri;
        setAkomodimi(akomodimi);
        setNr_musafirve(nr_musafirve);
        this.sherbimet = new ArrayList<>(sherbimet);
    }
    public String getEmri(){
        return emri;
    }
    public Akomodimi getAkomodimi(){
        return akomodimi;
    }
    public int getNr_musafirve(){
        return nr_musafirve;
    }


    public void setAkomodimi(Akomodimi akomodimi) throws HolidayException{
        if(akomodimi == null){
            throw new HolidayException("akomodimi nuk duhet te jet null");
        }
        this.akomodimi = akomodimi;
    }

    public void setNr_musafirve(int n) throws HolidayException{
        if(n < (akomodimi.getKapaciteti() / 2)){
            throw new HolidayException("akomudimi nuk pranon kete numer te musafrive");
        }
        this.nr_musafirve = n;
    }

    public List<Sherbimi> getSherbimet(){
        return new ArrayList<>(sherbimet);
    }
    public void shtoSherbim(Sherbimi sherbim) throws HolidayException{
        if(sherbim == null){
            throw new HolidayException("sherbim nuk duhet te jet null");
        }
        if(sherbimet.contains(sherbim)){
           throw new HolidayException("sherbim vetem se egziston");
        }
        sherbimet.add(sherbim);
    }
    public void hiqSherbimin(Sherbimi sherbim){
        sherbimet.remove(sherbim);
    }


    public double kalkuloCmimin(){
        int shuma=0;
        for(Sherbimi sherbimi : sherbimet){
            double cmimiSherbimit = sherbimi.getQmimi();
            if(sherbimi instanceof Ushqimi ushqim){
                if(ushqim.getTipi()==Ushqimi.Tipi.Gjysme_pansion){
                    cmimiSherbimit *= 0.8;
                }
            }
            shuma += cmimiSherbimit * nr_musafirve;
        }
        return shuma;
    }

    public void printo(){
        System.out.println(emri + " - " + akomodimi.getShifra()+" - " + nr_musafirve );
        for(Sherbimi sherbimi : sherbimet){
            System.out.println(" "+ sherbimi.toString());
        }
        System.out.println("Totali: " + kalkuloCmimin());
    }
    public static void main(String[] args) {
        try{
            Akomodimi akomodimi = new Akomodimi(101,6);

            Ushqimi mengjesi = new Ushqimi("mengjesei",12,Ushqimi.Tipi.Gjysme_pansion);
            Ushqimi darka = new Ushqimi("darka",122,Ushqimi.Tipi.Pansion_plote);

            Shetitja shetitje = new Shetitja("deti",2000,"shengjin");

            List<Sherbimi>sherbimet=new ArrayList<>();
            sherbimet.add(mengjesi);
            sherbimet.add(darka);
            sherbimet.add(shetitje);

            Pako pako = new Pako("pushimet verore",akomodimi,4,sherbimet);

            pako.printo();
        }
        catch (HolidayException e){
            System.out.println("Gabim: " + e.getMessage());
        }
    }
}
