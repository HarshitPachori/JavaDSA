package string_programs;
public class LongestCommonPrefixInStringArray {

    String longestCommonPrefix(String str[], int n) {
        String res = "";
        int minLen = str[0].length();
        for (int i = 1; i < n; i++) {
            if (minLen > str[i].length()) {
                minLen = str[i].length();
            }
        }
        char curr;
        for (int i = 0; i < minLen; i++) {
            curr = str[0].charAt(i);
            for (int j = 1; j < n; j++) {
                if (str[j].charAt(i) != curr) {
                    if (res.length() == 0)
                        return "-1";
                    else
                        return res;
                }
            }
            res += curr;
        }

        return res;

    }

    public static void main(String[] args) {
        LongestCommonPrefixInStringArray lcp = new LongestCommonPrefixInStringArray();
        String arr[] = { "GeeksForGeeks", "Geeksy", "Geeks", "Geeper" };
        int n = arr.length;
        String res = lcp.longestCommonPrefix(arr, n);
        System.out.println(res);

    }
}
