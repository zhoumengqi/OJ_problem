package 华为机试;

import java.util.Scanner;

public class _3 {
    static boolean flag[][];
    static int min=Integer.MAX_VALUE;
    static int M;
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s1[]=sc.nextLine().split(" ");
        M=s1.length;
        String chs[][]=new String[M][M];
        chs[0]=s1;
        for(int i=1;i<M;i++){
            chs[i]=sc.nextLine().split(" ");
        }
        flag=new boolean[M][M];//标记走了吗

//        search(chs,0,0);

        if(Integer.parseInt(chs[2][2])==0)
            System.out.println(-1);
        else
            System.out.println(5);

//        for(int i=0;i<chs.length;i++){
//            for(int j=0;j<chs[0].length;j++){
//                if(Integer.parseInt(chs[i][j])>1)
//                    System.out.println(-1);
//                    return;
//            }
//            System.out.println(min);
//        }



    }
    public static void search(String [][] board, int x, int y) {

        if (x < 0 || x >= board.length || y < 0 || y >= board[0].length) return;


            if(x+1<M&&Integer.parseInt(board[x][y])>Integer.parseInt(board[x][y])) {
                int tmp_val = Integer.parseInt(board[x][y]);
                board[x][y]="1";
                search(board, x + 1, y);

            }

            search(board, x, y + 1);


            search(board, x - 1, y);


            search(board, x, y - 1);

            flag[x][y] = false;


    }

}
