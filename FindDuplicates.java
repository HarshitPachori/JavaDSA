import java.util.*;

public class FindDuplicates {

    public static ArrayList<Integer> duplicates(int arr[], int n) {

        HashSet<Integer> set = new HashSet<>();
        SortedSet<Integer> dup = new TreeSet<>();
        ArrayList<Integer> arrayList = new ArrayList<>(set);
        for (int i = 0; i < n; i++) {
            if (set.contains(arr[i])) {
                dup.add(arr[i]);
            }
            set.add(arr[i]);
        }
        if (dup.size() == 0) {
            dup.add(-1);
        }
        arrayList.addAll(dup);

        return arrayList;
    }

    public static void main(String[] args) {
        int arr[] = { 13, 9, 25, 1, 1, 0, 22, 13, 22, 20, 3, 8, 11, 25, 10, 3, 15, 11, 19, 20, 2, 4, 25, 14, 23, 14 };
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList = duplicates(arr, 26);
        System.out.println(arrayList);
    }
}
