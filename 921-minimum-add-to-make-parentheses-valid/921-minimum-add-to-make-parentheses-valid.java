class Solution {
    public int minAddToMakeValid(String s) {
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == '(') {
                end++;
            } else if (end > 0) {
                end--;
            } else {
                start++;
            }
        }
        return start + end;
    }
}