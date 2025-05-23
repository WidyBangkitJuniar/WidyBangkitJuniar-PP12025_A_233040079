package Pertemuan11;

public class MyStack extends AbstractStack {
    public MyStack(int capacity) {
        super(capacity);
    }

    public void displayStack(String info) {
        System.out.println(info);
        System.out.print("Stack (bottom -> top): ");
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public int peekN(int n) {
            return arr[n];
    }
}

