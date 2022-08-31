import java.util.Scanner;

public class MergeTwoSortedArray {
    public static void merge(int arr1[], int arr2[], int m, int n, int[] arr3) {
        int i = 0, j = 0, k = 0;

        while (i < m && j < n) {
            if (arr1[i] < arr2[j]) {
                arr3[k++] = arr1[i++];
            } else {
                arr3[k++] = arr2[j++];
            }
        }
        while (i < m) {
            arr3[k++] = arr1[i++];

        }
        while (j < n) {
            arr3[k++] = arr2[j++];
        }

    }

    public static void printArray(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // for line change

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n;
        System.out.println("Enter the size of both arr1 and arr2: (hint: arr1>=5 and arr2>=5) ");
        m = sc.nextInt();
        n = sc.nextInt();
        int arr1[] = new int[m];
        int arr2[] = new int[n];
        int arr3[] = new int[m + n];
        arr1[0] = 2;
        arr1[1] = 4;
        arr1[2] = 6;
        arr1[3] = 8;
        arr1[4] = 10;
        arr2[0] = 1;
        arr2[1] = 3;
        arr2[2] = 5;
        arr2[3] = 7;
        arr2[4] = 9;
        // printArray(arr3, 9);
        merge(arr1, arr2, m, n, arr3);
        printArray(arr3, m + n);
        sc.close();

    }
}
