package Restorant;

public abstract class Artikulli {
	private String emri;
	private int qmimi;
	
	public Artikulli(String emri, int qmimi) throws EvenimentitException{
		if(emri == null){
			throw new EvenimentitException("emri nuk munet me kan null");
		}
		this.emri = emri;
		setQmimi(qmimi);
	}
	
	public String getEmri(){
		return emri;
	}
	public int getQmimi(){
		return qmimi;
	}
	public void setQmimi(int qmimi) throws EvenimentitException{
		if(qmimi <= 0){
			throw new EvenimentitException("Qmimi nuk mud te ket vlere negative ose 0");
		}
		this.qmimi=qmimi;
	}
	
	@Override
	public String toString(){
		return this.getClass().getSimpleName()+" " + emri + " - "+ qmimi;
	}
	
	@Override
	public boolean equals(Object obj){
		if(obj instanceof Artikulli ar){
			return this.emri.equalsIgnoreCase(ar.emri);
		}
		return false;
	}
}
