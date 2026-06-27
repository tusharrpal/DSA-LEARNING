class Solution {
    public int maxProfit(int[] prices) {

        int maxProfit=0;
        int minPrice=prices[0];
        for(int i=1;i<prices.length;i++){
            int sell=0;
            if(prices[i]>minPrice){
                int tempProfit=prices[i]-minPrice;
                if(tempProfit>maxProfit){
                    maxProfit=tempProfit;
                }
            }else{
                minPrice = prices[i];
            }
        }
        return maxProfit;
    }
}