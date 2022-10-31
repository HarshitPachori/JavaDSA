class HeapSort {
    void buildHeap(int arr[], int n) {
        for (int i = (n / 2 - 1); i >= 0; i--) {
            heapify(arr, n, i);
        }
    }

    //* Heapify function to maintain heap property.*/
    void heapify(int arr[], int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && arr[l] > arr[largest])
            largest = l;

        if (r < n && arr[r] > arr[largest])
            largest = r;

        // Swap and continue heapifying if root is not largest
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, n, largest);
        }
    }

    // Function to sort an array using Heap Sort.
    public void heapSort(int arr[], int n) {
        buildHeap(arr, n);
        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
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
        HeapSort hs = new HeapSort();
        int arr[] = { 5, 4, 3, 2, 1 };
        // int arr[] = { 1, 3, 4, 7, 9 };
        int n = arr.length;
        hs.printArray(arr, n);
        hs.heapSort(arr, n);
        hs.printArray(arr, n);
    }
}
