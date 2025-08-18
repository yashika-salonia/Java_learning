public class stock_buy_sell {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println("Max Profit: " + maxProfit(prices));
    }

    // brute force
    // static int maxProfit(int[] prices) {
    //     int max=0;
    //     int n=prices.length;
    //     for(int i=0;i<n;i++){
    //         for(int j=i+1;j<n;j++){
    //             if(prices[j]>prices[i]){
    //                 max=Math.max(max,prices[j]-prices[i]);
    //             }
    //         }
    //     }
    //     return max;
    // }
    
    // optimal approach
    static int maxProfit(int[] prices){
        int maxPf=0;
        int n=prices.length;
        int minPrice=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(prices[i]<minPrice){
                minPrice=prices[i];
            }
            maxPf=Math.max(maxPf,prices[i]-minPrice);
        }
        return maxPf;
    }
}
