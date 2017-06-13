package leetcode;

public class BestTimeBuySellStock {

	public static void main(String[] args) {
		BestTimeBuySellStock test = new BestTimeBuySellStock();
		System.out.println(test.maxProfit(new int[] {7, 1, 5, 2, 6}));

	}
	
	public int maxProfit(int[] prices) {
         if(prices.length<2) return 0;
         int buy=prices[0];
         int pro=0;
         for(int i=0;i<prices.length;i++){
        	 buy = Math.min(buy, prices[i]);
        	 pro= Math.max(prices[i]-buy, pro);
         }
         return pro;
    }

}
