public class ReverseArray {
    public static void reverseArray(int arr[], int m) {

        int start = m + 1;
        int end = arr.length - 1;
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void printArray(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // for line change

    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 2, 1, 0 };
        printArray(arr, 6); // before reverse
        reverseArray(arr, 3);
        printArray(arr, 6); // after reverse

    }
}
