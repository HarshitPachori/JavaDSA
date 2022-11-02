import java.util.ArrayList;

public class StockBuyAndSell {
    ArrayList<ArrayList<Integer>> stockBuySell(int A[], int n) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            if (A[i] > A[i - 1]) {
                ArrayList<Integer> temp = new ArrayList<>(2);
                temp.add(i - 1);
                temp.add(i);
                list.add(temp);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        StockBuyAndSell sbs = new StockBuyAndSell();
        int arr[] = { 100, 180, 260, 310, 40, 535, 695 };
        int n = arr.length;
        System.out.println(sbs.stockBuySell(arr, n));

    }
}
