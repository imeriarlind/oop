package Holiday;

public class Akomodimi {
    private final int shifra;
    private int kapaciteti;

    public Akomodimi(int shifra, int kapaciteti)  throws HolidayException {
        if(shifra <= 0){
            throw new HolidayException("Shifra duhet te jete pozitive");
        }
        if(kapaciteti < 2 && kapaciteti > 6){
            throw new HolidayException("Kapaciteti duhet te jete mes 2 dhe 6");
        }
		this.shifra=shifra;
		this.kapaciteti=kapaciteti;
    }
	
	public int getShifra(){
		return shifra;
	}
	
	public int getKapaciteti(){
		return kapaciteti;
	}
	
	public void setKapaciteti(int n) throws HolidayException {
		if(kapaciteti < 2 || kapaciteti > 6){
            throw new HolidayException("Kapaciteti duhet te jete mes 2 dhe 6");
        }
		this.kapaciteti = n;
	}


}
