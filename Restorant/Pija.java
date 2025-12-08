package Restorant;

public class Pija extends Artikulli{
	public enum Tipi{
		FRESKUESE,
		ALKOOLIKE
	}
	
	private Tipi tipi;
	
	public Pija(String emri, int qmimi, Tipi tipi) throws EvenimentitException{
		super(emri,qmimi);
		this.tipi = tipi;
	}
	
	public Tipi getTipi(){
		return tipi;
	}
	public void setTipi(Tipi tipi){
		this.tipi=tipi;
	}
	
	@Override
	public String toString(){
		return super.toString() + "  " + tipi;
	}
}
