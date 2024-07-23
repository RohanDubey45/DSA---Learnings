public class Stocks {

    public static boolean RepeatElements(int arr[]){
        int n = arr.length;
        for(int i=0; i<arr.length; i++){
            for (int j = i+1; j < n; j++) {
                if (arr[j]==arr[i]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int BuySellStocks(int prices[]){
        int BuyPrice = Integer.MAX_VALUE;
        int MaxProfit = 0;

        for(int i=0; i<prices.length; i++){

            if (BuyPrice < prices[i]) {
                int Profit = prices[i] - BuyPrice;
                MaxProfit = Math.max(MaxProfit, Profit);
            }
            else{
                BuyPrice = prices[i];
            }
        }
        return MaxProfit;

    }
    public static void main(String[] args) {

        // int prices[] = {7, 1, 5, 3, 6, 4};
        // int ans = BuySellStocks(prices);
        // System.out.println("Max Profit: "+ans);

        int arr[] = {1, 2, 3, 5, 6, 7, 1};
        boolean res = RepeatElements(arr);
        System.out.println(res);
        
        
    }
}
