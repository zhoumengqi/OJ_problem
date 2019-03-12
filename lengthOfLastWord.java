public class lengthOfLastWord {

    public int lengthOfLastWord(String s) {
        if(s.length()==0) return 0;
        int len=s.length();
        int res=0;
        int i=len-1;
        boolean flag=false;

        if(len==1&&s.charAt(0)!=' ') return 1;
        if(s.charAt(i)==' ') i--;
        for(;i>=0;i--){
            if(s.charAt(i)==' '){
                flag=true;
                break;
            }else{
                res++;
            }
        }
        return res;


    }

    public static void main(String[] args) {
        System.out.println(new lengthOfLastWord().lengthOfLastWord("b a "));
    }
}
