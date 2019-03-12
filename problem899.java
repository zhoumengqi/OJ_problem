import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem899 {

    public int[] sortArrayByParity(int[] A) {
        int start = 0;
        int end = A.length - 1;
        int tmp = 0;
        while (start < end) {
            while (start<A.length&&A[start] % 2 == 0) {
                start++;
            }
            while (end>=0&&A[end] % 2 == 1) {
                end--;
            }

            if (start>=end||start==A.length||end==-1) return A;
            tmp = A[start];
            A[start] = A[end];
            A[end] = tmp;
            start++;
            end--;
        }
        return A;

    }

    public static void main(String[] args) throws IOException {
//            int[] A = stringToIntegerArray(line);
        int A[] = {0,1};
        int[] ret = new problem899().sortArrayByParity(A);
        for (int i = 0; i < ret.length; i++) {
            System.out.print(ret[i] + " ");
        }

    }
}
