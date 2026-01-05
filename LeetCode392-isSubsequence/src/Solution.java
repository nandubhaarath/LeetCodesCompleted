public class Solution
{
   public static void main (String[]args)
   {
       String s = "acb";
        String t = "ahbgdc";

        char [] sToArray = s.toCharArray();
      char [] tToArray = t.toCharArray();
      boolean isSubsequence = false;
      int removed = 0;
      int indexToContinueFrom =0;

      for(int i =0; i<=sToArray.length-1;i++)
      {
          for(int x  = indexToContinueFrom; x<= tToArray.length-1 ; x++)
          {
             if(sToArray[i]==tToArray[x])
             {
                 tToArray[x]=0;
                 indexToContinueFrom =x;
                 removed++;
                 break;
             }

          }

      }
      if(removed==sToArray.length)
      {
         isSubsequence = true;
      }
       System.out.println(isSubsequence);
   }



}
