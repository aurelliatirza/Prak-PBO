public class Garis {

    private Titik tAwal;
    private Titik tAkhir;

    public Garis(){
        tAwal = new Titik();
        tAkhir = new Titik();
    }

    public Garis(Titik tAwal, Titik tAkhir){
        this.tAwal = tAwal;
        this.tAkhir = tAkhir;
    }
    
    public void setTitikAwal(Titik tAwal){
        this.tAwal = tAwal;
    }

    public void setTitikAkhir(Titik tAkhir){
        this.tAkhir = tAkhir;
    }

    public Titik getTitikAwal(){
        return this.tAwal;
    }

    public Titik getTitikAkhir(){
        return this.tAkhir;
    }

    public String koordinatGaris(){
        return "(" + tAwal.getAbsis() + ", " + tAwal.getOrdinat() + ") , (" + tAkhir.getAbsis() + ", " + tAkhir.getOrdinat() + ")";
    }

    public double getPanjang(){
        double deltaYKuadrat = Math.pow((tAkhir.getOrdinat()-tAwal.getOrdinat()),2);
        double deltaXKuadrat = Math.pow((tAkhir.getAbsis()-tAwal.getAbsis()),2);
        return Math.sqrt((deltaXKuadrat+deltaYKuadrat));
    }

    public double getGradien(){
        double deltaY = tAkhir.getOrdinat()-tAwal.getOrdinat();
        double deltaX = tAkhir.getAbsis()-tAwal.getAbsis();
        return deltaY/deltaX;
    }

    public Garis getRefleksiYGaris(){
        Garis Gx = new Garis (getTitikAwal().getRefleksiY(), getTitikAkhir().getRefleksiY());
        return Gx;
    }

    public Garis getRefleksiXGaris(){
        Garis Gx = new Garis (getTitikAwal().getRefleksiX(), getTitikAkhir().getRefleksiX());
        return Gx;
    }
    
    public boolean isTegakLurus(Garis G){
        return this.getGradien() * G.getGradien() == -1;
    }
}
