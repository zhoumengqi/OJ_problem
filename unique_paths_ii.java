public class unique_paths_ii {


    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int res = 0;
        if (obstacleGrid.length == 1 && obstacleGrid[0].length == 1) {
            if (obstacleGrid[0][0] == 0) return 1;
            else return 0;
        }


        int dp[][] = new int[obstacleGrid.length][obstacleGrid[0].length];
        if (obstacleGrid[0][0] == 1) {
            dp[0][0] = 0;
        }else{
            dp[0][0]=1;
        }
        for (int i = 1; i < obstacleGrid.length; i++) {
            if (obstacleGrid[i][0] != 1) {
                if (obstacleGrid[i - 1][0] == 1) {
                    dp[i][0] = 0;
                } else if(dp[i-1][0]==1){

                    dp[i][0] = 1;
                }
            } else {
                dp[i][0] = 0;
            }
        }
        for (int i = 1; i < obstacleGrid[0].length; i++) {
            if (obstacleGrid[0][i] != 1) {
                if (obstacleGrid[0][i - 1] == 1) {
                    dp[0][i] = 0;
                } else if(dp[0][i-1]==1){

                    dp[0][i] = 1;
                }


            } else {
                dp[0][i] = 0;
            }
        }

        for (int i = 1; i < obstacleGrid.length; i++) {
            for (int j = 1; j < obstacleGrid[0].length; j++) {
                if (obstacleGrid[i][j] == 1) {
                    dp[i][j] = 0;
                } else {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];

                }


            }

        }

        return dp[obstacleGrid.length - 1][obstacleGrid[0].length - 1];
    }

    public static void main(String[] args) {
//        int a[][] = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
//        int a[][] = {{1, 0}};
        int a[][] = {{0,1,0,0,0},{1,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0}};

        System.out.println(new unique_paths_ii().uniquePathsWithObstacles(a));
    }

}
