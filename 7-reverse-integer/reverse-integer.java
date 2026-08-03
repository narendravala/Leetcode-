class Solution {
    public int reverse(int x) {
        boolean isnegative=false;
        if(x<0){
            isnegative=true;
        }
        x=Math.abs(x);
        int temp=x;
        int reverse=0;
      
        while(temp>0){
            int rem=temp%10;
            temp/=10;

            if (reverse > Integer.MAX_VALUE / 10 || (reverse == Integer.MAX_VALUE / 10 && rem > 7)) {
                return 0;
            }
            // Check for underflow for negative numbers
            if (reverse < Integer.MIN_VALUE / 10 || (reverse == Integer.MIN_VALUE / 10 && rem < -8)) {
                return 0;
            }
            reverse=reverse*10+rem;
        }
        if(isnegative)
        return -reverse;
        else 
        return reverse;
    }
}