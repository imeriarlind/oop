package Holiday;

public abstract class Sherbimi {
    private final String emri;
    private int qmimi;

    public Sherbimi(String emri, int qmimi) throws HolidayException{
        this.emri=emri;
        if(qmimi <= 0){
            throw new HolidayException("qmimi duhet te kete vlere pozitive");
        }
        this.qmimi= qmimi;
    }

    public String getEmri(){
        return emri;
    }
    public int getQmimi(){
        return qmimi;
    }
    public void setQmimi(int n) throws HolidayException{
        if(n <= 0){
            throw new HolidayException("qmimi duhet te kete vlere pozitive");
        }
        this.qmimi= n;
    }

    @Override
    public String toString(){
        return this.getClass().getSimpleName() + " " + emri + ": "+ qmimi;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Sherbimi sherbimi) {
            return this.emri.equals(sherbimi.emri);
        }
        return false;
    }
}
