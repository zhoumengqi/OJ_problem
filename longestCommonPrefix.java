public class longestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if (strs.length==0){
            return "";
        }
        if (strs.length==1){
            return strs[0];
        }
        String res = "";
        boolean flag = true;
        int index = 0;
        int max_length = 0;

        for (int i = 0; i < strs.length; i++) {
            max_length = Math.max(max_length, strs.length);
        }
        char chars[][] = new char[strs.length][max_length];
        for (int i = 0; i < strs.length; i++) {
            chars[i] = strs[i].toCharArray();
        }
//        for (int i = 0; i < strs.length; i++) {
//            System.out.println(chars[i]);
//        }

        while (flag) {
            for (int i = 0; i < strs.length - 1; i++) {
                if (chars[i].length <= index||chars[i+1].length <= index) {
                    flag = false;
                    break;

                }
                if (chars[i][index] != chars[i + 1][index]) {
                    flag = false;
                    break;

                }


            }
            if(!flag) return res;
            res += chars[0][index];

            index++;

        }


        return res;
    }

    public static void main(String[] args) {
        String strs[] = {"abc", "abcd", "c"};
        System.out.println(new longestCommonPrefix().longestCommonPrefix(strs));
    }
}
