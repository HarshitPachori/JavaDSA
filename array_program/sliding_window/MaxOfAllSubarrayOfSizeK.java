package sliding_window;

import java.util.ArrayList;

public class MaxOfAllSubarrayOfSizeK {
    ArrayList<Integer> maxOfSubarrayOfSizeK(int arr[], int n, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n - k + 1; i++) {
            int max = arr[i];
            for (int j = 1; j < k; j++) {
                if (arr[i + j] > max) {
                    max = arr[i + j];
                }
            }
            list.add(max);
        }
        return list;
    }

    public static void main(String[] args) {
        MaxOfAllSubarrayOfSizeK mk = new MaxOfAllSubarrayOfSizeK();
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int n = arr.length;
        int k = 3;
        ArrayList<Integer> ans = new ArrayList<>();
        ans = mk.maxOfSubarrayOfSizeK(arr, n, k);
        System.out.println(ans);
    }
}
