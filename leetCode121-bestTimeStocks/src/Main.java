public class Main
{
    public static void main(String[]args)
    {
        int [] prices = new int []{7,1,5,3,6,4};

        int lowestPrice =prices[0];
        int lowestPricePosition =0;

        for(int i =0; i<= prices.length-2; i++)
        {

            if(lowestPrice>prices[i+1])
            {
                    lowestPrice = prices[i+1];
                    lowestPricePosition = i+1;
            }

        } 

        if (lowestPricePosition == prices.length-1)
        {
            //return 0
            System.out.println(0);
        }
        int highestSellingPrice =0 ;

        for(int z =lowestPricePosition+1; z<= prices.length-2; z++)
        {

            if(prices[z]<prices[z+1])
            {
               highestSellingPrice =prices[z+1];
            }
            else
            {
                highestSellingPrice = prices[z];
            }

        }

        System.out.println(highestSellingPrice-lowestPrice);


    }

}

//public  void class Solution
//{
//    public int maxProfit(int []prices)
//    {
//
//
//
//
//        return 0;
//    }
//
//
//}
