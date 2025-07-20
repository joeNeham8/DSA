import java.util.*;

public class NGE {
    public static int[] nextGreaterRight(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            // Remove all elements less than or equal to arr[i]
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

            // If stack is empty, no greater element to right
            result[i] = stack.isEmpty() ? -1 : stack.peek();

            // Push current element onto stack
            stack.push(arr[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 10, 8};
        int[] result = nextGreaterRight(arr);

        // Print the result array
        System.out.println(Arrays.toString(result));  // Output: [5, 10, 10, -1, -1]
    }
}
