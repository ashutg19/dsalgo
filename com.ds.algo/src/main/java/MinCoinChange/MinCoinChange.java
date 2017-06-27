package MinCoinChange;

public class MinCoinChange {

	public int minCoinDynamic(int amount, int[] coins) {
		
		int reqCoin[]=new int[amount+1];
		int cointCount[]=new int[coins.length];
		for (int i = 0; i < cointCount.length; i++) {
			cointCount[i]=-1;
		}
		reqCoin[0]=0;
		
		
		for (int amt=1;amt<=amount;amt++) {
			for (int i = 0; i < cointCount.length; i++) {
				cointCount[i]=-1;
			}
			
			for (int i = 0; i < coins.length; i++) {
				
				
				if (amt>=coins[i]) {
					cointCount[i]=reqCoin[amt-coins[i]]+1;
					
				}
			}
			
			
			reqCoin[amt]=-1;
			for (int i = 0; i < cointCount.length; i++) {
				
				
				if (cointCount[i]>0 && (reqCoin[amt]==-1 || cointCount[i]<reqCoin[amt]) ) {
					reqCoin[amt]=cointCount[i];
				}
				
				
				
				cointCount[i]=-1;
			}
			
		}

		return reqCoin[amount];

	}

	public static void main(String[] args) {
		int[] coins = { 1, 2, 1 };
		int amount = 500;
		MinCoinChange m = new MinCoinChange();
		System.out.println("(Dynamic Programming) Minimum Coins required to make change for " + amount + " are: "
				+ m.minCoinDynamic(amount, coins));
	}

}
