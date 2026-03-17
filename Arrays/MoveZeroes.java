/*
Problem: Move Zeroes
LeetCode: https://leetcode.com/problems/move-zeroes/
Difficulty: Easy
Approach: Two Pointer
Time Complexity: O(n)
Space Complexity : O(1)
*/

//Code:

class Solution {
    public void moveZeroes(int[] nums) {
        int last = 0;

        for(int i = 0 ; i < nums.length ; i++) {
            if(nums[i]!= 0){
                nums[last] = nums[i];
                last++;
            }
        }

        for(int j = last ; j < nums.length ; j++) {
            nums[j] = 0;
        }
    }
}