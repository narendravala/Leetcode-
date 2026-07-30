class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int [] mer= new int[nums1.length + nums2.length];
        int k=0;
        for(int i=0;i<nums1.length;i++){
            mer[i]=nums1[i];
        }
        for(int i=nums1.length;i<mer.length;i++){
            mer[i]=nums2[k];
            k++;
        }
        int sum=0;
        for(int i=0;i<mer.length;i++){
            sum+=mer[i];
        }
        Arrays.sort(mer);
        if(mer.length%2!=0){
        return mer[mer.length/2];
        }
        else{
    double d=(mer[mer.length/2-1]+mer[mer.length/2])/2.0; 
    return d;       
        }
    
    }
}