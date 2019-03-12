public class sortLog {

    public static void main(String args[]) {
        System.out.println("a8".compareTo("ab1"));

    }


    public String[] reorderLogFiles(String[] logs) {
        int index[] = new int[100];
        for (int i = 0; i < logs.length; i++) {
            String s = logs[i].split(" ")[1];
            if (is_int(s)) {
                index[i] = 1;
            } else {
                index[i] = 2;
            }
        }





        return null;
    }

    private boolean is_int(String s) {
        char chs[] = s.toCharArray();
        for (int i = 0; i < chs.length; i++) {
            if (chs[i] < '0' || chs[i] > '9') {
                return false;
            }
        }
        return true;
    }


}
