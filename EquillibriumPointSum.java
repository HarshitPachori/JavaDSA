public class EquillibriumPointSum {
    public static int equillibriumPoint(int arr[], int n) {
        int leftSum = 0;
        int totalSum = 0;
        // sum of array elements
        for (int i = 0; i < n; i++) {
            totalSum += arr[i];
        }
        // comparing for 0 to i-1 and i+1 to n-1
        for (int i = 0; i < n; i++) {
            if (leftSum == (totalSum - leftSum - arr[i])) {
                return i + 1;
            }
            leftSum += arr[i];
        }

        return -1;

    }

    public static void main(String[] args) {
        int arr[] = {};
        int result = equillibriumPoint(arr, arr.length);
        System.out.println(result);
    }
}
