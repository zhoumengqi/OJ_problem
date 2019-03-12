import javax.swing.*;

public class largest_rectangle_in_histogram {

    public int largestRectangleArea(int[] height) {
        int max_ret = 0;
        for (int i = 0; i < height.length; i++) {
            int left = i - 1;
            int right = i + 1;

            while (left >= 0 && height[left] >= height[i]) {
                left--;
            }
            while (right < height.length&& height[right] >= height[i] ) {
                right++;
            }
            if ((right - left-1) * height[i] > max_ret) {
                max_ret = (right - left-1) * height[i];
            }

        }


        return max_ret;
    }

    public static void main(String[] args) {
        int a[]={2,1,5,6,2,3};
        int b[]={2};
        System.out.println(new largest_rectangle_in_histogram().largestRectangleArea(a));
        System.out.println(new largest_rectangle_in_histogram().largestRectangleArea(b));
    }
}
