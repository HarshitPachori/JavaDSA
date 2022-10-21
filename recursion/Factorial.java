import java.util.Scanner;

public class Factorial {
    public static int fact(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * fact(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number => ");
        int num = sc.nextInt();
        int res = fact(num);
        System.out.println("Fact of " + num + " is " + res);
        sc.close();

    }
}
