public class RearrangeAlternatively {
    public static void rearrange(long arr[], int n) {

        int mini = 0, maxi = n - 1;
        long maxele = arr[n - 1] + 1;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                arr[i] = arr[i] + (arr[maxi] % maxele) * maxele;
                maxi--;
            } else {
                arr[i] = arr[i] + (arr[mini] % maxele) * maxele;
                mini++;
            }
        }
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] / maxele;
        }
    }

    public static void main(String[] args) {
        long nums[] = { 1, 2, 3, 4, 5, 6 };
        rearrange(nums, nums.length);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }

    }
}
