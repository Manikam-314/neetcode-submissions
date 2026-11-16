class Solution {
    public int maxProfit(int[] prices) {
        int sum=Integer.MAX_VALUE;
        int profit=0;
        for(int price:prices){
            sum=Math.min(price,sum);

            if(price>sum){
                profit=Math.max(price-sum,profit);
            }
        }
        

        return profit;
    }
}
