class Solution
    {

    public int firstMissingPositive(int[] nums)
    {
        //find the lowest and the highest

        int lowest = 0;
        int highest =0;

       for (int i=0; i<= nums.length-1;i++)
       {
           if(nums[i]>0)
           {
               if(nums[i]>highest)
               {
                   highest = nums[i];

               }
               if(nums[i]<lowest)
               {
                   lowest = nums[i];
               }
           }
       }

       if(lowest>1)
       {
           return 1;
       }
       else
       {

       }
        return 0;

    }


}
