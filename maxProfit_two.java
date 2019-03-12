public class maxProfit_two {

    public int maxProfit(int[] prices) {
        if (prices.length <= 1) return 0;
        int sum = 0;
        for (int i = 0; i < prices.length + 1; i++) {
             if (prices[i-1]>prices[i]){
                 sum+=prices[i+1]-prices[i];
             }

        }

        return sum;
    }


    public static void main(String[] args) {
        int a[] = {};
        System.out.println(new maxProfit_two().maxProfit(a));
    }

}
