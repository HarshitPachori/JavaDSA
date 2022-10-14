import java.util.*;

public class Check_even_prime_palindrome {

    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean isPalindrome(int n) {
        int digit = 0, rem;
        while (n != 0) {
            rem = n % 10;
            digit = digit * 10 + rem;
            n = n / 10;
        }
        if (digit == n)
            return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        sc.close();
        int ch = 1;
        if (isPrime(num)) {
            ch = 2;
        }

        if (isPalindrome(num)) {
            ch = 3;
        }
        switch (ch) {
            case 1:
                if (num % 2 == 0) {
                    System.out.println("EVEN");
                } else {
                    System.out.println("ODD");
                }
                break;
            case 2:
                System.out.println("PRIME");
                break;
            case 3:
                System.out.println("PALINDROME");
                break;

            default:
                break;
        }

    }
}
