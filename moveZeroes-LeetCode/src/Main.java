import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        int [] nums = new int[]{0,1,0,3,12};

        ArrayList <Integer> rearrangedList = new ArrayList();

        int numberOfZeros = 0;

        for (int i =0; i<= nums.length-1 ; i++)
        {

            if(nums[i]==0)
            {
                numberOfZeros = numberOfZeros+1;
            }
            else
            {
                rearrangedList.add(nums[i]);
            }

        }
        for(int x = 0 ; x<= numberOfZeros-1; x++)
        {
          rearrangedList.add(0);

        }

        for ( int num:rearrangedList)
        {
            System.out.print(num + ", ");
        }

    }
}