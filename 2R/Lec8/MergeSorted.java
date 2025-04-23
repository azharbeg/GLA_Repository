public class MergeSorted {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        

        int i = m+n -1;
        int j = n-1;
        int k = m - 1;

        while(k >= 0 && j >= 0){
            if(nums1[k] > nums2[j]){
                nums1[i--] = nums1[k--];  
            }
            else if(nums2[j] > nums1[k]){
                nums1[i--] = nums2[j--];
            }
            // if both are equal
            else{
                nums1[i--] = nums1[k--];
            }
        }
        
        while(k >= 0){
            nums1[i--] = nums1[k--];
        }
        while(j >= 0){
            nums1[i--] = nums2[j--];
        }
    
    }
}
