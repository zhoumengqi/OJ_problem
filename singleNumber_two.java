public class singleNumber_two {
    int res = 0;

    public int singleNumber(int[] A) {
        for (int i = 0; i < 32; i++) {
            int sum = 0;
            for (int j = 0; i < A.length; j++) {
                sum += (A[j] >> i) & 1;
            }
            res += (sum % 3) << i;


        }

        return res;
    }

    public static void main(String[] args) {

    }

}
