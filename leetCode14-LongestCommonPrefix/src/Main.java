import java.sql.SQLOutput;

public class Main
{
    public static void main(String[] args)
    {
         String [] words1 = new String[]{"flower","flow","flight"};
         String [] words2 = new String[]{"dog","racecar","prefix"};

        int position =0;
        String output = "";
         while(true)
         {
             if (position >= words1[0].length() || position >= words1[1].length() || position >= words1[2].length() )
             {
                 break;
             }


             String char0 = words1[0].substring(position, position + 1);
             String char1 = words1[1].substring(position, position + 1);
             String char2 = words1[2].substring(position, position + 1);


             if (char0.equals(char1) && char1.equals(char2))
             {
                 output = output + words1[0].charAt(position);
             }
             else
             {
                 System.out.println(output);
                 break;
             }

             position++;
         }
    }
}