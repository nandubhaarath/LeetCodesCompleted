public class Solution
{
    public boolean increasingTriplet(int[] nums)
    {
        for(int i =0; i<= nums.length-1 ;i++)
        {

            for(int z = i+1 ; z< nums.length-1 ; z++)
            {
                if(nums[z]>nums[i])
                {
                    if(howManyIncreasing(nums , z)>1)
                    {
                        return true;
                    }
                }


            }

        }

        return false; 
    }



    public int howManyIncreasing(int[]nums , int index)
    {
        int increasingNumbers =0;
        int numToCompare = nums[index];
        for (int i = index+1; i<=nums.length; i++)
        {
            if(nums[i]>numToCompare)
            {

                increasingNumbers++;

            }


        }

        return increasingNumbers;
    }
}
