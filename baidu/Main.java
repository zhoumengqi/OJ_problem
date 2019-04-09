package baidu;

import java.util.Scanner;

public class Main {
    private static int count = 0;
    private static int max = 3000002;
    static int Next[] = new int[max];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int len = s.length();
        getNext(s);
        int ans = len - Next[len];
        if (len % ans == 0)
            System.out.println(ans);
        else
            System.out.println(len);

    }


    public static void getNext(String s) {
        int m = s.length();
        Next[0] = -1;
        int j = 0;
        int k = -1;
        while (j < m) {
            if (k == -1 || s.charAt(j) == s.charAt(k))
                Next[++j] = ++k;
            else
                k = Next[k];
        }
    }

}
