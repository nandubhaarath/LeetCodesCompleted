import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String array[][]= new String[100][100];

        String word ="PAYPALISHIRING";

        int numRows = 3;
        int column = 0;
        int row = numRows-2;
        int wordLetterPos = 0;

        while(true)
        {
            if (wordLetterPos >= word.length())
            {
                break;
            }
            //gpwing down by the number of columns
           for(int i = 0; i <= numRows-1 ; i++)
           {
               if (wordLetterPos >= word.length())
               {
                   break;
               }
               array[i][column] = word.substring(wordLetterPos,wordLetterPos+1);
               wordLetterPos++;

           }
           column++;
           //gowing up diagnoally until top row
           while(row>0&&wordLetterPos < word.length())
           {
               array[row][column] = word.substring(wordLetterPos,wordLetterPos+1);
               wordLetterPos++;
               row--;
               column++;

           }
           row=numRows-2;

        }

        String output = "";
        for (int r = 0; r < numRows; r++)
        {
            for (int c = 0; c < array[r].length; c++)
            {

                if (array[r][c] == null)
                {
                    continue;
                }

                output = output + array[r][c];
            }
        }

        System.out.println(output);





    }
}