class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        List<String> list=new ArrayList<>();
        for (char key : map.keySet()) {
            Integer a=map.get(key);
            String res="";
            for(int i=0;i<a;i++){
                res+=key;
            }
             list.add(res);
        }
        Collections.sort(list,new Comparator<String>(){
            public int compare(String s1, String s2){
                return s2.length() - s1.length();
            }
        });
        String res="";
        for (String a:list){
            res+=a;
            
        }
        
        return res;
    }
}