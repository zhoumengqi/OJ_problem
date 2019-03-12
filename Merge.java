

public class Merge {

    public void merge(int A[], int m, int B[], int n) {
        int last = m + n - 1;
        int a_i = m - 1;
        int b_i = n - 1;
        while (a_i >= 0 && b_i >= 0) {
            if (A[a_i] > B[b_i]) {
                A[last--] = A[a_i--];
            } else {
                A[last--] = B[b_i--];
            }
        }

        while (a_i>=0){
            A[last--]=A[a_i--];
        }
        while (b_i>=0){
            A[last--]=B[b_i--];
        }
        for (int i=0;i<m+n;i++){
            System.out.print(A[i]+" ");
        }


    }

    public static void main(String[] args) {
        int A[]={4,6,0,0,0,0};
        int B[]={1};
        new Merge().merge(A,2,B,1);
    }

}
