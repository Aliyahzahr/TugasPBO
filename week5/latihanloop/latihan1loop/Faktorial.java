package latihan1loop;

import java.util.Scanner;

public class Faktorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan: ");
        int n = input.nextInt();
        
        if (n < 0) {
            System.out.println("Faktorial tidak terdefinisi untuk bilangan negatif!");
        } else if (n == 0 || n == 1) {
            System.out.println("Faktorial dari " + n + " adalah 1");
        } else {
            hitungFaktorial(n);
        }
        
        input.close();
    }
    
    static void hitungFaktorial(int n) {
        int hasil = 1;
        System.out.println("Bilangan : " + n);
        
        for (int i = 1; i < n; i++) {
            hasil *= i;
            System.out.println(hasil + " x " + (i + 1) + " = " + (hasil * (i + 1)));
        }
        
        hasil *= n;
        System.out.println(hasil);
    }

}
