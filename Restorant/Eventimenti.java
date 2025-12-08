package Restorant;

import java.util.List;
import java.util.ArrayList;


public class Eventimenti {
	private int shifra;
	private Lokali lokali;
	private int nr_musafirve;
	private List<Artikulli> artikujt;
	
	public Eventimenti(int shifra, Lokali lokali, int nr_musafirve, List<Artikulli>artikujt) throws EvenimentitException  {
		if(shifra <= 0){
			throw new EvenimentitException("shfra nuk munet me kan null");
		}
		this.shifra = shifra;
		if(lokali == null){
			throw new EvenimentitException("lokali nuk munet me kan null");
		}
		this.lokali = lokali;
		if(nr_musafirve < (lokali.getKapaciteti()/2)){
			throw new EvenimentitException("nr i musafirve duhet te jet se paku sa gjysma e kapacitetit");
		}
		this.nr_musafirve = nr_musafirve;
		this.artikujt = new ArrayList(artikujt);
	}
	
	public double kalkuloCmimin(){
        double shuma = 0;
        for (Artikulli artikull : artikujt) {
            if (artikull != null) {
                if (artikull instanceof Pija) {
                    Pija pija = (Pija) artikull;
                    // Krahasoni enum, jo string
                    if (pija.getTipi() == Pija.Tipi.FRESKUESE) {
                        shuma += artikull.getQmimi() * 0.9;
                        continue;
                    }
                }
                shuma += artikull.getQmimi();
            }
        }
        return shuma;
    }

    public void print(){
		System.out.println(shifra+ " - " + lokali.toString() +" : "+nr_musafirve);
		for(Artikulli artikull : artikujt){
			System.out.println(" "+artikull.toString());
		}
		System.out.println("totali: "+kalkuloCmimin());
    }
	
	public static void main(String[] args){
		try{
			Lokali kafeneja = new Lokali("kafeneja",15);
            Ushqimi mengjes = new Ushqimi("voe",5,true);
			Ushqimi dark = new Ushqimi("stake", 20 , false);
			Pija leng = new Pija ("sok me pip", 2,Pija.Tipi.FRESKUESE);
			List<Artikulli> artikull = new ArrayList<Artikulli>();
			artikull.add(mengjes);
			artikull.add(dark);
			artikull.add(leng);

            Eventimenti event = new Eventimenti(2,kafeneja,10,artikull);
			
			event.print();
			
			
		}
        catch(EvenimentitException ex){
            System.out.println(ex.getMessage());
        }
	}
}
