class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> data = new HashMap<Character, Integer>();
        data.put('I', 1);
        data.put('V', 5);
        data.put('X', 10);
        data.put('L', 50);
        data.put('C', 100);
        data.put('D', 500);
        data.put('M', 1000);

        int total = 0;

        for(int i = 0; i < s.length(); i++) {
            total += data.get(s.charAt(i));
            if(i > 0 && data.get(s.charAt(i - 1)) < data.get(s.charAt(i)))
                total -= data.get(s.charAt(i - 1)) * 2;
        }

        return total;
    }
}