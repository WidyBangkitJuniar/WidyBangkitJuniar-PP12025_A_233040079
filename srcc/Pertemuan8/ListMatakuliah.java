package Pertemuan8;

public class ListMatakuliah {
    private Node HEAD;
    
    public ListMatakuliah() {
        HEAD = null;
    }
    
    // Cek apakah list kosong
    public boolean isEmpty() {
        return HEAD == null;
    }
    
    // addHead
    public void addHead(Matakuliah data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            HEAD = newNode;
        } else {
            newNode.setNext(HEAD);
            HEAD = newNode;
        }
    }
    
    // DisplayElement
    public void displayElement() {
        if (isEmpty()) {
            System.out.println("List Kosong");
        } else {
            Node curNode = HEAD;
            while (curNode != null) {
                Matakuliah mk = curNode.getData();
                System.out.println("Matakuliah: " + mk.getKode() + ", " + 
                                 mk.getNama() + ", " + mk.getSks());
                curNode = curNode.getNext();
            }
            System.out.println();
        }
    }
    
    // size
    public int size() {
        int count = 0;
        Node curNode = HEAD;
        while (curNode != null) {
            count++;
            curNode = curNode.getNext();
        }
        return count;
    }
}




















