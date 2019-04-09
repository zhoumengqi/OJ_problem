public class VerifySquenceOfBST {
    public static void main(String[] args) {
        int a[]={7,4,6,5};
        System.out.println(new VerifySquenceOfBST().VerifySquenceOfBST(a));
    }

    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence.length==0){
            return false;
        }
        return judge(sequence,0,sequence.length-1);
    }
    public boolean judge(int[] sequence,int start,int end){
        //最后一个当作根
        if(start>=end){
            return true;
        }
        int i=start;
        for(;i<end;i++){
            if(sequence[i]>sequence[end]){
                break;
            }
        }
        int j=i;
        for(;i<end;i++){
            if(sequence[i]<sequence[end]){
                return false;
            }
        }
        return judge(sequence,start,j-1)&&judge(sequence,j,end-1);
    }

}
