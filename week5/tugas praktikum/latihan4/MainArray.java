package latihan4;  

import java.util.ArrayList;  
import java.util.Scanner;  

public class MainArray {  
    public static void main(String args[]) {  
        Scanner scanner = new Scanner(System.in);  

        // Input jumlah data yang diinginkan  
        System.out.print("Masukkan jumlah data: ");  
        int jumlahData = scanner.nextInt();  

        // Buat objek untuk mengelola operasi ArrayList  
        Array arrayOps = new Array();  // Pastikan ini adalah kelas yang sesuai  
        ArrayList<Integer> nilai1 = new ArrayList<>();  
        ArrayList<Integer> nilai2 = new ArrayList<>();  

        // Input nilai untuk nilai1  
        System.out.println("Nilai 1:");  
        for (int i = 0; i < jumlahData; i++) {  
            System.out.print("Index ke-" + i + " = ");  
            nilai1.add(scanner.nextInt());  
        }  

        // Input nilai untuk nilai2  
        System.out.println("Nilai 2:");  
        for (int i = 0; i < jumlahData; i++) {  
            System.out.print("Index ke-" + i + " = ");  
            nilai2.add(scanner.nextInt());  
        }  

        // Set nilai ke objek operasi  
        arrayOps.setNilai1(nilai1);  
        arrayOps.setNilai2(nilai2);  

        // Hitung semua operasi  
        arrayOps.hitung();  

        // Tampilkan hasil  
        arrayOps.tampilkanHasil();  

        scanner.close();  
    }  
}  