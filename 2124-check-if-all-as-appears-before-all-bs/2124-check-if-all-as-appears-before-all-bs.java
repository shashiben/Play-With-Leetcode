class Solution {
    public boolean checkString(String s) {
        boolean isBAppeared=false;
        for(char c:s.toCharArray()){
            if(isBAppeared){
                if(c=='a'){
                    return false;
                }
            }else{
                if(c=='b'){
                    isBAppeared=true;
                }
            }
        }
        return true;
    }
}