import  java.util.*;
public class restoreIpAddresses {
    public ArrayList<String> restoreIpAddresses(String s) {
        ArrayList<String> res=new ArrayList<String>();
        search(res,s,"",0,0);


        return res;
    }
    public void search(ArrayList<String> res,String s,String cur_s,int count,int index){
        if(count==3){
            if(s.length()-index>3) return ;//剪枝，如果剩下的超过3个肯定找不到了，所以直接返回
            //找到一个之后就添加 并返回
            if(validIp(s.substring(index,s.length())))
                res.add(cur_s+s.substring(index,s.length()));
            return ;
        }
        for(int i=index+1;i<=index+3&&i<s.length();i++){
            if(validIp(s.substring(index,i)))
                search(res,s,cur_s+s.substring(index,i)+".",count+1,i);
        }
    }
    public boolean validIp(String s){
        if(s.equals("")) return false;
        //单独一个0可以，0后面再跟数字就不行了
        if(s.equals("0")) return true;
        if(s.charAt(0)=='0'&&s.length()>=2){
            return  false;
        }
        int value=Integer.valueOf(s);
        if(value>=0&&value<=255){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(new restoreIpAddresses().restoreIpAddresses("010010"));
    }
}
