import java.util.ArrayList;
public class FindNumbersWithSum {
    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        int start=0;
        int end=array.length-1;
        int ji=Integer.MAX_VALUE;
        int resstart=0;
        int resend=0;
        ArrayList<Integer> res=new ArrayList<Integer> ();
        while(start<end){
            if(array[start]+array[end]==sum){
                if(array[start]*array[end]<ji){
                    ji=array[start]*array[end];
                    resstart=start;
                    resend=end;
                }
                start++;
                end--;
            }else if(array[start]+array[end]>sum){
                end--;
            }else{
                start++;
            }
        }
        res.add(array[resstart]);
        res.add(array[resend]);
        return res;
    }

    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9};
        ArrayList<Integer>res= new FindNumbersWithSum().FindNumbersWithSum(a,10);
        for(int i=0;i<res.size();i++){
            System.out.println(res.get(i));
        }

    }

}
