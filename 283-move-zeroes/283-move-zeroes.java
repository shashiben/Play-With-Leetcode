class Solution {
    public void moveZeroes(int[] nums) {
        int idx=0;
        for (int i:nums){
            if(i!=0){
                nums[idx]=i;
                idx++;
            }
        }
        for(int i=idx;i<nums.length;i++){
            nums[i]=0;
        }
    }
}