public class TrappingRainwater {
    long trappingWater(int arr[], int n) {
        // Your code here
        int leftmax[] = new int[n];
        int rightmax[] = new int[n];
        long trappedwater = 0;
        // calculate left max boundary
        leftmax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            leftmax[i] = Math.max(arr[i], leftmax[i - 1]);
        }
        // calculate right max boundary
        rightmax[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightmax[i] = Math.max(arr[i], rightmax[i + 1]);
        }
        // calculate water level
        for (int i = 0; i < n; i++) {
            int waterlevel = Math.min(leftmax[i], rightmax[i]);
            trappedwater += waterlevel - arr[i];
        }

        return trappedwater;
    }

    public static void main(String[] args) {
        TrappingRainwater tr = new TrappingRainwater();
        int arr[] = { 3, 0, 0, 2, 0, 4 };
        int n = arr.length;
        System.out.println(tr.trappingWater(arr, n));
    }
}
