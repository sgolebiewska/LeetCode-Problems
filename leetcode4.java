//Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums3 = new int[nums1.length+nums2.length];
        int j = 0;
        for(int i = 0; i < nums1.length + nums2.length; i++)
        {
            if(i<nums1.length){
                nums3[j]=nums1[i];
                j++;
            }else{
                nums3[j]=nums2[i-nums1.length];
                j++;
            }
        }
       
        Arrays.sort(nums3);

        int middle = (nums3.length)/2;
        if(nums3.length%2 != 0) return (double)nums3[middle];

        int median= nums3[nums3.length/2] + nums3[(nums3.length/2)-1];
        double result = (double)median/2;
        return result;
    }
}