//Runtime: 0 ms, faster than 100.00% of Java online submissions for Climbing Stairs.
//Memory Usage: 31.7 MB, less than 100.00% of Java online submissions for Climbing Stairs.

class Solution {
    public int climbStairs(int n) {
        int[] count = new int[n];
        if(n==0) return 0;
        if(n>=1) count[0] = 1;
        if(n>=2) count[1] = 2;
        for(int a = 2;a<n;a++)
            count[a] = count[a-1]+count[a-2];
        return count[n-1];
    }
}