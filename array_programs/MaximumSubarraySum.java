package array_programs;
public class MaximumSubarraySum {
    public static int findMaxiSum(int arr[], int n) {
        int sum = 0;
        int maxi = arr[0];
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum > maxi) {
                maxi = sum;
            }
            if (sum < 0) {
                sum = 0;
            }

        }
        return maxi;
    }

    public static void printArray(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int nums[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        printArray(nums, nums.length);
        int result = findMaxiSum(nums, nums.length);
        System.out.println(result);

    }
}
