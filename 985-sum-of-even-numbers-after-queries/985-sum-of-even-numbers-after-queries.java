class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int[] result =new int[queries.length];
        int arrSum=getSum(nums);
        for(int i=0;i<queries.length;i++){
            int index=queries[i][1];
            int value=queries[i][0];
            if(nums[index] % 2 == 0) {
                arrSum -= nums[index]; 
            } 
            nums[index]+=value;
            if(nums[index] % 2 == 0) {
                arrSum += nums[index]; 
            } 
            result[i]=arrSum;
        }
        return result;
    }
    public int getSum(int[] nums){
        int result=0;
        for(int n:nums){
            if(n%2==0){
                result+=n;
            }
        }
        return result;
    }
}