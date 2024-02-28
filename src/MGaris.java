public class MGaris {
    public static void main(String[] args) {
        Titik titikAwal = new Titik(5,3);
        Titik titikAkhir = new Titik(6,8);

        Garis G1 = new Garis(titikAwal, titikAkhir);
        System.out.println("Garis G1 berkoordinat: " + G1.koordinatGaris());
        System.out.println("Panjang garis G1 adalah: " + G1.getPanjang());
        System.out.println("Kemiringan/Gradien garis G1 adalah: " + G1.getGradien());

        Garis G2 = new Garis(new Titik(-2, 4), new Titik(3, 3));
        System.out.println("Garis G2 berkoordinat: " + G2.koordinatGaris());
        System.out.println("Panjang garis G2 adalah: " + G2.getPanjang());
        System.out.println("Kemiringan/Gradien garis G2 adalah: " + G2.getGradien());

        System.out.println("Apakah G1 tegak lurus dengan G2? " + G1.isTegakLurus(G2));

        Garis G3 = G1.getRefleksiXGaris();
        System.out.println("Garis G1 direfleksikan terhadap sumbu-x: " + G3.koordinatGaris());
        Garis G4 = G2.getRefleksiYGaris();
        System.out.println("Garis G2 direfleksikan terhadap sumbu-Y: " + G4.koordinatGaris());
    }
}
