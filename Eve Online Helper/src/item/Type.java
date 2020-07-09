package item;

public class Type {
    private int id;
    private String name;
    private double median;
    
    public Type(int id, String name){
        this.id = id;
        this.name = name;
    }
    
    public void setMedian(double median){ this.median = median; }
    public double getMedian(){ return this.median; }
    public int getID(){ return this.id; }
    public String getName(){ return this.name; }
    
}
