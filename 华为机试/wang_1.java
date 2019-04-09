package 华为机试;

import java.util.Scanner;

public class wang_1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s=sc.next();
//        System.out.println(s);
        int i=0;
        while(i<s.length()&&(s.charAt(i)!='+'&&s.charAt(i)!='-')){
            i++;
        }
        int res=Integer.parseInt(s.substring(0,i));
        while(i<s.length()){
            int flag=1;
            if(s.charAt(i)=='-'){
                flag=-1;
                i++;
            }else{
                flag=1;
                i++;
            }
                //i++;
            int j = i;
            while (j < s.length() && (s.charAt(j) != '+' && s.charAt(j) != '-')) {
                j++;
            }
            int tmp = flag * Integer.parseInt(s.substring(i, j));
            res += tmp;
            i=j;
        }
        System.out.println(res);


    }

}
//1+2+99-10-10