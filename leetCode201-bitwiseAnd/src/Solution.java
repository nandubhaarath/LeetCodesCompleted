class Solution
{
    public int rangeBitwiseAnd(int left, int right)
    {
        int number = right;


        while (number > left)
        {
            number = number & (number - 1);
        }

        return number & left;
    }
}