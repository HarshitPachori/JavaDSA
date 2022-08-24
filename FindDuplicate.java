public class FindDuplicate {

    public static int findDuplicateNumber(int nums[]) {
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
        int result = findDuplicateNumber(arr);
        System.out.println("Duplicate number is : " + result);
    }

}
