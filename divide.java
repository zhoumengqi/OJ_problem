public class divide {
    public int divide(int dividend, int divisor) {
        int res=0;
        while(dividend>=divisor){
            res+=1;
            dividend-=divisor;
        }
        return res;
    }
    public int add(int a,int b){
        int sum=0;
        int flag=b;//进位
        while(flag!=0){
            sum=a^b;
            flag=(a&b)<<1;
            a=sum;
            b=flag;
        }
        return sum;
    }
    public int multi(int a,int b){
        int sum=0;
         for(int i=0;i<b;i++){
             sum=add(a,sum);
         }
        return sum;
    }
    public int minus(int a,int b){
        return add(a,-b);
    }
    public int divide1(int a,int b){
        if(b==0) return 0;
        int result=0;
        if(a>0&&b>0){
            while(a>=b){
                a=minus(a,b);
                result++;
            }
            return result;
        }
        if(a<0&&b>0) return -divide1(-a,b);
        if(a<0&&b<0) return divide1(-a,-b);
        if(a>0&&b<0) return -divide1(a,-b);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new divide().divide1(123456789,5));


    }
}
