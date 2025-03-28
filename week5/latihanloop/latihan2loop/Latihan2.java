package latihan2loop;

import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input bilangan maksimum
        System.out.print("Bilangan: ");
        int n = scanner.nextInt();
        
        // Menampilkan angka dalam kelompok 5
        int count = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
            count++;
            if (count % 5 == 0) {
                System.out.println();
            }
        }
        System.out.println("\n------------------");
        
        // Meminta input untuk pemisahan
        System.out.print("Dipecah: ");
        int split = scanner.nextInt();
        
        count = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
            count++;
            if (count == split) {
                System.out.println();
                count = 0;
                split++;
            }
        }

        scanner.close();
    }
}