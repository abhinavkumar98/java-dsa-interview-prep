/**
 * ReverseArray
 *
 * Reverses an integer array in-place using the two-pointer technique.
 *
 * Example usage: run the `main` method to reverse a sample array and print it.
 *
 * Complexity: O(n) time, O(1) extra space.
 */
public class ReverseArray {
    /**
     * Example runner: creates an array, reverses it, and prints the result.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        reverseArray(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    /**
     * Reverses the provided array in-place.
     * Uses two pointers (`left` and `right`) and swaps until they meet.
     *
     * @param arr the array to reverse (assumed non-null)
     */
    public static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}