public class multiply {
    public String multiply(String num1, String num2) {
        // BigInteger a=new BigInteger(num1);
        // BigInteger b=new BigInteger(num2);
        // return a.multiply(b).toString();
        if (num1.equals("0") || num2.equals("0")) return "0";
        int a[] = new int[num1.length() + num2.length()];
        for (int i = 0; i < num1.length(); i++) {
            for (int j = 0; j < num2.length(); j++) {
                a[i + j] += (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
            }
        }
        String s = "";
        int temp = 0;
        for (int i = a.length - 1; i > 0; i--) {
            a[i-1]+=a[i]/10;
            a[i]=a[i]%10;
        }
        for(int i=0;i<a.length-1;i++){
            s+=a[i];
        }
        return s;

    }

    public static void main(String[] args) {
        System.out.println(new multiply().multiply("99", "99"));
    }
}
