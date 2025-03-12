package Tugas_Pertemuan3;

public class Tugas2_b {
    public static void main(String[] args) {
        StrukturList list = new StrukturList();
        
        list.addTail(4.5);
        list.addTail(5.5);
        list.addMid(2.1, 1);
        list.addMid(1.1, 2);
        list.addHead(3.4);
        
        System.out.print("b. ");
        list.displayElement();
        
    }
}