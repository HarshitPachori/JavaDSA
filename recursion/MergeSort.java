class MergeSort {
    void merge(int arr[], int l, int m, int r) {
        // * Subarrays L -> A[l...m] and R -> A[m+1...r] */
        int n1 = m - l + 1;
        int n2 = r - m;
        int L[] = new int[n1];
        int R[] = new int[n2];

        // * Create copies in both subarrays from main array */
        for (int i = 0; i < n1; i++) {
            L[i] = arr[l + i];
        }
        for (int i = 0; i < n2; i++) {
            R[i] = arr[m + 1 + i];
        }
        // * i and j are indexes for subarrays L[] and R[] & k is index for merged
        // subarray */
        int i = 0, j = 0, k = l;

        // * now merging subarrays */
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        // * now copy remaining elements of L[] subarray */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        // * now copy remaining elements of R[] subarray */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // * Function for mergesort */
    void mergeSort(int arr[], int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    // * function to print array */
    void printArray(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MergeSort ms = new MergeSort();
        // int arr[] = { 5, 4, 3, 2, 1 };
        int arr[] = { 1, 3, 4, 7, 9 };
        int n = arr.length;
        ms.printArray(arr, n);
        ms.mergeSort(arr, 0, n - 1);
        ms.printArray(arr, n);

    }
}