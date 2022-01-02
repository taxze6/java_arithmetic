package pers.taxze.arithmetic.easy;
/**
 * 力扣2022年一月二日
 * 题目链接：https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/
 来源：力扣（LeetCode）
 */
public class remove_duplicates_from_sorted_array26 {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0)
            return 0;
        int count = 0;
        for (int i = 1;i < nums.length;i++){
            if(nums[i] != nums[count]){
                count++;
                nums[count] = nums[i];
            }
        }
    return count+1;
    }
}
