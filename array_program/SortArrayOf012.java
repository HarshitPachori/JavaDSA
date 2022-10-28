
import java.util.*;

public class SortArrayOf012 {

    // BruteForce approach
    // Time comp -> O(nlogn) Space comp -> O(1)
    public static void sortMethodUsingBruteForce(int nums[], int n) {
        Arrays.sort(nums);
    }

    // Counting sort approach
    // Time comp -> O(n) + O(n) = O(2n) Space comp -> O(1)
    public static void sortMethodUsingCountingSort(int nums[], int n) {
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0)
                count0++;
            else if (nums[i] == 1)
                count1++;
            else
                count2++;
        }
        for (int i = 0; i < count0; i++) {
            nums[i] = 0;
        }
        for (int i = count0; i < count0 + count1; i++) {
            nums[i] = 1;
        }
        for (int i = count0 + count1; i < count0 + count1 + count2; i++) {
            nums[i] = 2;
        }
    }

    // Dutch National Flag Algorithm Optimized solution 3 pointer approach
    // Time comp -> O(n) Space comp -> O(1)
    public static void sortMethodUsing3Pointer(int[] nums, int n) {
        int low = 0;
        int high = n - 1;
        int mid = 0;
        int temp;

        while (mid <= high) {
            switch (nums[mid]) {
                case 0:
                    temp = nums[low];
                    nums[low] = nums[mid];
                    nums[mid] = temp;
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    temp = nums[mid];
                    nums[mid] = nums[high];
                    nums[high] = temp;
                    high--;
                    break;
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
        sortMethodUsingBruteForce(arr, arr.length);
        // sortMethodUsing3Pointer(arr, arr.length);
        // sortMethodUsingCountingSort(arr, arr.length);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
