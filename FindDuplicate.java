

import java.util.*;

public class FindDuplicate {
    // Naive Approach BruteForce
    // Time comp -> O(nlogn) space comp -> O(1)
    public static int findDuplicateNumberByBruteForceMethod(int nums[]) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length + 1; i++) {
            if (nums[i - 1] == nums[i]) {
                return nums[i];
            }
        }
        return -1;

    }

    // Hashing optimized solution
    // Time comp -> O(n) space comp -> O(n)
    public static int findDuplicateNumberByHashingMethod(int nums[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return nums[i];
            }
            map.put(nums[i], i);
        }
        return -1;

    }

    // Linkedlist Cycle Method optimized solution
    // Time comp -> O(n) Space comp -> O(1)
    public static int findDuplicateNumberByLinkedlistCycleMethod(int nums[]) {
        int slow = nums[0];
        int fast = nums[0];
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);
        fast = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 5, 9, 6, 9, 3, 8, 9, 7, 1 };
        int result1 = findDuplicateNumberByBruteForceMethod(arr);
        int result2 = findDuplicateNumberByHashingMethod(arr);
        int result3 = findDuplicateNumberByLinkedlistCycleMethod(arr);

        System.out.println("Duplicate number by BruteForce Method is : " + result1);
        System.out.println("Duplicate number by Hashing Method is : " + result2);
        System.out.println("Duplicate number by LinkedList Cycle Method is : " + result3);
    }

}
