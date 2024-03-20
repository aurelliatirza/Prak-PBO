import java.util.Scanner;

public class MLingkaran {
    public static void main(String[] args) {
        Lingkaran lingkaran1 = new Lingkaran(10.2);
        System.out.println("Luas lingkaran dengan jejari 10.2 satuan adalah "+ lingkaran1.hitungLuas());

        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan jejari lingkaran: ");
        double jejari = scan.nextDouble();
        Lingkaran lingkaran2 = new Lingkaran(jejari);
        System.out.println("Luas lingkaran tersebut dengan jejari " + jejari + " satuan adalah " + lingkaran2.hitungLuas());
        scan.close();
    }
}
