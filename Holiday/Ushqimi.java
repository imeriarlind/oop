package Holiday;

public class Ushqimi extends Sherbimi{
	
	public enum Tipi{
	Gjysme_pansion,
	Pansion_plote
	}
	
	private Tipi tipi;
	
	public Ushqimi (String emri, int qmimi , Tipi tipi) throws HolidayException{
		super(emri,qmimi);
		this.tipi=tipi;
	}
	
	public Tipi getTipi(){
		return tipi;
	}
	
	public void setTipi(Tipi tipi){
		this.tipi=tipi;
	}
	
	@Override
	public String toString(){
		return super.toString()+ " - " + tipi;
	}
}
