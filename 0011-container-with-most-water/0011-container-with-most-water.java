class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length-1;
        int maxArea=0;
        
        while(l<r){
            int d=r-l;
            int h= height[r]<height[l]?height[r]:height[l];
            int tempArea=h*d;
            maxArea= tempArea>maxArea?tempArea:maxArea;
            if(height[l]<height[r]){
                l++;
            }else{
                r--;
            }
        }
        return maxArea;
    }
}