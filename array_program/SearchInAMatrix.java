class SearchInAMatrix {
    boolean isPresent(int arr[][], int n, int m, int x) {
        int i = 0;
        int j = m - 1;
        while (i < n && j >= 0) {
            if (arr[i][j] == x) {
                return true;
            } else if (arr[i][j] < x) {
                i++;
            } else {
                j--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        SearchInAMatrix sm = new SearchInAMatrix();
        int arr[][] = { { 3, 30, 38 }, { 44, 52, 54 }, { 57, 60, 69 } };
        int x = 62;
        boolean res = sm.isPresent(arr, arr.length, arr[0].length, x);
        if (res) {
            System.out.println("Element is present !");
        } else {
            System.out.println("Element is not present !");
        }
    }
}