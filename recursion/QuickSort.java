class QuickSort {
    int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int p = partition(arr, low, high);

            quickSort(arr, low, p - 1);
            quickSort(arr, p + 1, high);
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
        QuickSort qs = new QuickSort();
        int arr[] = { 5, 4, 3, 2, 1 };
        // int arr[] = { 1, 3, 4, 7, 9 };
        int n = arr.length;
        qs.printArray(arr, n);
        qs.quickSort(arr, 0, n - 1);
        qs.printArray(arr, n);
    }
}
