class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        int result=0;
        int n1=nums1.length-1,n2=nums2.length-1;
        for(int i=0;i<=n1+n2;i++){
            int p1=Math.max(0,n1-i);
            int p2=Math.max(0,i-n1);
            int sameMatch=0;
            for(int j=p1,k=p2;j<=n1&&k<=n2;j++,k++){
                sameMatch=nums1[j]==nums2[k]?sameMatch+1:0;
                result=Math.max(result,sameMatch);
            }
        }
        return result;
    }
}