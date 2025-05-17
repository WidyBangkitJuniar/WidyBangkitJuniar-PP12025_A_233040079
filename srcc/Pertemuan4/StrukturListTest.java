package Tugas_Pertemuan4;

public class StrukturListTest {
    public static void main(String[] args) {
        StrukturList list = new StrukturList();
        list.addHead(10);
        list.addHead(20);
        list.addHead(30);

        list.printList(); 

        list.removeHead();
        list.printList(); 

        list.removeHead();
        list.removeHead();
        list.removeHead(); 
    }
}