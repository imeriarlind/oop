package Restorant;

public class Ushqimi extends Artikulli{
	private boolean eshteVegetarian;
	
	public Ushqimi(String emri, int qmimi, boolean eshteVegetarian) throws EvenimentitException{
		super(emri,qmimi);
		this.eshteVegetarian=eshteVegetarian;
	}
	
	public boolean getEshteVegetarian(){
		return eshteVegetarian;
	}
	
	public void setEshteVegetarian(boolean a){
		this.eshteVegetarian = a;
	}
	
	@Override
	public String toString(){
		return super.toString()+"   vegetarian:" + eshteVegetarian;
	}
}
