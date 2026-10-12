package Stack;

import java.util.Stack;

public class Balanced_right {

    public static void nextGreater(int[] arr) {

        Stack<Integer> stack = new Stack<>();
        int[] result = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {

            int curr = arr[i];

            // Remove elements that cannot be the answer
            while (!stack.isEmpty() && stack.peek() <= curr) {
                stack.pop();
            }

            // Find the answer
            if (stack.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = stack.peek();
            }

            // Current element may be useful for elements on its left
            stack.push(curr);
        }

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static void main(String[] args) {

        int[] arr = {4, 5, 2, 10, 8};

        nextGreater(arr);
    }
}