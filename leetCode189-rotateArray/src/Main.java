import java.util.ArrayList;
import java.util.Scanner;

public class Main
{

    public static void main(String[]args)
    {
        Scanner scanner =  new Scanner(System.in);
        int nums[] = new int[]{1,2,3,4,5,6,7};

        System.out.println("Enter how much to roate by");
        int rotate = scanner.nextInt();

        ArrayList<Integer> start  = new ArrayList<>();
        ArrayList<Integer> end =new ArrayList<>();

        for(int i=0; i<=rotate-1;i++)
        {
           start.add(nums[i]);
        }
        for(int i= rotate+1; i<= nums.length-1;i++)
        {
            end.add(nums[i]);
        }
        for(int i=0; i<=rotate-1;i++)
        {
            nums[i]= end.get(i);
        }
        for(int i= rotate+1; i<= nums.length-1;i++)
        {
            nums[i]= start.getFirst();
            start.removeFirst();
        }

        for (int n : nums)
        {
            System.out.println(n + ",");
        }



    }


}
