class Solution {
    public int maxArea(int[] heights) {
        
        int left=0;
        int right=heights.length-1;
        int sum=0;
        int val=0;
        int min=Integer.MAX_VALUE;
        while(left<right){

            if(heights[left]<=heights[right]){
                val=right-left;
                min=Math.min(heights[left],heights[right])*val;
                sum=Math.max(min,sum);
                left++;
            }
            else if(heights[left]>=heights[right]){
                val=right-left;
                min=Math.min(heights[left],heights[right])*val;
                sum=Math.max(min,sum);
                right--;
            }
            // else{
            //     left++;
            //     right--;
            // }
        }
        return sum;
    }
}
