package Tugas_Pertemuan3;

public class StrukturList {
    Node HEAD;

    boolean isEmpty() {
        return HEAD == null;
    }

    public void addTail(double data) {
        Node posNode = null, curNode = null;
        Node newNode = new Node(data);
        if (isEmpty()) {
            HEAD = newNode;
        } else {
            curNode = HEAD;
            while (curNode != null) {
                posNode = curNode;
                curNode = curNode.getNext();
            }
            posNode.setNext(newNode);
        }
    }

    public void displayElement() {
        Node curNode = HEAD;
        while (curNode != null) {
            System.out.print(curNode.getData() + " ");
            curNode = curNode.getNext();
        }
        System.out.println();
    }

    public void addHead(double data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            HEAD = newNode;
        } else {
            newNode.setNext(HEAD);
            HEAD = newNode;
        }
    }

    public void addMid(double data, int position) {
        Node newNode = new Node(data);
        if (position == 1) {
            newNode.setNext(HEAD);
            HEAD = newNode;
        } else {
            Node curNode = HEAD;
            int i = 1;
            while (curNode != null && i < position - 1) {
                curNode = curNode.getNext();
                i++;
            }
            if (curNode != null) {
                newNode.setNext(curNode.getNext());
                curNode.setNext(newNode);
            } else {
                addTail(data);
            }
        }
    }
}