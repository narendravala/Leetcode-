class Solution {
    public boolean validDigit(int n, int x) {
        boolean yes=false;
        String str = String.valueOf(n);
        String str1= String.valueOf(x);
        if(str.charAt(0)==str1.charAt(0)){
return yes;
        }
        for(int i=0;i<str.length();i++){
            
            if(str.charAt(i)==str1.charAt(0)){
                yes=true;
                return  yes;
            }
        }
return yes;
    }
}