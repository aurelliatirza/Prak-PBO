public class BujurSangkar  extends BangunDatar{
    public double hitungLuas(double sisi){
        luas = sisi * sisi;
        return luas;
    }
}

//Jika metode Abstrak BangunDatar yang berupa hitungLuas() tidak dapat dijalankan
//karena method hitungLuas() diwariskan dari class abstract
//Sehingga segala method yand ada di class abstract harus diimplementasikan oleh child classnya.