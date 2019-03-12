import java.util.Arrays;

public class exist {
    boolean isfind;
    int m;
    int n;
    boolean flag[][];

    public void init() {
        isfind = false;
        for (int i = 0; i < m; i++) {
            Arrays.fill(flag[i], false);
        }
    }

    public boolean exist(char[][] board, String word) {
        m = board.length;
        n = board[0].length;
        flag = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == word.charAt(0)) {
                    init();//初始化标记
                    search(board, i, j, word, 0);
                    if (isfind) {
                        return true;
                    }
                }
            }
        }
        return false;

    }

    public void search(char[][] board, int x, int y, String word, int index) {
        if (isfind) return;
        if (index == word.length()) {
            isfind = true;
            return;
        }
        if (x < 0 || x >= board.length || y < 0 || y >= board[0].length) return;

        if (!flag[x][y] && board[x][y] == word.charAt(index)) {
            flag[x][y] = true;
            search(board, x + 1, y, word, index + 1);


            search(board, x, y + 1, word, index + 1);


            search(board, x - 1, y, word, index + 1);


            search(board, x, y - 1, word, index + 1);

            flag[x][y] = false;
        }

    }

    public static void main(String[] args) {
        char board[][] = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};

        System.out.println(new exist().exist(board, "ABCB"));
    }
}
