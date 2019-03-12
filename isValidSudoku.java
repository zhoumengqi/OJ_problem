public class isValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        //判断每一行是否重复

        for (int i = 0; i < 9; i++) {
            int a[] = new int[10];
            for (int j = 0; j < 9; j++) {
                //排除非数字的
                if ((board[i][j] - '0') < 0 || (board[i][j] - '0') > 9) continue;
                if (a[board[i][j] - '0'] > 0) {
                    return false;
                } else {
                    a[board[i][j] - '0'] = 1;
                }

            }
        }
        //判断每列
        for (int i = 0; i < 9; i++) {
            int a[] = new int[10];
            for (int j = 0; j < 9; j++) {
                //排除非数字的
                if ((board[j][i] - '0') < 0 || (board[j][i] - '0') > 9) continue;
                if (a[board[j][i] - '0'] > 0) {
                    return false;
                } else {
                    a[board[j][i] - '0'] = 1;
                }

            }
        }
        //判断每一个3*3
        for (int hang = 0; hang < 9; hang+=3) {
            for (int lie = 0; lie < 9; lie+=3) {

                int a[]=new int[10];
                for(int i=hang;i<hang+3;i++){
                    for (int j=lie;j<lie+3;j++){


                        //排除非数字的
                        if ((board[i][j] - '0') < 0 || (board[i][j] - '0') > 9) continue;
                        if (a[board[i][j] - '0'] > 0) {
                            return false;
                        } else {
                            a[board[i][j] - '0'] = 1;
                        }

                    }




                }




            }


        }
        return true;
    }


    public static void main(String[] args) {

//        System.out.println(new isValidSudoku().isValidSudoku());
    }
}
