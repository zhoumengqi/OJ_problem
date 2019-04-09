package 华为机试;

import java.util.Scanner;

public class _1 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "";
        int count = 0;
        String[] ip1 = sc.next().split("\\.");
        String[] ip2 = sc.next().split("\\.");
        String[] mask = sc.next().split("\\.");
        for (int i = 0; i < mask.length; i++) {
            if ((Integer.valueOf(mask[i]) & Integer.valueOf(ip1[i])) == (Integer.valueOf(mask[i])
                    & Integer.valueOf(ip2[i]))) {
                count++;
            }
            str += "." + String.valueOf(Integer.valueOf(mask[i]) & Integer.valueOf(ip1[i]));
        }
        if(count == mask.length)
            System.out.println(1+" "+str.substring(1));
        else
            System.out.println(0+" "+str.substring(1));
    }
}
