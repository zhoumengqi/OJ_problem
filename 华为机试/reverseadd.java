package 华为机试;

public class reverseadd {
    public int reverseadd(String s ){
        String[] nums =s.split(" ");
//        System.out.println(nums[1]);
        StringBuffer sb1=new StringBuffer(nums[0]);
        StringBuffer sb2=new StringBuffer(nums[1]);

        int a=Integer.parseInt(sb1.reverse().toString());
        int b=Integer.parseInt(sb2.reverse().toString());
//        System.out.println(sb2.reverse().toString());
//        System.out.println(b);
        long sum=a+b;
        if(sum>Integer.MAX_VALUE){
            return -1;
        }else{
            return Integer.parseInt((a+b)+"");
        }


    }

    public static void main(String[] args) {
        System.out.println(new reverseadd().reverseadd("1231111111 456"));
    }

}
