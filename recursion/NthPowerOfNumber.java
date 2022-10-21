import java.util.Scanner;

public class NthPowerOfNumber {
    public static int power(int n, int p) {
        if (p == 0)
            return 1;
        return n * power(n, p - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number => \n");
        int num = sc.nextInt();
        System.out.println("Enter the power => \n");
        int powr = sc.nextInt();
        int res = power(num, powr);
        System.out.println("The " + powr + "th power of " + num + " is " + res);

        sc.close();
    }
}
