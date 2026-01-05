//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {

        int [] nums = new int[]{1,1,2};

        for (int i =0 ; i <= nums.length-2 ; i++)
        {
           if(nums[i] == nums[i+1])
           {
               int count = i;
               while(i!= nums.length-2)
               {

                   nums[count] = nums[count+1];
                   count =count +1;
               }
           }


        }


    }
}
















