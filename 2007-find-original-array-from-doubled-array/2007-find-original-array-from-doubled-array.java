class Solution {
    public int[] findOriginalArray(int[] changed) {
        int n = changed.length;
        if(n % 2 != 0){
            return new int[0];
        }
        Map<Integer,Integer> hashSet = new HashMap<>();
        int[] result = new int[n/2];
        int index = 0;
        Arrays.sort(changed);
        int start = n-1;
        while(start>= 0){
            int element = changed[start];
            int doubleVal = element * 2;
            if(hashSet.containsKey(doubleVal)){
                if(hashSet.get(doubleVal) == 1){
                    hashSet.remove(doubleVal);
                }else {
                    hashSet.put(doubleVal,hashSet.get(doubleVal) - 1);
                }
                result[index++] = element;
            }else{
                hashSet.put(element,hashSet.getOrDefault(element,0) + 1);
            }
            start--;
        }
        if(index==n/2){
            return result;
        }else{
            return new int[0];
        }
        
    }
}