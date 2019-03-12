public class search {
    public int search(int[] A, int target) {
        int mid = 0, low = 0, high = A.length - 1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A[mid] == target) {
                return mid;
            }
            if (A[low] <= A[mid]) {
                if (A[low] <= target && target <= A[mid]) {
                    high = mid - 1;

                } else low = mid + 1;


            } else {
                if (A[mid] <= target && target <= A[high])
                    low = mid + 1;
                else high = mid - 1;


            }


        }


        return -1;
    }

    public static void main(String[] args) {

    }
}
