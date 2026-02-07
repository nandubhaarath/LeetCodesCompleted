import java.util.ArrayList;
public class Solution
{
    public int singleNumber(int[] nums)
    {
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int n : nums)
        {
            if(!numbers.contains(n))
            {

                numbers.add(n);
            }
            else if (numbers.contains(n))
            {
                numbers.remove(numbers.indexOf(n));
            }
        }
        return numbers.getFirst();

    }
}
