public class Solution
{
    public boolean isPalindrome(String s)
    {
        //turning s into a single string
        String cleaned = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();

        char[] arr = cleaned.toCharArray();


            for (int i = 0; i < arr.length / 2; i++)
            {
                if (arr[i] != arr[arr.length - 1 - i])
                {
                    return false;
            }

        }



        return true;
    }

}
