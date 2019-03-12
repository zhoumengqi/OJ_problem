public class canJump {

    public boolean canJump(int[] A) {
        int max = 0;//用来保存最大可以走到的距离
        int len = A.length;
        for (int i = 0; i < len && max >= i; i++) {
            if (i + A[i] > max)
                max = i + A[i];
        }
        if (max >= len - 1) return true;
        else return false;

    }


    public static void main(String[] args) {

    }

}
