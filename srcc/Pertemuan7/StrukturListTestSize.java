package Pertemuan7;

public class StrukturListTestSize {
    public static void main(String[] args) {
        StrukturList list = new StrukturList();
        
        list.addTail(7);
        list.addTail(6);
        list.addTail(4);
        list.addTail(2);
        list.addTail(3);
        
        list.displayElement();
        
        System.out.println(list.size());
    }
}