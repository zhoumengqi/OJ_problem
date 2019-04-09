import java.util.ArrayList;

public class printMatrix {
    public static void main(String[] args) {
       int a[][]={{1 ,2,3 ,4},{ 5 ,6 ,7 ,8},{ 9, 10 ,11 ,12},{ 13 ,14 ,15 ,16}};
//       int a[][]={{1 ,2, 3,4,5}};
        ArrayList<Integer> res=new printMatrix().printMatrix(a);
        for(int i=0;i<res.size();i++){
            System.out.print(res.get(i)+" ");
        }


    }
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> res=new ArrayList<Integer>();
        int zuo=0;
        int shang=0;
        int xia=matrix.length-1;
        int you=matrix[0].length-1;
        while(zuo<=you&&shang<=xia){
            for(int i=zuo;i<=you;i++)res.add(matrix[shang][i]);
            shang++;
            for(int i=shang;i<=xia;i++)res.add(matrix[i][you]);
            you--;
            for(int i=you;i>=zuo&&shang<=xia;i--)res.add(matrix[xia][i]);
            xia--;
            for(int i=xia;i>=shang&&you>=zuo;i--)res.add(matrix[i][zuo]);
            zuo++;
        }



        return res;
    }
}
