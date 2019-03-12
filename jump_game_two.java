public class jump_game_two {


    public int jump(int[] A) {
        int min = 0;
        int dp[] = new int[A.length];

        for (int i = 0; i < dp.length; i++) {
            int maxPosition = Math.min(i + A[i], A.length - 1);

            for (int j = i + 1; j <=maxPosition; j++) {
                if (dp[j] == 0) dp[j] = dp[i] + 1;
            }
            if (dp[A.length - 1] != 0) {
                min = dp[A.length - 1];
                break;
            }
        }

        return min;
    }

    public static void main(String[] args) {
        int a[]={2,3,1,1,4};
        System.out.println(new jump_game_two().jump(a));
    }
}
