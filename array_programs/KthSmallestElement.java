package array_programs;
import java.util.*;

public class KthSmallestElement {
    public static int kthSmallest(int[] arr, int l, int r, int k) {
   
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int n = r - l + 1;
        for (int i = 0; i < k; i++) {
            pq.add(arr[i]);
        }
        for (int i = k; i < n; i++) {
            if (arr[i] < pq.peek()) {
                pq.poll();
                pq.add(arr[i]);
            }
        }
        return pq.peek();

    }

    public static void main(String[] args) {
        int arr[] = { 7, 10, 4, 20, 15 };
        int res = kthSmallest(arr, 0, 4, 4);
        System.out.println(res);

    }
}
