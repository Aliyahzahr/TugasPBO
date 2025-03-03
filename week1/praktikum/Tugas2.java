package praktikum;  

public class Tugas2 {  
    public static void main(String[] args) {  
        // 1. Luas dan Keliling Persegi  
        double sisi = 5.0; // Ganti dengan panjang sisi persegi  
        double luasPersegi = sisi * sisi;  
        double kelilingPersegi = 4 * sisi; // Keliling persegi  
        System.out.println("Luas Persegi: " + luasPersegi);  
        System.out.println("Keliling Persegi: " + kelilingPersegi);  

        // 2. Luas dan Keliling Segitiga  
        double alas = 6.0; // Ganti dengan alas segitiga  
        double tinggi = 4.0; // Ganti dengan tinggi segitiga  
        double sisiMiring = Math.sqrt((alas * alas) + (tinggi * tinggi)); // Hitung sisi miring dengan Pythagoras  
        double luasSegitiga = 0.5 * alas * tinggi;  
        double kelilingSegitiga = alas + tinggi + sisiMiring; // Keliling segitiga  
        System.out.println("Luas Segitiga: " + luasSegitiga);  
        System.out.println("Keliling Segitiga: " + kelilingSegitiga);  

        // 3. Luas dan Keliling Lingkaran  
        double jariJari = 3.0; // Ganti dengan jari-jari lingkaran  
        double phi = 3.14; // Nilai pi  
        double luasLingkaran = phi * jariJari * jariJari;  
        double kelilingLingkaran = 2 * phi * jariJari; // Keliling lingkaran  
        System.out.println("Luas Lingkaran: " + luasLingkaran);  
        System.out.println("Keliling Lingkaran: " + kelilingLingkaran);  

        // 4. Volume Kubus  
        double sisiKubus = 2.0; // Ganti dengan panjang sisi kubus  
        double volumeKubus = sisiKubus * sisiKubus * sisiKubus;  
        System.out.println("Volume Kubus: " + volumeKubus);  
    }  
}  