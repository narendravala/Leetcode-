class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        String [] str= new String[nums.length];
   String str1 = String.valueOf(digit);
        for(int i=0;i<nums.length;i++){
      str[i] = String.valueOf(nums[i]);
        }
        
        int count=0;
        for(int i=0;i<str.length;i++ ){
for(int j=0;j<str[i].length();j++){
    String strval=str[i];
    if(strval.charAt(j)==str1.charAt(0)){
        count++;
    }
}
}   
return count;
 }
}