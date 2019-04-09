import java.util.Scanner;

public class _360_1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int sum=0;
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int d=sc.nextInt();
            sum+=d;//4人队伍
            //三人队伍找单人去借
            if(c>a){
                sum+=(a);
                a=0;
            }else{
                sum+=c;
                a-=c;
            }
            if(b>=2){
                sum+=(b/2);
                b=b%2;
            }
            if(b>0){
                if(a>=2){
                    sum+=1;
                    a=a-2;
                }
            }
            if(a>=4){
                sum+=(a/4);
            }
            System.out.println(sum);

        }

    }

}
