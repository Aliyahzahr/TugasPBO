package week6;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Membuat objek Scanner
        System.out.print("Masukkan kata: ");
        String input = scanner.nextLine(); // Menerima input dari user

        TextGame game;

        // Kamu bisa pilih ingin pakai FancyTextGame atau TextGame biasa
        game = new FancyTextGame();

        boolean hasil = game.isPalindrome(input);

        // Output hasil
        System.out.println("Hasil: " + (hasil ? "Palindrome" : "Bukan Palindrome"));

        scanner.close(); // Menutup Scanner
    }
}
