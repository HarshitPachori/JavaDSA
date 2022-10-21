package array_programs;

import java.util.ArrayList;

public class ReverseArraylist {
    public static void reverseArrayList(ArrayList<Integer> arr, int m) {
        int start = m + 1;
        int end = arr.size() - 1;

        while (start <= end) {
            int temp = arr.get(start);
            arr.set(start, arr.get(end));
            arr.set(end, temp);
            start++;
            end--;

        }

    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        System.out.println(nums);
        reverseArrayList(nums, 1);
        System.out.println(nums);
    }
}
