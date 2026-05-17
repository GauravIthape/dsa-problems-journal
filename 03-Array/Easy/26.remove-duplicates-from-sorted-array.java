/*
 * @lc app=leetcode id=26 lang=java
 *
 * [26] Remove Duplicates from Sorted Array
 */

// @lc code=start
import java.util.HashSet;
class Solution {
    public int removeDuplicates(int[] nums) {
        int index=0;
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums)
        {
            if(!set.contains(num))
            {
                set.add(num);
                nums[index]=num;
                index++;
            }
        }
        return index;
    }
}
// @lc code=end

