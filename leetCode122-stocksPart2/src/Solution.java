public class Solution
{
    public int maxProfit(int[] prices)
    {
        int maxProfit = 0;

        // To keep things simple, we'll assume the number of lows and highs
        // cannot exceed prices.length
        int[] lowestArray = new int[prices.length];
        int[] highestArray = new int[prices.length];
        int[] lowestAddedIndexes = new int[prices.length];

        int lowArrayPos = 0;
        int highArrayPos = 0;

        // doing L to R to obtain lowest stock prices
        for (int i = 0; i < prices.length; i++)
        {
            if ((i == 0 || prices[i] <= prices[i - 1]) &&
                    (i == prices.length - 1 || prices[i] < prices[i + 1]))
            {
                lowestArray[lowArrayPos] = prices[i];
                lowestAddedIndexes[lowArrayPos] = i;
                lowArrayPos++;
            }
        }

        // doing L to R to obtain highest stock prices
        for (int i = 0; i < prices.length; i++)
        {
            if ((i == 0 || prices[i] >= prices[i - 1]) &&
                    (i == prices.length - 1 || prices[i] > prices[i + 1]))
            {
                highestArray[highArrayPos] = prices[i];
                highArrayPos++;
            }
        }

        // matching pairs of lows and highs
        int hiPos = 0;
        for (int i = 0; i < lowArrayPos; i++)
        {
            int lowIndex = lowestAddedIndexes[i];

            // find next high that comes after this low
            while (hiPos < highArrayPos &&
                    getIndexOfPrice(prices, highestArray[hiPos]) < lowIndex)
            {
                hiPos++;
            }

            if (hiPos < highArrayPos)
            {
                int highIndex = getIndexOfPrice(prices, highestArray[hiPos]);
                if (highIndex > lowIndex && highestArray[hiPos] > lowestArray[i])
                {
                    maxProfit += highestArray[hiPos] - lowestArray[i];
                    hiPos++;
                }
            }
        }

        return maxProfit;
    }

    // method to get the index of a price value in prices[] rather than repeating againa nd again
    private int getIndexOfPrice(int[] prices, int price)
    {
        for (int i = 0; i < prices.length; i++)
        {
            if (prices[i] == price)
            {
                return i;
            }
        }
        return -1;
    }
}
