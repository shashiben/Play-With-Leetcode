class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        doRecursion(result,0,nums);
        return result;
    }
    public void doRecursion(List<List<Integer>> result,int start,int[] nums){
        if(start==nums.length){
            result.add(Arrays.stream(nums).boxed().toList());
        }else{
            for(int i=start;i<nums.length;i++){
                swap(nums,start,i);
                doRecursion(result,start+1,nums);
                swap(nums,start,i);
                
            }
        }
    }
    
    public void swap(int[] nums,int left,int right){
        int temp=nums[left];
        nums[left]=nums[right];
        nums[right]=temp;
    }
}