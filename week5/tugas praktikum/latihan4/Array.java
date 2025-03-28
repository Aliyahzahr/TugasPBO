package latihan4; 

import java.util.ArrayList;  

public class Array {  
    private ArrayList<Integer> nilai1 = new ArrayList<>();  
    private ArrayList<Integer> nilai2 = new ArrayList<>();  
    private ArrayList<Integer> jumlah = new ArrayList<>();  
    private ArrayList<Integer> pengurangan = new ArrayList<>();  
    private ArrayList<Integer> perkalian = new ArrayList<>();  
    private ArrayList<Integer> pembagian = new ArrayList<>();  

    public void setNilai1(ArrayList<Integer> nilai) {  
        this.nilai1 = nilai;  
    }  

    public void setNilai2(ArrayList<Integer> nilai) {  
        this.nilai2 = nilai;  
    }  

    public void hitung() {  
        for (int i = 0; i < nilai1.size(); i++) {  
            jumlah.add(nilai1.get(i) + nilai2.get(i));  
            pengurangan.add(nilai1.get(i) - nilai2.get(i));  
            perkalian.add(nilai1.get(i) * nilai2.get(i));  
            if (nilai2.get(i) != 0) {  
                pembagian.add(nilai1.get(i) / nilai2.get(i));  
            } else {  
                pembagian.add(0); // Atau bisa ditangani dengan cara lain  
            }  
        }  
    }  

    public void tampilkanHasil() {  
        for (int i = 0; i < jumlah.size(); i++) {  
            System.out.println("Hasil Jumlah index ke-" + i + " = " + jumlah.get(i));  
            System.out.println("Hasil Pengurangan index ke-" + i + " = " + pengurangan.get(i));  
            System.out.println("Hasil Perkalian index ke-" + i + " = " + perkalian.get(i));  
            if (nilai2.get(i) != 0) {  
                System.out.println("Hasil Pembagian index ke-" + i + " = " + pembagian.get(i));  
            } else {  
                System.out.println("Pembagian index ke-" + i + " tidak dapat dilakukan (Pembagi 0)");  
            }  
        }  
    }  
}  