package Tugas_Pertemuan3;

public class Tugas2_a {
    public static void main(String[] args) {
    	
        StrukturList list = new StrukturList();        
        list.addTail(4.5);
        list.addMid(3.4, 1);
        list.addHead(2.1);

        System.out.print("a. ");
        list.displayElement();
    }
}