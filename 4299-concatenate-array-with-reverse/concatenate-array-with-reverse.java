class Solution {
    public int[] concatWithReverse(int[] nums) {
        int arr[] =new int[nums.length*2];
        int j=nums.length-1;;
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i];
        }
        for(int i= nums.length;i<arr.length;i++){
            arr[i]=nums[j];
            j--;
        }
        return arr;
    }
}