import java.util.ArrayList;
import java.util.HashSet;

class UnionOfTwoSortedArrays {

    // * Naive Approach ( BRUTEFORCE ) using HashSet */
    ArrayList<Integer> findUnion1(int arr1[], int arr2[], int n, int m) {
        ArrayList<Integer> unionList = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(arr1[i]);
        }
        for (int i = 0; i < m; i++) {
            set.add(arr2[i]);
        }
        for (int it : set) {
            unionList.add(it);
        }
        return unionList;
    }

    // * Time comp => O((m+n)log(m+n)) */
    // * Space comp => O(m+n) -> if ArrayList considered , otherwise -> O(1) */

    // * Better Approach ( Efficient ) using 2 Pointers Approach */
    ArrayList<Integer> findUnion2(int arr1[], int arr2[], int n, int m) {
        ArrayList<Integer> unionList = new ArrayList<>();
        int i = 0, j = 0;
        // * Copying elements of arr1[] and arr2[] in sorted order */
        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                if (unionList.size() == 0 || unionList.get(unionList.size() - 1) != arr1[i]) {
                    unionList.add(arr1[i]);
                }
                i++;
            } else {
                if (unionList.size() == 0 || unionList.get(unionList.size() - 1) != arr2[j]) {
                    unionList.add(arr2[j]);
                }
                j++;
            }
        }
        // * Copying remaining elements of arr1[] */
        while (i < n) {
            if (unionList.size() == 0 || unionList.get(unionList.size() - 1) != arr1[i]) {
                unionList.add(arr1[i]);
            }
            i++;
        }
        // * Copying remaining elements of arr2[] */
        while (j < m) {
            if (unionList.size() == 0 || unionList.get(unionList.size() - 1) != arr2[j]) {
                unionList.add(arr2[j]);
            }
            j++;
        }
        return unionList;
    }

    // * Time comp => O(m+n) */
    // * Space comp => O(m+n) -> if ArrayList considered , otherwise -> O(1) */

    void printArray(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // for line change

    }

    public static void main(String[] args) {
        UnionOfTwoSortedArrays usa = new UnionOfTwoSortedArrays();
        int arr1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int arr2[] = { 2, 3, 4, 4, 5, 11, 12 };
        int n = arr1.length;
        int m = arr2.length;
        usa.printArray(arr1, n);
        usa.printArray(arr2, m);
        ArrayList<Integer> res1 = usa.findUnion1(arr1, arr2, n, m);
        ArrayList<Integer> res2 = usa.findUnion2(arr1, arr2, n, m);
        System.out.println(res1);
        System.out.println(res2);

    }
}