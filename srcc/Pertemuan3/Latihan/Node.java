package Pertemuan3;

public class Node {
	private int data;
	private Node Next;
	
	/** Inisialisasia atribut node */
	public Node(int data) {
		this.data = data;
	}
	
	/** Setter & Getter */
	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return Next;
	}

	public void setNext(Node next) {
		Next = next;
	}
}