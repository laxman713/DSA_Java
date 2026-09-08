// nums = [10, 20, 30, 40, 50, 60]
// target = 40

// Output: 3


public class Find_element {

    public static void main(String[] args) {

        int[] nums = {10, 20, 30, 40, 50, 60};
        int target = 40;

        int left = 0;
        int right = nums.length - 1;

        int result = -1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                result = mid;
                break;
            }
            else if (nums[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        System.out.println("Element found at index: " + result);
    }
}