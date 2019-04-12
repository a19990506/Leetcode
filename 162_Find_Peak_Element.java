//Runtime: 0 ms, faster than 100.00% of Java online submissions for Find Peak Element.
//Memory Usage: 39.6 MB, less than 5.19% of Java online submissions for Find Peak Element.

class Solution {
    public int findPeakElement(int[] nums) {
        return search(nums,0,nums.length-1);
    }
    public int search(int[] num,int start,int end){
        if(start == end) return start;
        else if(start+1 == end){
            if(num[start] > num[end]) return start;
            return end;
        }else{
            int mid = (start+end)/2;
            if(num[mid] > num[mid-1] && num[mid] > num[mid+1])return mid;
            else if(num[mid-1] > num[mid] && num[mid] > num[mid+1]) return search(num,start,mid-1);
            else return search(num,mid+1,end);
        }
    }
}