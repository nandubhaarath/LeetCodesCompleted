class Solution
{
    public long zeroFilledSubarray(int[] nums)
    {

        long numberOfZero = 0;
        long recurringBoolean = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 0)
            {
                recurringBoolean++;
                numberOfZero += recurringBoolean;
            }
            else
            {
                recurringBoolean = 0;
            }
        }

        return numberOfZero;
    }
}
