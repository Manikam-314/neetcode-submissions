class Solution {
    public int maxArea(int[] heights) {
        int left=0;
        int right=heights.length-1;
        int maxArea=0;
        while(left<right){
            int h=Math.min(heights[left],heights[right]);
            int width=right-left;
            int mul=h*width;
             maxArea=Math.max(mul,maxArea);
        if(heights[left] < heights[right]){
            left++;
        }
        else{
            right--;
        }
        }
        return maxArea;
    }
}
