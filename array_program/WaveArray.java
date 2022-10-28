;
public class WaveArray {
    public static void waveArray(int arr[], int n) {
        for (int i = 1; i < n; i++) {
            int temp = arr[i - 1];
            arr[i - 1] = arr[i];
            arr[i] = temp;
            i++;
        }

    }

    public static void printArray(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        printArray(arr, arr.length);
        waveArray(arr, arr.length);
        printArray(arr, arr.length);
    }
}
