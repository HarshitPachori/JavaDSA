package array_programs;
import java.util.Scanner;

class StringPalindrome {
    public static boolean isPalindrome(String str) {
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isLetter(c))
                s += Character.toLowerCase(c);
            if (Character.isDigit(c))
                s += c;
        }
        if (s.length() == 0)
            return true;
        boolean ans = palindromeHelper(0, s.length() - 1, s);
        return ans;
    }

    public static boolean palindromeHelper(int l, int r, String s) {
        if (l >= r)
            return true;
        if (s.charAt(l) != s.charAt(r))
            return false;
        return palindromeHelper(l + 1, r - 1, s);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String => ");
        String str = sc.nextLine();
        boolean res = isPalindrome(str);
        if (res) {
            System.out.println("String is a Palindrome.");
        } else {
            System.out.println("String is not a Palindrome.");
        }
        sc.close();
    }
}
