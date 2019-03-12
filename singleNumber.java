public class singleNumber {

    public int singleNumber(int[] A) {
    int res=0;
    for (int i=0;i<A.length;i++){
        res^=A[i];
    }
    return res;

    }

    public static void main(String[] args) {
        int a[]={1,2,3,3,2};
        System.out.println(new singleNumber().singleNumber(a));
    }
}
