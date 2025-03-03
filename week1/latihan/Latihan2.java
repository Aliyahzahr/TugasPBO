package latihan;  

public class Latihan2 {  
    public static void main(String[] args) {  
         
        Integer diameterLingkaran = 10;   
        Double jariJariLingkaran = diameterLingkaran / 2.0;   
        Double kelilingLingkaran = 2 * Math.PI * jariJariLingkaran;   

          
        Integer alasSegitiga = 6;  
        Integer tinggiSegitiga = 8;  
        Double luasSegitiga = 0.5 * alasSegitiga * tinggiSegitiga;  

         
        Integer diameterTabung = 5;  
        Double jariJariTabung = diameterTabung / 2.0;   
        Integer tinggiTabung = 10;  
        Double volumeTabung = Math.PI * Math.pow(jariJariTabung, 2) * tinggiTabung;  

       
        System.out.println("Keliling Lingkaran: " + kelilingLingkaran);  
        System.out.println("Luas Segitiga: " + luasSegitiga);  
        System.out.println("Volume Tabung: " + volumeTabung);  
    }  
}  