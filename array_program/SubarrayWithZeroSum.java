
import java.util.HashMap;

public class SubarrayWithZeroSum {
    public static int subArraySum(int arr[], int n) {
        int sum = 0;
        int maxi = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum == 0) {
                maxi = i + 1;
            } else {
                if (map.get(sum) != null) {
                    maxi = Math.max(maxi, i - map.get(sum));

                } else {
                    map.put(sum, i);
                }
            }
        }

        return maxi;
    }

    public static void main(String[] args) {
        int arr[] = { 15, -2, 2, -8, 1, 7, 10, 23 };
        int result = subArraySum(arr, arr.length);
        System.out.println(result);
    }
}