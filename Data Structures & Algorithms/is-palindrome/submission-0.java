class Solution {
    public boolean isPalindrome(String s) {
             int i = 0;
        int j = s.length() - 1;

        while (i < j) {

            // skip invalid chars from left
            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }

            // skip invalid chars from right
            while (i < j && !Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            }

            char left = Character.toLowerCase(s.charAt(i));
            char right = Character.toLowerCase(s.charAt(j));

            if (left != right) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}
