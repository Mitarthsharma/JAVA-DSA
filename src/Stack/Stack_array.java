package Stack;

public class Stack_array {

    static int top = -1;

    public static void push(int[] stack, int value) {

        if (top == stack.length - 1) {
            System.out.println("Stack Overflow");
            return;
        }

        top++;
        stack[top] = value;
    }

    public static void printStack(int[] stack) {

        for (int i = 0; i <= top; i++) {
            System.out.println(stack[i]);
        }
    }

    public static void pop(int[] stack) {

        if (isEmpty(stack)) {
            System.out.println("Stack Underflow");
            return;
        }

        int value = stack[top];
        top--;

        System.out.println("Popped: " + value);
    }

    public static void peek(int[] stack) {

        if (isEmpty(stack)) {
            System.out.println("Stack is empty");
            return;
        }

        System.out.println("Top: " + stack[top]);
    }

    public static boolean isEmpty(int[] stack) {
        return top == -1;
    }

    public static void main(String[] args) {

        int[] stack = new int[5];

        push(stack, 1);
        push(stack, 2);
        push(stack, 3);

        peek(stack);       // 3

        pop(stack);        // 3
        pop(stack);        // 2

        peek(stack);       // 1

        printStack(stack); // 1
    }
}