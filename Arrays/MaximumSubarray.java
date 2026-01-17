/*
Problem: Maximum Subarray
LeetCode: https://leetcode.com/problems/maximum-subarray/
Difficulty: Medium
Approach: Brute Force
Time Complexity: O(n3)
Space Complexity : O(1)
*/

//Code
class Solution {
    public int maxSubArray(int[] nums) {
        int max_sum = Integer.MIN_VALUE;
        
        //For stopping at each element of the nums array
        for(int i = 0 ; i < nums.length ; i++) {

            //For moving from 'i' to 'n'
            for(int j = i ; j < nums.length ; j++) {

                int sum = 0;

                //For adding elements between 'i' and 'j'
                for(int k = i; k <= j; k++) {
                    sum = sum + nums[k];

                    max_sum = Math.max(sum, max_sum);
                }
            }
        }

        //return maximum sum if it is greater than zero
        if(max_sum > 0) {
            return max_sum;
        }

        return 0;
    }
}