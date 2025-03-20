package week2;

publuc class MahasiswaAksi
{
    public static void main(String[] args)
    {
        //membuat objek mahasiswa
        Mahasiswa mahasiswaTI = new Mahasiswa();
        mahasiswaTI.setData(nim:"A11.2023.15294",nama:"Aliyah Zahratu Rizqi",programStudi:"Teknik Informatika",umur:"19");
        int angkatan = 0;
        angkatan = substring(mahasiswaTI.getNim(), 4, 4);

        System.out.println("NIM: " + mahasiswaTI.getNim());
        System.out.println("Nama: " + mahasiswaTI.getNama());
        System.out.println("Program Studi: " + mahasiswaTI.getProgramStudi());
        System.out.println("Umur: " + mahasiswaTI.getUmur());
        System.out.println("Angkatan: " + angkatan);

        //buat objek baru
        Mahasiswa mahasiswaTI = new Mahasiswa();
        mahasiswaTI.setData(nim:"A11.2023.15295",nama:"Wulan", programStudi:"Sistem Informasi", umur:"20");

        System.out.println("NIM: " + mahasiswaTI.getNim());
        System.out.println("Nama: " + mahasiswaTI.getNama());
        System.out.println("Program Studi: " + mahasiswaTI.getProgramStudi());
        System.out.println("Umur: " + mahasiswaTI.getUmur());

}