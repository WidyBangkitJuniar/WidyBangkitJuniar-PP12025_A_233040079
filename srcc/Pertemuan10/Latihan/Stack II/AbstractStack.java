package Pertemuan11;

public abstract class AbstractStack {
    protected int[] arr;
    protected int top;
    protected int capacity;

    public AbstractStack(int capacity) {
        this.capacity = capacity;
        this.arr = new int[capacity];
        this.top = -1;
    }

    public void push(int item) {
        if (isFull()) {
            System.out.println("Stack penuh");
            return;
        }
        arr[++top] = item;
    }
    
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack kosong");
            return -1;
        }
        return arr[top--];
    }

    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        return arr[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == capacity - 1);
    }

    public int size() {
        return top + 1;
    }
}

