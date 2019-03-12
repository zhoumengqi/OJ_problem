package 虚拟赛115;

class one {
    public int[] prisonAfterNDays(int[] cells, int N) {

        int rescell[][] = new int[14][8];
        for (int j = 1; j < 7; j++) {
            if ((cells[j - 1] ^ cells[j + 1]) == 0) {
                rescell[0][j] = 1;

            } else {
                rescell[0][j] = 0;
            }

        }

        for (int i = 1; i < 14; i++) {
            for (int j = 1; j < 7; j++) {
                if ((rescell[i-1][j - 1] ^ rescell[i-1][j + 1]) == 0) {
                    rescell[i][j] = 1;

                } else {
                    rescell[i][j] = 0;
                }
            }
        }
//        for(int k=0;k<N;k++) {
//            for (int i = 0; i < 8; i++) {
//                System.out.print(rescell[k][i]);
//            }
//            System.out.println();
//        }
            return rescell[(N - 1) % 14];


    }

    public static void main(String[] args) {
        int a[] = {0, 1, 0, 1, 1, 0, 0, 1};
        new one().prisonAfterNDays(a, 7);
    }

}
