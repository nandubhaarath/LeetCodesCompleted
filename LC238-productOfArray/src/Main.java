public class Main {
    public static void main(String[] args) {
        int nums[] = new int[]{1, 2, 3, 4};
        int[] answerArray = new int[nums.length];
        int multiply = 0;

        for (int i = 0; i <= nums.length - 1; i++)
        {
            multiply =1;
            for (int x = 0; x <= nums.length - 1; x++)
            {
                if (i == x)
                {
                    continue;
                }
                else
                {
                    multiply = multiply * nums[x];
                }
            }
            answerArray[i]=multiply;
        }

        for(int x: answerArray)
        {
            System.out.println(x);
        }
    }
}
