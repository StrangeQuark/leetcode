class Solution {
    public String longestCommonPrefix(String[] strs) {
        String output = strs[0];

        if(strs.length == 1)
            return strs[0];

        for(String s : strs) {
            String temp = "";
            for(int i = 0; i < s.length(); i++) {
                if(output.length() > i) {
                    if(s.charAt(i) == output.charAt(i)) {
                        temp = temp + s.charAt(i);
                    }
                    else
                        break;
                }
            }
            output = temp;
        }

        return output;
    }
}