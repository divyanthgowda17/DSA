class Solution {
    public String largestNumber(int[] nums) {
      int largest = Integer.MIN_VALUE;
      for (int i=0; i<nums.length; i++){
        if(largest < nums[i]){
            largest = nums[i];
        }
        return largest;
      }
    }
}