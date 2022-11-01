import java.util.Arrays;

class MinimumPlatform {
    int findPlatform(int arr[], int dep[], int n) {
        Arrays.sort(arr);
        Arrays.sort(dep);
        int maxPlatform = 1;
        int platformCount = 0;
        int i = 0, j = 0;
        while (i < n && j < n) {
            if (arr[i] <= dep[j]) {
                platformCount++;
                maxPlatform = Math.max(maxPlatform, platformCount);
                i++;
            } else {
                platformCount--;
                j++;
            }
        }
        return maxPlatform;
    }

    public static void main(String[] args) {
        MinimumPlatform mp = new MinimumPlatform();
        int arr[] = { 900, 940, 950, 1100, 1500, 1800 };
        int dep[] = { 910, 1200, 1120, 1130, 1900, 2000 };
        System.out.println("The minimum platform required are : " + mp.findPlatform(arr, dep, arr.length));
    }
}
