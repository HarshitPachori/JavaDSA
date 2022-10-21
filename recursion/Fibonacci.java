import java.util.Scanner;

public class Fibonacci {
    public static int fib(int n) {
        if (n == 0 || n == 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.print(fib(i) + " ");
        }

        sc.close();
    }
}
