package array_programs;
import java.util.HashMap;

public class CountPairsWithGivenSum {

    public static int getPairCount(int arr[], int n, int k) {
        int pairCount = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(k - arr[i])) {
                pairCount += map.get(k - arr[i]);
            }
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);

            } else {
                map.put(arr[i], 1);

            }
        }
        return pairCount;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 5, 7, 1 };
        int key = 6;
        int result = getPairCount(arr, arr.length, key);
        System.out.println(result);
    }
}
