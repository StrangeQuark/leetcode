class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;

        int leftToRight = x; 
        int rightToLeft = 0;

        while( x != 0){
            int digit = x %10;
            rightToLeft = rightToLeft * 10 + digit;
            x = x / 10;
        }return rightToLeft == leftToRight;
    }
}