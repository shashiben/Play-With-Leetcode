class Solution {
    public int numDecodings(String s) {
        int n=s.length();
        int[] cache=new int[n];
        Arrays.fill(cache,-1);
        return getNo(s,0,cache);
    }
    public static int getNo(String s,int i,int[] cache){
        int n=s.length();
        if(i==n)return 1;
        if(s.charAt(i)=='0')return 0;
        if(cache[i]!=-1)return cache[i];
        int count=getNo(s,i+1,cache);
        if(i<n-1 && ((s.charAt(i)-'0')*10+s.charAt(i+1)-'0')<27){
            count+=getNo(s,i+2,cache);
        }
        cache[i]=count;
        return count;
    }
}