package Pertemuan2;

public class Node {
    // Atribut
    private int data; 
    private Node next;

    // Konstruktor untuk inisialisasi data
    public Node(int data) {
        this.data = data;
        this.next = null; 
    }

    // Setter untuk data
    public void setData(int data) {
        this.data = data;
    }

    // Getter untuk data
    public int getData() {
        return data;
    }

    // Setter untuk next
    public void setNext(Node next) {
        this.next = next;
    }

    // Getter untuk next
    public Node getNext() {
        return next;
    }
}