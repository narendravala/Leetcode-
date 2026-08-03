class Solution {
    public int mirrorDistance(int n) {
        int temp=n;
        int digit=0;
        while(temp>0)
        {
            int rem=temp%10;
            digit=digit*10+rem;
            temp/=10;
        }
        return Math.abs(n-digit);
    }
}