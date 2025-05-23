package Tugas_Pertemuan10;

public class StrukturStackTest {
    public static void main(String[] args) {
        StrukturStack stack = new StrukturStack(3);

        // Push 3
        System.out.println("#Push 3x:");
        stack.push(2);
        stack.push(4);
        stack.push(1);
        printStackStatus(stack);

        // Pop 1
        System.out.println("#Pop 1x:");
        int popped = stack.pop();
        System.out.println("Data yang di pop: " + popped);
        printStackStatus(stack);
    }

    private static void printStackStatus(StrukturStack stack) {
        System.out.println("Size: " + stack.size());
        System.out.println("Empty: " + stack.isEmpty());
        System.out.println("Full: " + stack.isFull());
        System.out.println("Top: " + stack.top());
        System.out.print("Elemen from TOP: ");
        for (int i = stack.size() - 1; i >= 0; i--) {
            System.out.print(stack.getElementAt(i) + " ");
        }
        System.out.println();
    }
}

