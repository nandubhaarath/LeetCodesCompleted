public class Main
{
    public static void main(String[] args)
    {
        int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};

        int end = nums.length - 1;
        int i=0;

        while(true)
        {

            if(nums[i]==-1)
            {
                break;
            }
            if (nums[i] == nums[i + 1])
            {
                for (int z = i; z <= nums.length - 2; z++)
                {
                    nums[z] = nums[z + 1];

                }

                nums[end] = -1;
                end--;

            }
            if (nums[i] != nums[i + 1])
            {
                i++;
            }
            if(i== nums.length-1)
            {
                break;
            }
        }
    }


}