import java.util.ArrayList;
import java.util.List;

public class subsets {
    public ArrayList<ArrayList<Integer>> subsets(int[] S) {

        ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> cur=new ArrayList<Integer>();
        find(res,cur,S,0);
        return res;

    }
    public void find(ArrayList<ArrayList<Integer>> res,ArrayList<Integer> cur,int s[],int index){
        if(index>=s.length){
            res.add(cur);
            return;
        }
        for(int i=index;i<s.length;i++){
            if(i-1>=0&&s[i-1]==s[i]){
                i++;
            }else{
                ArrayList<Integer> tmp=new ArrayList(cur);
                find(res,cur,s,i+1);//不使用当前数字
                tmp.add(s[i]);
                find(res,tmp,s,i+1);//用了当前数字
            }
        }
    }
    public static void main(String[] args) {
        int a[]={1,2,2};
        ArrayList<ArrayList<Integer>> res= new subsets().subsets(a);
        for(int i=0;i<res.size();i++){
            ArrayList<Integer> tmp=res.get(i);
            for(int j=0;j<tmp.size();j++){
                System.out.print(tmp.get(j));
            }
            System.out.println();
        }


    }
}
