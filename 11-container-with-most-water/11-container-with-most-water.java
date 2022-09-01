class Solution {
    public int maxArea(int[] height) {
        int i=0,j=height.length-1;
        int maxArea=0;
        while(i<=j){
            int area=Math.abs(i-j)*Math.min(height[i],height[j]);
            if(area>maxArea){
                maxArea=area;
            }
            if(height[i]>height[j]){
                j--;
            }else{
                i++;
            }
        }
        return maxArea;
    }
}