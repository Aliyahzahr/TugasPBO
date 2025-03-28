package latihan2;

import java.util.ArrayList;  
import java.util.Scanner;  

public class NilaiMahasiswa {  
    private ArrayList<Integer> daftarNilai;  

    public NilaiMahasiswa() {  
        daftarNilai = new ArrayList<>();  
    }  

    public void tambahNilai(int nilai) {  
        daftarNilai.add(nilai);  
    }  

    public void tampilkanDaftarNilai() {  
        System.out.println("Daftar Nilai Mahasiswa:");  
        for (int i = 0; i < daftarNilai.size(); i++) {  
            System.out.println("Nilai ke-" + (i + 1) + ": " + daftarNilai.get(i));  
        }  
    }  

    public static void main(String[] args) {  
        NilaiMahasiswa nm = new NilaiMahasiswa();  
        Scanner scanner = new Scanner(System.in);  
        
        while (true) {  
            System.out.print("Masukkan nilai (atau ketik 0 untuk berhenti): ");  
            int nilai = scanner.nextInt();  
            if (nilai == 0) {  
                break;  // Keluar dari loop jika user mengetik 0  
            }  
            nm.tambahNilai(nilai);  // Menambah nilai ke dalam daftar  
        }  
        
        nm.tampilkanDaftarNilai();  // Menampilkan daftar nilai  
        scanner.close();  
    }  
}  