import java.util.ArrayList;

public class Test {

    public int removeDuplicates(int[] A) {
        int res = 0;
        int count = 0;
        int index = 0, pre = 0;
        while (index < A.length - 1) {
            if (A[index] == A[index + 1]) {
                int tmp = index + 1;
                while (A[index] == A[tmp]) {
                    tmp++;
                }
                index = tmp;
                A[pre++] = A[index++];
                A[pre++] = A[index++];


            } else {
                res++;
                A[pre++] = A[index++];
            }
        }
        return res;
    }


    public static void main(String[] args) {
        int a[]={1,1,1,2,2,4};
        System.out.println(new Test().removeDuplicates(a));
    }
}
