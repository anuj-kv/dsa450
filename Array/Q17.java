package Array;

public class Q17 {
    public static void main(String[] args) {
        //Best time to buy and sell stock
        int[] prices = {7,1,5,3,6,4};
        int profit = 0;
        for(int i = 0; i<prices.length; i++){
            for(int j = i+1; j<prices.length; j++){
                 profit = Math.max(profit,prices[j]-prices[i]);
            }
        }
        System.out.println(profit);
        //optimized solution


    }
}
