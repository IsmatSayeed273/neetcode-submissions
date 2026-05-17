class Solution {
    public int lengthOfLongestSubstring(String s) {
         int n = s.length();

        int low = 0, maxLen = 0;

        Map<Character, Integer> freq = new HashMap<>();

        for(int high = 0; high < n; high++) {

            char c = s.charAt(high);

            // add current character
            freq.put(c, freq.getOrDefault(c, 0) + 1);

            // shrink if duplicate exists
            while(freq.get(c) > 1) {

                char leftChar = s.charAt(low);

                freq.put(leftChar,
                         freq.get(leftChar) - 1);

                if(freq.get(leftChar) == 0) {
                    freq.remove(leftChar);
                }

                low++;
            }

            // valid window
            maxLen = Math.max(maxLen,
                              high - low + 1);
        }

        return maxLen;
    }
}
