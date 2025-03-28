package latihan1;

import java.util.Scanner;

class Nilai {
    int angka;

    // Konstruktor untuk menyimpan nilai
    public Nilai(int angka) {
        this.angka = angka;
    }

    // Method untuk menampilkan nilai
    public void tampilkanNilai(int index) {
        System.out.println("Hasil nilai[" + index + "] = " + angka);
    }
}

public class ArrayObjek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah data: ");
        int jumlah = input.nextInt();

        // Array Objek untuk menyimpan nilai
        Nilai[] daftarNilai = new Nilai[jumlah];

        // Input data
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan data ke-" + (i + 1) + ": ");
            int angka = input.nextInt();
            daftarNilai[i] = new Nilai(angka);
        }

        // Menampilkan hasil dengan method daftarNilai()
        System.out.println("\nHasil nilai:");
        for (int i = 0; i < jumlah; i++) {
            daftarNilai[i].tampilkanNilai(i);
        }

        input.close();
    }
}
