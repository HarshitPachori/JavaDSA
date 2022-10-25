public class ReverseArray {
    public static void reverseArray(int arr[], int l, int r) {
        if (l >= r)
            return;
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        reverseArray(arr, l + 1, r - 1);
    }

    public static void printArray(int arr[], int n) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 55, 44, 31, 24, 1 };
        reverseArray(arr, 0, arr.length - 1);
        printArray(arr, arr.length);
    }
}
