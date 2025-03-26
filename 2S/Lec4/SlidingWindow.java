package 2S.Lec4;

// This is the brute force approach for the better understanding
public class SlidingWindow {

    public int[] maxSlidingWindow(int[] nums, int k) {
        
        // // for the first window
        int n = nums.length;
        if(n == 0 || k == 0) return new int[0];
        int maxi = Integer.MIN_VALUE;
        int[] arr = new int[n-k+1] ; // number of window

        for(int i = 0; i < k; i++){

          maxi = Math.max(maxi,nums[i]);
        }
            
        arr[0] = maxi;
        int start = 1;
        int end = k;
        
        while(end < n){
            maxi = Integer.MIN_VALUE;
            for(int i = start; i <= end; i++){

                    maxi = Math.max(maxi, nums[i]);
            }

            // yha maxi mai maximum element hai usko array mai daal denge;
            arr[start] = maxi;

            // start or end ko increase kr do
            start++;
            end++;
        }
        return arr;
    }
}
