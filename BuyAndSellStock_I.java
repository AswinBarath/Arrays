package arrays;

public class BuyAndSellStock_I {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 7,1,5,3,6,4 };
		System.out.println(maxProfit(arr));
	}

	public static int maxProfit(int[] prices) {
		int minprice = Integer.MAX_VALUE;
		int maxprofit = 0;
		for(int i = 0; i < prices.length; i++) {
			if(prices[i] < minprice)
				minprice = prices[i];
			else if(prices[i] - minprice > maxprofit)
				maxprofit = prices[i] - minprice;
		}
		return maxprofit;
	}
}
