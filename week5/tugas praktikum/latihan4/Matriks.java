package latihan4;

import java.util.Scanner;  

public class Matriks {
    private int[][] matriksA;  
    private int[][] matriksB;  
    private int[][] hasilPenjumlahan;  
    private int[][] hasilPerkalian;  

    // Method untuk input matriks  
    private void inputMatriks(int[][] matriks, String namaMatriks) {  
        Scanner scanner = new Scanner(System.in);  
        System.out.println("Input elemen " + namaMatriks + ": ");  
        for (int i = 0; i < matriks.length; i++) {  
            for (int j = 0; j < matriks[i].length; j++) {  
                System.out.print("input " + namaMatriks + " [" + i + "][" + j + "] = ");  
                matriks[i][j] = scanner.nextInt();  
            }  
        }  
    }  

    // Method untuk menjumlahkan matriks  
    private void jumlahMatriks() {  
        for (int i = 0; i < matriksA.length; i++) {  
            for (int j = 0; j < matriksA[i].length; j++) {  
                hasilPenjumlahan[i][j] = matriksA[i][j] + matriksB[i][j];  
            }  
        }  
    }  

    // Method untuk mengalikan matriks  
    private void kaliMatriks() {  
        for (int i = 0; i < matriksA.length; i++) {  
            for (int j = 0; j < matriksB[0].length; j++) {  
                hasilPerkalian[i][j] = 0; // Inisialisasi hasil  
                for (int k = 0; k < matriksA[0].length; k++) {  
                    hasilPerkalian[i][j] += matriksA[i][k] * matriksB[k][j];  
                }  
            }  
        }  
    }  

    // Method untuk menampilkan matriks  
    private void tampilkanMatriks(int[][] matriks, String namaMatriks) {  
        System.out.println("Hasil " + namaMatriks + ":");  
        for (int[] baris : matriks) {  
            for (int elemen : baris) {  
                System.out.print(elemen + " ");  
            }  
            System.out.println();  
        }  
    }  

    public static void main(String[] args) {  
        Matriks matriks = new Matriks();  
        Scanner scanner = new Scanner(System.in);  

        System.out.print("Input baris matriks A= ");  
        int barisA = scanner.nextInt();  
        System.out.print("Input kolom matriks A= ");  
        int kolomA = scanner.nextInt();  
        matriks.matriksA = new int[barisA][kolomA];  

        matriks.inputMatriks(matriks.matriksA, "A");  

        System.out.print("Input baris matriks B= ");  
        int barisB = scanner.nextInt();  
        System.out.print("Input kolom matriks B= ");  
        int kolomB = scanner.nextInt();  
        matriks.matriksB = new int[barisB][kolomB];  

        matriks.inputMatriks(matriks.matriksB, "B");  

        // Penjumlahan matriks (harus memiliki ukuran yang sama)  
        if (barisA == barisB && kolomA == kolomB) {  
            matriks.hasilPenjumlahan = new int[barisA][kolomA];  
            matriks.jumlahMatriks();  
            matriks.tampilkanMatriks(matriks.hasilPenjumlahan, "penjumlahan matriks C");  
        } else {  
            System.out.println("Ukuran matriks tidak sesuai untuk penjumlahan.");  
        }  

        // Perkalian matriks (kolom A harus sama dengan baris B)  
        if (kolomA == barisB) {  
            matriks.hasilPerkalian = new int[barisA][kolomB];  
            matriks.kaliMatriks();  
            matriks.tampilkanMatriks(matriks.hasilPerkalian, "perkalian matriks A dengan matriks B");  
        } else {  
            System.out.println("Ukuran matriks tidak sesuai untuk perkalian.");  
        }  

        scanner.close();  
    }  
}  