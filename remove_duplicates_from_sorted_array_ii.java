public class remove_duplicates_from_sorted_array_ii {


    public int removeDuplicates(int[] A) {
        if (A.length < 3) return A.length;
        int idx = 1, cnt = 1;
        for (int i = 1; i < A.length; i++) {
            if (A[i] == A[i - 1]) {
                cnt++;
                if (cnt <= 2) {
                    A[idx++] = A[i];
                }
            } else {
                A[idx++] = A[i];
                cnt = 1;
            }


        }

        return idx;
    }

    public static void main(String[] args) {
        int a[]={1,1,1,2,2,3};
        System.out.println(new remove_duplicates_from_sorted_array_ii().removeDuplicates(a));
    }

}
