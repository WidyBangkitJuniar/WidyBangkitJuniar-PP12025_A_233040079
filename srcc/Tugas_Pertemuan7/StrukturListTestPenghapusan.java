package Tugas_Pertemuan7;

public class StrukturListTestPenghapusan {
    public static void main(String[] args) {
        StrukturList list = new StrukturList();
        
        list.addTail(4);
        list.addTail(3);
        list.addTail(7);
        list.addTail(8);
        list.addTail(1);
        list.addTail(9);
        
        System.out.println();
        list.displayElement();
        
        list.clearList();
        
        System.out.println();
        list.displayElement();
    }
}