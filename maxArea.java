public class maxArea {
    public int maxArea(int[] height) {
        int res=0;
        for (int i=0;i<height.length-1;i++){
            for (int j=i+1;j<height.length;j++){
                res=Math.max(res,(j-i)*Math.min(height[i],height[j]));

            }
        }
        return res;
    }


    public static void main(String[] args) {
       int h[]={1,1};
        System.out.println(new maxArea().maxArea(h));
    }
}
