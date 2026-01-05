//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{

    public static void main (String[]args)
    {
       int [] nums = new int[]{0,4,2,1,0,-1,-3};
        for (int i = 0; i <= nums.length - 1; i++)
        {
            int greaterNumbers = 0;
            int numToCheck = nums[i];

            for (int z = i + 1; z <= nums.length - 1; z++)
            {
                if (greaterNumbers >= 2)
                {

                    System.out.println("true");
                    break;
                }
                if (nums[z] > numToCheck)
                {
                    numToCheck = nums[z];
                    greaterNumbers++;
                }

            }

        }

        System.out.println("false");
    }
}