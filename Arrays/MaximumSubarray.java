/*
Problem: Maximum Subarray
LeetCode: https://leetcode.com/problems/maximum-subarray/
Difficulty: Medium

*/


/*
Approach: Brute Force
Time Complexity: O(n3)
Space Complexity : O(1)
*/

//1.) Brute Force Approach - O(n3)
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
            return max_sum;
    }
}

//-----------------------------------------------------------------//

/*
Approach: Optimised Brute Force
Time Complexity: O(n2)
Space Complexity : O(1)
*/

//2.) Optimised Brute Force Approach - O(n2)
//Code

class Solution {
    public int maxSubArray(int[] nums) {
        int max_sum = Integer.MIN_VALUE;
        
        for(int i = 0 ; i < nums.length ; i++) {
            int sum = 0;
            for(int j = i ; j < nums.length ; j++) {
                    sum = sum + nums[j];
                    max_sum = Math.max(sum, max_sum);
            }
        }
            return max_sum;
    }
}

//--------------------------------------------------------------//

/*
Approach: Kadane's Algorithm
Time Complexity: O(n)
Space Complexity : O(1)
*/

//3.) Kadane's Algorithm  - O(n)
//Code

class Solution {
    public int maxSubArray(int[] nums) {
        int max_sum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0 ; i < nums.length ; i++) {
                sum = sum + nums[i];
                max_sum = Math.max(sum, max_sum);

                if(sum < 0) {
                    sum = 0;
                }
        }
        return max_sum;
    }
}