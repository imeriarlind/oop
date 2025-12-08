package Restorant;

public class Lokali {
	private final String emri;
	private int kapaciteti;
	
	public Lokali(String emri, int kapaciteti) throws EvenimentitException{
		if(emri == null){
			throw new EvenimentitException("emri nuk munet me kan null");
		}
		this.emri = emri;
		setKapaciteti(kapaciteti);
	}
	
	public String getEmri(){
		return emri;
	}
	
	public int getKapaciteti(){
		return kapaciteti;
	}
	
	public void setKapaciteti(int n) throws EvenimentitException{
		if(n<=0){
			throw new EvenimentitException("nuk munesh me lan kapacitet negativ");
		}
		if(n > 20){
			throw new EvenimentitException("nuk zen ven ma shum se 20");
		}
		this.kapaciteti=n;
	}
    @Override
    public String toString(){
        return emri;
    }
}
