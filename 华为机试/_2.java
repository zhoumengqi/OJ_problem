package 华为机试;

import java.util.Scanner;

public class _2 {
   public  static  int x=0;
   public static  int y=0;
    public static  int m;
    public static  int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         m = sc.nextInt();
        char c1[]= sc.next().toCharArray();
         n=c1.length;
        char chs[][] = new char[m][n];
        chs[0]=c1;
        for (int i = 1; i < m; i++) {
            chs[i] = sc.next().toCharArray();
        }
        int max = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                x=i;
                y=j;
                if (chs[i][j] - '0' == 1 && isvalid(chs, i, j)) {
                    max=Math.max(max,(x-i)*(y-j));
                }
            }
        }
        System.out.println(max);
    }
    private static boolean isvalid(char[][] chs, int m1, int n1) {
        int index = 0;
        int end_i = m1, end_j = n1;
        while (end_i < m && end_j < n) {
            if (chs[end_i][end_j] - '0' == 0) {
                break;
            }
            end_i++;
            end_j++;
        }
        x=end_i;
        y=end_j;
        boolean flag = true;
        for (int i = m1; i < end_i; i++) {
            for (int j = n1; j < end_j; j++) {
                if (chs[i][j] - '0' == 0) {
                    return false;
                }
            }
        }
        return flag;
    }
}
