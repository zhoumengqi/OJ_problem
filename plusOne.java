public class plusOne {
    public int[] plusOne(int[] digits) {
        int tmp = 1;
        boolean bo = false;
        if (digits[digits.length - 1] == 9) bo = true;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (bo) {
                if (digits[i] + tmp == 10) {
                    digits[i] = 0;

                } else {
                    if (tmp==1){
                        digits[i]=digits[i]+1;
                    }
                    tmp = 0;

                }

            }else {
                digits[digits.length - 1] =digits[digits.length - 1] +1;
                return digits;
            }

        }
        if (tmp == 1) {
            int res[] = new int[digits.length + 1];
            res[0] = 1;
            for (int i = 1; i < res.length; i++) {
                res[i] = digits[i - 1];
            }

            return res;
        } else
            //digits[0]=digits[0]+1;
            return digits;


    }

    public static void main(String[] args) {
        int a[] = {8,9,3,9};
        int b[] = new plusOne().plusOne(a);
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }

    }

}
