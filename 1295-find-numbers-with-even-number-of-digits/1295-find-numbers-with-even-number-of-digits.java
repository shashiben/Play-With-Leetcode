class Solution {
    public int findNumbers(int[] nums) {
        int result=0;
        for(int n:nums){
            if(isEvenDigit(n)){
                result++;
            }
        }
        return result;
    }
    public boolean isEvenDigit(int n){
        // int sum=0;
        // while(n>0){
        //     n=n/10;
        //     sum++;
        // }
        // return sum%2==0;
        String s=String.valueOf(n);
        return s.length()%2==0;
    }
}