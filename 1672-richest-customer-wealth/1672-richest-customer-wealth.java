class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=0;
        for (int[] n :accounts){
            max=Math.max(max,getSum(n));
        }
        return max;
    }
    public int getSum(int[] n){
        int sum=0;
        for(int i:n){
            sum+=i;
        }
        return sum;
    }
}