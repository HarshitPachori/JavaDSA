;
public class PeakElementOfArray {
    public static int peakElement(int arr[], int n) {
        int val = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                val = i;
            }
        }
        return val;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 };
        int result = peakElement(arr, arr.length);
        System.out.println(result);
    }
}
