public class GetUglyNumber_Solution {
    public int GetUglyNumber_Solution(int index) {
        if(index<7) return index;
        int value=1;
        int p2=0;
        int p3=0;
        int p5=0;
        int num[]=new int[index+1];
        num[0]=1;
        while(--index>0){
            num[value]=Math.min(Math.min(num[p2]*2,num[p3]*3),num[p5]*5);
            if(num[value]==num[p2]*2)p2++;
            if(num[value]==num[p3]*3)p3++;
            if(num[value]==num[p5]*5)p5++;
            value++;
        }
        return num[value-1];
    }

    public static void main(String[] args) {
        System.out.println(new GetUglyNumber_Solution().GetUglyNumber_Solution(7));
    }
}
