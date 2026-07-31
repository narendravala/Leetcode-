class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;

        long reverse = 0;
        int temp = x;

        while (temp > 0) {
            int rem = temp % 10;
            reverse = (reverse * 10) + rem; // Multiply first, then add
            temp /= 10;
        }

        return reverse == x;
    }
}