package Pertemuan10;

public class StrukturStack {
    private int[] array;
    private int capacity;
    private int TOP;
    
    public final int MIN = -1;
    
    public StrukturStack(int capacity) {
        super();
        array = new int[capacity];
        this.capacity = capacity;
        TOP = MIN;
    }
    
    public boolean isEmpty() {
        return (TOP == MIN);
    }
    
    public boolean isFull() {
        return (TOP == capacity - 1);
    }
    
    public void push(int data) {
        if(isFull()) {
            System.out.println("Stack penuh");
        }
        else {
            TOP++;
            array[TOP] = data;
        }
    }
    
    public int size() {
        return TOP + 1;
    }
    
    public int top() {
        if (isEmpty()) {
            return MIN;
        } else {
            return array[TOP];
        }
    }
    
    public int getElementAt(int index) {
        if (index >= 0 && index <= TOP) {
            return array[index];
        }
        return MIN;
    }
}