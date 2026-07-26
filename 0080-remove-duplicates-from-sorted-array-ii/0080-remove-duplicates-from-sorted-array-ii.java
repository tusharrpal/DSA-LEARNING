class Solution {
    public int removeDuplicates(int[] nums) {
        int cm=2;
        int officer=2;

        while(cm<nums.length){
            if(nums[cm]!= nums[officer-2]){
                nums[officer]= nums[cm];
                officer++;
            }
            cm++;
        }
        return officer;
    }  
}
