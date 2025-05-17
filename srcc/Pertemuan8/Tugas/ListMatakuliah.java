package Tugas_Pertemuan8;

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
    
    // addMiddle
    public void addMiddle(Matakuliah data, int position) {
        if (position <= 0) {
            addHead(data);
        } else if (position >= size()) {
            addTail(data);
        } else {
            Node newNode = new Node(data);
            Node curNode = HEAD;
            for (int i = 1; i < position; i++) {
                curNode = curNode.getNext();
            }
            newNode.setNext(curNode.getNext());
            curNode.setNext(newNode);
        }
    }
    
    // addTail
    public void addTail(Matakuliah data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            HEAD = newNode;
        } else {
            Node curNode = HEAD;
            while (curNode.getNext() != null) {
                curNode = curNode.getNext();
            }
            curNode.setNext(newNode);
        }
    }
    
    // removeHead
    public void removeHead() {
        if (isEmpty()) {
            System.out.println("List kosong, tidak ada yang dihapus");
        } else {
            HEAD = HEAD.getNext();
        }
    }
    
    // removeMiddle
    public void removeMiddle(int position) {
        if (isEmpty()) {
            System.out.println("List kosong, tidak ada yang dihapus");
        } else if (position <= 0) {
            removeHead();
        } else if (position >= size() - 1) {
            removeTail();
        } else {
            Node curNode = HEAD;
            for (int i = 1; i < position; i++) {
                curNode = curNode.getNext();
            }
            curNode.setNext(curNode.getNext().getNext());
        }
    }
    
    // removeTail
    public void removeTail() {
        if (isEmpty()) {
            System.out.println("List kosong, tidak ada yang dihapus");
        } else if (HEAD.getNext() == null) {
            HEAD = null;
        } else {
            Node curNode = HEAD;
            while (curNode.getNext().getNext() != null) {
                curNode = curNode.getNext();
            }
            curNode.setNext(null);
        }
    }
    
    // find
    public Node find(String kode) {
        Node curNode = HEAD;
        while (curNode != null) {
            if (curNode.getData().getKode().equalsIgnoreCase(kode)) {
                return curNode;
            }
            curNode = curNode.getNext();
        }
        return null;
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




















