import java.util.Scanner;

public class TowerOfHanoi {
    public static void printTOH(int n, char source, char destination, char auxillary) {
        if (n == 0)
            return;
        printTOH(n - 1, source, auxillary, destination);
        System.out.printf("Move disk %d from disk %c to disk %c \n", n, source, destination);
        printTOH(n - 1, auxillary, destination, source);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of disk:");
        int disk = sc.nextInt();
        printTOH(disk, 'A', 'B', 'C');
        sc.close();
    }
}
