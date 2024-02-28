// public class MTitik {
    
//     public static void main(String[] args) {
//         Titik T1 = new Titik();
//         Titik T2 = new Titik();
//         //Titik T3;

//         T1.setAbsis(1);
//         T1.setOrdinat(1);
//         T2.setAbsis(4);
//         T2.setOrdinat(5);

        
//         // System.out.println(("\nJumkah Objek titik: " + T2.getCounter()));
//         System.out.println("T1(" + T1.getAbsis()+ ", " + T1.getOrdinat() + ")");
//         System.out.println("T2(" + T2.getAbsis()+ ", " + T2.getOrdinat() + ")");
//         // System.out.println("\nT3(" + T3.getAbsis()+ ", " + T3.getOrdinat() + ")");       
//     }
// }


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