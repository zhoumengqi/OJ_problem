public class NumberOf1Between1AndN_Solution {
    public int NumberOf1Between1AndN_Solution(int n) {
        int cur=0;
        int i=1;
        int after=0;
        int before=0;
        int count=0;
        while((n/i)!=0){
            cur=(n/i)%10;
            before=(n/i)/10;
            after=n%i;
            if(cur==0){
                count+=before*i;
            }else if(cur==1){
                count+=(before*i+after+1);
            }else{
                count+=(before+1)*i;
            }
            i*=10;
        }
        return count;
    }

    public static void main(String[] args) {
        new NumberOf1Between1AndN_Solution().NumberOf1Between1AndN_Solution(1);

    }
}
