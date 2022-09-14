class Solution {
    public boolean isHappy(int n) {
        if(n==1){
            return true;
        }
        int temp=0;
        HashSet<Integer> hashSet=new HashSet<>();
        while(n>0 && !hashSet.contains(n)){
            n=doSquare(n);
            if(n==1){
                return true;
            }
            hashSet.add(temp);
            temp=n;
            System.out.println(hashSet+","+n);
        }
        return false;
    }
    public int doSquare(int n){
        int result=0;
        if(n<10){
            return n*n;
        }
        while(n!=0){
            int trail=n%10;
            result=trail*trail+result;
            n=n/10;
        }
        return result;
    }
}