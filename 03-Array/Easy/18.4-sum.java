/*
 * @lc app=leetcode id=18 lang=java
 *
 * [18] 4Sum
 */

// @lc code=start
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        
        // Edge case: Need at least 4 numbers
        if (nums == null || nums.length < 4) {
            return result;
        }
        
        // Step 1: Sort the array to easily skip duplicates and use two pointers
        Arrays.sort(nums);
        int n = nums.length;
        
        // Step 2: First loop (fixes the 1st number)
        for (int i = 0; i < n - 3; i++) {
            // Skip duplicates for the 1st number
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            
            // Step 3: Second loop (fixes the 2nd number)
            for (int j = i + 1; j < n - 2; j++) {
                // Skip duplicates for the 2nd number
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
                
                // Step 4: Two Pointers for the remaining two numbers
                int left = j + 1;
                int right = n - 1;
                
                while (left < right) {
                    // Use long to prevent integer overflow
                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];
                    
                    if (sum == target) {
                        // Found a valid quadruplet
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        
                        // Move both pointers inward
                        left++;
                        right--;
                        
                        // Skip duplicates for the 3rd number (left pointer)
                        while (left < right && nums[left] == nums[left - 1]) {
                            left++;
                        }
                        // Skip duplicates for the 4th number (right pointer)
                        while (left < right && nums[right] == nums[right + 1]) {
                            right--;
                        }
                    } 
                    else if (sum < target) {
                        left++; // We need a larger sum, move left pointer right
                    } 
                    else {
                        right--; // We need a smaller sum, move right pointer left
                    }
                }
            }
        }
        
        return result;
    }
}
// @lc code=end

