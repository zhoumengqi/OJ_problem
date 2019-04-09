import java.util.ArrayList;
import java.util.Arrays;

public class partition {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> res = new partition().partition("aab");
        for (int i = 0; i < res.size(); i++) {
            ArrayList tmp = res.get(i);
            for (int j = 0; j < tmp.size(); j++) {
                System.out.print(tmp.get(j) + " ");
            }
            System.out.println();
        }

    }

    public ArrayList<ArrayList<String>> partition(String s) {
        ArrayList<ArrayList<String>> res = new ArrayList<ArrayList<String>>();
        ArrayList<String> cur = new ArrayList<String>();
        dfs(s, cur, res);
        return res;


    }

    public void dfs(String s, ArrayList<String> cur, ArrayList<ArrayList<String>> res) {
        if (s == "") {
            res.add(cur);
            return;
        }
        for (int i = 1; i <= s.length(); i++) {
            String sub = s.substring(0, i);
            if (isPalindrome(sub)) {
                cur.add(sub);
                ArrayList<String> listtmp = new ArrayList<>(cur);

                dfs(s.substring(i, s.length()), listtmp, res);
//                dfs("", listtmp, res);
                cur.remove(cur.size() - 1);
            }

        }

    }


    public boolean isPalindrome(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

}
