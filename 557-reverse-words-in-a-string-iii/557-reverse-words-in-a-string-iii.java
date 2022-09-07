class Solution {
    public String reverseWords(String s) {
        String[] splitArray=s.split(" ");
        String result="";
        for(String a:splitArray){
           String reversedString=reverseString(a);
            System.out.println(reversedString);
            if(result==""){
                result=String.join("",result,reversedString);
            }else
            result=String.join(" ",result,reversedString);
        }
        return result;
    }
    public String reverseString(String s){
        char[] result=new char[s.length()];
        for(int i=s.length()-1;i>=0;i--){
            result[s.length()-1-i]=s.charAt(i);
        }
        return new String(result);
    }
}