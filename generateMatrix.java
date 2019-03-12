import java.security.Principal;

public class generateMatrix {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int index = 1;
        int a = 0, c = 0;
        int b = n - 1, d = n - 1;
        while (a <= b && c <= d) {
            for (int i = c; i < d; i++) {
                res[a][i] = index++;
            }
            for (int i = a; i < b; i++) {
                res[i][b] = index++;
            }
            for (int i = d; i > c; i--) {
                res[b][i] = index++;
            }
            for (int i = b; i > a; i--) {
                res[i][c] = index++;
            }
            a++;
            c++;
            b--;
            d--;

        }

        if (n % 2 == 1)
            res[n / 2][n / 2] = index;
        return res;
    }

    public static void main(String[] args) {
        int a[][] = new generateMatrix().generateMatrix(1);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();

        }

    }
}
