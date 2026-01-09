class Solution
{
    public int reverseBits(int n)
    {
        int toDivide = n;
        int reverseDenary = 0;

        for (int i = 0; i < 32; i++)
        {
            int remainder = toDivide % 2;
            reverseDenary = reverseDenary * 2;
            reverseDenary = reverseDenary + remainder;

            toDivide = toDivide / 2;
        }

        return reverseDenary;
    }
}
