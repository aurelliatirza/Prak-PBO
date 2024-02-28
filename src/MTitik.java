

class MTitik
{

    public static void main(String args[]) {
        Titik t1 = new Titik();
        t1.setAbsis(3);
        t1.setOrdinat(4);
        System.out.println("Titik1("+ t1.getAbsis() + ", " + t1.getOrdinat() + ")");
        Titik t2 = new Titik(5, 6);
        System.out.println("titik t3 adalah: " + t2.getAbsis()+ " "+t2.getOrdinat());

        System.out.println("Jarak PUsat t1 adalah: "+ t1.getJarakPusat());
        System.out.println("Pencerminan");
        t1.getRefleksiX();
        System.out.println("PEncerminan dengan sumbu-x");
        System.out.println("Titik("+ t1.getAbsis() + ", " + t1.getOrdinat() + ")");
        t2.getRefleksiY();
        System.out.println("PEncerminan dengan sumbu-y");
        System.out.println("Titik("+ t2.getAbsis() + ", " + t2.getOrdinat() + ")");

    }
}
