import java.util.*;
class Find_ele_in_rotated_array {
    public static void main(String[] args) {
        
    int nums[] ={4,5,6,7,0,1,2};
    int target = 4;
        int left = 0;
        int right = nums.length-1;
        while(left<=right){
            int mid = (left+right)/2;
            if(nums[mid]==target){
               System.out.println(mid);
            }
              if(nums[left] <= nums[mid]) {

                if(nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }

            // Right half is sorted
            else {

                if(nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            }
            
        }
  
        
    }
