class Solution {
    public String countAndSay(int n) {
        if(n<=1){
            return Integer.toString(n);
        }
        String start="1";
        for(int i=1;i<n;i++){
            start=appendIndex(start);
        }
       
        return start;
    }
    public String appendIndex(String n){
        StringBuilder sb=new StringBuilder();
        char c=n.charAt(0);
        int count = 1;
        for(int i = 1; i < n.length(); i++){
            if(n.charAt(i) == c){
                count++;
            }
            else{
                sb.append(count);
                sb.append(c);
                c = n.charAt(i);
                count = 1;
            }
        }
        sb.append(count);
        sb.append(c);
        return sb.toString();

    }
}