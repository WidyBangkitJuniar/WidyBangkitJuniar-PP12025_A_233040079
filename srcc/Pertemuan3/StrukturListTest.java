package Pertemuan3;

public class StrukturListTest {
    public static void main(String[] args) {
        // Buat objek StrukturList
        StrukturList list = new StrukturList();

        // Tambahkan elemen ke list
        list.addTail(3);  // Tambah elemen 3 di akhir list
        list.addTail(4);  // Tambah elemen 4 di akhir list
        list.addMid(7, 2); // Tambah elemen 7 di index 2
        list.addMid(8, 2); // Tambah elemen 8 di index 2
        list.addHead(5); // Tambah elemen 5 di awal list

        // Tampilkan elemen list
        System.out.print("Elemen list: ");
        list.displayElement();
    }
}