import java.util.ArrayList;
import java.util.Arrays;

public class permute {
    public ArrayList<ArrayList<Integer>> permute(int[] num) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        boolean bool[] = new boolean[num.length];
        int cur[] = new int[num.length];
        Arrays.fill(bool, false);
        dfs(0, list, num, bool, cur);


        return list;
    }

    private void dfs(int index, ArrayList<ArrayList<Integer>> list, int[] num, boolean[] bool, int[] cur) {

        if (index == num.length) {
            ArrayList<Integer> list_tmp = new ArrayList<>();
            for (int i = 0; i < cur.length; i++) {
                list_tmp.add(cur[i]);
                System.out.print(cur[i] + " ");
            }
            list.add(list_tmp);
//           System.out.println();

        }


        for (int i = 0; i < num.length; i++) {
            if (index < num.length && bool[i] == false) {
                bool[i] = true;
                cur[index] = num[i];
                dfs(index + 1, list, num, bool, cur);
                bool[i] = false;
            }


        }


    }

    public static void main(String[] args) {
        new permute().permute(new int[]{2});
    }
}
