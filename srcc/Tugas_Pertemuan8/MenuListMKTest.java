package Tugas_Pertemuan8;

import java.util.Scanner;

public class MenuListMKTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListMatakuliah list = new ListMatakuliah();
        int choice;
        
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Matakuliah di Awal");
            System.out.println("2. Tambah Matakuliah di Akhir");
            System.out.println("3. Tambah Matakuliah di Posisi Tertentu");
            System.out.println("4. Hapus Matakuliah di Awal");
            System.out.println("5. Hapus Matakuliah di Akhir");
            System.out.println("6. Hapus Matakuliah di Posisi Tertentu");
            System.out.println("7. Cari Matakuliah");
            System.out.println("8. Tampilkan Semua Matakuliah");
            System.out.println("9. Tampilkan Jumlah Matakuliah");
            System.out.println("0. Keluar");
            System.out.print("Pilihan Anda: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline
            
            switch (choice) {
                case 1:
                    System.out.print("Masukkan kode matakuliah: ");
                    String kode1 = scanner.nextLine();
                    System.out.print("Masukkan nama matakuliah: ");
                    String nama1 = scanner.nextLine();
                    System.out.print("Masukkan SKS: ");
                    int sks1 = scanner.nextInt();
                    list.addHead(new Matakuliah(kode1, nama1, sks1));
                    break;
                    
                case 2:
                    System.out.print("Masukkan kode matakuliah: ");
                    String kode2 = scanner.nextLine();
                    System.out.print("Masukkan nama matakuliah: ");
                    String nama2 = scanner.nextLine();
                    System.out.print("Masukkan SKS: ");
                    int sks2 = scanner.nextInt();
                    list.addTail(new Matakuliah(kode2, nama2, sks2));
                    break;
                    
                case 3:
                    System.out.print("Masukkan posisi: ");
                    int pos = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Masukkan kode matakuliah: ");
                    String kode3 = scanner.nextLine();
                    System.out.print("Masukkan nama matakuliah: ");
                    String nama3 = scanner.nextLine();
                    System.out.print("Masukkan SKS: ");
                    int sks3 = scanner.nextInt();
                    list.addMiddle(new Matakuliah(kode3, nama3, sks3), pos);
                    break;
                    
                case 4:
                    list.removeHead();
                    System.out.println("Matakuliah di awal telah dihapus");
                    break;
                    
                case 5:
                    list.removeTail();
                    System.out.println("Matakuliah di akhir telah dihapus");
                    break;
                    
                case 6:
                    System.out.print("Masukkan posisi yang akan dihapus: ");
                    int posHapus = scanner.nextInt();
                    list.removeMiddle(posHapus);
                    System.out.println("Matakuliah di posisi " + posHapus + " telah dihapus");
                    break;
                    
                case 7:
                    System.out.print("Masukkan kode matakuliah yang dicari: ");
                    String kodeCari = scanner.nextLine();
                    Node found = list.find(kodeCari);
                    if (found != null) {
                        System.out.println("Data ditemukan: " + found.getData());
                    } else {
                        System.out.println("Data tidak ditemukan");
                    }
                    break;
                    
                case 8:
                    System.out.println("Daftar Matakuliah:");
                    list.displayElement();
                    break;
                    
                case 9:
                    System.out.println("Jumlah Matakuliah: " + list.size());
                    break;
                    
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                    
                default:
                    System.out.println("Pilihan tidak valid");
            }
        } while (choice != 0);
        
        scanner.close();
    }
}