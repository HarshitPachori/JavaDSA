import java.util.*;

public class LeadersInArray {
    public static ArrayList<Integer> leadersInArray(int arr[], int n) {
        ArrayList<Integer> list = new ArrayList<>();

        int maxi = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] >= maxi) {
                list.add(arr[i]);
                maxi = arr[i];
            }
        }
        Collections.reverse(list);
        return list;

    }

    public static void main(String[] args) {
        // int arr[] = { 16, 17, 4, 3, 5, 2 };
        int arr[] = { 1, 2, 3, 4, 0 };
        ArrayList<Integer> list = new ArrayList<>();

        list = leadersInArray(arr, arr.length);

        System.out.println(list);
    }
}
