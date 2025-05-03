package Tugas_Pertemuan7;

public class StrukturList {
    private Node HEAD;

    public StrukturList() {
        this.HEAD = null;
    }
    
    public void clearList() {
        HEAD = null;
    }

    public void addTail(int data) {
        Node newNode = new Node(data);
        if (HEAD == null) {
            HEAD = newNode;
        } else {
            Node curNode = HEAD;
            while (curNode.getNext() != null) {
                curNode = curNode.getNext();
            }
            curNode.setNext(newNode);
        }
    }
    
    public void displayElement() {
        Node curNode = HEAD;
        if (curNode == null) {
            System.out.println("List Kosong");
        } else {
            while (curNode != null) {
                System.out.print(curNode.getData() + " ");
                curNode = curNode.getNext();
            }
            System.out.println();
        }
    }
    
    public boolean find(int x) {
        Node curNode = HEAD;
        boolean ketemu = false;
        
        while (curNode != null && !ketemu) {
            if (curNode.getData() == x) {
                ketemu = true;
            } else {
                curNode = curNode.getNext();
            }
        }
        return ketemu;
    }
    
    public int size() {
        Node curNode = HEAD;
        int jumlah = 0;
        
        while (curNode != null) {
            jumlah++;
            curNode = curNode.getNext();
        }
        return jumlah;
    }
}