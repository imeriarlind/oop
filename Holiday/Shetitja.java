package Holiday;

public class Shetitja extends Sherbimi{
	private String destinacioni;
	
	public Shetitja(String emri, int qmimi, String destinacioni) throws HolidayException{
		super(emri,qmimi);
		if(destinacioni == null){
			throw new HolidayException("destinacioni nuk munet me kan i zbrazet.");
		}
		this.destinacioni = destinacioni;
	}
	
	public String getDestinacioni(){
		return destinacioni;
	}
	
	public void setDestinacioni() throws HolidayException{
		if(destinacioni == null){
		throw new HolidayException("destinacioni nuk munet me kan i zbrazet.");
		}
		this.destinacioni = destinacioni;
	}
	
	@Override
	public String toString(){
		return super.toString() + " - " + destinacioni;
	}
}
