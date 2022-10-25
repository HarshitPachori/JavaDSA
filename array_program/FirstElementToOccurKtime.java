package array_program;
import java.util.HashMap;

public class FirstElementToOccurKtime {
    public static int firstElement(int a[], int n, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(a[i])) {
                map.put(a[i], map.get(a[i]) + 1);
            } else {
                map.put(a[i], 1);
            }
            if (map.get(a[i]) == 2) {
                return i;
            }
        }
        System.out.println(map);
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 7, 4, 3, 4, 8, 7 };
        int res = firstElement(arr, arr.length, 2);
        System.out.println(res);
    }
}
