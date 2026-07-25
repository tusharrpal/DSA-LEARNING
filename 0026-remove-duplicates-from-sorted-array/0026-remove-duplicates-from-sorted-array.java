class Solution {
    public int removeDuplicates(int[] nums) {
        int officer=0;
        int cm=1;
        int res=1;

        while(cm<nums.length){
            if(nums[cm]==nums[officer]){
                cm++;
            }
            else{
                nums[officer+1]=nums[cm];
                cm++;
                officer++;
                res++;
            }
        }
        return res;
    }
}