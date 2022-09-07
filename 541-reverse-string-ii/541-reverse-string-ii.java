class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder result = new StringBuilder();
        for(int i=0; i<s.length() ;i++ ){
            char c=s.charAt(i);
            System.out.println((i/k));
            if((i/k)%2==0){
                result.insert(result.length()-(i%k),c);
            }else{
                result.append(c);
            }
        }
        return result.toString();
    }
}