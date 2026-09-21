public class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int total = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            int currentValue = romanMap.get(s.charAt(i));

            if (i < n - 1 && currentValue < romanMap.get(s.charAt(i + 1))) {
                total -= currentValue;
            } else {
                total += currentValue;
            }
        }

        return total;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.romanToInt("III"));     
        System.out.println(sol.romanToInt("LVIII"));   
        System.out.println(sol.romanToInt("MCMXCIV")); 
    }
}