import java.util.Arrays;

public class two_sum {
    public int[] twoSum(int[] numbers, int target) {

        int i=0;
        int res[]=new int[2];
        int j=numbers.length-1;
        int map[]=new int[10000000];
        for(int k=0;k<numbers.length;k++){
            map[numbers[k]]=k+1;
        }
        Arrays.sort(numbers);
        while(i<=j){
            if(numbers[i]+numbers[j]==target){
                break;
            }
            if(numbers[i]+numbers[j]>target){
                j--;
            }else if(numbers[i]+numbers[j]<target){
                i++;

            }
        }


        res[0]=map[numbers[i]];
        res[1]=map[numbers[j]];
        return res;

    }

    public static void main(String[] args) {
        int a[]={2, 7, 11, 15};
        System.out.println(new two_sum().twoSum(a,9)[0]);
        int i=0;
        System.out.println(i++==i);
        System.out.println(i);
    }
}
