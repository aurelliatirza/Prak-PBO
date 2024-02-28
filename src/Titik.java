
public class Titik {
    private double x,y;
    static int counter;
    public Titik(double x, double y){
        counter++;
        this.x = x;
        this.y = y;
    }
    public Titik(){
        this(0,0);
    }
    public void setAbsis(double x){
        this.x = x;
    }

    public void setOrdinat(double y){
        this.y = y;
    }

    public double getAbsis(){
        return this.x;
    }

    public double getOrdinat(){
        return this.y;
    }

    public int getCounter(){
        return counter;
    }
    
    public double getJarakPusat(){
        return Math.sqrt((getAbsis()*getAbsis())+(getOrdinat()*getOrdinat()));
    }

    private void refleksiX(){
        this.setOrdinat(this.getOrdinat() * -1);
    }

    public void getRefleksiX(){
        refleksiX();
    }

    private void refleksiY(){
        this.setAbsis(this.getAbsis() * -1);
    }

    public void getRefleksiY(){
        refleksiY();
    }
}