package test;

public class sd {

    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int res[][]=new int[r][c];
        int M=nums.length;
        int N=nums[0].length;
        int count=0;
        if(M*N<r*c) return nums;
        while(count<M*N){
            int new_r=count/c;
            int new_c=count%c;
            int new_m=count/N;
            int new_n=count%N;
            res[new_r][new_c]=nums[new_m][new_n];
            count++;
        }
        return res;
    }

    public static void main(String[] args) {
        int a[][]={{1,2},{3,4}};

        new sd().matrixReshape(a,1,4);
    }
}
