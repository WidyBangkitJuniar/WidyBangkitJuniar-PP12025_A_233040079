package Tugas_Pertemuan3;

public class Tugas1 {
    public static void main(String[] args) {
        StrukturList list = new StrukturList();

        list.addTail(4.4);
        list.addTail(5.5);
        list.addMid(2.2, 1);
        list.addMid(3.3, 2);
        list.addHead(1.1);

        System.out.print("Elemen list: ");
        list.displayElement();

    }
}