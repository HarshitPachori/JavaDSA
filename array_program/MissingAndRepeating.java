import java.util.HashMap;

public class MissingAndRepeating {
    public static int[] findTwoElement(int arr[], int n) {
        // code here
        int res[] = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        int missing = 0, repeating = 0;
        // for getting the count of each element
        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        // for finding the repeating element
        for (int i = 0; i < n; i++) {
            if (map.get(arr[i]) == 2) {
                repeating = arr[i];
                break;
            }
        }

        // for finding the missing element
        for (int i = 0; i < n; i++) {
            if (map.containsKey(i + 1))
                continue;
            else {
                missing = i + 1;
                break;
            }
        }
        res[0] = repeating;
        res[1] = missing;
        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 2 };
        int res[] = findTwoElement(arr, arr.length);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
