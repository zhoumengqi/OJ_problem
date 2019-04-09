import java.util.ArrayList;

public class GetLeastNumbers_Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        //使用快排的思想，，基于枢纽划分成两段，递归调用
        ArrayList<Integer> res = new ArrayList<Integer>();
        find(res, input, k, 0, input.length - 1);


        return res;
    }

    public void find(ArrayList<Integer> res, int[] input, int k, int start, int end) {
        if (start > end) return;
        int pivot = input[start];
        int curstart = start;
        int curend = end;
        while (curstart < curend) {
            while (curstart < curend && input[curend] >= pivot) curend--;
            swap(input, curstart, curend);
            while (curstart < curend && input[curstart] < pivot) curstart++;
            swap(input, curstart, curend);
        }
        if (curend - start + 1 == k) {
            for (int i = start; i <= curend; i++) res.add(input[i]);
        } else if (curend - start + 1 > k) {
            find(res, input, k, start, curend);
        } else {
            for (int i = start; i <= curend; i++) res.add(input[i]);
            find(res, input, k - (curend - start +1), curstart+1, end);
        }

    }

    public void swap(int[] input, int i, int j) {
        int tmp = input[i];
        input[i] = input[j];
        input[j] = tmp;
    }

    public static void main(String[] args) {
        int a[] = {9,7,5,3,1};
        ArrayList res = new GetLeastNumbers_Solution().GetLeastNumbers_Solution(a, 3);
        for (int i = 0; i < res.size(); i++) {
            System.out.print(res.get(i) + " ");
        }
    }


}
