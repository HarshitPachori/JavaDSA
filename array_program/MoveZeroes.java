package array_program;

public class MoveZeroes {
    public static void move(int arr[], int n) {
        int i = 0;
        for (int j = 0; j < n; j++) {
            if (arr[j] != 0) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
            }
        }

    }

    public static void printArray(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int num[] = { 1, 0, 2, 3, 0, 0, 0, 4, 5, 6, 0 };
        printArray(num, num.length);
        move(num, num.length);
        printArray(num, num.length);

    }
}
