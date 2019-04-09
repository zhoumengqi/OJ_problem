package baidu;

import java.text.DecimalFormat;
import java.util.Scanner;

public class test1 {
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");


        while(sc.hasNext()){
            int n=sc.nextInt();
            int m=sc.nextInt();
            float sum= (float) (n*1.0);
            float tmp= (float) (n*1.0);
            while(m-->1){
                tmp= (float) Math.sqrt(tmp);
                sum+=tmp;
            }
            System.out.println(df.format(sum));
        }
    }

}
