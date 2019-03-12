public class reverse {

    public int reverse(int x) {
        boolean bo = false;
        if (x < 0) {
            x = x * (-1);
            bo = true;
        }
        long res=0;
        int yu=0;
        while (x!=0){
            yu=x%10;
            res=(res*10+yu);
            x=x/10;

        }
        if (bo) res*=(-1);
        return (int)res;
    }


    public static void main(String[] args) {
        System.out.println(new reverse().reverse(1234567890));
    }

}
