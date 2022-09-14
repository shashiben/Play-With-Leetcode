class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0")||num2.equals("0")){
            return "0";
        }
        int[] mArr=new int[num1.length()+num2.length()-1];
        for(int i=0;i<num1.length();i++){
            for(int j=0;j<num2.length();j++){
                // System.out.println((num1.charAt(i)-'0')+","+(num2.charAt(j)-'0'));
                mArr[i + j] += (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
            }
        }
        System.out.println(Arrays.toString(mArr));
        for(int i=mArr.length-1;i>0;i--){
            System.out.println(mArr[i]+","+mArr[i-1]);
            mArr[i-1]+=mArr[i]/10;
            mArr[i]=mArr[i]%10;
            
        }
        System.out.println(Arrays.toString(mArr));
        StringBuilder result=new StringBuilder();
        for(int v:mArr){
            result.append(v);
        }
        return result.toString();
    }
}