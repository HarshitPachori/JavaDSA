package array_program;
import java.util.*;

public class UniqueOccurance {
    public static boolean occurances(int arr[]) {
        Arrays.sort(arr);
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        int temp = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == temp)
                count++;
            else {
                if (list.contains(count))
                    return false;
                else {
                    list.add(count);
                    count = 1;
                    temp = arr[i];
                }
            }
        }
        if (list.contains(count))
            return false;
        return true;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 1, 1, 3 };
        boolean result = occurances(arr);
        System.out.println(result);
    }
}
