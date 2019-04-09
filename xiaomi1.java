import java.util.Arrays;
import java.util.List;

public class xiaomi1 {
    double getMaxSumInRequest(int[] array, List<int[]> queryList) {
        int count[] = new int[array.length];
        for (int i = 0; i < queryList.size(); i++) {
            int tmp[] = queryList.get(i);
            int start = tmp[0];
            int end = tmp[1];
            for (int j = start; j <= end; j++) {
                count[j]++;
            }

        }
        Arrays.sort(count);
        int sum = 0;
        for (int i = count.length - 1; i >= 0; i--) {
            int a = getMax(array);
            sum += a * count[i];

        }
        return sum;

//      return 0;
    }

    public int getMax(int array[]) {
        int max = array[0];
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                index = i;
            }
        }
        array[index] = Integer.MIN_VALUE;
        return max;
    }

}
