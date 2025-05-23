package Pertemuan10;

public class StrukturStackTest {
    public static void main(String[] args) {
        StrukturStack stack = new StrukturStack(3);

        // Sebelum push
        System.out.println("#Sebelum push");
        System.out.println("Size: " + stack.size());
        System.out.println("Empty: " + stack.isEmpty());
        System.out.println("Full: " + stack.isFull());
        System.out.println("Top: " + stack.top());
        System.out.println("Elemen from TOP: ");

        // Push 3x
        System.out.println("#Melakukan push 3x:");
        System.out.println("push 2; push 4; push 1");
        stack.push(2);
        stack.push(4);
        stack.push(1);

        // Setelah push
        System.out.println("Size: " + stack.size());
        System.out.println("Empty: " + stack.isEmpty());
        System.out.println("Full: " + stack.isFull());
        System.out.println("Top: " + stack.top());
        
        // Print elemen dari TOP
        System.out.print("Elemen from TOP: ");
        for (int i = stack.size() - 1; i >= 0; i--) {
            System.out.print(stack.getElementAt(i) + " ");
        }
    }
}

