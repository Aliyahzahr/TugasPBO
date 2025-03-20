package week3;
import java.util.Random;
import java.util.Scanner;

class Tebakangka {
    public static void main(String[] aaa) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        
        System.out.println("========================");
        System.out.println("      TEBAK ANGKA       ");
        System.out.println("========================");
        Angka angka = new Angka (r.nextInt(100));
        int tebakan;
        
        do {
            System.out.print("Masukkan angka: ");
            tebakan = s.nextInt();

            if (!angka.cekAngka(tebakan)) 
            {
                angka.statusAngka(tebakan);
            }
            else 
            {
                System.out.println("Tebakan kamu benar!");
            }
        }
        while(angka.angka != tebakan);
    }
}