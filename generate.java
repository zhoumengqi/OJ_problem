import java.util.ArrayList;

public class generate {

    public ArrayList<ArrayList<Integer>> generate(int numRows) {

        ArrayList<ArrayList<Integer>> reslist = new ArrayList<>();
        if (numRows == 0) return reslist;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        reslist.add(list);
        ArrayList<Integer> last = list;
        for (int i = 2; i <= numRows; i++) {
            ArrayList<Integer> list2 = new ArrayList<>();

            for (int j = 0; j < i; j++) {
                if (j == 0 || j == i - 1) {
                    list2.add(1);
                } else {
                    list2.add(last.get(j - 1) + last.get(j));
                }
            }
            reslist.add(list2);

            last = list2;
        }


        return reslist;
    }

    public static void main(String[] args) {
        System.out.println(new generate().generate(5));


    }


}
