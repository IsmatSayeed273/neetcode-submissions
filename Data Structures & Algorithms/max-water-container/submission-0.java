class Solution {
    public int maxArea(int[] heights) {
       int n = heights.length;
        int left = 0, right = n-1;
        int maxArea= 0;
         while(left< right){
            int wi = right - left ;
            int hi = Math.min(heights[left], heights[right]);
            int area = wi * hi ;
            maxArea = Math.max(area, maxArea);
            if(heights[left] < heights[right]){
                left++;
            }
            else right --;

         }
         return maxArea; 
    }
}
