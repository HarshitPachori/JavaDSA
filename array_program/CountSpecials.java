package array_program;
import java.util.HashMap;

public class CountSpecials {
    public static int specialCount(int arr[], int n, int k) {
        int f = (int) Math.floor(n / k);
        HashMap<Integer, Integer> map = new HashMap<>();
        int c1 = 0;
        int c2 = 0;
        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                c1++;                
            }
            if (c1 == f) {
                c2++;
            }
            map.put(i, arr[i]);
        }

        return c2;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 1, 2, 4 };
        int k = 2;
        int n = arr.length;
        int result = specialCount(arr, n, k);
        System.out.println(result);
    }
}
