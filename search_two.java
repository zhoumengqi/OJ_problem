public class search_two {
    public boolean search(int[] A, int target) {
        int mid = 0, low = 0, high = A.length - 1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A[mid] == target) {
                return true;
            }
            if (A[low] == A[mid]) {
                low++;
            } else if (A[low] < A[mid]) {
                if (A[low] <= target && target <= A[mid]) {
                    high = mid - 1;

                } else low = mid + 1;


            } else {
                if (A[mid] <= target && target <= A[high])
                    low = mid + 1;
                else high = mid - 1;


            }


        }


        return false;


    }

    public static void main(String[] args) {
        int a[]={1,1,1,3,1};
        System.out.println(new search_two().search(a,3));
    }
}