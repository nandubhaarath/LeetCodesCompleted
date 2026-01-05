public class Solution {

    public int removeDuplicates(int[] nums) {

        int k = 0;
        int end  = nums.length-2;
        nums =  new int[]{1,1,2};
        for (int i = 0; i <= nums.length; i++)
        {
            if (nums[i] == nums[i + 1])
            {
                for (int z = i; z <= nums.length; z++)
                {
                    nums[z] =nums[z+1];

                }

                nums[end]=0;
                end--;

            }
        }

        return k;
    }


}
