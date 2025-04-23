package 2R.Lec8;

public class RemoveDuplicates {

    int removeDuplicates(vector<int>& nums) {
        

        int n = nums.size();
        int k = 0;
        int i;

        for( i = 0; i < n -1; i++)
        {
            if(nums[i] == nums[i+1])
            {
                continue;
            }
            else{
                nums[k++] = nums[i];   // 0,1,2,3
            }
        }
        // how to handle last element 4,4 or 4

        nums[k] = nums[i];

        int size = k + 1;

        return size;
    }
}
