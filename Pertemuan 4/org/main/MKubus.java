package org.main;

import org.bangundatar.*;
import org.bangunruang.*;

public class MKubus {
  public static void main(String[] args){
    Kubus kubus = new Kubus(new BujurSangkar(4));
	
	  System.out.println("\n");

    double luasAlas = kubus.hitungLuasAlas();
    System.out.println("Luas Permukaan Kubus dengan panjang sisi 4 satuan : " + luasAlas);
	
    double volumeKubus = kubus.hitungVolume();
    System.out.println("Volume Kubus dengan panjang sisi 4 satuan : " + volumeKubus);

    BujurSangkar persegi = new BujurSangkar(10);
    System.out.println("Luas Bujur Sangkar : " + persegi.hitungLuas());

    Segitiga segitiga = new Segitiga(3, 5, 3);
    segitiga.printInfo();
    System.out.println("Luas Segitiga : " + segitiga.hitungLuas());
	}
}