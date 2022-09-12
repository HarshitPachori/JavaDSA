import java.util.TreeSet;

public class ShortestOnLeft {
    public static int[] shortestOnLeft(int arr[], int n) {
        int nums[] = new int[n];
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            Integer low = set.lower(arr[i]);
            if (low == null) {
                nums[i] = -1;
            } else {
                nums[i] = low;
            }
            set.add(arr[i]);
        }

        return nums;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 5, 1 };
        int res[] = shortestOnLeft(arr, arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
