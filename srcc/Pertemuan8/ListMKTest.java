package Pertemuan8;

public class ListMKTest {
    public static void main(String[] args) {
        ListMatakuliah list = new ListMatakuliah();
        
        list.addHead(new Matakuliah("IF001", "Dasar Pemrograman", 4));
        list.addHead(new Matakuliah("IF002", "Pemrograman Web", 3));
        list.addHead(new Matakuliah("IF003", "Struktur Diskrit", 3));
        list.addHead(new Matakuliah("IF004", "Konstruksi PL Berorientasi Objek", 3));
        
        list.displayElement();
        System.out.println("Jumlah Matakuliah: " + list.size());
        
        // Menambahkan Mata Kuliah
        list.addHead(new Matakuliah("IF005", "Algoritma dan Struktur Data", 4));
        list.addHead(new Matakuliah("IF006", "Basis Data", 3));
        
        System.out.println("\n Penambahan:");
        list.displayElement();
        System.out.println("Jumlah Matakuliah: " + list.size());
    }
}