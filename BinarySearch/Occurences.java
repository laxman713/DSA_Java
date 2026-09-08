import java.util.Arrays;

class Occurences {
    public static void main(String[] args) {

        int nums[] = {5, 7, 7, 8, 8, 10};
        int target = 8;

        int left = 0;
        int right = nums.length - 1;
        int ans[] = {-1, -1};

        // First occurrence
        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] == target) {
                ans[0] = mid;
                right = mid - 1;
            } 
            else if (nums[mid] < target) {
                left = mid + 1;
            } 
            else {
                right = mid - 1;
            }
        }

        // Last occurrence
        left = 0;
        right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] == target) {
                ans[1] = mid;
                left = mid + 1;
            } 
            else if (nums[mid] < target) {
                left = mid + 1;
            } 
            else {
                right = mid - 1;
            }
        }

        System.out.println(Arrays.toString(ans));
    }
}