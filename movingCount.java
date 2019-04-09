import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class movingCount {
    int count=0;
    boolean flag[][];
    public int movingCount(int threshold, int rows, int cols)
    {   flag=new boolean[rows][cols];
        dfs(0,0,threshold,rows,cols);
        return count;
    }
    public void dfs(int x,int y,int threshold, int rows, int cols){
        if(x<0||y<0||x>=rows||y>=cols)  return;
        if(flag[x][y]) return;
        if(getNumSum(x)+getNumSum(y)>threshold)return ;

        count++;
        flag[x][y]=true;
        System.out.println("x="+x+"  y="+y+"   count="+count);
        dfs(x+1,y,threshold,rows,cols);
        dfs(x-1,y,threshold,rows,cols);
        dfs(x,y+1,threshold,rows,cols);
        dfs(x,y-1,threshold,rows,cols);
//        flag[x][y]=false;
    }
    public int getNumSum(int n){
        int sum=0;
        while(n!=0){
            sum+=n%10;
            n=n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(new movingCount().movingCount(10,10,10));
        TreeSet<Integer> l1=new TreeSet<>();
        l1.add(1);
        l1.add(3);
        l1.add(2);
//        ArrayList res1=l1.toArray();
        System.out.println(l1);

    }

}
