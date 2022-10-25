package array_program;
import java.util.HashMap;

public class FirstRepeated {
    public static int firstRepeated(int arr[], int n) {
        int res = Integer.MAX_VALUE;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                res = Math.min(res, map.get(arr[i]));
            }
            map.put(arr[i], i + 1);
        }
        if (res == Integer.MAX_VALUE)
            return -1;
        return res;
    }

    public static void printArray(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        int arr[] = { 1, 5, 3, 4, 3, 5, 6 };
        int result = firstRepeated(arr, arr.length);
        System.out.println(result);

    }
}
