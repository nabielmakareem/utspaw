package com.uts1;

import java.util.Date;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class CustomerHotel {
    long noktp;
    String name;
    String address;
    int nokamar;
    Date waktuCheckin;
    Date waktuCheckout;
    double totalpembayaran;
    String pesananMakanan;

    public CustomerHotel() {
        noktp = 452876512;
        name = "Nabiel Makareem A";
        address = "Jl. Kapten Piere Tendean";
        nokamar = 301;
    }

    public void infotamu() {
        System.out.println("No.KTP: " + noktp);
        System.out.println("Nama: " + name);
        System.out.println("Alamat: " + address);
        System.out.println("No.Kamar: " + nokamar);
    }
    
    public void setchekin (Date waktu) {
        LocalDate currentDate = LocalDate.now(); // Current date
        System.out.println("Waktu Checkin: " + currentDate);
    }

    public void setchekout (Date waktu) {
        LocalDate currentDate = LocalDate.now();
        LocalDate nextDay = currentDate.plus(1, ChronoUnit.DAYS);
        System.out.println("Waktu Checkout: " + nextDay);
    }

    public void informasipembayaran() {
        double totalpembayaran = 300000;
        System.out.println("Total Pembayaran: " + totalpembayaran);
    }

    public void pesananMakanan() {
        pesananMakanan = "Mie Goreng Ayam Kampung + Es Tea";
        System.out.println("makanan Yang di pesan: " + pesananMakanan);
    }

}