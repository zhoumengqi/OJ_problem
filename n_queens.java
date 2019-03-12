import java.util.ArrayList;
import java.util.Arrays;

public class n_queens {

    static int N = 0;
    private int[] map = new int[20];
    static ArrayList<String[]> reslist ;

    public ArrayList<String[]> solveNQueens(int n) {
        reslist= new ArrayList();
        if (n==1){
            String tmp[]=new String[1];
            tmp[0]="Q";

            reslist.add(tmp);
            return reslist;

        }



        N = n;
        func(1);
        return reslist;
    }

    private void func(int x) {
        if (x == N + 1) {
            char chs[][] = new char[N][N];
            for (int i = 0; i < N; i++) {
                Arrays.fill(chs[i], '.');
            }

            for (int i = 1; i <= N; i++) {
                chs[i - 1][map[i] - 1] = 'Q';
            }

            String str[] = new String[N];
            for (int i = 0; i < N; i++) {
                String tmp = "";
                for (int j = 0; j < N; j++) {
                    tmp = tmp + chs[i][j];
                }
                str[i] = tmp;
                System.out.println(tmp);
            }
            reslist.add(str);
            System.out.println();
        }
        for (int i = 1; i <= N; i++) {

            map[x] = i;
            if (check(x)) func(x + 1);
        }


    }

    private boolean check(int x) {

        for (int i = 1; i < x; i++) {
            if (map[i] == map[x] || Math.abs(map[x] - map[i]) == Math.abs(x - i)) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(new n_queens().solveNQueens(4));
    }
}
