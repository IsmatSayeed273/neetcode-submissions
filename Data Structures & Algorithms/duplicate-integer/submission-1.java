class Solution {
    public boolean hasDuplicate(int[] nums) {
        if (nums.length == 0) return false;
        Arrays.sort(nums);
        int i=0;
            for(int j=i+1; j<nums.length; j++){
                if (nums[i] != nums[j]){
                  nums[i+1] =nums[j];
                  i++;
                }
                else return true;
            }
            return false;
       
    }
}
