
public class totalNQueens {
    static int res = 0;
    static int N = 0;
    private int[] map = new int[20];

    public int totalNQueens(int n) {
        N = n;
        func(1);
        return res;
    }

    private void func(int x) {
        if (x == N + 1) {
            for (int i=1;i<=N;i++){
                System.out.print(map[i]+" ");
            }
            System.out.println();

            res++;
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
        System.out.println(new totalNQueens().totalNQueens(4));
    }
}
