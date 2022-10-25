package array_program;
public class DNF_Sort {
    // leetcode problem at https://leetcode.com/problems/sort-colors/
    // i have used dutch national flag algo to solve this problem which is simple a
    // three pointer algorithm.
    public static void sort012(int arr[], int n) {
        int low = 0, mid = 0, high = n - 1;
        while (mid <= high) {
            switch (arr[mid]) {
                case 0:
                    int temp1 = arr[mid];
                    arr[mid] = arr[low];
                    arr[low] = temp1;
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    int temp2 = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp2;
                    high--;
                    break;

            }
        }
    }

    public static void main(String[] args) {
        System.out.println("hello");
    }
}
