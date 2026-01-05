import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
       Scanner scanner = new Scanner(System.in);
       String s = "the sky is blue";
       String word = "";
       String finalSentence="";
       int wordCount =0;
        //old bad code
//       String reverse = "";
//       int position = s.length()-1;
//       String tempWord = "";
//       int tempWordStart =0;
//
//       for(int i = 0 ; i<=s.length()-1;  i++)
//        {
//           if (!s.substring(position , position+1).equals(" "))
//           {
//               while(!s.substring(position , position+1).equals(""))
//               {
//                   if (s.substring(position , position+1).equals())
//               }
//           }
//        }
        ArrayList<String>wordsToReverse = new ArrayList<>();

        for(int i=0; i<=s.length();i++)
        {
            if(i==s.length())
            {
                wordsToReverse.add(word);
                wordCount++;
                break;
            }
            if(!s.substring(i, i + 1).equals(" "))
            {
                word = word + s.substring(i,i+1);
            }
            if(s.substring(i, i + 1).equals(" "))
            {
                if(word.length()>1)
                {
                   wordsToReverse.add(word);
                   wordCount++;
                   word = "";
                }
            }
        }
        for(int i = 0 ; i<= wordCount-2 ; i++)
        {
           finalSentence = finalSentence + wordsToReverse.getLast();
           finalSentence = finalSentence + " ";
           wordsToReverse.removeLast();
        }
        finalSentence = finalSentence + wordsToReverse.getLast();
        System.out.println(finalSentence);
    }
}