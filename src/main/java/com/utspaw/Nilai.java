package com.uts1;

import java.util.Scanner;

public class Nilai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  

        System.out.print("Masukkan nilai: ");
        double nilai = scanner.nextDouble();

        if (nilai >= 80 && nilai <= 100) {
            System.out.println("Grade: A");
        } else if (nilai >= 77.5 && nilai <= 79.99) {
            System.out.println("Grade: A-");
        } else if (nilai >= 75 && nilai < 77.5) {
            System.out.println("Grade: AB");
        } else if (nilai >= 72.5 && nilai < 75) {
            System.out.println("Grade: B+");
        } else if (nilai >= 70 && nilai < 72.5) {
            System.out.println("Grade: B");
        } else if (nilai >= 67.5 && nilai < 69.99) {
            System.out.println("Grade: B-");
        } else if (nilai >= 65 && nilai < 67.49) {
            System.out.println("Grade: BC");
        } else if (nilai >= 62.5 && nilai < 64.99) {
            System.out.println("Grade: C+");
        } else if (nilai >= 60 && nilai < 62.49) {
            System.out.println("Grade: C");
        } else if (nilai >= 55 && nilai < 59.99) {
            System.out.println("Grade: C-");
        } else if (nilai >= 50 && nilai < 54.99) {
            System.out.println("Grade: CD");
        } else if (nilai >= 45 && nilai < 49.99) {
            System.out.println("Grade: D+");
        } else if (nilai >= 40 && nilai < 44.99) {
            System.out.println("Grade: D");
        } else if (nilai < 40.00) {
            System.out.println("Grade: E");
        }else {
            System.out.println("Tidak ada grade yang sesuai untuk nilai ini.");
        }

        scanner.close();
    }
}