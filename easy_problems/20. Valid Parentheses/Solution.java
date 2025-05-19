class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[')
                stack.push(s.charAt(i));

            try {
                if(s.charAt(i) == ')' && stack.pop() != '(') {
                    return false;
                }
                if(s.charAt(i) == '}' && stack.pop() != '{') {
                    return false;
                }
                if(s.charAt(i) == ']' && stack.pop() != '[') {
                    return false;
                }
            } catch (Exception ex) {
                return false;
            }
        }

        return stack.empty();
    }
}