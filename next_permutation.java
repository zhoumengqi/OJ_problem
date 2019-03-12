public class next_permutation {


    public void nextPermutation(int[] num) {
        boolean flag = false;
        int index=0;
        for (int i = num.length - 1; i > 0; i--) {
            if (num[i] > num[i - 1]) {
                index=i-1;
                for(int j=num.length-1;j>=i;j--){
                    if (num[j]>num[index]){
                        int tmp=num[j];
                        num[j]=num[index];
                        num[index]=tmp;
                        swap(num,index+1,num.length-1);
                       return;
                    }
                }

            }
        }
        if (flag == false) {
            swap(num,0,num.length-1);


        }


    }

    private void swap(int[] num, int start, int end) {
        int tmp=0;
        while (start<end){
            tmp=num[start];
            num[start]=num[end];
            num[end]=tmp;
            start++;
            end--;
        }


    }

    public static void main(String[] args) {
        int a[]={1,1,5};
        new next_permutation().nextPermutation(a);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }

}
