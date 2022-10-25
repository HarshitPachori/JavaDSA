package array_program;
import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayUsingRecursion {
    public static int helper(int l, int r, ArrayList<Integer> arr) {
        if (l >= r)
            return 1;
        Collections.swap(arr, l, r);
        return helper(l + 1, r - 1, arr);
    }

    public static void reversed(ArrayList<Integer> arr, int m) { // m => rotating position
        helper(m, arr.size() - 1, arr);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(2);
        list.add(1);
        list.add(0);
        System.out.println(list);
        reversed(list, 2);
        System.out.println(list);
    }
}
