public class Main
{
    public static void main(String[] args)
    {

        int n = 4;

        int[] numberOfOnes = new int[n + 1];

        for (int i = 0; i <= n; i++)
        {
            int toDivide = i;
            int oneCount = 0;

            while (toDivide != 0)
            {
                if (toDivide % 2 == 1)
                {
                    oneCount++;
                }
                toDivide = toDivide / 2;
            }

            numberOfOnes[i] = oneCount;
        }

        for (int i = 0; i <= n; i++)
        {
            System.out.println(i + " -> " + numberOfOnes[i]);
        }
    }
}
