package latihan1;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Jumlah data yang akan dimasukkan
        System.out.print("Masukkan jumlah data: ");
        int jumlah = input.nextInt();

        int[] nilai = new int[jumlah];

        // Input data
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan data ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
        }

        // Menampilkan data yang telah dimasukkan
        System.out.println("\nData yang dimasukkan:");
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Data ke - " + (i + 1) + " = " + nilai[i]);
        }

        // Menampilkan hasil nilai sesuai indeks
        System.out.println("\nHasil nilai:");
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Hasil nilai[" + i + "] = " + nilai[i]);
        }

        input.close();
    }
}
